// Generated from JavaScript.g4 by ANTLR 4.1
package cz.cvut.valespe.js.parser;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JavaScriptParser}.
 */
public interface JavaScriptListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JavaScriptParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentOperator(@NotNull JavaScriptParser.AssignmentOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentOperator(@NotNull JavaScriptParser.AssignmentOperatorContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaScriptParser#functionParameters}.
	 * @param ctx the parse tree
	 */
	void enterFunctionParameters(@NotNull JavaScriptParser.FunctionParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#functionParameters}.
	 * @param ctx the parse tree
	 */
	void exitFunctionParameters(@NotNull JavaScriptParser.FunctionParametersContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaScriptParser#minusExpression}.
	 * @param ctx the parse tree
	 */
	void enterMinusExpression(@NotNull JavaScriptParser.MinusExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#minusExpression}.
	 * @param ctx the parse tree
	 */
	void exitMinusExpression(@NotNull JavaScriptParser.MinusExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaScriptParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentExpression(@NotNull JavaScriptParser.AssignmentExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentExpression(@NotNull JavaScriptParser.AssignmentExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaScriptParser#int}.
	 * @param ctx the parse tree
	 */
	void enterInt(@NotNull JavaScriptParser.IntContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#int}.
	 * @param ctx the parse tree
	 */
	void exitInt(@NotNull JavaScriptParser.IntContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaScriptParser#mulExpression}.
	 * @param ctx the parse tree
	 */
	void enterMulExpression(@NotNull JavaScriptParser.MulExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#mulExpression}.
	 * @param ctx the parse tree
	 */
	void exitMulExpression(@NotNull JavaScriptParser.MulExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaScriptParser#parenthesesExpression}.
	 * @param ctx the parse tree
	 */
	void enterParenthesesExpression(@NotNull JavaScriptParser.ParenthesesExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#parenthesesExpression}.
	 * @param ctx the parse tree
	 */
	void exitParenthesesExpression(@NotNull JavaScriptParser.ParenthesesExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaScriptParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(@NotNull JavaScriptParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(@NotNull JavaScriptParser.BlockContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaScriptParser#anonymousFunctionExpression}.
	 * @param ctx the parse tree
	 */
	void enterAnonymousFunctionExpression(@NotNull JavaScriptParser.AnonymousFunctionExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#anonymousFunctionExpression}.
	 * @param ctx the parse tree
	 */
	void exitAnonymousFunctionExpression(@NotNull JavaScriptParser.AnonymousFunctionExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaScriptParser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(@NotNull JavaScriptParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(@NotNull JavaScriptParser.IdContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaScriptParser#divExpression}.
	 * @param ctx the parse tree
	 */
	void enterDivExpression(@NotNull JavaScriptParser.DivExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#divExpression}.
	 * @param ctx the parse tree
	 */
	void exitDivExpression(@NotNull JavaScriptParser.DivExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaScriptParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(@NotNull JavaScriptParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(@NotNull JavaScriptParser.FileContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaScriptParser#anonymousFunction}.
	 * @param ctx the parse tree
	 */
	void enterAnonymousFunction(@NotNull JavaScriptParser.AnonymousFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#anonymousFunction}.
	 * @param ctx the parse tree
	 */
	void exitAnonymousFunction(@NotNull JavaScriptParser.AnonymousFunctionContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaScriptParser#plusExpression}.
	 * @param ctx the parse tree
	 */
	void enterPlusExpression(@NotNull JavaScriptParser.PlusExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#plusExpression}.
	 * @param ctx the parse tree
	 */
	void exitPlusExpression(@NotNull JavaScriptParser.PlusExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaScriptParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclaration(@NotNull JavaScriptParser.FunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclaration(@NotNull JavaScriptParser.FunctionDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaScriptParser#functionName}.
	 * @param ctx the parse tree
	 */
	void enterFunctionName(@NotNull JavaScriptParser.FunctionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#functionName}.
	 * @param ctx the parse tree
	 */
	void exitFunctionName(@NotNull JavaScriptParser.FunctionNameContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaScriptParser#assignmentExpressionExpression}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentExpressionExpression(@NotNull JavaScriptParser.AssignmentExpressionExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#assignmentExpressionExpression}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentExpressionExpression(@NotNull JavaScriptParser.AssignmentExpressionExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaScriptParser#modExpression}.
	 * @param ctx the parse tree
	 */
	void enterModExpression(@NotNull JavaScriptParser.ModExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#modExpression}.
	 * @param ctx the parse tree
	 */
	void exitModExpression(@NotNull JavaScriptParser.ModExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaScriptParser#functionParameter}.
	 * @param ctx the parse tree
	 */
	void enterFunctionParameter(@NotNull JavaScriptParser.FunctionParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#functionParameter}.
	 * @param ctx the parse tree
	 */
	void exitFunctionParameter(@NotNull JavaScriptParser.FunctionParameterContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaScriptParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclaration(@NotNull JavaScriptParser.VarDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclaration(@NotNull JavaScriptParser.VarDeclarationContext ctx);
}