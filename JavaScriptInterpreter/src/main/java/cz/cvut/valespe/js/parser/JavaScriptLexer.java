// Generated from JavaScript.g4 by ANTLR 4.1
package cz.cvut.valespe.js.parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JavaScriptLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__10=1, T__9=2, T__8=3, T__7=4, T__6=5, T__5=6, T__4=7, T__3=8, T__2=9, 
		T__1=10, T__0=11, ASSIGNMENT=12, PLUS=13, MINUS=14, MUL=15, DIV=16, MOD=17, 
		INT=18, ID=19, WS=20, COMMENT=21, LINE_COMMENT=22;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'{'", "'function'", "')'", "'.'", "','", "'('", "'new'", "'}'", "'var'", 
		"'this.'", "'.prototype'", "'='", "'+'", "'-'", "'*'", "'/'", "'%'", "INT", 
		"ID", "WS", "COMMENT", "LINE_COMMENT"
	};
	public static final String[] ruleNames = {
		"T__10", "T__9", "T__8", "T__7", "T__6", "T__5", "T__4", "T__3", "T__2", 
		"T__1", "T__0", "ASSIGNMENT", "PLUS", "MINUS", "MUL", "DIV", "MOD", "INT", 
		"ID", "WS", "COMMENT", "LINE_COMMENT"
	};


	public JavaScriptLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "JavaScript.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 19: WS_action((RuleContext)_localctx, actionIndex); break;

		case 20: COMMENT_action((RuleContext)_localctx, actionIndex); break;

		case 21: LINE_COMMENT_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}
	private void LINE_COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2: skip();  break;
		}
	}
	private void COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\30\u0098\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b"+
		"\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20"+
		"\3\20\3\21\3\21\3\22\3\22\3\23\5\23k\n\23\3\23\6\23n\n\23\r\23\16\23o"+
		"\3\24\3\24\7\24t\n\24\f\24\16\24w\13\24\3\25\6\25z\n\25\r\25\16\25{\3"+
		"\25\3\25\3\26\3\26\3\26\3\26\7\26\u0084\n\26\f\26\16\26\u0087\13\26\3"+
		"\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\7\27\u0092\n\27\f\27\16\27"+
		"\u0095\13\27\3\27\3\27\3\u0085\30\3\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1"+
		"\17\t\1\21\n\1\23\13\1\25\f\1\27\r\1\31\16\1\33\17\1\35\20\1\37\21\1!"+
		"\22\1#\23\1%\24\1\'\25\1)\26\2+\27\3-\30\4\3\2\7\3\2\62;\6\2&&C\\aac|"+
		"\7\2&&\62;C\\aac|\5\2\13\f\17\17\"\"\4\2\f\f\17\17\u009d\2\3\3\2\2\2\2"+
		"\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2"+
		"\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2"+
		"\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2"+
		"\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\3/\3\2\2\2\5\61\3\2\2\2"+
		"\7:\3\2\2\2\t<\3\2\2\2\13>\3\2\2\2\r@\3\2\2\2\17B\3\2\2\2\21F\3\2\2\2"+
		"\23H\3\2\2\2\25L\3\2\2\2\27R\3\2\2\2\31]\3\2\2\2\33_\3\2\2\2\35a\3\2\2"+
		"\2\37c\3\2\2\2!e\3\2\2\2#g\3\2\2\2%j\3\2\2\2\'q\3\2\2\2)y\3\2\2\2+\177"+
		"\3\2\2\2-\u008d\3\2\2\2/\60\7}\2\2\60\4\3\2\2\2\61\62\7h\2\2\62\63\7w"+
		"\2\2\63\64\7p\2\2\64\65\7e\2\2\65\66\7v\2\2\66\67\7k\2\2\678\7q\2\289"+
		"\7p\2\29\6\3\2\2\2:;\7+\2\2;\b\3\2\2\2<=\7\60\2\2=\n\3\2\2\2>?\7.\2\2"+
		"?\f\3\2\2\2@A\7*\2\2A\16\3\2\2\2BC\7p\2\2CD\7g\2\2DE\7y\2\2E\20\3\2\2"+
		"\2FG\7\177\2\2G\22\3\2\2\2HI\7x\2\2IJ\7c\2\2JK\7t\2\2K\24\3\2\2\2LM\7"+
		"v\2\2MN\7j\2\2NO\7k\2\2OP\7u\2\2PQ\7\60\2\2Q\26\3\2\2\2RS\7\60\2\2ST\7"+
		"r\2\2TU\7t\2\2UV\7q\2\2VW\7v\2\2WX\7q\2\2XY\7v\2\2YZ\7{\2\2Z[\7r\2\2["+
		"\\\7g\2\2\\\30\3\2\2\2]^\7?\2\2^\32\3\2\2\2_`\7-\2\2`\34\3\2\2\2ab\7/"+
		"\2\2b\36\3\2\2\2cd\7,\2\2d \3\2\2\2ef\7\61\2\2f\"\3\2\2\2gh\7\'\2\2h$"+
		"\3\2\2\2ik\7/\2\2ji\3\2\2\2jk\3\2\2\2km\3\2\2\2ln\t\2\2\2ml\3\2\2\2no"+
		"\3\2\2\2om\3\2\2\2op\3\2\2\2p&\3\2\2\2qu\t\3\2\2rt\t\4\2\2sr\3\2\2\2t"+
		"w\3\2\2\2us\3\2\2\2uv\3\2\2\2v(\3\2\2\2wu\3\2\2\2xz\t\5\2\2yx\3\2\2\2"+
		"z{\3\2\2\2{y\3\2\2\2{|\3\2\2\2|}\3\2\2\2}~\b\25\2\2~*\3\2\2\2\177\u0080"+
		"\7\61\2\2\u0080\u0081\7,\2\2\u0081\u0085\3\2\2\2\u0082\u0084\13\2\2\2"+
		"\u0083\u0082\3\2\2\2\u0084\u0087\3\2\2\2\u0085\u0086\3\2\2\2\u0085\u0083"+
		"\3\2\2\2\u0086\u0088\3\2\2\2\u0087\u0085\3\2\2\2\u0088\u0089\7,\2\2\u0089"+
		"\u008a\7\61\2\2\u008a\u008b\3\2\2\2\u008b\u008c\b\26\3\2\u008c,\3\2\2"+
		"\2\u008d\u008e\7\61\2\2\u008e\u008f\7\61\2\2\u008f\u0093\3\2\2\2\u0090"+
		"\u0092\n\6\2\2\u0091\u0090\3\2\2\2\u0092\u0095\3\2\2\2\u0093\u0091\3\2"+
		"\2\2\u0093\u0094\3\2\2\2\u0094\u0096\3\2\2\2\u0095\u0093\3\2\2\2\u0096"+
		"\u0097\b\27\4\2\u0097.\3\2\2\2\t\2jou{\u0085\u0093";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}