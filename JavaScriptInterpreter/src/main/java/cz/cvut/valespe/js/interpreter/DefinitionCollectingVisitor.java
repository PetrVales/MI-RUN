package cz.cvut.valespe.js.interpreter;

import cz.cvut.valespe.js.interpreter.model.JsFunction;
import cz.cvut.valespe.js.interpreter.model.JsObject;
import cz.cvut.valespe.js.parser.JavaScriptParser;
import cz.cvut.valespe.js.parser.JavaScriptVisitor;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Collects all variable and function definition
 */
public class DefinitionCollectingVisitor implements JavaScriptVisitor {

    private Memory memory;
    private Scope scope;

    public DefinitionCollectingVisitor(Memory memory, Scope scope) {
        this.memory = memory;
        this.scope = scope;
    }

    @Override
    public Object visitFile(@NotNull JavaScriptParser.FileContext ctx) {
        for (JavaScriptParser.FunctionDeclarationContext functionDeclarationContext : ctx.functionDeclaration()) {
            functionDeclarationContext.accept(this);
        }
        for (JavaScriptParser.VarDeclarationContext varDeclarationContext : ctx.varDeclaration()) {
            varDeclarationContext.accept(this);
        }
        for (JavaScriptParser.ExpressionContext expressionContext : ctx.expression()) {
            expressionContext.accept(this);
        }
        return null;
    }

    @Override
    public Object visitVarAssignment(@NotNull JavaScriptParser.VarAssignmentContext ctx) {
        scope.define((String) ctx.ID().accept(this));
        return null;
    }

    @Override
    public Object visitAssignmentExpressionExpression(@NotNull JavaScriptParser.AssignmentExpressionExpressionContext ctx) {
        ctx.assignmentExpression().accept(this);
        return null;
    }

    @Override
    public Object visitFunctionDeclaration(@NotNull JavaScriptParser.FunctionDeclarationContext ctx) {
        String name = (String) ctx.functionName().accept(this);
        Scope innerScope = new Scope();
        if (ctx.functionParameters() != null) {
            ctx.functionParameters().accept(new DefinitionCollectingVisitor(memory, innerScope));
        }
        ctx.functionBody().accept(new DefinitionCollectingVisitor(memory, innerScope));
        final JsFunction function = new JsFunction(name, getFunctionParams(ctx.functionParameters()), ctx.functionBody(), innerScope);
        final Memory.Reference reference = memory.storeJsObject(function);
        scope.set(name, reference);
        return null;
    }

    @Override
    public Object visitAnonymousFunction(@NotNull JavaScriptParser.AnonymousFunctionContext ctx) {
        Scope innerScope = new Scope(scope);
        if (ctx.functionParameters() != null) {
            ctx.functionParameters().accept(new DefinitionCollectingVisitor(memory, innerScope));
        }
        ctx.functionBody().accept(new DefinitionCollectingVisitor(memory, innerScope));
        final JsFunction function = new JsFunction(null, getFunctionParams(ctx.functionParameters()), ctx.functionBody(), innerScope);
        return memory.storeJsObject(function);
    }

    private List<String> getFunctionParams(JavaScriptParser.FunctionParametersContext ctx) {
        List<String> params = new ArrayList<String>();
        if (ctx != null) {
            for (JavaScriptParser.FunctionParameterContext functionParameter : ctx.functionParameter()) {
                params.add((String) functionParameter.ID().accept(this));
            }
        }
        return params;
    }

    @Override
    public Object visitFunctionName(@NotNull JavaScriptParser.FunctionNameContext ctx) {
        scope.define((String) ctx.ID().accept(this));
        return ctx.ID().accept(this);
    }

    @Override
    public Object visitFunctionParameters(@NotNull JavaScriptParser.FunctionParametersContext ctx) {
        for (JavaScriptParser.FunctionParameterContext functionParameter : ctx.functionParameter()) {
            functionParameter.accept(this);
        }
        return null;
    }

    @Override
    public Object visitFunctionBody(@NotNull JavaScriptParser.FunctionBodyContext ctx) {
        for (JavaScriptParser.FunctionDeclarationContext functionDeclarationContext : ctx.functionDeclaration()) {
            functionDeclarationContext.accept(this);
        }
        for (JavaScriptParser.VarDeclarationContext varDeclarationContext : ctx.varDeclaration()) {
            varDeclarationContext.accept(this);
        }
        for (JavaScriptParser.ExpressionContext expressionContext : ctx.expression()) {
            expressionContext.accept(this);
        }
        return null;
    }

    @Override
    public Object visitPrototypeAssignmentExpressionExpression(@NotNull JavaScriptParser.PrototypeAssignmentExpressionExpressionContext ctx) {
        ctx.prototypeAssignmentExpression().accept(this);
        return null;
    }

    @Override
    public Object visitPrototypeAssignment(@NotNull JavaScriptParser.PrototypeAssignmentContext ctx) {
        final String nameRef = (String) ctx.ID().accept(this);
        final Memory.Reference objectRef = scope.get(nameRef);
        final JsObject jsObject = memory.getJsObject(objectRef);
        jsObject.setPrototype((Memory.Reference) ctx.expression().accept(this));
        return null;
    }

    @Override
    public Object visitTerminal(@NotNull TerminalNode node) {
        switch (node.getSymbol().getType()) {
            case JavaScriptParser.INT: return Integer.parseInt(node.getText());
            case JavaScriptParser.ID: return node.getText();
            default: return null;
        }
    }

    @Override
    public Object visitFunctionParameter(@NotNull JavaScriptParser.FunctionParameterContext ctx) {
        scope.define((String) ctx.ID().accept(this));
        return null;
    }

    @Override
    public Object visitId(@NotNull JavaScriptParser.IdContext ctx) {
        return ctx.ID().accept(this);
    }

    @Override
    public Object visitVarDeclaration(@NotNull JavaScriptParser.VarDeclarationContext ctx) {
        scope.define((String) ctx.ID().accept(this));
        return null;
    }

    @Override
    public Object visitCallMethodOnInstance(@NotNull JavaScriptParser.CallMethodOnInstanceContext ctx) {
        // Nothing to do
        return null;
    }

    @Override
    public Object visitMinusExpression(@NotNull JavaScriptParser.MinusExpressionContext ctx) {
        // Nothing to do
        return null;
    }

    @Override
    public Object visitSetPropertyOnInstance(@NotNull JavaScriptParser.SetPropertyOnInstanceContext ctx) {
        // Nothing to do
        return null;
    }

    @Override
    public Object visitInt(@NotNull JavaScriptParser.IntContext ctx) {
        // Nothing to do
        return null;
    }

    @Override
    public Object visitString(@NotNull JavaScriptParser.StringContext ctx) {
        // Nothing to do
        return null;
    }

    @Override
    public Object visitMulExpression(@NotNull JavaScriptParser.MulExpressionContext ctx) {
        // Nothing to do
        return null;
    }

    @Override
    public Object visitParenthesesExpression(@NotNull JavaScriptParser.ParenthesesExpressionContext ctx) {
        // Nothing to do
        return null;
    }

    @Override
    public Object visitAnonymousFunctionExpression(@NotNull JavaScriptParser.AnonymousFunctionExpressionContext ctx) {
        // Nothing to do
        return null;
    }

    @Override
    public Object visitMessageToInstanceExpression(@NotNull JavaScriptParser.MessageToInstanceExpressionContext ctx) {
        // Nothing to do
        return null;
    }

    @Override
    public Object visitDivExpression(@NotNull JavaScriptParser.DivExpressionContext ctx) {
        // Nothing to do
        return null;
    }

    @Override
    public Object visitAssignment(@NotNull JavaScriptParser.AssignmentContext ctx) {
        // Nothing to do
        return null;
    }

    @Override
    public Object visitThisCallMethod(@NotNull JavaScriptParser.ThisCallMethodContext ctx) {
        // Nothing to do
        return null;
    }

    @Override
    public Object visitCreateInstance(@NotNull JavaScriptParser.CreateInstanceContext ctx) {
        // Nothing to do
        return null;
    }

    @Override
    public Object visitCallParam(@NotNull JavaScriptParser.CallParamContext ctx) {
        // Nothing to do
        return null;
    }

    @Override
    public Object visitThisExpressionExpression(@NotNull JavaScriptParser.ThisExpressionExpressionContext ctx) {
        // Nothing to do
        return null;
    }

    @Override
    public Object visitCreateInstanceExpression(@NotNull JavaScriptParser.CreateInstanceExpressionContext ctx) {
        // Nothing to do
        return null;
    }

    @Override
    public Object visitFunctionCall(@NotNull JavaScriptParser.FunctionCallContext ctx) {
        // Nothing to do
        return null;
    }

    @Override
    public Object visitFunctionCallExpression(@NotNull JavaScriptParser.FunctionCallExpressionContext ctx) {
        // Nothing to do
        return null;
    }

    @Override
    public Object visitArrayAccessExpression(@NotNull JavaScriptParser.ArrayAccessExpressionContext ctx) {
        // Nothing to do
        return null;
    }

    @Override
    public Object visitArrayAccess(@NotNull JavaScriptParser.ArrayAccessContext ctx) {
        // Nothing to do
        return null;
    }

    @Override
    public Object visitCreateArray(@NotNull JavaScriptParser.CreateArrayContext ctx) {
        // Nothing to do
        return null;
    }

    @Override
    public Object visitArray(@NotNull JavaScriptParser.ArrayContext ctx) {
        // Nothing to do
        return null;
    }

    @Override
    public Object visitArrayAssignmentExpression(@NotNull JavaScriptParser.ArrayAssignmentExpressionContext ctx) {
        // Nothing to do
        return null;
    }

    @Override
    public Object visitArrayAssignment(@NotNull JavaScriptParser.ArrayAssignmentContext ctx) {
        // Nothing to do
        return null;
    }

    @Override
    public Object visitCallParams(@NotNull JavaScriptParser.CallParamsContext ctx) {
        // Nothing to do
        return null;
    }

    @Override
    public Object visitPlusExpression(@NotNull JavaScriptParser.PlusExpressionContext ctx) {
        // Nothing to do
        return null;
    }

    @Override
    public Object visitModExpression(@NotNull JavaScriptParser.ModExpressionContext ctx) {
        // Nothing to do
        return null;
    }

    @Override
    public Object visit(@NotNull ParseTree tree) {
        // Nothing to do
        return null;
    }

    @Override
    public Object visitChildren(@NotNull RuleNode node) {
        // Nothing to do
        return null;
    }

    @Override
    public Object visitErrorNode(@NotNull ErrorNode node) {
        // Nothing to do
        return null;
    }

    @Override
    public Object visitGetPropertyOnInstance(@NotNull JavaScriptParser.GetPropertyOnInstanceContext ctx) {
        // Nothing to do
        return null;
    }

    @Override
    public Object visitThisGetterExpression(@NotNull JavaScriptParser.ThisGetterExpressionContext ctx) {
        // Nothing to do
        return null;
    }

    @Override
    public Object visitThisSetterExpression(@NotNull JavaScriptParser.ThisSetterExpressionContext ctx) {
        // Nothing to do
        return null;
    }

}
