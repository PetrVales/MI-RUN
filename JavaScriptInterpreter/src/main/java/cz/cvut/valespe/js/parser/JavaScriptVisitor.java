// Generated from JavaScript.g4 by ANTLR 4.1
package cz.cvut.valespe.js.parser;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link JavaScriptParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface JavaScriptVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link JavaScriptParser#varAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarAssignment(@NotNull JavaScriptParser.VarAssignmentContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaScriptParser#parenthesesExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesesExpression(@NotNull JavaScriptParser.ParenthesesExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaScriptParser#anonymousFunctionExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnonymousFunctionExpression(@NotNull JavaScriptParser.AnonymousFunctionExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaScriptParser#id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(@NotNull JavaScriptParser.IdContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaScriptParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(@NotNull JavaScriptParser.FunctionCallContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaScriptParser#callParam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallParam(@NotNull JavaScriptParser.CallParamContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaScriptParser#createInstanceExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateInstanceExpression(@NotNull JavaScriptParser.CreateInstanceExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaScriptParser#thisAssignmentExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThisAssignmentExpression(@NotNull JavaScriptParser.ThisAssignmentExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaScriptParser#file}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile(@NotNull JavaScriptParser.FileContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaScriptParser#anonymousFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnonymousFunction(@NotNull JavaScriptParser.AnonymousFunctionContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaScriptParser#callParams}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallParams(@NotNull JavaScriptParser.CallParamsContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaScriptParser#plusExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlusExpression(@NotNull JavaScriptParser.PlusExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaScriptParser#assignmentExpressionExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentExpressionExpression(@NotNull JavaScriptParser.AssignmentExpressionExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaScriptParser#varDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDeclaration(@NotNull JavaScriptParser.VarDeclarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaScriptParser#functionParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionParameters(@NotNull JavaScriptParser.FunctionParametersContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaScriptParser#minusExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinusExpression(@NotNull JavaScriptParser.MinusExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaScriptParser#int}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt(@NotNull JavaScriptParser.IntContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaScriptParser#mulExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulExpression(@NotNull JavaScriptParser.MulExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaScriptParser#functionBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionBody(@NotNull JavaScriptParser.FunctionBodyContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaScriptParser#createInstance}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateInstance(@NotNull JavaScriptParser.CreateInstanceContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaScriptParser#divExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivExpression(@NotNull JavaScriptParser.DivExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaScriptParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(@NotNull JavaScriptParser.AssignmentContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaScriptParser#thisAssignmentExpressionExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThisAssignmentExpressionExpression(@NotNull JavaScriptParser.ThisAssignmentExpressionExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaScriptParser#functionCallExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCallExpression(@NotNull JavaScriptParser.FunctionCallExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaScriptParser#functionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclaration(@NotNull JavaScriptParser.FunctionDeclarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaScriptParser#functionName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionName(@NotNull JavaScriptParser.FunctionNameContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaScriptParser#modExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModExpression(@NotNull JavaScriptParser.ModExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaScriptParser#functionParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionParameter(@NotNull JavaScriptParser.FunctionParameterContext ctx);
}