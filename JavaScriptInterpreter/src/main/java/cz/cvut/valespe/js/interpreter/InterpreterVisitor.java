package cz.cvut.valespe.js.interpreter;


import java.lang.Object;
import cz.cvut.valespe.js.parser.JavaScriptParser;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * TODO javadoc
 */
public class InterpreterVisitor implements cz.cvut.valespe.js.parser.JavaScriptVisitor {

    private Memory memory;
    private Scope scope;
    private Scope thisScope;

    public InterpreterVisitor(Memory memory, Scope scope, Scope thisScope) {
        this.memory = memory;
        this.scope = scope;
        this.thisScope = thisScope;
    }

    @Override
    public Object visitFile(@NotNull JavaScriptParser.FileContext ctx) {
        Object result = null;
        for (JavaScriptParser.ExpressionContext expressionContext : ctx.expression()) {
            result = expressionContext.accept(this);
        }
        return result;
    }

    @Override
    public Object visitMessageToInstanceExpression(@NotNull JavaScriptParser.MessageToInstanceExpressionContext ctx) {
        return ctx.messageToInstance().accept(this);
    }

    @Override
    public Object visitCallMethodOnInstance(@NotNull JavaScriptParser.CallMethodOnInstanceContext ctx) {
        Memory.Reference nameRef = (Memory.Reference) ctx.ID(0).accept(this);
        Symbol instanceName = (Symbol) memory.getJsObject(nameRef);
        Memory.Reference instanceRed = scope.get((String) instanceName.value());
        JsObject instance = memory.getJsObject(instanceRed);
        Memory.Reference methodRef = (Memory.Reference) ctx.ID(1).accept(this);   // TODO
        Symbol methodName = (Symbol) memory.getJsObject(methodRef);
        List<Memory.Reference> paramRefs = ctx.callParams() == null ? Collections.emptyList() : (List) ctx.callParams().accept(this);
        return instance.invoke((String) methodName.value(), paramRefs, scope, memory);
    }

    @Override
    public Object visitGetPropertyOnInstance(@NotNull JavaScriptParser.GetPropertyOnInstanceContext ctx) {
        Memory.Reference nameRef = (Memory.Reference) ctx.ID(0).accept(this);
        Symbol instanceName = (Symbol) memory.getJsObject(nameRef);
        Memory.Reference instanceRed = scope.get((String) instanceName.value());
        JsObject instance = memory.getJsObject(instanceRed);
        Memory.Reference methodRef = (Memory.Reference) ctx.ID(1).accept(this);
        Symbol methodName = (Symbol) memory.getJsObject(methodRef);
        return instance.invoke((String) methodName.value(), null, scope, memory);
    }

    @Override
    public Object visitSetPropertyOnInstance(@NotNull JavaScriptParser.SetPropertyOnInstanceContext ctx) {
        Memory.Reference nameRef = (Memory.Reference) ctx.ID(0).accept(this);
        Symbol instanceName = (Symbol) memory.getJsObject(nameRef);
        Memory.Reference instanceRed = scope.get((String) instanceName.value());
        JsObject instance = memory.getJsObject(instanceRed);
        Memory.Reference methodRef = (Memory.Reference) ctx.ID(1).accept(this);
        Symbol methodName = (Symbol) memory.getJsObject(methodRef);
        List<Memory.Reference> paramRefs = Arrays.asList((Memory.Reference) ctx.expression().accept(this));
        return instance.invoke((String) methodName.value(), paramRefs, scope, memory);
    }

    @Override
    public Object visitThisExpressionExpression(@NotNull JavaScriptParser.ThisExpressionExpressionContext ctx) {
        return ctx.thisExpression().accept(this);
    }

    @Override
    public Object visitThisCallMethod(@NotNull JavaScriptParser.ThisCallMethodContext ctx) {
        Memory.Reference methodRef = (Memory.Reference) ctx.ID().accept(this);
        Symbol methodName = (Symbol) memory.getJsObject(methodRef);
        JsObject method = memory.getJsObject(thisScope.get((String) methodName.value()));
        List<Memory.Reference> paramRefs = ctx.callParams() == null ? Collections.emptyList() : (List) ctx.callParams().accept(this);
        return method.invoke(paramRefs, thisScope, memory);
    }

    @Override
    public Object visitThisGetterExpression(@NotNull JavaScriptParser.ThisGetterExpressionContext ctx) {
        Memory.Reference nameRef = (Memory.Reference) ctx.ID().accept(this);
        return thisScope.get((String) memory.getJsObject(nameRef).value());
    }

    @Override
    public Object visitThisSetterExpression(@NotNull JavaScriptParser.ThisSetterExpressionContext ctx) {
        Memory.Reference nameRef = (Memory.Reference) ctx.ID().accept(this);
        Memory.Reference resultRef = (Memory.Reference) ctx.expression().accept(this);
        if (resultRef != null && memory.getJsObject(resultRef).isSymbol())
            resultRef = thisScope.get((String) memory.getJsObject(resultRef).value());
        thisScope.define((String) memory.getJsObject(nameRef).value());
        thisScope.set((String) memory.getJsObject(nameRef).value(), resultRef);
        return null;
    }

    @Override
    public Object visitParenthesesExpression(@NotNull JavaScriptParser.ParenthesesExpressionContext ctx) {
        return ctx.expression().accept(this);
    }

    @Override
    public Object visitFunctionCallExpression(@NotNull JavaScriptParser.FunctionCallExpressionContext ctx) {
        return ctx.functionCall().accept(this);
    }

    @Override
    public Object visitFunctionCall(@NotNull JavaScriptParser.FunctionCallContext ctx) {
        Memory.Reference nameRef = (Memory.Reference) ctx.ID().accept(this);
        Memory.Reference funRef = scope.get((String) memory.getJsObject(nameRef).value());
        JsFunction function = (JsFunction) memory.getJsObject(funRef);
        List<Memory.Reference> paramRefs = ctx.callParams() == null ? Collections.emptyList() : (List) ctx.callParams().accept(this);
        return function.invoke(paramRefs, scope, memory);
    }

    @Override
    public Object visitCallParams(@NotNull JavaScriptParser.CallParamsContext ctx) {
        List<Memory.Reference> params = new ArrayList<Memory.Reference>();
        for (JavaScriptParser.CallParamContext callParamContext : ctx.callParam()) {
            params.add((Memory.Reference) callParamContext.accept(this));
        }
        return params;
    }

    @Override
    public Object visitCallParam(@NotNull JavaScriptParser.CallParamContext ctx) {
        if (ctx.ID() != null)
            return ctx.ID().accept(this);
        else
            return ctx.INT().accept(this);
    }

    @Override
    public Object visitCreateInstanceExpression(@NotNull JavaScriptParser.CreateInstanceExpressionContext ctx) {
        return ctx.createInstance().accept(this);
    }

    @Override
    public Object visitCreateInstance(@NotNull JavaScriptParser.CreateInstanceContext ctx) {
        Memory.Reference nameRef = (Memory.Reference) ctx.ID().accept(this);
        Symbol functionName = (Symbol) memory.getJsObject(nameRef);
        Memory.Reference constructorRef = scope.get((String) functionName.value());
        final JsObject jsObject = memory.getJsObject(constructorRef);
        if (jsObject.isJsFunction()) {
            JsFunction constructor = (JsFunction) jsObject;
            List<Memory.Reference> paramRefs = ctx.callParams() == null ? Collections.emptyList() : (List) ctx.callParams().accept(this);
            return constructor.constructInstance(paramRefs, scope, memory);
        }
        return null;
    }

    @Override
    public Object visitFunctionBody(@NotNull JavaScriptParser.FunctionBodyContext ctx) {
        Object returnValue = null;
        for (JavaScriptParser.ExpressionContext expressionContext : ctx.expression()) {
            returnValue = expressionContext.accept(this);
        }
        return returnValue;
    }

    @Override
    public Object visitPlusExpression(@NotNull JavaScriptParser.PlusExpressionContext ctx) {
        Memory.Reference firstRef = (Memory.Reference) ctx.expression(0).accept(this);
        Memory.Reference secondRef = (Memory.Reference) ctx.expression(1).accept(this);
        return invokeBinaryOperationOnInt(firstRef, secondRef, "+");
    }

    @Override
    public Object visitMinusExpression(@NotNull JavaScriptParser.MinusExpressionContext ctx) {
        Memory.Reference firstRef = (Memory.Reference) ctx.expression(0).accept(this);
        Memory.Reference secondRef = (Memory.Reference) ctx.expression(1).accept(this);
        return invokeBinaryOperationOnInt(firstRef, secondRef, "-");
    }

    @Override
    public Object visitMulExpression(@NotNull JavaScriptParser.MulExpressionContext ctx) {
        Memory.Reference firstRef = (Memory.Reference) ctx.expression(0).accept(this);
        Memory.Reference secondRef = (Memory.Reference) ctx.expression(1).accept(this);
        return invokeBinaryOperationOnInt(firstRef, secondRef, "*");
    }

    @Override
    public Object visitDivExpression(@NotNull JavaScriptParser.DivExpressionContext ctx) {
        Memory.Reference firstRef = (Memory.Reference) ctx.expression(0).accept(this);
        Memory.Reference secondRef = (Memory.Reference) ctx.expression(1).accept(this);
        return invokeBinaryOperationOnInt(firstRef, secondRef, "/");
    }

    @Override
    public Object visitModExpression(@NotNull JavaScriptParser.ModExpressionContext ctx) {
        Memory.Reference firstRef = (Memory.Reference) ctx.expression(0).accept(this);
        Memory.Reference secondRef = (Memory.Reference) ctx.expression(1).accept(this);
        return invokeBinaryOperationOnInt(firstRef, secondRef, "%");
    }

    private Object invokeBinaryOperationOnInt(Memory.Reference firstRef, Memory.Reference secondRef, String operation) {
        JsObject first = memory.getJsObject(firstRef);
        JsObject second = memory.getJsObject(secondRef);
        if (first.isSymbol())
            first = memory.getJsObject(scope.get((String) first.value()));
        if (second.isSymbol())
            secondRef = scope.get((String) second.value());
        return first.invoke(operation, Arrays.asList(secondRef), scope, memory);
    }

    @Override
    public Object visitAssignmentExpressionExpression(@NotNull JavaScriptParser.AssignmentExpressionExpressionContext ctx) {
        ctx.assignmentExpression().accept(this);
        return null;
    }

    @Override
    public Object visitVarAssignment(@NotNull JavaScriptParser.VarAssignmentContext ctx) {
        Memory.Reference nameRef = (Memory.Reference) ctx.ID().accept(this);
        Memory.Reference resultRef = (Memory.Reference) ctx.expression().accept(this);
        if (resultRef != null && memory.getJsObject(resultRef).isSymbol())
            resultRef = scope.get((String) memory.getJsObject(resultRef).value());
        scope.set((String) memory.getJsObject(nameRef).value(), resultRef);
        return null;
    }

    @Override
    public Object visitAssignment(@NotNull JavaScriptParser.AssignmentContext ctx) {
        Memory.Reference nameRef = (Memory.Reference) ctx.ID().accept(this);
        Memory.Reference resultRef = (Memory.Reference) ctx.expression().accept(this);
        if (resultRef != null && memory.getJsObject(resultRef).isSymbol())
            resultRef = scope.get((String) memory.getJsObject(resultRef).value());
        scope.set((String) memory.getJsObject(nameRef).value(), resultRef);
        return null;
    }

    @Override
    public Object visitAnonymousFunctionExpression(@NotNull JavaScriptParser.AnonymousFunctionExpressionContext ctx) {
        return ctx.anonymousFunction().accept(new DefinitionCollectingVisitor(memory, scope));
    }

    @Override
    public Object visitAnonymousFunction(@NotNull JavaScriptParser.AnonymousFunctionContext ctx) {
        JsFunction function = new JsFunction(null, getFunctionParams(ctx.functionParameters()), ctx.functionBody(), scope);
        return memory.storeJsObject(function);
    }

    private List getFunctionParams(JavaScriptParser.FunctionParametersContext functionParameters) {
        return functionParameters == null ? new ArrayList() : (List) functionParameters.accept(this);
    }

    @Override
    public Object visitFunctionParameters(@NotNull JavaScriptParser.FunctionParametersContext ctx) {
        List<Memory.Reference> params = new ArrayList<Memory.Reference>();
        if (ctx.functionParameter() != null) {
            for (JavaScriptParser.FunctionParameterContext param : ctx.functionParameter()) {
                params.add((Memory.Reference) param.accept(this));
            }
        }
        return params;
    }

    @Override
    public Object visitFunctionName(@NotNull JavaScriptParser.FunctionNameContext ctx) {
        return ctx.ID().accept(this);
    }

    @Override
    public Object visitFunctionParameter(@NotNull JavaScriptParser.FunctionParameterContext ctx) {
        return ctx.ID().accept(this);
    }

    @Override
    public Object visitInt(@NotNull JavaScriptParser.IntContext ctx) {
        return ctx.INT().accept(this);
    }

    @Override
    public Object visitId(@NotNull JavaScriptParser.IdContext ctx) {
        return ctx.ID().accept(this);
    }

    @Override
    public Memory.Reference visitTerminal(@NotNull TerminalNode node) {
        JsObject terminal = null;
        switch (node.getSymbol().getType()) {
            case JavaScriptParser.INT:
                terminal = new JsInt(Integer.parseInt(node.getText()));
                break;
            case JavaScriptParser.ID:
                terminal =  new Symbol(node.getText());
                break;
            default: throw new IllegalStateException("Unknown terminal node");
        }
        return memory.storeJsObject(terminal);
    }

    @Override
    public Object visitVarDeclaration(@NotNull JavaScriptParser.VarDeclarationContext ctx) {
        return null;
    }

    @Override
    public Object visitFunctionDeclaration(@NotNull JavaScriptParser.FunctionDeclarationContext ctx) {
        return null;
    }

    @Override
    public Object visitErrorNode(@NotNull ErrorNode node) {
        return null;
    }

    @Override
    public Object visit(@NotNull ParseTree tree) {
        return null;
    }

    @Override
    public Object visitChildren(@NotNull RuleNode node) {
        return null;
    }

}
