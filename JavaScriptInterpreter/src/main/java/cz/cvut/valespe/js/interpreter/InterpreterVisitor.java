package cz.cvut.valespe.js.interpreter;


import java.lang.Object;

import cz.cvut.valespe.js.interpreter.model.*;
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
        final JsObject instance = resolveSymbolToJsObject(ctx.ID(0).accept(this));
        final String methodName = resolveSymbolName(ctx.ID(1).accept(this));
        final List<Memory.Reference> paramRefs = ctx.callParams() == null ?
                        Collections.<Memory.Reference>emptyList() :
                        (List<Memory.Reference>) ctx.callParams().accept(this);
        return instance.invoke(methodName, paramRefs, scope, memory);
    }

    @Override
    public Object visitGetPropertyOnInstance(@NotNull JavaScriptParser.GetPropertyOnInstanceContext ctx) {
        JsObject instance = resolveSymbolToJsObject(ctx.ID(0).accept(this));
        String methodName = resolveSymbolName(ctx.ID(1).accept(this));
        return instance.invoke(methodName, null, scope, memory);
    }

    @Override
    public Object visitSetPropertyOnInstance(@NotNull JavaScriptParser.SetPropertyOnInstanceContext ctx) {
        JsObject instance = resolveSymbolToJsObject(ctx.ID(0).accept(this));
        String methodName = resolveSymbolName(ctx.ID(1).accept(this));
        List<Memory.Reference> paramRefs = Arrays.asList((Memory.Reference) ctx.expression().accept(this));
        return instance.invoke(methodName, paramRefs, scope, memory);
    }

    @Override
    public Object visitThisExpressionExpression(@NotNull JavaScriptParser.ThisExpressionExpressionContext ctx) {
        return ctx.thisExpression().accept(this);
    }

    @Override
    public Object visitThisCallMethod(@NotNull JavaScriptParser.ThisCallMethodContext ctx) {
        JsObject method = resolveSymbolToJsObjectFromThisScope(ctx.ID().accept(this));
        List<Memory.Reference> paramRefs = ctx.callParams() == null ?
                        Collections.<Memory.Reference>emptyList() :
                        (List<Memory.Reference>) ctx.callParams().accept(this);
        return method.invoke(paramRefs, thisScope, memory);
    }

    @Override
    public Object visitThisGetterExpression(@NotNull JavaScriptParser.ThisGetterExpressionContext ctx) {
        return thisScope.get(resolveSymbolName(ctx.ID().accept(this)));
    }

    @Override
    public Object visitThisSetterExpression(@NotNull JavaScriptParser.ThisSetterExpressionContext ctx) {
        String propertyName = resolveSymbolName(ctx.ID().accept(this));
        Memory.Reference resultRef = getReferenceOfJsObject(ctx.expression().accept(this));
        thisScope.define(propertyName);
        thisScope.set(propertyName, resultRef);
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
        JsObject function = resolveSymbolToJsObject(ctx.ID().accept(this));
        List<Memory.Reference> paramRefs = ctx.callParams() == null ?
                Collections.<Memory.Reference>emptyList() :
                (List<Memory.Reference>) ctx.callParams().accept(this);
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
        else if (ctx.INT() != null)
            return ctx.INT().accept(this);
        else if (ctx.STRING() != null)
            return ctx.STRING().accept(this);
        else
            return null;
    }

    @Override
    public Object visitCreateInstanceExpression(@NotNull JavaScriptParser.CreateInstanceExpressionContext ctx) {
        return ctx.createInstance().accept(this);
    }

    @Override
    public Object visitCreateInstance(@NotNull JavaScriptParser.CreateInstanceContext ctx) {
        final JsObject jsObject = resolveSymbolToJsObject(ctx.ID().accept(this));
        if (jsObject.isJsFunction()) {
            JsFunction constructor = (JsFunction) jsObject;
            List<Memory.Reference> paramRefs = ctx.callParams() == null ?
                    Collections.<Memory.Reference>emptyList() :
                    (List<Memory.Reference>) ctx.callParams().accept(this);
            return constructor.constructInstance(paramRefs, scope, memory);
        }
        throw new TypeError(resolveSymbolName(ctx.ID().accept(this)) + " is not function");
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
        return invokeBinaryOperation(firstRef, secondRef, "+");
    }

    @Override
    public Object visitMinusExpression(@NotNull JavaScriptParser.MinusExpressionContext ctx) {
        Memory.Reference firstRef = (Memory.Reference) ctx.expression(0).accept(this);
        Memory.Reference secondRef = (Memory.Reference) ctx.expression(1).accept(this);
        return invokeBinaryOperation(firstRef, secondRef, "-");
    }

    @Override
    public Object visitMulExpression(@NotNull JavaScriptParser.MulExpressionContext ctx) {
        Memory.Reference firstRef = (Memory.Reference) ctx.expression(0).accept(this);
        Memory.Reference secondRef = (Memory.Reference) ctx.expression(1).accept(this);
        return invokeBinaryOperation(firstRef, secondRef, "*");
    }

    @Override
    public Object visitDivExpression(@NotNull JavaScriptParser.DivExpressionContext ctx) {
        Memory.Reference firstRef = (Memory.Reference) ctx.expression(0).accept(this);
        Memory.Reference secondRef = (Memory.Reference) ctx.expression(1).accept(this);
        return invokeBinaryOperation(firstRef, secondRef, "/");
    }

    @Override
    public Object visitModExpression(@NotNull JavaScriptParser.ModExpressionContext ctx) {
        Memory.Reference firstRef = (Memory.Reference) ctx.expression(0).accept(this);
        Memory.Reference secondRef = (Memory.Reference) ctx.expression(1).accept(this);
        return invokeBinaryOperation(firstRef, secondRef, "%");
    }

    private Object invokeBinaryOperation(Memory.Reference firstRef, Memory.Reference secondRef, String operation) {
        JsObject first = ensureObject(firstRef);
        JsObject second = memory.getJsObject(secondRef);
        if (second.isSymbol())
            secondRef = scope.get((String) second.value());
        return first.invoke(operation, Arrays.asList(secondRef), scope, memory);
    }

    @Override
    public Object visitOrExpression(@NotNull JavaScriptParser.OrExpressionContext ctx) {
        Memory.Reference firstRef = (Memory.Reference) ctx.expression(0).accept(this);
        Memory.Reference secondRef = (Memory.Reference) ctx.expression(1).accept(this);
        return invokeBinaryOperation(firstRef, secondRef, "||");
    }

    @Override
    public Object visitAndExpression(@NotNull JavaScriptParser.AndExpressionContext ctx) {
        Memory.Reference firstRef = (Memory.Reference) ctx.expression(0).accept(this);
        Memory.Reference secondRef = (Memory.Reference) ctx.expression(1).accept(this);
        return invokeBinaryOperation(firstRef, secondRef, "&&");
    }

    @Override
    public Object visitEqualsExpression(@NotNull JavaScriptParser.EqualsExpressionContext ctx) {
        Memory.Reference firstRef = (Memory.Reference) ctx.expression(0).accept(this);
        Memory.Reference secondRef = (Memory.Reference) ctx.expression(1).accept(this);
        return invokeBinaryOperation(firstRef, secondRef, "==");
    }

    @Override
    public Object visitCompareExpression(@NotNull JavaScriptParser.CompareExpressionContext ctx) {
        Memory.Reference firstRef = (Memory.Reference) ctx.expression(0).accept(this);
        Memory.Reference secondRef = (Memory.Reference) ctx.expression(1).accept(this);
        return invokeBinaryOperation(firstRef, secondRef, ctx.COMPARE_OPERATORS().getText());
    }

    @Override
    public Object visitNotExpression(@NotNull JavaScriptParser.NotExpressionContext ctx) {
        JsObject first = ensureObject(ctx.expression().accept(this));
        return first.invoke("!", Collections.<Memory.Reference>emptyList(), scope, memory);
    }

    @Override
    public Object visitUnaryMinusExpression(@NotNull JavaScriptParser.UnaryMinusExpressionContext ctx) {
        JsObject first = ensureObject(ctx.expression().accept(this));
        return first.invoke("-", Collections.<Memory.Reference>emptyList(), scope, memory);
    }

    @Override
    public Object visitFalse(@NotNull JavaScriptParser.FalseContext ctx) {
        return ctx.FALSE().accept(this);
    }

    @Override
    public Object visitTrue(@NotNull JavaScriptParser.TrueContext ctx) {
        return ctx.TRUE().accept(this);
    }

    @Override
    public Object visitAssignmentExpressionExpression(@NotNull JavaScriptParser.AssignmentExpressionExpressionContext ctx) {
        ctx.assignmentExpression().accept(this);
        return null;
    }

    @Override
    public Object visitVarAssignment(@NotNull JavaScriptParser.VarAssignmentContext ctx) {
        String name = resolveSymbolName(ctx.ID().accept(this));
        Memory.Reference resultRef = getReferenceOfJsObject(ctx.expression().accept(this));
        scope.set(name, resultRef);
        return null;
    }

    @Override
    public Object visitAssignment(@NotNull JavaScriptParser.AssignmentContext ctx) {
        String name = resolveSymbolName(ctx.ID().accept(this));
        Memory.Reference resultRef = getReferenceOfJsObject(ctx.expression().accept(this));
        scope.set(name, resultRef);
        return null;
    }

    @Override
    public Object visitPrototypeAssignmentExpressionExpression(@NotNull JavaScriptParser.PrototypeAssignmentExpressionExpressionContext ctx) {
        ctx.prototypeAssignmentExpression().accept(this);
        return null;
    }

    @Override
    public Object visitPrototypeAssignment(@NotNull JavaScriptParser.PrototypeAssignmentContext ctx) {
        final JsObject jsObject = resolveSymbolToJsObject(ctx.ID().accept(this));
        jsObject.setPrototype((Memory.Reference) ctx.expression().accept(this));
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
    public Object visitArray(@NotNull JavaScriptParser.ArrayContext ctx) {
        return ctx.createArray().accept(this);
    }

    @Override
    public Object visitArrayAssignmentExpression(@NotNull JavaScriptParser.ArrayAssignmentExpressionContext ctx) {
        return ctx.arrayAssignment().accept(this);
    }

    @Override
    public Object visitArrayAccessExpression(@NotNull JavaScriptParser.ArrayAccessExpressionContext ctx) {
        return ctx.arrayAccess().accept(this);
    }

    @Override
    public Object visitCreateArray(@NotNull JavaScriptParser.CreateArrayContext ctx) {
        List<Memory.Reference> refs = (List) ctx.callParams().accept(this);
        List<Memory.Reference> arrayRefs = new ArrayList<Memory.Reference>(refs.size());
        for (Memory.Reference ref : refs) {
            final JsObject jsObject = memory.getJsObject(ref);
            if (jsObject.isSymbol())
                arrayRefs.add(scope.get((String) jsObject.value()));
            else
                arrayRefs.add(ref);
        }
        return memory.storeJsObject(new JsArray(arrayRefs));
    }

    @Override
    public Object visitArrayAccess(@NotNull JavaScriptParser.ArrayAccessContext ctx) {
        String name = resolveSymbolName(ctx.ID().accept(this));
        JsObject array = resolveSymbolToJsObject(ctx.ID().accept(this));
        JsObject index = loadJsObjectFromMemory(ctx.INT().accept(this));
        if (array.isJsArray()) {
            return ((JsArray) array).get((Integer) index.value());
        }
        throw new TypeError(name + " is not array.");
    }

    @Override
    public Object visitArrayAssignment(@NotNull JavaScriptParser.ArrayAssignmentContext ctx) {
        String name = resolveSymbolName(ctx.ID().accept(this));
        JsObject array = resolveSymbolToJsObject(ctx.ID().accept(this));
        JsObject index = loadJsObjectFromMemory(ctx.INT().accept(this));
        if (array.isJsArray()) {
            ((JsArray) array).set((Integer) index.value(), (Memory.Reference) ctx.expression().accept(this));
            return null;
        }
        throw new TypeError(name + " is not array.");
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
    public Object visitString(@NotNull JavaScriptParser.StringContext ctx) {
        return ctx.STRING().accept(this);
    }

    @Override
    public Object visitIfExpression(@NotNull JavaScriptParser.IfExpressionContext ctx) {
        return ctx.ifStatement().accept(this);
    }

    @Override
    public Object visitIfStatement(@NotNull JavaScriptParser.IfStatementContext ctx) {
        JsObject condition = ensureObject(ctx.expression().accept(this));
        if (!condition.isJsBoolean())
            throw new TypeError("Not boolean expression");
        if ((Boolean) condition.value()) {
            ctx.functionBody(0).accept(this);
        } else {
            ctx.functionBody(1).accept(this);
        }
        return null;
    }

    @Override
    public Object visitWhileExpression(@NotNull JavaScriptParser.WhileExpressionContext ctx) {
        return ctx.whileStatement().accept(this);
    }

    @Override
    public Object visitWhileStatement(@NotNull JavaScriptParser.WhileStatementContext ctx) {
        JsObject condition = ensureObject(ctx.expression().accept(this));
        if (!condition.isJsBoolean())
            throw new TypeError("Not boolean expression");
        while ((Boolean) condition.value()) {
            ctx.functionBody().accept(this);
            condition = ensureObject(ctx.expression().accept(this));
            if (!condition.isJsBoolean())
                throw new TypeError("Not boolean expression");
        }
        return null;
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
            case JavaScriptParser.STRING:
                terminal =  new JsString(node.getText().replace("\"", ""));
                break;
            case JavaScriptParser.TRUE:
                terminal =  new JsBoolean(Boolean.TRUE);
                break;
            case JavaScriptParser.FALSE:
                terminal =  new JsBoolean(Boolean.FALSE);
                break;
            default: throw new IllegalStateException("Unknown terminal node");
        }
        return memory.storeJsObject(terminal);
    }

    private JsObject loadJsObjectFromMemory(Object ref) {
        return memory.getJsObject((Memory.Reference) ref);
    }

    private JsObject ensureObject(Object ref) {
        JsObject object = memory.getJsObject((Memory.Reference) ref);
        if (object.isSymbol())
            object = memory.getJsObject(scope.get((String) object.value()));
        return object;
    }

    private Memory.Reference getReferenceOfJsObject(Object ref) {
        Memory.Reference resultRef = (Memory.Reference) ref;
        if (resultRef != null && memory.getJsObject(resultRef).isSymbol())
            resultRef = scope.get((String) memory.getJsObject(resultRef).value());
        return resultRef;
    }

    private JsObject resolveSymbolToJsObjectFromThisScope(Object id) {
        return resolveSymbolToJsObjectFromScope(id, thisScope);
    }

    private JsObject resolveSymbolToJsObject(Object id) {
        return resolveSymbolToJsObjectFromScope(id, scope);
    }

    private JsObject resolveSymbolToJsObjectFromScope(Object id, Scope scopeToUse) {
        final String symbol = resolveSymbolName(id);
        final Memory.Reference instanceRed = scopeToUse.get(symbol);
        return memory.getJsObject(instanceRed);
    }

    private String resolveSymbolName(Object nameRef) {
        final Symbol instanceName = (Symbol) memory.getJsObject((Memory.Reference) nameRef);
        return (String) instanceName.value();
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
