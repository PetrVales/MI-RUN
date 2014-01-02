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
		T__13=1, T__12=2, T__11=3, T__10=4, T__9=5, T__8=6, T__7=7, T__6=8, T__5=9, 
		T__4=10, T__3=11, T__2=12, T__1=13, T__0=14, ASSIGNMENT=15, PLUS=16, MINUS=17, 
		MUL=18, DIV=19, MOD=20, AND=21, OR=22, INT=23, TRUE=24, FALSE=25, ID=26, 
		STRING=27, WS=28, COMMENT=29, LINE_COMMENT=30;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"']'", "'{'", "'function'", "')'", "'.'", "','", "'['", "'('", "'new'", 
		"'}'", "'!'", "'var'", "'this.'", "'.prototype'", "'='", "'+'", "'-'", 
		"'*'", "'/'", "'%'", "'&&'", "'||'", "INT", "'true'", "'false'", "ID", 
		"STRING", "WS", "COMMENT", "LINE_COMMENT"
	};
	public static final String[] ruleNames = {
		"T__13", "T__12", "T__11", "T__10", "T__9", "T__8", "T__7", "T__6", "T__5", 
		"T__4", "T__3", "T__2", "T__1", "T__0", "ASSIGNMENT", "PLUS", "MINUS", 
		"MUL", "DIV", "MOD", "AND", "OR", "INT", "TRUE", "FALSE", "ID", "STRING", 
		"WS", "COMMENT", "LINE_COMMENT"
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
		case 27: WS_action((RuleContext)_localctx, actionIndex); break;

		case 28: COMMENT_action((RuleContext)_localctx, actionIndex); break;

		case 29: LINE_COMMENT_action((RuleContext)_localctx, actionIndex); break;
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2 \u00c8\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\3\2\3\2\3"+
		"\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b"+
		"\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3"+
		"\26\3\26\3\26\3\27\3\27\3\27\3\30\5\30\u0087\n\30\3\30\6\30\u008a\n\30"+
		"\r\30\16\30\u008b\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3"+
		"\32\3\33\3\33\7\33\u009b\n\33\f\33\16\33\u009e\13\33\3\34\3\34\7\34\u00a2"+
		"\n\34\f\34\16\34\u00a5\13\34\3\34\3\34\3\35\6\35\u00aa\n\35\r\35\16\35"+
		"\u00ab\3\35\3\35\3\36\3\36\3\36\3\36\7\36\u00b4\n\36\f\36\16\36\u00b7"+
		"\13\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\7\37\u00c2\n\37\f"+
		"\37\16\37\u00c5\13\37\3\37\3\37\3\u00b5 \3\3\1\5\4\1\7\5\1\t\6\1\13\7"+
		"\1\r\b\1\17\t\1\21\n\1\23\13\1\25\f\1\27\r\1\31\16\1\33\17\1\35\20\1\37"+
		"\21\1!\22\1#\23\1%\24\1\'\25\1)\26\1+\27\1-\30\1/\31\1\61\32\1\63\33\1"+
		"\65\34\1\67\35\19\36\2;\37\3= \4\3\2\b\3\2\62;\6\2&&C\\aac|\7\2&&\62;"+
		"C\\aac|\n\2##&&..\60;AAC\\aac|\5\2\13\f\17\17\"\"\4\2\f\f\17\17\u00ce"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\3?\3\2\2\2\5A\3\2\2\2\7C\3\2\2\2\tL\3\2\2\2\13N\3\2"+
		"\2\2\rP\3\2\2\2\17R\3\2\2\2\21T\3\2\2\2\23V\3\2\2\2\25Z\3\2\2\2\27\\\3"+
		"\2\2\2\31^\3\2\2\2\33b\3\2\2\2\35h\3\2\2\2\37s\3\2\2\2!u\3\2\2\2#w\3\2"+
		"\2\2%y\3\2\2\2\'{\3\2\2\2)}\3\2\2\2+\177\3\2\2\2-\u0082\3\2\2\2/\u0086"+
		"\3\2\2\2\61\u008d\3\2\2\2\63\u0092\3\2\2\2\65\u0098\3\2\2\2\67\u009f\3"+
		"\2\2\29\u00a9\3\2\2\2;\u00af\3\2\2\2=\u00bd\3\2\2\2?@\7_\2\2@\4\3\2\2"+
		"\2AB\7}\2\2B\6\3\2\2\2CD\7h\2\2DE\7w\2\2EF\7p\2\2FG\7e\2\2GH\7v\2\2HI"+
		"\7k\2\2IJ\7q\2\2JK\7p\2\2K\b\3\2\2\2LM\7+\2\2M\n\3\2\2\2NO\7\60\2\2O\f"+
		"\3\2\2\2PQ\7.\2\2Q\16\3\2\2\2RS\7]\2\2S\20\3\2\2\2TU\7*\2\2U\22\3\2\2"+
		"\2VW\7p\2\2WX\7g\2\2XY\7y\2\2Y\24\3\2\2\2Z[\7\177\2\2[\26\3\2\2\2\\]\7"+
		"#\2\2]\30\3\2\2\2^_\7x\2\2_`\7c\2\2`a\7t\2\2a\32\3\2\2\2bc\7v\2\2cd\7"+
		"j\2\2de\7k\2\2ef\7u\2\2fg\7\60\2\2g\34\3\2\2\2hi\7\60\2\2ij\7r\2\2jk\7"+
		"t\2\2kl\7q\2\2lm\7v\2\2mn\7q\2\2no\7v\2\2op\7{\2\2pq\7r\2\2qr\7g\2\2r"+
		"\36\3\2\2\2st\7?\2\2t \3\2\2\2uv\7-\2\2v\"\3\2\2\2wx\7/\2\2x$\3\2\2\2"+
		"yz\7,\2\2z&\3\2\2\2{|\7\61\2\2|(\3\2\2\2}~\7\'\2\2~*\3\2\2\2\177\u0080"+
		"\7(\2\2\u0080\u0081\7(\2\2\u0081,\3\2\2\2\u0082\u0083\7~\2\2\u0083\u0084"+
		"\7~\2\2\u0084.\3\2\2\2\u0085\u0087\7/\2\2\u0086\u0085\3\2\2\2\u0086\u0087"+
		"\3\2\2\2\u0087\u0089\3\2\2\2\u0088\u008a\t\2\2\2\u0089\u0088\3\2\2\2\u008a"+
		"\u008b\3\2\2\2\u008b\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c\60\3\2\2"+
		"\2\u008d\u008e\7v\2\2\u008e\u008f\7t\2\2\u008f\u0090\7w\2\2\u0090\u0091"+
		"\7g\2\2\u0091\62\3\2\2\2\u0092\u0093\7h\2\2\u0093\u0094\7c\2\2\u0094\u0095"+
		"\7n\2\2\u0095\u0096\7u\2\2\u0096\u0097\7g\2\2\u0097\64\3\2\2\2\u0098\u009c"+
		"\t\3\2\2\u0099\u009b\t\4\2\2\u009a\u0099\3\2\2\2\u009b\u009e\3\2\2\2\u009c"+
		"\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d\66\3\2\2\2\u009e\u009c\3\2\2"+
		"\2\u009f\u00a3\7$\2\2\u00a0\u00a2\t\5\2\2\u00a1\u00a0\3\2\2\2\u00a2\u00a5"+
		"\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a6\3\2\2\2\u00a5"+
		"\u00a3\3\2\2\2\u00a6\u00a7\7$\2\2\u00a78\3\2\2\2\u00a8\u00aa\t\6\2\2\u00a9"+
		"\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00ac\3\2"+
		"\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00ae\b\35\2\2\u00ae:\3\2\2\2\u00af\u00b0"+
		"\7\61\2\2\u00b0\u00b1\7,\2\2\u00b1\u00b5\3\2\2\2\u00b2\u00b4\13\2\2\2"+
		"\u00b3\u00b2\3\2\2\2\u00b4\u00b7\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b5\u00b3"+
		"\3\2\2\2\u00b6\u00b8\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b8\u00b9\7,\2\2\u00b9"+
		"\u00ba\7\61\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bc\b\36\3\2\u00bc<\3\2\2"+
		"\2\u00bd\u00be\7\61\2\2\u00be\u00bf\7\61\2\2\u00bf\u00c3\3\2\2\2\u00c0"+
		"\u00c2\n\7\2\2\u00c1\u00c0\3\2\2\2\u00c2\u00c5\3\2\2\2\u00c3\u00c1\3\2"+
		"\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c6\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c6"+
		"\u00c7\b\37\4\2\u00c7>\3\2\2\2\n\2\u0086\u008b\u009c\u00a3\u00ab\u00b5"+
		"\u00c3";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}