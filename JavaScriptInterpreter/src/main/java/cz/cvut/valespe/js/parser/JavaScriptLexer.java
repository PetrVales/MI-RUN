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
		T__8=1, T__7=2, T__6=3, T__5=4, T__4=5, T__3=6, T__2=7, T__1=8, T__0=9, 
		ASSIGNMENT=10, PLUS=11, MINUS=12, MUL=13, DIV=14, MOD=15, INT=16, ID=17, 
		WS=18, COMMENT=19, LINE_COMMENT=20;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'{'", "'function'", "')'", "','", "'('", "'new'", "'}'", "'var'", "'this.'", 
		"'='", "'+'", "'-'", "'*'", "'/'", "'%'", "INT", "ID", "WS", "COMMENT", 
		"LINE_COMMENT"
	};
	public static final String[] ruleNames = {
		"T__8", "T__7", "T__6", "T__5", "T__4", "T__3", "T__2", "T__1", "T__0", 
		"ASSIGNMENT", "PLUS", "MINUS", "MUL", "DIV", "MOD", "INT", "ID", "WS", 
		"COMMENT", "LINE_COMMENT"
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
		case 17: WS_action((RuleContext)_localctx, actionIndex); break;

		case 18: COMMENT_action((RuleContext)_localctx, actionIndex); break;

		case 19: LINE_COMMENT_action((RuleContext)_localctx, actionIndex); break;
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\26\u0087\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\t"+
		"\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17"+
		"\3\17\3\20\3\20\3\21\5\21Z\n\21\3\21\6\21]\n\21\r\21\16\21^\3\22\3\22"+
		"\7\22c\n\22\f\22\16\22f\13\22\3\23\6\23i\n\23\r\23\16\23j\3\23\3\23\3"+
		"\24\3\24\3\24\3\24\7\24s\n\24\f\24\16\24v\13\24\3\24\3\24\3\24\3\24\3"+
		"\24\3\25\3\25\3\25\3\25\7\25\u0081\n\25\f\25\16\25\u0084\13\25\3\25\3"+
		"\25\3t\26\3\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1\21\n\1\23\13\1\25"+
		"\f\1\27\r\1\31\16\1\33\17\1\35\20\1\37\21\1!\22\1#\23\1%\24\2\'\25\3)"+
		"\26\4\3\2\7\3\2\62;\6\2&&C\\aac|\7\2&&\62;C\\aac|\5\2\13\f\17\17\"\"\4"+
		"\2\f\f\17\17\u008c\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\3+\3\2\2\2\5-\3"+
		"\2\2\2\7\66\3\2\2\2\t8\3\2\2\2\13:\3\2\2\2\r<\3\2\2\2\17@\3\2\2\2\21B"+
		"\3\2\2\2\23F\3\2\2\2\25L\3\2\2\2\27N\3\2\2\2\31P\3\2\2\2\33R\3\2\2\2\35"+
		"T\3\2\2\2\37V\3\2\2\2!Y\3\2\2\2#`\3\2\2\2%h\3\2\2\2\'n\3\2\2\2)|\3\2\2"+
		"\2+,\7}\2\2,\4\3\2\2\2-.\7h\2\2./\7w\2\2/\60\7p\2\2\60\61\7e\2\2\61\62"+
		"\7v\2\2\62\63\7k\2\2\63\64\7q\2\2\64\65\7p\2\2\65\6\3\2\2\2\66\67\7+\2"+
		"\2\67\b\3\2\2\289\7.\2\29\n\3\2\2\2:;\7*\2\2;\f\3\2\2\2<=\7p\2\2=>\7g"+
		"\2\2>?\7y\2\2?\16\3\2\2\2@A\7\177\2\2A\20\3\2\2\2BC\7x\2\2CD\7c\2\2DE"+
		"\7t\2\2E\22\3\2\2\2FG\7v\2\2GH\7j\2\2HI\7k\2\2IJ\7u\2\2JK\7\60\2\2K\24"+
		"\3\2\2\2LM\7?\2\2M\26\3\2\2\2NO\7-\2\2O\30\3\2\2\2PQ\7/\2\2Q\32\3\2\2"+
		"\2RS\7,\2\2S\34\3\2\2\2TU\7\61\2\2U\36\3\2\2\2VW\7\'\2\2W \3\2\2\2XZ\7"+
		"/\2\2YX\3\2\2\2YZ\3\2\2\2Z\\\3\2\2\2[]\t\2\2\2\\[\3\2\2\2]^\3\2\2\2^\\"+
		"\3\2\2\2^_\3\2\2\2_\"\3\2\2\2`d\t\3\2\2ac\t\4\2\2ba\3\2\2\2cf\3\2\2\2"+
		"db\3\2\2\2de\3\2\2\2e$\3\2\2\2fd\3\2\2\2gi\t\5\2\2hg\3\2\2\2ij\3\2\2\2"+
		"jh\3\2\2\2jk\3\2\2\2kl\3\2\2\2lm\b\23\2\2m&\3\2\2\2no\7\61\2\2op\7,\2"+
		"\2pt\3\2\2\2qs\13\2\2\2rq\3\2\2\2sv\3\2\2\2tu\3\2\2\2tr\3\2\2\2uw\3\2"+
		"\2\2vt\3\2\2\2wx\7,\2\2xy\7\61\2\2yz\3\2\2\2z{\b\24\3\2{(\3\2\2\2|}\7"+
		"\61\2\2}~\7\61\2\2~\u0082\3\2\2\2\177\u0081\n\6\2\2\u0080\177\3\2\2\2"+
		"\u0081\u0084\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0085"+
		"\3\2\2\2\u0084\u0082\3\2\2\2\u0085\u0086\b\25\4\2\u0086*\3\2\2\2\t\2Y"+
		"^djt\u0082";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}