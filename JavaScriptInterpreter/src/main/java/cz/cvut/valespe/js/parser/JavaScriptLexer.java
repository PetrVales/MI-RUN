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
		T__12=1, T__11=2, T__10=3, T__9=4, T__8=5, T__7=6, T__6=7, T__5=8, T__4=9, 
		T__3=10, T__2=11, T__1=12, T__0=13, ASSIGNMENT=14, PLUS=15, MINUS=16, 
		MUL=17, DIV=18, MOD=19, INT=20, ID=21, STRING=22, WS=23, COMMENT=24, LINE_COMMENT=25;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"']'", "'{'", "'function'", "')'", "'.'", "','", "'['", "'('", "'new'", 
		"'}'", "'var'", "'this.'", "'.prototype'", "'='", "'+'", "'-'", "'*'", 
		"'/'", "'%'", "INT", "ID", "STRING", "WS", "COMMENT", "LINE_COMMENT"
	};
	public static final String[] ruleNames = {
		"T__12", "T__11", "T__10", "T__9", "T__8", "T__7", "T__6", "T__5", "T__4", 
		"T__3", "T__2", "T__1", "T__0", "ASSIGNMENT", "PLUS", "MINUS", "MUL", 
		"DIV", "MOD", "INT", "ID", "STRING", "WS", "COMMENT", "LINE_COMMENT"
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
		case 22: WS_action((RuleContext)_localctx, actionIndex); break;

		case 23: COMMENT_action((RuleContext)_localctx, actionIndex); break;

		case 24: LINE_COMMENT_action((RuleContext)_localctx, actionIndex); break;
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\33\u00ab\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3"+
		"\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23"+
		"\3\24\3\24\3\25\5\25u\n\25\3\25\6\25x\n\25\r\25\16\25y\3\26\3\26\7\26"+
		"~\n\26\f\26\16\26\u0081\13\26\3\27\3\27\7\27\u0085\n\27\f\27\16\27\u0088"+
		"\13\27\3\27\3\27\3\30\6\30\u008d\n\30\r\30\16\30\u008e\3\30\3\30\3\31"+
		"\3\31\3\31\3\31\7\31\u0097\n\31\f\31\16\31\u009a\13\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\32\3\32\3\32\3\32\7\32\u00a5\n\32\f\32\16\32\u00a8\13\32"+
		"\3\32\3\32\3\u0098\33\3\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1\21\n"+
		"\1\23\13\1\25\f\1\27\r\1\31\16\1\33\17\1\35\20\1\37\21\1!\22\1#\23\1%"+
		"\24\1\'\25\1)\26\1+\27\1-\30\1/\31\2\61\32\3\63\33\4\3\2\b\3\2\62;\6\2"+
		"&&C\\aac|\7\2&&\62;C\\aac|\n\2##&&..\60;AAC\\aac|\5\2\13\f\17\17\"\"\4"+
		"\2\f\f\17\17\u00b1\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3"+
		"\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\3\65\3\2\2\2\5\67\3\2\2\2"+
		"\79\3\2\2\2\tB\3\2\2\2\13D\3\2\2\2\rF\3\2\2\2\17H\3\2\2\2\21J\3\2\2\2"+
		"\23L\3\2\2\2\25P\3\2\2\2\27R\3\2\2\2\31V\3\2\2\2\33\\\3\2\2\2\35g\3\2"+
		"\2\2\37i\3\2\2\2!k\3\2\2\2#m\3\2\2\2%o\3\2\2\2\'q\3\2\2\2)t\3\2\2\2+{"+
		"\3\2\2\2-\u0082\3\2\2\2/\u008c\3\2\2\2\61\u0092\3\2\2\2\63\u00a0\3\2\2"+
		"\2\65\66\7_\2\2\66\4\3\2\2\2\678\7}\2\28\6\3\2\2\29:\7h\2\2:;\7w\2\2;"+
		"<\7p\2\2<=\7e\2\2=>\7v\2\2>?\7k\2\2?@\7q\2\2@A\7p\2\2A\b\3\2\2\2BC\7+"+
		"\2\2C\n\3\2\2\2DE\7\60\2\2E\f\3\2\2\2FG\7.\2\2G\16\3\2\2\2HI\7]\2\2I\20"+
		"\3\2\2\2JK\7*\2\2K\22\3\2\2\2LM\7p\2\2MN\7g\2\2NO\7y\2\2O\24\3\2\2\2P"+
		"Q\7\177\2\2Q\26\3\2\2\2RS\7x\2\2ST\7c\2\2TU\7t\2\2U\30\3\2\2\2VW\7v\2"+
		"\2WX\7j\2\2XY\7k\2\2YZ\7u\2\2Z[\7\60\2\2[\32\3\2\2\2\\]\7\60\2\2]^\7r"+
		"\2\2^_\7t\2\2_`\7q\2\2`a\7v\2\2ab\7q\2\2bc\7v\2\2cd\7{\2\2de\7r\2\2ef"+
		"\7g\2\2f\34\3\2\2\2gh\7?\2\2h\36\3\2\2\2ij\7-\2\2j \3\2\2\2kl\7/\2\2l"+
		"\"\3\2\2\2mn\7,\2\2n$\3\2\2\2op\7\61\2\2p&\3\2\2\2qr\7\'\2\2r(\3\2\2\2"+
		"su\7/\2\2ts\3\2\2\2tu\3\2\2\2uw\3\2\2\2vx\t\2\2\2wv\3\2\2\2xy\3\2\2\2"+
		"yw\3\2\2\2yz\3\2\2\2z*\3\2\2\2{\177\t\3\2\2|~\t\4\2\2}|\3\2\2\2~\u0081"+
		"\3\2\2\2\177}\3\2\2\2\177\u0080\3\2\2\2\u0080,\3\2\2\2\u0081\177\3\2\2"+
		"\2\u0082\u0086\7$\2\2\u0083\u0085\t\5\2\2\u0084\u0083\3\2\2\2\u0085\u0088"+
		"\3\2\2\2\u0086\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0089\3\2\2\2\u0088"+
		"\u0086\3\2\2\2\u0089\u008a\7$\2\2\u008a.\3\2\2\2\u008b\u008d\t\6\2\2\u008c"+
		"\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u008c\3\2\2\2\u008e\u008f\3\2"+
		"\2\2\u008f\u0090\3\2\2\2\u0090\u0091\b\30\2\2\u0091\60\3\2\2\2\u0092\u0093"+
		"\7\61\2\2\u0093\u0094\7,\2\2\u0094\u0098\3\2\2\2\u0095\u0097\13\2\2\2"+
		"\u0096\u0095\3\2\2\2\u0097\u009a\3\2\2\2\u0098\u0099\3\2\2\2\u0098\u0096"+
		"\3\2\2\2\u0099\u009b\3\2\2\2\u009a\u0098\3\2\2\2\u009b\u009c\7,\2\2\u009c"+
		"\u009d\7\61\2\2\u009d\u009e\3\2\2\2\u009e\u009f\b\31\3\2\u009f\62\3\2"+
		"\2\2\u00a0\u00a1\7\61\2\2\u00a1\u00a2\7\61\2\2\u00a2\u00a6\3\2\2\2\u00a3"+
		"\u00a5\n\7\2\2\u00a4\u00a3\3\2\2\2\u00a5\u00a8\3\2\2\2\u00a6\u00a4\3\2"+
		"\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a9\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a9"+
		"\u00aa\b\32\4\2\u00aa\64\3\2\2\2\n\2ty\177\u0086\u008e\u0098\u00a6";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}