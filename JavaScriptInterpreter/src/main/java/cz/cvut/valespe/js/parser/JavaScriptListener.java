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
	 * Enter a parse tree produced by {@link JavaScriptParser#varAssignment}.
	 * @param ctx the parse tree
	 */
	void enterVarAssignment(@NotNull JavaScriptParser.VarAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#varAssignment}.
	 * @param ctx the parse tree
	 */
	void exitVarAssignment(@NotNull JavaScriptParser.VarAssignmentContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaScriptParser#thisSetterExpression}.
	 * @param ctx the parse tree
	 */
	void enterThisSetterExpression(@NotNull JavaScriptParser.ThisSetterExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#thisSetterExpression}.
	 * @param ctx the parse tree
	 */
	void exitThisSetterExpression(@NotNull JavaScriptParser.ThisSetterExpressionContext ctx);

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
	 * Enter a parse tree produced by {@link JavaScriptParser#messageToInstanceExpression}.
	 * @param ctx the parse tree
	 */
	void enterMessageToInstanceExpression(@NotNull JavaScriptParser.MessageToInstanceExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#messageToInstanceExpression}.
	 * @param ctx the parse tree
	 */
	void exitMessageToInstanceExpression(@NotNull JavaScriptParser.MessageToInstanceExpressionContext ctx);

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
	 * Enter a parse tree produced by {@link JavaScriptParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(@NotNull JavaScriptParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(@NotNull JavaScriptParser.FunctionCallContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaScriptParser#callParam}.
	 * @param ctx the parse tree
	 */
	void enterCallParam(@NotNull JavaScriptParser.CallParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#callParam}.
	 * @param ctx the parse tree
	 */
	void exitCallParam(@NotNull JavaScriptParser.CallParamContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaScriptParser#thisExpressionExpression}.
	 * @param ctx the parse tree
	 */
	void enterThisExpressionExpression(@NotNull JavaScriptParser.ThisExpressionExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#thisExpressionExpression}.
	 * @param ctx the parse tree
	 */
	void exitThisExpressionExpression(@NotNull JavaScriptParser.ThisExpressionExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaScriptParser#createInstanceExpression}.
	 * @param ctx the parse tree
	 */
	void enterCreateInstanceExpression(@NotNull JavaScriptParser.CreateInstanceExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#createInstanceExpression}.
	 * @param ctx the parse tree
	 */
	void exitCreateInstanceExpression(@NotNull JavaScriptParser.CreateInstanceExpressionContext ctx);

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
	 * Enter a parse tree produced by {@link JavaScriptParser#getPropertyOnInstance}.
	 * @param ctx the parse tree
	 */
	void enterGetPropertyOnInstance(@NotNull JavaScriptParser.GetPropertyOnInstanceContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#getPropertyOnInstance}.
	 * @param ctx the parse tree
	 */
	void exitGetPropertyOnInstance(@NotNull JavaScriptParser.GetPropertyOnInstanceContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaScriptParser#thisGetterExpression}.
	 * @param ctx the parse tree
	 */
	void enterThisGetterExpression(@NotNull JavaScriptParser.ThisGetterExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#thisGetterExpression}.
	 * @param ctx the parse tree
	 */
	void exitThisGetterExpression(@NotNull JavaScriptParser.ThisGetterExpressionContext ctx);

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
	 * Enter a parse tree produced by {@link JavaScriptParser#callParams}.
	 * @param ctx the parse tree
	 */
	void enterCallParams(@NotNull JavaScriptParser.CallParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#callParams}.
	 * @param ctx the parse tree
	 */
	void exitCallParams(@NotNull JavaScriptParser.CallParamsContext ctx);

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
	 * Enter a parse tree produced by {@link JavaScriptParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclaration(@NotNull JavaScriptParser.VarDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclaration(@NotNull JavaScriptParser.VarDeclarationContext ctx);

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
	 * Enter a parse tree produced by {@link JavaScriptParser#setPropertyOnInstance}.
	 * @param ctx the parse tree
	 */
	void enterSetPropertyOnInstance(@NotNull JavaScriptParser.SetPropertyOnInstanceContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#setPropertyOnInstance}.
	 * @param ctx the parse tree
	 */
	void exitSetPropertyOnInstance(@NotNull JavaScriptParser.SetPropertyOnInstanceContext ctx);

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
	 * Enter a parse tree produced by {@link JavaScriptParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void enterFunctionBody(@NotNull JavaScriptParser.FunctionBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void exitFunctionBody(@NotNull JavaScriptParser.FunctionBodyContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaScriptParser#callMethodOnInstance}.
	 * @param ctx the parse tree
	 */
	void enterCallMethodOnInstance(@NotNull JavaScriptParser.CallMethodOnInstanceContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#callMethodOnInstance}.
	 * @param ctx the parse tree
	 */
	void exitCallMethodOnInstance(@NotNull JavaScriptParser.CallMethodOnInstanceContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaScriptParser#createInstance}.
	 * @param ctx the parse tree
	 */
	void enterCreateInstance(@NotNull JavaScriptParser.CreateInstanceContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#createInstance}.
	 * @param ctx the parse tree
	 */
	void exitCreateInstance(@NotNull JavaScriptParser.CreateInstanceContext ctx);

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
	 * Enter a parse tree produced by {@link JavaScriptParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(@NotNull JavaScriptParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(@NotNull JavaScriptParser.AssignmentContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaScriptParser#thisCallMethod}.
	 * @param ctx the parse tree
	 */
	void enterThisCallMethod(@NotNull JavaScriptParser.ThisCallMethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#thisCallMethod}.
	 * @param ctx the parse tree
	 */
	void exitThisCallMethod(@NotNull JavaScriptParser.ThisCallMethodContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaScriptParser#functionCallExpression}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallExpression(@NotNull JavaScriptParser.FunctionCallExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#functionCallExpression}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallExpression(@NotNull JavaScriptParser.FunctionCallExpressionContext ctx);

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
}