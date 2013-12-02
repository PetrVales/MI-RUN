package cz.cvut.valespe.js.interpreter;


import cz.cvut.valespe.js.parser.JavaScriptParser;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.List;

/**
 * TODO javadoc
 */
public class JavaScriptVisitor implements cz.cvut.valespe.js.parser.JavaScriptVisitor {

    private Scope scope;

    public JavaScriptVisitor(Scope scope) {
        this.scope = scope;
    }

    @Override
    public Object visitAssignmentOperator(@NotNull JavaScriptParser.AssignmentOperatorContext ctx) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Object visitFunctionParameters(@NotNull JavaScriptParser.FunctionParametersContext ctx) {
        List<String> params = new ArrayList<String>();
        if (ctx.functionParameter() != null) {
            for (JavaScriptParser.FunctionParameterContext param : ctx.functionParameter()) {
                params.add((String) param.accept(this));
            }
        }
        return params;
    }

    @Override
    public Object visitMinusExpression(@NotNull JavaScriptParser.MinusExpressionContext ctx) {
        return (Integer) ctx.expression(0).accept(this) - (Integer) ctx.expression(1).accept(this);
    }

    @Override
    public Object visitAssignmentExpression(@NotNull JavaScriptParser.AssignmentExpressionContext ctx) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Object visitMulExpression(@NotNull JavaScriptParser.MulExpressionContext ctx) {
        return (Integer) ctx.expression(0).accept(this) * (Integer) ctx.expression(1).accept(this);
    }

    @Override
    public Object visitInt(@NotNull JavaScriptParser.IntContext ctx) {
        return ctx.INT().accept(this);
    }

    @Override
    public Object visitParenthesesExpression(@NotNull JavaScriptParser.ParenthesesExpressionContext ctx) {
        return ctx.expression().accept(this);
    }

    @Override
    public Object visitBlock(@NotNull JavaScriptParser.BlockContext ctx) {
        for (JavaScriptParser.ExpressionContext expressionContext : ctx.expression()) {
            return expressionContext.accept(this);
        }
        return null;
    }

    @Override
    public Object visitAnonymousFunctionExpression(@NotNull JavaScriptParser.AnonymousFunctionExpressionContext ctx) {
        return ctx.anonymousFunction().accept(this);
    }

    @Override
    public Object visitId(@NotNull JavaScriptParser.IdContext ctx) {
        return ctx.ID();
    }

    @Override
    public Object visitDivExpression(@NotNull JavaScriptParser.DivExpressionContext ctx) {
        return (Integer) ctx.expression(0).accept(this) / (Integer) ctx.expression(1).accept(this);
    }

    @Override
    public Object visitFile(@NotNull JavaScriptParser.FileContext ctx) {
        for (JavaScriptParser.FunctionDeclarationContext functionDeclarationContext : ctx.functionDeclaration()) {
            return functionDeclarationContext.accept(this);
        }
        for (JavaScriptParser.VarDeclarationContext varDeclarationContext : ctx.varDeclaration()) {
            return varDeclarationContext.accept(this);
        }
        for (JavaScriptParser.ExpressionContext expressionContext : ctx.expression()) {
            return expressionContext.accept(this);
        }
        return null;
    }

    @Override
    public Object visitAnonymousFunction(@NotNull JavaScriptParser.AnonymousFunctionContext ctx) {
        return new Function(getFunctionParams(ctx.functionParameters()), ctx.block());
    }

    @Override
    public Object visitFunctionDeclaration(@NotNull JavaScriptParser.FunctionDeclarationContext ctx) {
        final Function function = new Function(getFunctionParams(ctx.functionParameters()), ctx.block());
        setVariable((String) ctx.functionName().accept(this), function);
        return function;
    }

    private List getFunctionParams(JavaScriptParser.FunctionParametersContext functionParameters) {
        return functionParameters == null ? new ArrayList() : (List) functionParameters.accept(this);
    }

    @Override
    public Object visitPlusExpression(@NotNull JavaScriptParser.PlusExpressionContext ctx) {
        return (Integer) ctx.expression(0).accept(this) + (Integer) ctx.expression(1).accept(this);
    }

    @Override
    public Object visitFunctionName(@NotNull JavaScriptParser.FunctionNameContext ctx) {
        return ctx.ID().accept(this);
    }

    @Override
    public Object visitAssignmentExpressionExpression(@NotNull JavaScriptParser.AssignmentExpressionExpressionContext ctx) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Object visitModExpression(@NotNull JavaScriptParser.ModExpressionContext ctx) {
        return (Integer) ctx.expression(0).accept(this) % (Integer) ctx.expression(1).accept(this);
    }

    @Override
    public Object visitFunctionParameter(@NotNull JavaScriptParser.FunctionParameterContext ctx) {
        return ctx.ID().accept(this);
    }

    @Override
    public Object visitVarDeclaration(@NotNull JavaScriptParser.VarDeclarationContext ctx) {
        defineNameInCurrentScope((String) ctx.ID().accept(this));
        return null;
    }

    @Override
    public Object visit(@NotNull ParseTree tree) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Object visitChildren(@NotNull RuleNode node) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
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
    public Object visitErrorNode(@NotNull ErrorNode node) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    private void defineNameInCurrentScope(String name) {
        scope.define(name);
    }

    private void setVariable(String name, Object value) {
        scope.set(name, value);
    }

    private Object getVariable(String name) {
        return scope.get(name);
    }

}
