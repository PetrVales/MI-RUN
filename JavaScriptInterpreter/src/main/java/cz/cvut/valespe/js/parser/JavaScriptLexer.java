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
		T__16=1, T__15=2, T__14=3, T__13=4, T__12=5, T__11=6, T__10=7, T__9=8, 
		T__8=9, T__7=10, T__6=11, T__5=12, T__4=13, T__3=14, T__2=15, T__1=16, 
		T__0=17, ASSIGNMENT=18, PLUS=19, MINUS=20, MUL=21, DIV=22, MOD=23, AND=24, 
		OR=25, INT=26, TRUE=27, FALSE=28, ID=29, STRING=30, WS=31, COMMENT=32, 
		LINE_COMMENT=33;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"']'", "'.'", "')'", "'function'", "','", "'['", "'('", "'if'", "'var'", 
		"'this.'", "'.prototype'", "'{'", "'new'", "'=='", "'else'", "'}'", "'!'", 
		"'='", "'+'", "'-'", "'*'", "'/'", "'%'", "'&&'", "'||'", "INT", "'true'", 
		"'false'", "ID", "STRING", "WS", "COMMENT", "LINE_COMMENT"
	};
	public static final String[] ruleNames = {
		"T__16", "T__15", "T__14", "T__13", "T__12", "T__11", "T__10", "T__9", 
		"T__8", "T__7", "T__6", "T__5", "T__4", "T__3", "T__2", "T__1", "T__0", 
		"ASSIGNMENT", "PLUS", "MINUS", "MUL", "DIV", "MOD", "AND", "OR", "INT", 
		"TRUE", "FALSE", "ID", "STRING", "WS", "COMMENT", "LINE_COMMENT"
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
		case 30: WS_action((RuleContext)_localctx, actionIndex); break;

		case 31: COMMENT_action((RuleContext)_localctx, actionIndex); break;

		case 32: LINE_COMMENT_action((RuleContext)_localctx, actionIndex); break;
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2#\u00d9\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3"+
		"\16\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3"+
		"\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3"+
		"\31\3\31\3\31\3\32\3\32\3\32\3\33\5\33\u0098\n\33\3\33\6\33\u009b\n\33"+
		"\r\33\16\33\u009c\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3"+
		"\35\3\36\3\36\7\36\u00ac\n\36\f\36\16\36\u00af\13\36\3\37\3\37\7\37\u00b3"+
		"\n\37\f\37\16\37\u00b6\13\37\3\37\3\37\3 \6 \u00bb\n \r \16 \u00bc\3 "+
		"\3 \3!\3!\3!\3!\7!\u00c5\n!\f!\16!\u00c8\13!\3!\3!\3!\3!\3!\3\"\3\"\3"+
		"\"\3\"\7\"\u00d3\n\"\f\"\16\"\u00d6\13\"\3\"\3\"\3\u00c6#\3\3\1\5\4\1"+
		"\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1\21\n\1\23\13\1\25\f\1\27\r\1\31\16\1"+
		"\33\17\1\35\20\1\37\21\1!\22\1#\23\1%\24\1\'\25\1)\26\1+\27\1-\30\1/\31"+
		"\1\61\32\1\63\33\1\65\34\1\67\35\19\36\1;\37\1= \1?!\2A\"\3C#\4\3\2\b"+
		"\3\2\62;\6\2&&C\\aac|\7\2&&\62;C\\aac|\n\2##&&..\60;AAC\\aac|\5\2\13\f"+
		"\17\17\"\"\4\2\f\f\17\17\u00df\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t"+
		"\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2"+
		"\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2"+
		"\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2"+
		"+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2"+
		"\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2"+
		"C\3\2\2\2\3E\3\2\2\2\5G\3\2\2\2\7I\3\2\2\2\tK\3\2\2\2\13T\3\2\2\2\rV\3"+
		"\2\2\2\17X\3\2\2\2\21Z\3\2\2\2\23]\3\2\2\2\25a\3\2\2\2\27g\3\2\2\2\31"+
		"r\3\2\2\2\33t\3\2\2\2\35x\3\2\2\2\37{\3\2\2\2!\u0080\3\2\2\2#\u0082\3"+
		"\2\2\2%\u0084\3\2\2\2\'\u0086\3\2\2\2)\u0088\3\2\2\2+\u008a\3\2\2\2-\u008c"+
		"\3\2\2\2/\u008e\3\2\2\2\61\u0090\3\2\2\2\63\u0093\3\2\2\2\65\u0097\3\2"+
		"\2\2\67\u009e\3\2\2\29\u00a3\3\2\2\2;\u00a9\3\2\2\2=\u00b0\3\2\2\2?\u00ba"+
		"\3\2\2\2A\u00c0\3\2\2\2C\u00ce\3\2\2\2EF\7_\2\2F\4\3\2\2\2GH\7\60\2\2"+
		"H\6\3\2\2\2IJ\7+\2\2J\b\3\2\2\2KL\7h\2\2LM\7w\2\2MN\7p\2\2NO\7e\2\2OP"+
		"\7v\2\2PQ\7k\2\2QR\7q\2\2RS\7p\2\2S\n\3\2\2\2TU\7.\2\2U\f\3\2\2\2VW\7"+
		"]\2\2W\16\3\2\2\2XY\7*\2\2Y\20\3\2\2\2Z[\7k\2\2[\\\7h\2\2\\\22\3\2\2\2"+
		"]^\7x\2\2^_\7c\2\2_`\7t\2\2`\24\3\2\2\2ab\7v\2\2bc\7j\2\2cd\7k\2\2de\7"+
		"u\2\2ef\7\60\2\2f\26\3\2\2\2gh\7\60\2\2hi\7r\2\2ij\7t\2\2jk\7q\2\2kl\7"+
		"v\2\2lm\7q\2\2mn\7v\2\2no\7{\2\2op\7r\2\2pq\7g\2\2q\30\3\2\2\2rs\7}\2"+
		"\2s\32\3\2\2\2tu\7p\2\2uv\7g\2\2vw\7y\2\2w\34\3\2\2\2xy\7?\2\2yz\7?\2"+
		"\2z\36\3\2\2\2{|\7g\2\2|}\7n\2\2}~\7u\2\2~\177\7g\2\2\177 \3\2\2\2\u0080"+
		"\u0081\7\177\2\2\u0081\"\3\2\2\2\u0082\u0083\7#\2\2\u0083$\3\2\2\2\u0084"+
		"\u0085\7?\2\2\u0085&\3\2\2\2\u0086\u0087\7-\2\2\u0087(\3\2\2\2\u0088\u0089"+
		"\7/\2\2\u0089*\3\2\2\2\u008a\u008b\7,\2\2\u008b,\3\2\2\2\u008c\u008d\7"+
		"\61\2\2\u008d.\3\2\2\2\u008e\u008f\7\'\2\2\u008f\60\3\2\2\2\u0090\u0091"+
		"\7(\2\2\u0091\u0092\7(\2\2\u0092\62\3\2\2\2\u0093\u0094\7~\2\2\u0094\u0095"+
		"\7~\2\2\u0095\64\3\2\2\2\u0096\u0098\7/\2\2\u0097\u0096\3\2\2\2\u0097"+
		"\u0098\3\2\2\2\u0098\u009a\3\2\2\2\u0099\u009b\t\2\2\2\u009a\u0099\3\2"+
		"\2\2\u009b\u009c\3\2\2\2\u009c\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d"+
		"\66\3\2\2\2\u009e\u009f\7v\2\2\u009f\u00a0\7t\2\2\u00a0\u00a1\7w\2\2\u00a1"+
		"\u00a2\7g\2\2\u00a28\3\2\2\2\u00a3\u00a4\7h\2\2\u00a4\u00a5\7c\2\2\u00a5"+
		"\u00a6\7n\2\2\u00a6\u00a7\7u\2\2\u00a7\u00a8\7g\2\2\u00a8:\3\2\2\2\u00a9"+
		"\u00ad\t\3\2\2\u00aa\u00ac\t\4\2\2\u00ab\u00aa\3\2\2\2\u00ac\u00af\3\2"+
		"\2\2\u00ad\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae<\3\2\2\2\u00af\u00ad"+
		"\3\2\2\2\u00b0\u00b4\7$\2\2\u00b1\u00b3\t\5\2\2\u00b2\u00b1\3\2\2\2\u00b3"+
		"\u00b6\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b7\3\2"+
		"\2\2\u00b6\u00b4\3\2\2\2\u00b7\u00b8\7$\2\2\u00b8>\3\2\2\2\u00b9\u00bb"+
		"\t\6\2\2\u00ba\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc"+
		"\u00bd\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00bf\b \2\2\u00bf@\3\2\2\2\u00c0"+
		"\u00c1\7\61\2\2\u00c1\u00c2\7,\2\2\u00c2\u00c6\3\2\2\2\u00c3\u00c5\13"+
		"\2\2\2\u00c4\u00c3\3\2\2\2\u00c5\u00c8\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c6"+
		"\u00c4\3\2\2\2\u00c7\u00c9\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c9\u00ca\7,"+
		"\2\2\u00ca\u00cb\7\61\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00cd\b!\3\2\u00cd"+
		"B\3\2\2\2\u00ce\u00cf\7\61\2\2\u00cf\u00d0\7\61\2\2\u00d0\u00d4\3\2\2"+
		"\2\u00d1\u00d3\n\7\2\2\u00d2\u00d1\3\2\2\2\u00d3\u00d6\3\2\2\2\u00d4\u00d2"+
		"\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d7\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d7"+
		"\u00d8\b\"\4\2\u00d8D\3\2\2\2\n\2\u0097\u009c\u00ad\u00b4\u00bc\u00c6"+
		"\u00d4";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}