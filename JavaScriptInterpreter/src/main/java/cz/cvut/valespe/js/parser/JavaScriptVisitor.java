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
	 * Visit a parse tree produced by {@link JavaScriptParser#arrayAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAssignment(@NotNull JavaScriptParser.ArrayAssignmentContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaScriptParser#anonymousFunctionExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnonymousFunctionExpression(@NotNull JavaScriptParser.AnonymousFunctionExpressionContext ctx);

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
	 * Visit a parse tree produced by {@link JavaScriptParser#thisExpressionExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThisExpressionExpression(@NotNull JavaScriptParser.ThisExpressionExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaScriptParser#arrayAccessExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAccessExpression(@NotNull JavaScriptParser.ArrayAccessExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaScriptParser#file}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile(@NotNull JavaScriptParser.FileContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaScriptParser#getPropertyOnInstance}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetPropertyOnInstance(@NotNull JavaScriptParser.GetPropertyOnInstanceContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaScriptParser#false}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFalse(@NotNull JavaScriptParser.FalseContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaScriptParser#assignmentExpressionExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentExpressionExpression(@NotNull JavaScriptParser.AssignmentExpressionExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaScriptParser#functionParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionParameters(@NotNull JavaScriptParser.FunctionParametersContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaScriptParser#setPropertyOnInstance}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetPropertyOnInstance(@NotNull JavaScriptParser.SetPropertyOnInstanceContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaScriptParser#int}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt(@NotNull JavaScriptParser.IntContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaScriptParser#ifExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfExpression(@NotNull JavaScriptParser.IfExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaScriptParser#mulExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulExpression(@NotNull JavaScriptParser.MulExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaScriptParser#notExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotExpression(@NotNull JavaScriptParser.NotExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaScriptParser#createInstance}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateInstance(@NotNull JavaScriptParser.CreateInstanceContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaScriptParser#arrayAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAccess(@NotNull JavaScriptParser.ArrayAccessContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaScriptParser#divExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivExpression(@NotNull JavaScriptParser.DivExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaScriptParser#createArray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateArray(@NotNull JavaScriptParser.CreateArrayContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaScriptParser#functionCallExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCallExpression(@NotNull JavaScriptParser.FunctionCallExpressionContext ctx);

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
	 * Visit a parse tree produced by {@link JavaScriptParser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(@NotNull JavaScriptParser.ArrayContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaScriptParser#arrayAssignmentExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAssignmentExpression(@NotNull JavaScriptParser.ArrayAssignmentExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaScriptParser#prototypeAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrototypeAssignment(@NotNull JavaScriptParser.PrototypeAssignmentContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaScriptParser#varAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarAssignment(@NotNull JavaScriptParser.VarAssignmentContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaScriptParser#thisSetterExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThisSetterExpression(@NotNull JavaScriptParser.ThisSetterExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaScriptParser#parenthesesExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesesExpression(@NotNull JavaScriptParser.ParenthesesExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaScriptParser#messageToInstanceExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMessageToInstanceExpression(@NotNull JavaScriptParser.MessageToInstanceExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaScriptParser#orExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrExpression(@NotNull JavaScriptParser.OrExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaScriptParser#prototypeAssignmentExpressionExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrototypeAssignmentExpressionExpression(@NotNull JavaScriptParser.PrototypeAssignmentExpressionExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaScriptParser#id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(@NotNull JavaScriptParser.IdContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaScriptParser#andExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpression(@NotNull JavaScriptParser.AndExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaScriptParser#createInstanceExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateInstanceExpression(@NotNull JavaScriptParser.CreateInstanceExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaScriptParser#equalsExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualsExpression(@NotNull JavaScriptParser.EqualsExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaScriptParser#thisGetterExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThisGetterExpression(@NotNull JavaScriptParser.ThisGetterExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaScriptParser#callParams}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallParams(@NotNull JavaScriptParser.CallParamsContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaScriptParser#anonymousFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnonymousFunction(@NotNull JavaScriptParser.AnonymousFunctionContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaScriptParser#plusExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlusExpression(@NotNull JavaScriptParser.PlusExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaScriptParser#varDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDeclaration(@NotNull JavaScriptParser.VarDeclarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaScriptParser#minusExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinusExpression(@NotNull JavaScriptParser.MinusExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaScriptParser#true}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrue(@NotNull JavaScriptParser.TrueContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaScriptParser#functionBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionBody(@NotNull JavaScriptParser.FunctionBodyContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaScriptParser#callMethodOnInstance}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallMethodOnInstance(@NotNull JavaScriptParser.CallMethodOnInstanceContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaScriptParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(@NotNull JavaScriptParser.IfStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaScriptParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(@NotNull JavaScriptParser.AssignmentContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaScriptParser#unaryMinusExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryMinusExpression(@NotNull JavaScriptParser.UnaryMinusExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaScriptParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(@NotNull JavaScriptParser.StringContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaScriptParser#thisCallMethod}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThisCallMethod(@NotNull JavaScriptParser.ThisCallMethodContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaScriptParser#functionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclaration(@NotNull JavaScriptParser.FunctionDeclarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaScriptParser#functionParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionParameter(@NotNull JavaScriptParser.FunctionParameterContext ctx);
}