// Generated from JavaScript.g4 by ANTLR 4.1
package cz.cvut.valespe.js.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JavaScriptParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__9=1, T__8=2, T__7=3, T__6=4, T__5=5, T__4=6, T__3=7, T__2=8, T__1=9, 
		T__0=10, ASSIGNMENT=11, PLUS=12, MINUS=13, MUL=14, DIV=15, MOD=16, INT=17, 
		ID=18, WS=19, COMMENT=20, LINE_COMMENT=21;
	public static final String[] tokenNames = {
		"<INVALID>", "'{'", "'function'", "')'", "'.'", "','", "'('", "'new'", 
		"'}'", "'var'", "'this.'", "'='", "'+'", "'-'", "'*'", "'/'", "'%'", "INT", 
		"ID", "WS", "COMMENT", "LINE_COMMENT"
	};
	public static final int
		RULE_file = 0, RULE_functionDeclaration = 1, RULE_functionName = 2, RULE_functionParameters = 3, 
		RULE_functionParameter = 4, RULE_functionBody = 5, RULE_expression = 6, 
		RULE_functionCall = 7, RULE_callParams = 8, RULE_callParam = 9, RULE_createInstance = 10, 
		RULE_messageToInstance = 11, RULE_thisExpression = 12, RULE_assignmentExpression = 13, 
		RULE_anonymousFunction = 14, RULE_varDeclaration = 15;
	public static final String[] ruleNames = {
		"file", "functionDeclaration", "functionName", "functionParameters", "functionParameter", 
		"functionBody", "expression", "functionCall", "callParams", "callParam", 
		"createInstance", "messageToInstance", "thisExpression", "assignmentExpression", 
		"anonymousFunction", "varDeclaration"
	};

	@Override
	public String getGrammarFileName() { return "JavaScript.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public JavaScriptParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class FileContext extends ParserRuleContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public FunctionDeclarationContext functionDeclaration(int i) {
			return getRuleContext(FunctionDeclarationContext.class,i);
		}
		public List<VarDeclarationContext> varDeclaration() {
			return getRuleContexts(VarDeclarationContext.class);
		}
		public List<FunctionDeclarationContext> functionDeclaration() {
			return getRuleContexts(FunctionDeclarationContext.class);
		}
		public VarDeclarationContext varDeclaration(int i) {
			return getRuleContext(VarDeclarationContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public FileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptListener ) ((JavaScriptListener)listener).enterFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptListener ) ((JavaScriptListener)listener).exitFile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaScriptVisitor ) return ((JavaScriptVisitor<? extends T>)visitor).visitFile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FileContext file() throws RecognitionException {
		FileContext _localctx = new FileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_file);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(35);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(32); functionDeclaration();
					}
					break;

				case 2:
					{
					setState(33); expression(0);
					}
					break;

				case 3:
					{
					setState(34); varDeclaration();
					}
					break;
				}
				}
				setState(37); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 2) | (1L << 6) | (1L << 7) | (1L << 9) | (1L << 10) | (1L << INT) | (1L << ID))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionDeclarationContext extends ParserRuleContext {
		public FunctionParametersContext functionParameters() {
			return getRuleContext(FunctionParametersContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(JavaScriptParser.WS); }
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public TerminalNode WS(int i) {
			return getToken(JavaScriptParser.WS, i);
		}
		public FunctionNameContext functionName() {
			return getRuleContext(FunctionNameContext.class,0);
		}
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptListener ) ((JavaScriptListener)listener).enterFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptListener ) ((JavaScriptListener)listener).exitFunctionDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaScriptVisitor ) return ((JavaScriptVisitor<? extends T>)visitor).visitFunctionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_functionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39); match(2);
			setState(41);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(40); match(WS);
				}
			}

			setState(43); functionName();
			setState(45);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(44); match(WS);
				}
			}

			setState(47); match(6);
			setState(49);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(48); functionParameters();
				}
			}

			setState(51); match(3);
			setState(53);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(52); match(WS);
				}
			}

			setState(55); functionBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionNameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(JavaScriptParser.ID, 0); }
		public FunctionNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptListener ) ((JavaScriptListener)listener).enterFunctionName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptListener ) ((JavaScriptListener)listener).exitFunctionName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaScriptVisitor ) return ((JavaScriptVisitor<? extends T>)visitor).visitFunctionName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionNameContext functionName() throws RecognitionException {
		FunctionNameContext _localctx = new FunctionNameContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_functionName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57); match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionParametersContext extends ParserRuleContext {
		public FunctionParameterContext functionParameter(int i) {
			return getRuleContext(FunctionParameterContext.class,i);
		}
		public List<FunctionParameterContext> functionParameter() {
			return getRuleContexts(FunctionParameterContext.class);
		}
		public FunctionParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptListener ) ((JavaScriptListener)listener).enterFunctionParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptListener ) ((JavaScriptListener)listener).exitFunctionParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaScriptVisitor ) return ((JavaScriptVisitor<? extends T>)visitor).visitFunctionParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionParametersContext functionParameters() throws RecognitionException {
		FunctionParametersContext _localctx = new FunctionParametersContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_functionParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59); functionParameter();
			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==5) {
				{
				{
				setState(60); match(5);
				setState(61); functionParameter();
				}
				}
				setState(66);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionParameterContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(JavaScriptParser.ID, 0); }
		public FunctionParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptListener ) ((JavaScriptListener)listener).enterFunctionParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptListener ) ((JavaScriptListener)listener).exitFunctionParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaScriptVisitor ) return ((JavaScriptVisitor<? extends T>)visitor).visitFunctionParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionParameterContext functionParameter() throws RecognitionException {
		FunctionParameterContext _localctx = new FunctionParameterContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_functionParameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67); match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionBodyContext extends ParserRuleContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public FunctionDeclarationContext functionDeclaration(int i) {
			return getRuleContext(FunctionDeclarationContext.class,i);
		}
		public List<VarDeclarationContext> varDeclaration() {
			return getRuleContexts(VarDeclarationContext.class);
		}
		public List<FunctionDeclarationContext> functionDeclaration() {
			return getRuleContexts(FunctionDeclarationContext.class);
		}
		public VarDeclarationContext varDeclaration(int i) {
			return getRuleContext(VarDeclarationContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public FunctionBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptListener ) ((JavaScriptListener)listener).enterFunctionBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptListener ) ((JavaScriptListener)listener).exitFunctionBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaScriptVisitor ) return ((JavaScriptVisitor<? extends T>)visitor).visitFunctionBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionBodyContext functionBody() throws RecognitionException {
		FunctionBodyContext _localctx = new FunctionBodyContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_functionBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69); match(1);
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 2) | (1L << 6) | (1L << 7) | (1L << 9) | (1L << 10) | (1L << INT) | (1L << ID))) != 0)) {
				{
				setState(73);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(70); functionDeclaration();
					}
					break;

				case 2:
					{
					setState(71); expression(0);
					}
					break;

				case 3:
					{
					setState(72); varDeclaration();
					}
					break;
				}
				}
				setState(77);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(78); match(8);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public int _p;
		public ExpressionContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ExpressionContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
			this._p = ctx._p;
		}
	}
	public static class IdContext extends ExpressionContext {
		public TerminalNode ID() { return getToken(JavaScriptParser.ID, 0); }
		public IdContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptListener ) ((JavaScriptListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptListener ) ((JavaScriptListener)listener).exitId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaScriptVisitor ) return ((JavaScriptVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DivExpressionContext extends ExpressionContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode DIV() { return getToken(JavaScriptParser.DIV, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public DivExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptListener ) ((JavaScriptListener)listener).enterDivExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptListener ) ((JavaScriptListener)listener).exitDivExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaScriptVisitor ) return ((JavaScriptVisitor<? extends T>)visitor).visitDivExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MinusExpressionContext extends ExpressionContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode MINUS() { return getToken(JavaScriptParser.MINUS, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public MinusExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptListener ) ((JavaScriptListener)listener).enterMinusExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptListener ) ((JavaScriptListener)listener).exitMinusExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaScriptVisitor ) return ((JavaScriptVisitor<? extends T>)visitor).visitMinusExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ThisExpressionExpressionContext extends ExpressionContext {
		public ThisExpressionContext thisExpression() {
			return getRuleContext(ThisExpressionContext.class,0);
		}
		public ThisExpressionExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptListener ) ((JavaScriptListener)listener).enterThisExpressionExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptListener ) ((JavaScriptListener)listener).exitThisExpressionExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaScriptVisitor ) return ((JavaScriptVisitor<? extends T>)visitor).visitThisExpressionExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateInstanceExpressionContext extends ExpressionContext {
		public CreateInstanceContext createInstance() {
			return getRuleContext(CreateInstanceContext.class,0);
		}
		public CreateInstanceExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptListener ) ((JavaScriptListener)listener).enterCreateInstanceExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptListener ) ((JavaScriptListener)listener).exitCreateInstanceExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaScriptVisitor ) return ((JavaScriptVisitor<? extends T>)visitor).visitCreateInstanceExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntContext extends ExpressionContext {
		public TerminalNode INT() { return getToken(JavaScriptParser.INT, 0); }
		public IntContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptListener ) ((JavaScriptListener)listener).enterInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptListener ) ((JavaScriptListener)listener).exitInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaScriptVisitor ) return ((JavaScriptVisitor<? extends T>)visitor).visitInt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MulExpressionContext extends ExpressionContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode MUL() { return getToken(JavaScriptParser.MUL, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public MulExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptListener ) ((JavaScriptListener)listener).enterMulExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptListener ) ((JavaScriptListener)listener).exitMulExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaScriptVisitor ) return ((JavaScriptVisitor<? extends T>)visitor).visitMulExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenthesesExpressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParenthesesExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptListener ) ((JavaScriptListener)listener).enterParenthesesExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptListener ) ((JavaScriptListener)listener).exitParenthesesExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaScriptVisitor ) return ((JavaScriptVisitor<? extends T>)visitor).visitParenthesesExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunctionCallExpressionContext extends ExpressionContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public FunctionCallExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptListener ) ((JavaScriptListener)listener).enterFunctionCallExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptListener ) ((JavaScriptListener)listener).exitFunctionCallExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaScriptVisitor ) return ((JavaScriptVisitor<? extends T>)visitor).visitFunctionCallExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AnonymousFunctionExpressionContext extends ExpressionContext {
		public AnonymousFunctionContext anonymousFunction() {
			return getRuleContext(AnonymousFunctionContext.class,0);
		}
		public AnonymousFunctionExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptListener ) ((JavaScriptListener)listener).enterAnonymousFunctionExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptListener ) ((JavaScriptListener)listener).exitAnonymousFunctionExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaScriptVisitor ) return ((JavaScriptVisitor<? extends T>)visitor).visitAnonymousFunctionExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MessageToInstanceExpressionContext extends ExpressionContext {
		public MessageToInstanceContext messageToInstance() {
			return getRuleContext(MessageToInstanceContext.class,0);
		}
		public MessageToInstanceExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptListener ) ((JavaScriptListener)listener).enterMessageToInstanceExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptListener ) ((JavaScriptListener)listener).exitMessageToInstanceExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaScriptVisitor ) return ((JavaScriptVisitor<? extends T>)visitor).visitMessageToInstanceExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PlusExpressionContext extends ExpressionContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode PLUS() { return getToken(JavaScriptParser.PLUS, 0); }
		public PlusExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptListener ) ((JavaScriptListener)listener).enterPlusExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptListener ) ((JavaScriptListener)listener).exitPlusExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaScriptVisitor ) return ((JavaScriptVisitor<? extends T>)visitor).visitPlusExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignmentExpressionExpressionContext extends ExpressionContext {
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public AssignmentExpressionExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptListener ) ((JavaScriptListener)listener).enterAssignmentExpressionExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptListener ) ((JavaScriptListener)listener).exitAssignmentExpressionExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaScriptVisitor ) return ((JavaScriptVisitor<? extends T>)visitor).visitAssignmentExpressionExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ModExpressionContext extends ExpressionContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode MOD() { return getToken(JavaScriptParser.MOD, 0); }
		public ModExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptListener ) ((JavaScriptListener)listener).enterModExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptListener ) ((JavaScriptListener)listener).exitModExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaScriptVisitor ) return ((JavaScriptVisitor<? extends T>)visitor).visitModExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState, _p);
		ExpressionContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, RULE_expression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				_localctx = new FunctionCallExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(81); functionCall();
				}
				break;

			case 2:
				{
				_localctx = new CreateInstanceExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(82); createInstance();
				}
				break;

			case 3:
				{
				_localctx = new ThisExpressionExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(83); thisExpression();
				}
				break;

			case 4:
				{
				_localctx = new MessageToInstanceExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(84); messageToInstance();
				}
				break;

			case 5:
				{
				_localctx = new IdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(85); match(ID);
				}
				break;

			case 6:
				{
				_localctx = new IntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(86); match(INT);
				}
				break;

			case 7:
				{
				_localctx = new AssignmentExpressionExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(87); assignmentExpression();
				}
				break;

			case 8:
				{
				_localctx = new AnonymousFunctionExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(88); anonymousFunction();
				}
				break;

			case 9:
				{
				_localctx = new ParenthesesExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(89); match(6);
				setState(90); expression(0);
				setState(91); match(3);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(112);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(110);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						_localctx = new MulExpressionContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(95);
						if (!(5 >= _localctx._p)) throw new FailedPredicateException(this, "5 >= $_p");
						setState(96); match(MUL);
						setState(97); expression(6);
						}
						break;

					case 2:
						{
						_localctx = new DivExpressionContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(98);
						if (!(4 >= _localctx._p)) throw new FailedPredicateException(this, "4 >= $_p");
						setState(99); match(DIV);
						setState(100); expression(5);
						}
						break;

					case 3:
						{
						_localctx = new ModExpressionContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(101);
						if (!(3 >= _localctx._p)) throw new FailedPredicateException(this, "3 >= $_p");
						setState(102); match(MOD);
						setState(103); expression(4);
						}
						break;

					case 4:
						{
						_localctx = new PlusExpressionContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(104);
						if (!(2 >= _localctx._p)) throw new FailedPredicateException(this, "2 >= $_p");
						setState(105); match(PLUS);
						setState(106); expression(3);
						}
						break;

					case 5:
						{
						_localctx = new MinusExpressionContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(107);
						if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
						setState(108); match(MINUS);
						setState(109); expression(2);
						}
						break;
					}
					} 
				}
				setState(114);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class FunctionCallContext extends ParserRuleContext {
		public CallParamsContext callParams() {
			return getRuleContext(CallParamsContext.class,0);
		}
		public TerminalNode ID() { return getToken(JavaScriptParser.ID, 0); }
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptListener ) ((JavaScriptListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptListener ) ((JavaScriptListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaScriptVisitor ) return ((JavaScriptVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115); match(ID);
			setState(116); match(6);
			setState(118);
			_la = _input.LA(1);
			if (_la==INT || _la==ID) {
				{
				setState(117); callParams();
				}
			}

			setState(120); match(3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CallParamsContext extends ParserRuleContext {
		public CallParamContext callParam(int i) {
			return getRuleContext(CallParamContext.class,i);
		}
		public List<CallParamContext> callParam() {
			return getRuleContexts(CallParamContext.class);
		}
		public CallParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callParams; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptListener ) ((JavaScriptListener)listener).enterCallParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptListener ) ((JavaScriptListener)listener).exitCallParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaScriptVisitor ) return ((JavaScriptVisitor<? extends T>)visitor).visitCallParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallParamsContext callParams() throws RecognitionException {
		CallParamsContext _localctx = new CallParamsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_callParams);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122); callParam();
			setState(127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==5) {
				{
				{
				setState(123); match(5);
				setState(124); callParam();
				}
				}
				setState(129);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CallParamContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(JavaScriptParser.INT, 0); }
		public TerminalNode ID() { return getToken(JavaScriptParser.ID, 0); }
		public CallParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callParam; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptListener ) ((JavaScriptListener)listener).enterCallParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptListener ) ((JavaScriptListener)listener).exitCallParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaScriptVisitor ) return ((JavaScriptVisitor<? extends T>)visitor).visitCallParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallParamContext callParam() throws RecognitionException {
		CallParamContext _localctx = new CallParamContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_callParam);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			_la = _input.LA(1);
			if ( !(_la==INT || _la==ID) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreateInstanceContext extends ParserRuleContext {
		public CallParamsContext callParams() {
			return getRuleContext(CallParamsContext.class,0);
		}
		public TerminalNode ID() { return getToken(JavaScriptParser.ID, 0); }
		public CreateInstanceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createInstance; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptListener ) ((JavaScriptListener)listener).enterCreateInstance(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptListener ) ((JavaScriptListener)listener).exitCreateInstance(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaScriptVisitor ) return ((JavaScriptVisitor<? extends T>)visitor).visitCreateInstance(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateInstanceContext createInstance() throws RecognitionException {
		CreateInstanceContext _localctx = new CreateInstanceContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_createInstance);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132); match(7);
			setState(133); match(ID);
			setState(134); match(6);
			setState(136);
			_la = _input.LA(1);
			if (_la==INT || _la==ID) {
				{
				setState(135); callParams();
				}
			}

			setState(138); match(3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MessageToInstanceContext extends ParserRuleContext {
		public MessageToInstanceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_messageToInstance; }
	 
		public MessageToInstanceContext() { }
		public void copyFrom(MessageToInstanceContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SetPropertyOnInstanceContext extends MessageToInstanceContext {
		public List<TerminalNode> ID() { return getTokens(JavaScriptParser.ID); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ASSIGNMENT() { return getToken(JavaScriptParser.ASSIGNMENT, 0); }
		public TerminalNode ID(int i) {
			return getToken(JavaScriptParser.ID, i);
		}
		public SetPropertyOnInstanceContext(MessageToInstanceContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptListener ) ((JavaScriptListener)listener).enterSetPropertyOnInstance(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptListener ) ((JavaScriptListener)listener).exitSetPropertyOnInstance(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaScriptVisitor ) return ((JavaScriptVisitor<? extends T>)visitor).visitSetPropertyOnInstance(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GetPropertyOnInstanceContext extends MessageToInstanceContext {
		public List<TerminalNode> ID() { return getTokens(JavaScriptParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(JavaScriptParser.ID, i);
		}
		public GetPropertyOnInstanceContext(MessageToInstanceContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptListener ) ((JavaScriptListener)listener).enterGetPropertyOnInstance(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptListener ) ((JavaScriptListener)listener).exitGetPropertyOnInstance(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaScriptVisitor ) return ((JavaScriptVisitor<? extends T>)visitor).visitGetPropertyOnInstance(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CallMethodOnInstanceContext extends MessageToInstanceContext {
		public CallParamsContext callParams() {
			return getRuleContext(CallParamsContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(JavaScriptParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(JavaScriptParser.ID, i);
		}
		public CallMethodOnInstanceContext(MessageToInstanceContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptListener ) ((JavaScriptListener)listener).enterCallMethodOnInstance(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptListener ) ((JavaScriptListener)listener).exitCallMethodOnInstance(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaScriptVisitor ) return ((JavaScriptVisitor<? extends T>)visitor).visitCallMethodOnInstance(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MessageToInstanceContext messageToInstance() throws RecognitionException {
		MessageToInstanceContext _localctx = new MessageToInstanceContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_messageToInstance);
		int _la;
		try {
			setState(156);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				_localctx = new CallMethodOnInstanceContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(140); match(ID);
				setState(141); match(4);
				setState(142); match(ID);
				setState(143); match(6);
				setState(145);
				_la = _input.LA(1);
				if (_la==INT || _la==ID) {
					{
					setState(144); callParams();
					}
				}

				setState(147); match(3);
				}
				break;

			case 2:
				_localctx = new SetPropertyOnInstanceContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(148); match(ID);
				setState(149); match(4);
				setState(150); match(ID);
				setState(151); match(ASSIGNMENT);
				setState(152); expression(0);
				}
				break;

			case 3:
				_localctx = new GetPropertyOnInstanceContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(153); match(ID);
				setState(154); match(4);
				setState(155); match(ID);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ThisExpressionContext extends ParserRuleContext {
		public ThisExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_thisExpression; }
	 
		public ThisExpressionContext() { }
		public void copyFrom(ThisExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ThisCallMethodContext extends ThisExpressionContext {
		public CallParamsContext callParams() {
			return getRuleContext(CallParamsContext.class,0);
		}
		public TerminalNode ID() { return getToken(JavaScriptParser.ID, 0); }
		public ThisCallMethodContext(ThisExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptListener ) ((JavaScriptListener)listener).enterThisCallMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptListener ) ((JavaScriptListener)listener).exitThisCallMethod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaScriptVisitor ) return ((JavaScriptVisitor<? extends T>)visitor).visitThisCallMethod(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ThisSetterExpressionContext extends ThisExpressionContext {
		public TerminalNode ID() { return getToken(JavaScriptParser.ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ASSIGNMENT() { return getToken(JavaScriptParser.ASSIGNMENT, 0); }
		public ThisSetterExpressionContext(ThisExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptListener ) ((JavaScriptListener)listener).enterThisSetterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptListener ) ((JavaScriptListener)listener).exitThisSetterExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaScriptVisitor ) return ((JavaScriptVisitor<? extends T>)visitor).visitThisSetterExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ThisGetterExpressionContext extends ThisExpressionContext {
		public TerminalNode ID() { return getToken(JavaScriptParser.ID, 0); }
		public ThisGetterExpressionContext(ThisExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptListener ) ((JavaScriptListener)listener).enterThisGetterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptListener ) ((JavaScriptListener)listener).exitThisGetterExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaScriptVisitor ) return ((JavaScriptVisitor<? extends T>)visitor).visitThisGetterExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ThisExpressionContext thisExpression() throws RecognitionException {
		ThisExpressionContext _localctx = new ThisExpressionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_thisExpression);
		int _la;
		try {
			setState(171);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				_localctx = new ThisCallMethodContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(158); match(10);
				setState(159); match(ID);
				setState(160); match(6);
				setState(162);
				_la = _input.LA(1);
				if (_la==INT || _la==ID) {
					{
					setState(161); callParams();
					}
				}

				setState(164); match(3);
				}
				break;

			case 2:
				_localctx = new ThisSetterExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(165); match(10);
				setState(166); match(ID);
				setState(167); match(ASSIGNMENT);
				setState(168); expression(0);
				}
				break;

			case 3:
				_localctx = new ThisGetterExpressionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(169); match(10);
				setState(170); match(ID);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentExpressionContext extends ParserRuleContext {
		public AssignmentExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentExpression; }
	 
		public AssignmentExpressionContext() { }
		public void copyFrom(AssignmentExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AssignmentContext extends AssignmentExpressionContext {
		public TerminalNode ID() { return getToken(JavaScriptParser.ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ASSIGNMENT() { return getToken(JavaScriptParser.ASSIGNMENT, 0); }
		public AssignmentContext(AssignmentExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptListener ) ((JavaScriptListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptListener ) ((JavaScriptListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaScriptVisitor ) return ((JavaScriptVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarAssignmentContext extends AssignmentExpressionContext {
		public TerminalNode ID() { return getToken(JavaScriptParser.ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ASSIGNMENT() { return getToken(JavaScriptParser.ASSIGNMENT, 0); }
		public VarAssignmentContext(AssignmentExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptListener ) ((JavaScriptListener)listener).enterVarAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptListener ) ((JavaScriptListener)listener).exitVarAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaScriptVisitor ) return ((JavaScriptVisitor<? extends T>)visitor).visitVarAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentExpressionContext assignmentExpression() throws RecognitionException {
		AssignmentExpressionContext _localctx = new AssignmentExpressionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_assignmentExpression);
		try {
			setState(180);
			switch (_input.LA(1)) {
			case ID:
				_localctx = new AssignmentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(173); match(ID);
				setState(174); match(ASSIGNMENT);
				setState(175); expression(0);
				}
				break;
			case 9:
				_localctx = new VarAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(176); match(9);
				setState(177); match(ID);
				setState(178); match(ASSIGNMENT);
				setState(179); expression(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnonymousFunctionContext extends ParserRuleContext {
		public FunctionParametersContext functionParameters() {
			return getRuleContext(FunctionParametersContext.class,0);
		}
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public AnonymousFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anonymousFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptListener ) ((JavaScriptListener)listener).enterAnonymousFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptListener ) ((JavaScriptListener)listener).exitAnonymousFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaScriptVisitor ) return ((JavaScriptVisitor<? extends T>)visitor).visitAnonymousFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnonymousFunctionContext anonymousFunction() throws RecognitionException {
		AnonymousFunctionContext _localctx = new AnonymousFunctionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_anonymousFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182); match(2);
			setState(183); match(6);
			setState(185);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(184); functionParameters();
				}
			}

			setState(187); match(3);
			setState(188); functionBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarDeclarationContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(JavaScriptParser.ID, 0); }
		public VarDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptListener ) ((JavaScriptListener)listener).enterVarDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptListener ) ((JavaScriptListener)listener).exitVarDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaScriptVisitor ) return ((JavaScriptVisitor<? extends T>)visitor).visitVarDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDeclarationContext varDeclaration() throws RecognitionException {
		VarDeclarationContext _localctx = new VarDeclarationContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_varDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190); match(9);
			setState(191); match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 6: return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return 5 >= _localctx._p;

		case 1: return 4 >= _localctx._p;

		case 2: return 3 >= _localctx._p;

		case 3: return 2 >= _localctx._p;

		case 4: return 1 >= _localctx._p;
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3\27\u00c4\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2"+
		"\3\2\6\2&\n\2\r\2\16\2\'\3\3\3\3\5\3,\n\3\3\3\3\3\5\3\60\n\3\3\3\3\3\5"+
		"\3\64\n\3\3\3\3\3\5\38\n\3\3\3\3\3\3\4\3\4\3\5\3\5\3\5\7\5A\n\5\f\5\16"+
		"\5D\13\5\3\6\3\6\3\7\3\7\3\7\3\7\7\7L\n\7\f\7\16\7O\13\7\3\7\3\7\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b`\n\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\bq\n\b\f\b\16\bt\13\b"+
		"\3\t\3\t\3\t\5\ty\n\t\3\t\3\t\3\n\3\n\3\n\7\n\u0080\n\n\f\n\16\n\u0083"+
		"\13\n\3\13\3\13\3\f\3\f\3\f\3\f\5\f\u008b\n\f\3\f\3\f\3\r\3\r\3\r\3\r"+
		"\3\r\5\r\u0094\n\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u009f\n\r\3"+
		"\16\3\16\3\16\3\16\5\16\u00a5\n\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\5\16\u00ae\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00b7\n\17\3"+
		"\20\3\20\3\20\5\20\u00bc\n\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\2\22"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \2\3\3\2\23\24\u00d6\2%\3\2\2"+
		"\2\4)\3\2\2\2\6;\3\2\2\2\b=\3\2\2\2\nE\3\2\2\2\fG\3\2\2\2\16_\3\2\2\2"+
		"\20u\3\2\2\2\22|\3\2\2\2\24\u0084\3\2\2\2\26\u0086\3\2\2\2\30\u009e\3"+
		"\2\2\2\32\u00ad\3\2\2\2\34\u00b6\3\2\2\2\36\u00b8\3\2\2\2 \u00c0\3\2\2"+
		"\2\"&\5\4\3\2#&\5\16\b\2$&\5 \21\2%\"\3\2\2\2%#\3\2\2\2%$\3\2\2\2&\'\3"+
		"\2\2\2\'%\3\2\2\2\'(\3\2\2\2(\3\3\2\2\2)+\7\4\2\2*,\7\25\2\2+*\3\2\2\2"+
		"+,\3\2\2\2,-\3\2\2\2-/\5\6\4\2.\60\7\25\2\2/.\3\2\2\2/\60\3\2\2\2\60\61"+
		"\3\2\2\2\61\63\7\b\2\2\62\64\5\b\5\2\63\62\3\2\2\2\63\64\3\2\2\2\64\65"+
		"\3\2\2\2\65\67\7\5\2\2\668\7\25\2\2\67\66\3\2\2\2\678\3\2\2\289\3\2\2"+
		"\29:\5\f\7\2:\5\3\2\2\2;<\7\24\2\2<\7\3\2\2\2=B\5\n\6\2>?\7\7\2\2?A\5"+
		"\n\6\2@>\3\2\2\2AD\3\2\2\2B@\3\2\2\2BC\3\2\2\2C\t\3\2\2\2DB\3\2\2\2EF"+
		"\7\24\2\2F\13\3\2\2\2GM\7\3\2\2HL\5\4\3\2IL\5\16\b\2JL\5 \21\2KH\3\2\2"+
		"\2KI\3\2\2\2KJ\3\2\2\2LO\3\2\2\2MK\3\2\2\2MN\3\2\2\2NP\3\2\2\2OM\3\2\2"+
		"\2PQ\7\n\2\2Q\r\3\2\2\2RS\b\b\1\2S`\5\20\t\2T`\5\26\f\2U`\5\32\16\2V`"+
		"\5\30\r\2W`\7\24\2\2X`\7\23\2\2Y`\5\34\17\2Z`\5\36\20\2[\\\7\b\2\2\\]"+
		"\5\16\b\2]^\7\5\2\2^`\3\2\2\2_R\3\2\2\2_T\3\2\2\2_U\3\2\2\2_V\3\2\2\2"+
		"_W\3\2\2\2_X\3\2\2\2_Y\3\2\2\2_Z\3\2\2\2_[\3\2\2\2`r\3\2\2\2ab\6\b\2\3"+
		"bc\7\20\2\2cq\5\16\b\2de\6\b\3\3ef\7\21\2\2fq\5\16\b\2gh\6\b\4\3hi\7\22"+
		"\2\2iq\5\16\b\2jk\6\b\5\3kl\7\16\2\2lq\5\16\b\2mn\6\b\6\3no\7\17\2\2o"+
		"q\5\16\b\2pa\3\2\2\2pd\3\2\2\2pg\3\2\2\2pj\3\2\2\2pm\3\2\2\2qt\3\2\2\2"+
		"rp\3\2\2\2rs\3\2\2\2s\17\3\2\2\2tr\3\2\2\2uv\7\24\2\2vx\7\b\2\2wy\5\22"+
		"\n\2xw\3\2\2\2xy\3\2\2\2yz\3\2\2\2z{\7\5\2\2{\21\3\2\2\2|\u0081\5\24\13"+
		"\2}~\7\7\2\2~\u0080\5\24\13\2\177}\3\2\2\2\u0080\u0083\3\2\2\2\u0081\177"+
		"\3\2\2\2\u0081\u0082\3\2\2\2\u0082\23\3\2\2\2\u0083\u0081\3\2\2\2\u0084"+
		"\u0085\t\2\2\2\u0085\25\3\2\2\2\u0086\u0087\7\t\2\2\u0087\u0088\7\24\2"+
		"\2\u0088\u008a\7\b\2\2\u0089\u008b\5\22\n\2\u008a\u0089\3\2\2\2\u008a"+
		"\u008b\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008d\7\5\2\2\u008d\27\3\2\2"+
		"\2\u008e\u008f\7\24\2\2\u008f\u0090\7\6\2\2\u0090\u0091\7\24\2\2\u0091"+
		"\u0093\7\b\2\2\u0092\u0094\5\22\n\2\u0093\u0092\3\2\2\2\u0093\u0094\3"+
		"\2\2\2\u0094\u0095\3\2\2\2\u0095\u009f\7\5\2\2\u0096\u0097\7\24\2\2\u0097"+
		"\u0098\7\6\2\2\u0098\u0099\7\24\2\2\u0099\u009a\7\r\2\2\u009a\u009f\5"+
		"\16\b\2\u009b\u009c\7\24\2\2\u009c\u009d\7\6\2\2\u009d\u009f\7\24\2\2"+
		"\u009e\u008e\3\2\2\2\u009e\u0096\3\2\2\2\u009e\u009b\3\2\2\2\u009f\31"+
		"\3\2\2\2\u00a0\u00a1\7\f\2\2\u00a1\u00a2\7\24\2\2\u00a2\u00a4\7\b\2\2"+
		"\u00a3\u00a5\5\22\n\2\u00a4\u00a3\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a6"+
		"\3\2\2\2\u00a6\u00ae\7\5\2\2\u00a7\u00a8\7\f\2\2\u00a8\u00a9\7\24\2\2"+
		"\u00a9\u00aa\7\r\2\2\u00aa\u00ae\5\16\b\2\u00ab\u00ac\7\f\2\2\u00ac\u00ae"+
		"\7\24\2\2\u00ad\u00a0\3\2\2\2\u00ad\u00a7\3\2\2\2\u00ad\u00ab\3\2\2\2"+
		"\u00ae\33\3\2\2\2\u00af\u00b0\7\24\2\2\u00b0\u00b1\7\r\2\2\u00b1\u00b7"+
		"\5\16\b\2\u00b2\u00b3\7\13\2\2\u00b3\u00b4\7\24\2\2\u00b4\u00b5\7\r\2"+
		"\2\u00b5\u00b7\5\16\b\2\u00b6\u00af\3\2\2\2\u00b6\u00b2\3\2\2\2\u00b7"+
		"\35\3\2\2\2\u00b8\u00b9\7\4\2\2\u00b9\u00bb\7\b\2\2\u00ba\u00bc\5\b\5"+
		"\2\u00bb\u00ba\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00be"+
		"\7\5\2\2\u00be\u00bf\5\f\7\2\u00bf\37\3\2\2\2\u00c0\u00c1\7\13\2\2\u00c1"+
		"\u00c2\7\24\2\2\u00c2!\3\2\2\2\27%\'+/\63\67BKM_prx\u0081\u008a\u0093"+
		"\u009e\u00a4\u00ad\u00b6\u00bb";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}