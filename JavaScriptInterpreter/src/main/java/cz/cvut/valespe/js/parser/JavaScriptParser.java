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
		T__12=1, T__11=2, T__10=3, T__9=4, T__8=5, T__7=6, T__6=7, T__5=8, T__4=9, 
		T__3=10, T__2=11, T__1=12, T__0=13, ASSIGNMENT=14, PLUS=15, MINUS=16, 
		MUL=17, DIV=18, MOD=19, INT=20, ID=21, STRING=22, WS=23, COMMENT=24, LINE_COMMENT=25;
	public static final String[] tokenNames = {
		"<INVALID>", "']'", "'{'", "'function'", "')'", "'.'", "','", "'['", "'('", 
		"'new'", "'}'", "'var'", "'this.'", "'.prototype'", "'='", "'+'", "'-'", 
		"'*'", "'/'", "'%'", "INT", "ID", "STRING", "WS", "COMMENT", "LINE_COMMENT"
	};
	public static final int
		RULE_file = 0, RULE_functionDeclaration = 1, RULE_functionName = 2, RULE_functionParameters = 3, 
		RULE_functionParameter = 4, RULE_functionBody = 5, RULE_expression = 6, 
		RULE_functionCall = 7, RULE_callParams = 8, RULE_callParam = 9, RULE_createInstance = 10, 
		RULE_messageToInstance = 11, RULE_thisExpression = 12, RULE_prototypeAssignmentExpression = 13, 
		RULE_assignmentExpression = 14, RULE_anonymousFunction = 15, RULE_varDeclaration = 16, 
		RULE_createArray = 17, RULE_arrayAssignment = 18, RULE_arrayAccess = 19;
	public static final String[] ruleNames = {
		"file", "functionDeclaration", "functionName", "functionParameters", "functionParameter", 
		"functionBody", "expression", "functionCall", "callParams", "callParam", 
		"createInstance", "messageToInstance", "thisExpression", "prototypeAssignmentExpression", 
		"assignmentExpression", "anonymousFunction", "varDeclaration", "createArray", 
		"arrayAssignment", "arrayAccess"
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
			setState(43); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(43);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(40); functionDeclaration();
					}
					break;

				case 2:
					{
					setState(41); expression(0);
					}
					break;

				case 3:
					{
					setState(42); varDeclaration();
					}
					break;
				}
				}
				setState(45); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 3) | (1L << 7) | (1L << 8) | (1L << 9) | (1L << 11) | (1L << 12) | (1L << INT) | (1L << ID) | (1L << STRING))) != 0) );
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
			setState(47); match(3);
			setState(49);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(48); match(WS);
				}
			}

			setState(51); functionName();
			setState(53);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(52); match(WS);
				}
			}

			setState(55); match(8);
			setState(57);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(56); functionParameters();
				}
			}

			setState(59); match(4);
			setState(61);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(60); match(WS);
				}
			}

			setState(63); functionBody();
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
			setState(65); match(ID);
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
			setState(67); functionParameter();
			setState(72);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==6) {
				{
				{
				setState(68); match(6);
				setState(69); functionParameter();
				}
				}
				setState(74);
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
			setState(75); match(ID);
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
			setState(77); match(2);
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 3) | (1L << 7) | (1L << 8) | (1L << 9) | (1L << 11) | (1L << 12) | (1L << INT) | (1L << ID) | (1L << STRING))) != 0)) {
				{
				setState(81);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(78); functionDeclaration();
					}
					break;

				case 2:
					{
					setState(79); expression(0);
					}
					break;

				case 3:
					{
					setState(80); varDeclaration();
					}
					break;
				}
				}
				setState(85);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(86); match(10);
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
	public static class PrototypeAssignmentExpressionExpressionContext extends ExpressionContext {
		public PrototypeAssignmentExpressionContext prototypeAssignmentExpression() {
			return getRuleContext(PrototypeAssignmentExpressionContext.class,0);
		}
		public PrototypeAssignmentExpressionExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptListener ) ((JavaScriptListener)listener).enterPrototypeAssignmentExpressionExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptListener ) ((JavaScriptListener)listener).exitPrototypeAssignmentExpressionExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaScriptVisitor ) return ((JavaScriptVisitor<? extends T>)visitor).visitPrototypeAssignmentExpressionExpression(this);
			else return visitor.visitChildren(this);
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
	public static class ArrayAccessExpressionContext extends ExpressionContext {
		public ArrayAccessContext arrayAccess() {
			return getRuleContext(ArrayAccessContext.class,0);
		}
		public ArrayAccessExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptListener ) ((JavaScriptListener)listener).enterArrayAccessExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptListener ) ((JavaScriptListener)listener).exitArrayAccessExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaScriptVisitor ) return ((JavaScriptVisitor<? extends T>)visitor).visitArrayAccessExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringContext extends ExpressionContext {
		public TerminalNode STRING() { return getToken(JavaScriptParser.STRING, 0); }
		public StringContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptListener ) ((JavaScriptListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptListener ) ((JavaScriptListener)listener).exitString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaScriptVisitor ) return ((JavaScriptVisitor<? extends T>)visitor).visitString(this);
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
	public static class ArrayContext extends ExpressionContext {
		public CreateArrayContext createArray() {
			return getRuleContext(CreateArrayContext.class,0);
		}
		public ArrayContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptListener ) ((JavaScriptListener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptListener ) ((JavaScriptListener)listener).exitArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaScriptVisitor ) return ((JavaScriptVisitor<? extends T>)visitor).visitArray(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayAssignmentExpressionContext extends ExpressionContext {
		public ArrayAssignmentContext arrayAssignment() {
			return getRuleContext(ArrayAssignmentContext.class,0);
		}
		public ArrayAssignmentExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptListener ) ((JavaScriptListener)listener).enterArrayAssignmentExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptListener ) ((JavaScriptListener)listener).exitArrayAssignmentExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaScriptVisitor ) return ((JavaScriptVisitor<? extends T>)visitor).visitArrayAssignmentExpression(this);
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
			setState(106);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				_localctx = new FunctionCallExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(89); functionCall();
				}
				break;

			case 2:
				{
				_localctx = new CreateInstanceExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(90); createInstance();
				}
				break;

			case 3:
				{
				_localctx = new ThisExpressionExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(91); thisExpression();
				}
				break;

			case 4:
				{
				_localctx = new MessageToInstanceExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(92); messageToInstance();
				}
				break;

			case 5:
				{
				_localctx = new ArrayAccessExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(93); arrayAccess();
				}
				break;

			case 6:
				{
				_localctx = new IdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(94); match(ID);
				}
				break;

			case 7:
				{
				_localctx = new IntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(95); match(INT);
				}
				break;

			case 8:
				{
				_localctx = new StringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(96); match(STRING);
				}
				break;

			case 9:
				{
				_localctx = new ArrayAssignmentExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(97); arrayAssignment();
				}
				break;

			case 10:
				{
				_localctx = new ArrayContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(98); createArray();
				}
				break;

			case 11:
				{
				_localctx = new PrototypeAssignmentExpressionExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(99); prototypeAssignmentExpression();
				}
				break;

			case 12:
				{
				_localctx = new AssignmentExpressionExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(100); assignmentExpression();
				}
				break;

			case 13:
				{
				_localctx = new AnonymousFunctionExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(101); anonymousFunction();
				}
				break;

			case 14:
				{
				_localctx = new ParenthesesExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(102); match(8);
				setState(103); expression(0);
				setState(104); match(4);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(125);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(123);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						_localctx = new MulExpressionContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(108);
						if (!(5 >= _localctx._p)) throw new FailedPredicateException(this, "5 >= $_p");
						setState(109); match(MUL);
						setState(110); expression(6);
						}
						break;

					case 2:
						{
						_localctx = new DivExpressionContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(111);
						if (!(4 >= _localctx._p)) throw new FailedPredicateException(this, "4 >= $_p");
						setState(112); match(DIV);
						setState(113); expression(5);
						}
						break;

					case 3:
						{
						_localctx = new ModExpressionContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(114);
						if (!(3 >= _localctx._p)) throw new FailedPredicateException(this, "3 >= $_p");
						setState(115); match(MOD);
						setState(116); expression(4);
						}
						break;

					case 4:
						{
						_localctx = new PlusExpressionContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(117);
						if (!(2 >= _localctx._p)) throw new FailedPredicateException(this, "2 >= $_p");
						setState(118); match(PLUS);
						setState(119); expression(3);
						}
						break;

					case 5:
						{
						_localctx = new MinusExpressionContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(120);
						if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
						setState(121); match(MINUS);
						setState(122); expression(2);
						}
						break;
					}
					} 
				}
				setState(127);
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
			setState(128); match(ID);
			setState(129); match(8);
			setState(131);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << ID) | (1L << STRING))) != 0)) {
				{
				setState(130); callParams();
				}
			}

			setState(133); match(4);
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
			setState(135); callParam();
			setState(140);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==6) {
				{
				{
				setState(136); match(6);
				setState(137); callParam();
				}
				}
				setState(142);
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
		public TerminalNode STRING() { return getToken(JavaScriptParser.STRING, 0); }
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
			setState(143);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << ID) | (1L << STRING))) != 0)) ) {
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
			setState(145); match(9);
			setState(146); match(ID);
			setState(147); match(8);
			setState(149);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << ID) | (1L << STRING))) != 0)) {
				{
				setState(148); callParams();
				}
			}

			setState(151); match(4);
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
			setState(169);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				_localctx = new CallMethodOnInstanceContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(153); match(ID);
				setState(154); match(5);
				setState(155); match(ID);
				setState(156); match(8);
				setState(158);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << ID) | (1L << STRING))) != 0)) {
					{
					setState(157); callParams();
					}
				}

				setState(160); match(4);
				}
				break;

			case 2:
				_localctx = new SetPropertyOnInstanceContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(161); match(ID);
				setState(162); match(5);
				setState(163); match(ID);
				setState(164); match(ASSIGNMENT);
				setState(165); expression(0);
				}
				break;

			case 3:
				_localctx = new GetPropertyOnInstanceContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(166); match(ID);
				setState(167); match(5);
				setState(168); match(ID);
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
			setState(184);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				_localctx = new ThisCallMethodContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(171); match(12);
				setState(172); match(ID);
				setState(173); match(8);
				setState(175);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << ID) | (1L << STRING))) != 0)) {
					{
					setState(174); callParams();
					}
				}

				setState(177); match(4);
				}
				break;

			case 2:
				_localctx = new ThisSetterExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(178); match(12);
				setState(179); match(ID);
				setState(180); match(ASSIGNMENT);
				setState(181); expression(0);
				}
				break;

			case 3:
				_localctx = new ThisGetterExpressionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(182); match(12);
				setState(183); match(ID);
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

	public static class PrototypeAssignmentExpressionContext extends ParserRuleContext {
		public PrototypeAssignmentExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prototypeAssignmentExpression; }
	 
		public PrototypeAssignmentExpressionContext() { }
		public void copyFrom(PrototypeAssignmentExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PrototypeAssignmentContext extends PrototypeAssignmentExpressionContext {
		public TerminalNode ID() { return getToken(JavaScriptParser.ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ASSIGNMENT() { return getToken(JavaScriptParser.ASSIGNMENT, 0); }
		public PrototypeAssignmentContext(PrototypeAssignmentExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptListener ) ((JavaScriptListener)listener).enterPrototypeAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptListener ) ((JavaScriptListener)listener).exitPrototypeAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaScriptVisitor ) return ((JavaScriptVisitor<? extends T>)visitor).visitPrototypeAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrototypeAssignmentExpressionContext prototypeAssignmentExpression() throws RecognitionException {
		PrototypeAssignmentExpressionContext _localctx = new PrototypeAssignmentExpressionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_prototypeAssignmentExpression);
		try {
			_localctx = new PrototypeAssignmentContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(186); match(ID);
			setState(187); match(13);
			setState(188); match(ASSIGNMENT);
			setState(189); expression(0);
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
		enterRule(_localctx, 28, RULE_assignmentExpression);
		try {
			setState(198);
			switch (_input.LA(1)) {
			case ID:
				_localctx = new AssignmentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(191); match(ID);
				setState(192); match(ASSIGNMENT);
				setState(193); expression(0);
				}
				break;
			case 11:
				_localctx = new VarAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(194); match(11);
				setState(195); match(ID);
				setState(196); match(ASSIGNMENT);
				setState(197); expression(0);
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
		enterRule(_localctx, 30, RULE_anonymousFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200); match(3);
			setState(201); match(8);
			setState(203);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(202); functionParameters();
				}
			}

			setState(205); match(4);
			setState(206); functionBody();
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
		enterRule(_localctx, 32, RULE_varDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208); match(11);
			setState(209); match(ID);
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

	public static class CreateArrayContext extends ParserRuleContext {
		public CallParamsContext callParams() {
			return getRuleContext(CallParamsContext.class,0);
		}
		public CreateArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createArray; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptListener ) ((JavaScriptListener)listener).enterCreateArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptListener ) ((JavaScriptListener)listener).exitCreateArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaScriptVisitor ) return ((JavaScriptVisitor<? extends T>)visitor).visitCreateArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateArrayContext createArray() throws RecognitionException {
		CreateArrayContext _localctx = new CreateArrayContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_createArray);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211); match(7);
			setState(213);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << ID) | (1L << STRING))) != 0)) {
				{
				setState(212); callParams();
				}
			}

			setState(215); match(1);
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

	public static class ArrayAssignmentContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(JavaScriptParser.INT, 0); }
		public TerminalNode ID() { return getToken(JavaScriptParser.ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ASSIGNMENT() { return getToken(JavaScriptParser.ASSIGNMENT, 0); }
		public ArrayAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptListener ) ((JavaScriptListener)listener).enterArrayAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptListener ) ((JavaScriptListener)listener).exitArrayAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaScriptVisitor ) return ((JavaScriptVisitor<? extends T>)visitor).visitArrayAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayAssignmentContext arrayAssignment() throws RecognitionException {
		ArrayAssignmentContext _localctx = new ArrayAssignmentContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_arrayAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217); match(ID);
			setState(218); match(7);
			setState(219); match(INT);
			setState(220); match(1);
			setState(221); match(ASSIGNMENT);
			setState(222); expression(0);
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

	public static class ArrayAccessContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(JavaScriptParser.INT, 0); }
		public TerminalNode ID() { return getToken(JavaScriptParser.ID, 0); }
		public ArrayAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayAccess; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptListener ) ((JavaScriptListener)listener).enterArrayAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptListener ) ((JavaScriptListener)listener).exitArrayAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaScriptVisitor ) return ((JavaScriptVisitor<? extends T>)visitor).visitArrayAccess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayAccessContext arrayAccess() throws RecognitionException {
		ArrayAccessContext _localctx = new ArrayAccessContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_arrayAccess);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224); match(ID);
			setState(225); match(7);
			setState(226); match(INT);
			setState(227); match(1);
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3\33\u00e8\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\2\6\2.\n\2\r\2\16\2/\3\3\3\3"+
		"\5\3\64\n\3\3\3\3\3\5\38\n\3\3\3\3\3\5\3<\n\3\3\3\3\3\5\3@\n\3\3\3\3\3"+
		"\3\4\3\4\3\5\3\5\3\5\7\5I\n\5\f\5\16\5L\13\5\3\6\3\6\3\7\3\7\3\7\3\7\7"+
		"\7T\n\7\f\7\16\7W\13\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bm\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b~\n\b\f\b\16\b\u0081\13\b\3\t\3\t"+
		"\3\t\5\t\u0086\n\t\3\t\3\t\3\n\3\n\3\n\7\n\u008d\n\n\f\n\16\n\u0090\13"+
		"\n\3\13\3\13\3\f\3\f\3\f\3\f\5\f\u0098\n\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r"+
		"\5\r\u00a1\n\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00ac\n\r\3\16"+
		"\3\16\3\16\3\16\5\16\u00b2\n\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16"+
		"\u00bb\n\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\5\20\u00c9\n\20\3\21\3\21\3\21\5\21\u00ce\n\21\3\21\3\21\3\21\3\22\3"+
		"\22\3\22\3\23\3\23\5\23\u00d8\n\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\2\26\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$&(\2\3\3\2\26\30\u00fc\2-\3\2\2\2\4\61\3\2\2\2\6C\3"+
		"\2\2\2\bE\3\2\2\2\nM\3\2\2\2\fO\3\2\2\2\16l\3\2\2\2\20\u0082\3\2\2\2\22"+
		"\u0089\3\2\2\2\24\u0091\3\2\2\2\26\u0093\3\2\2\2\30\u00ab\3\2\2\2\32\u00ba"+
		"\3\2\2\2\34\u00bc\3\2\2\2\36\u00c8\3\2\2\2 \u00ca\3\2\2\2\"\u00d2\3\2"+
		"\2\2$\u00d5\3\2\2\2&\u00db\3\2\2\2(\u00e2\3\2\2\2*.\5\4\3\2+.\5\16\b\2"+
		",.\5\"\22\2-*\3\2\2\2-+\3\2\2\2-,\3\2\2\2./\3\2\2\2/-\3\2\2\2/\60\3\2"+
		"\2\2\60\3\3\2\2\2\61\63\7\5\2\2\62\64\7\31\2\2\63\62\3\2\2\2\63\64\3\2"+
		"\2\2\64\65\3\2\2\2\65\67\5\6\4\2\668\7\31\2\2\67\66\3\2\2\2\678\3\2\2"+
		"\289\3\2\2\29;\7\n\2\2:<\5\b\5\2;:\3\2\2\2;<\3\2\2\2<=\3\2\2\2=?\7\6\2"+
		"\2>@\7\31\2\2?>\3\2\2\2?@\3\2\2\2@A\3\2\2\2AB\5\f\7\2B\5\3\2\2\2CD\7\27"+
		"\2\2D\7\3\2\2\2EJ\5\n\6\2FG\7\b\2\2GI\5\n\6\2HF\3\2\2\2IL\3\2\2\2JH\3"+
		"\2\2\2JK\3\2\2\2K\t\3\2\2\2LJ\3\2\2\2MN\7\27\2\2N\13\3\2\2\2OU\7\4\2\2"+
		"PT\5\4\3\2QT\5\16\b\2RT\5\"\22\2SP\3\2\2\2SQ\3\2\2\2SR\3\2\2\2TW\3\2\2"+
		"\2US\3\2\2\2UV\3\2\2\2VX\3\2\2\2WU\3\2\2\2XY\7\f\2\2Y\r\3\2\2\2Z[\b\b"+
		"\1\2[m\5\20\t\2\\m\5\26\f\2]m\5\32\16\2^m\5\30\r\2_m\5(\25\2`m\7\27\2"+
		"\2am\7\26\2\2bm\7\30\2\2cm\5&\24\2dm\5$\23\2em\5\34\17\2fm\5\36\20\2g"+
		"m\5 \21\2hi\7\n\2\2ij\5\16\b\2jk\7\6\2\2km\3\2\2\2lZ\3\2\2\2l\\\3\2\2"+
		"\2l]\3\2\2\2l^\3\2\2\2l_\3\2\2\2l`\3\2\2\2la\3\2\2\2lb\3\2\2\2lc\3\2\2"+
		"\2ld\3\2\2\2le\3\2\2\2lf\3\2\2\2lg\3\2\2\2lh\3\2\2\2m\177\3\2\2\2no\6"+
		"\b\2\3op\7\23\2\2p~\5\16\b\2qr\6\b\3\3rs\7\24\2\2s~\5\16\b\2tu\6\b\4\3"+
		"uv\7\25\2\2v~\5\16\b\2wx\6\b\5\3xy\7\21\2\2y~\5\16\b\2z{\6\b\6\3{|\7\22"+
		"\2\2|~\5\16\b\2}n\3\2\2\2}q\3\2\2\2}t\3\2\2\2}w\3\2\2\2}z\3\2\2\2~\u0081"+
		"\3\2\2\2\177}\3\2\2\2\177\u0080\3\2\2\2\u0080\17\3\2\2\2\u0081\177\3\2"+
		"\2\2\u0082\u0083\7\27\2\2\u0083\u0085\7\n\2\2\u0084\u0086\5\22\n\2\u0085"+
		"\u0084\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0088\7\6"+
		"\2\2\u0088\21\3\2\2\2\u0089\u008e\5\24\13\2\u008a\u008b\7\b\2\2\u008b"+
		"\u008d\5\24\13\2\u008c\u008a\3\2\2\2\u008d\u0090\3\2\2\2\u008e\u008c\3"+
		"\2\2\2\u008e\u008f\3\2\2\2\u008f\23\3\2\2\2\u0090\u008e\3\2\2\2\u0091"+
		"\u0092\t\2\2\2\u0092\25\3\2\2\2\u0093\u0094\7\13\2\2\u0094\u0095\7\27"+
		"\2\2\u0095\u0097\7\n\2\2\u0096\u0098\5\22\n\2\u0097\u0096\3\2\2\2\u0097"+
		"\u0098\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009a\7\6\2\2\u009a\27\3\2\2"+
		"\2\u009b\u009c\7\27\2\2\u009c\u009d\7\7\2\2\u009d\u009e\7\27\2\2\u009e"+
		"\u00a0\7\n\2\2\u009f\u00a1\5\22\n\2\u00a0\u009f\3\2\2\2\u00a0\u00a1\3"+
		"\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00ac\7\6\2\2\u00a3\u00a4\7\27\2\2\u00a4"+
		"\u00a5\7\7\2\2\u00a5\u00a6\7\27\2\2\u00a6\u00a7\7\20\2\2\u00a7\u00ac\5"+
		"\16\b\2\u00a8\u00a9\7\27\2\2\u00a9\u00aa\7\7\2\2\u00aa\u00ac\7\27\2\2"+
		"\u00ab\u009b\3\2\2\2\u00ab\u00a3\3\2\2\2\u00ab\u00a8\3\2\2\2\u00ac\31"+
		"\3\2\2\2\u00ad\u00ae\7\16\2\2\u00ae\u00af\7\27\2\2\u00af\u00b1\7\n\2\2"+
		"\u00b0\u00b2\5\22\n\2\u00b1\u00b0\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b3"+
		"\3\2\2\2\u00b3\u00bb\7\6\2\2\u00b4\u00b5\7\16\2\2\u00b5\u00b6\7\27\2\2"+
		"\u00b6\u00b7\7\20\2\2\u00b7\u00bb\5\16\b\2\u00b8\u00b9\7\16\2\2\u00b9"+
		"\u00bb\7\27\2\2\u00ba\u00ad\3\2\2\2\u00ba\u00b4\3\2\2\2\u00ba\u00b8\3"+
		"\2\2\2\u00bb\33\3\2\2\2\u00bc\u00bd\7\27\2\2\u00bd\u00be\7\17\2\2\u00be"+
		"\u00bf\7\20\2\2\u00bf\u00c0\5\16\b\2\u00c0\35\3\2\2\2\u00c1\u00c2\7\27"+
		"\2\2\u00c2\u00c3\7\20\2\2\u00c3\u00c9\5\16\b\2\u00c4\u00c5\7\r\2\2\u00c5"+
		"\u00c6\7\27\2\2\u00c6\u00c7\7\20\2\2\u00c7\u00c9\5\16\b\2\u00c8\u00c1"+
		"\3\2\2\2\u00c8\u00c4\3\2\2\2\u00c9\37\3\2\2\2\u00ca\u00cb\7\5\2\2\u00cb"+
		"\u00cd\7\n\2\2\u00cc\u00ce\5\b\5\2\u00cd\u00cc\3\2\2\2\u00cd\u00ce\3\2"+
		"\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d0\7\6\2\2\u00d0\u00d1\5\f\7\2\u00d1"+
		"!\3\2\2\2\u00d2\u00d3\7\r\2\2\u00d3\u00d4\7\27\2\2\u00d4#\3\2\2\2\u00d5"+
		"\u00d7\7\t\2\2\u00d6\u00d8\5\22\n\2\u00d7\u00d6\3\2\2\2\u00d7\u00d8\3"+
		"\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00da\7\3\2\2\u00da%\3\2\2\2\u00db\u00dc"+
		"\7\27\2\2\u00dc\u00dd\7\t\2\2\u00dd\u00de\7\26\2\2\u00de\u00df\7\3\2\2"+
		"\u00df\u00e0\7\20\2\2\u00e0\u00e1\5\16\b\2\u00e1\'\3\2\2\2\u00e2\u00e3"+
		"\7\27\2\2\u00e3\u00e4\7\t\2\2\u00e4\u00e5\7\26\2\2\u00e5\u00e6\7\3\2\2"+
		"\u00e6)\3\2\2\2\30-/\63\67;?JSUl}\177\u0085\u008e\u0097\u00a0\u00ab\u00b1"+
		"\u00ba\u00c8\u00cd\u00d7";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}