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
		T__3=10, T__2=11, T__1=12, T__0=13, PLUS=14, MINUS=15, MUL=16, DIV=17, 
		MOD=18, INT=19, ID=20, WS=21;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'{'", "' /= '", "'function'", "')'", "','", "' -= '", "' += '", "'('", 
		"' *= '", "'}'", "' = '", "' %= '", "'var'", "'+'", "'-'", "'*'", "'/'", 
		"'%'", "INT", "ID", "WS"
	};
	public static final String[] ruleNames = {
		"T__12", "T__11", "T__10", "T__9", "T__8", "T__7", "T__6", "T__5", "T__4", 
		"T__3", "T__2", "T__1", "T__0", "PLUS", "MINUS", "MUL", "DIV", "MOD", 
		"INT", "ID", "WS"
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
		case 20: WS_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\27\u0081\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\3\3\3\3\3\3\3"+
		"\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3"+
		"\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3"+
		"\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\20\3\20"+
		"\3\21\3\21\3\22\3\22\3\23\3\23\3\24\5\24m\n\24\3\24\6\24p\n\24\r\24\16"+
		"\24q\3\25\3\25\7\25v\n\25\f\25\16\25y\13\25\3\26\6\26|\n\26\r\26\16\26"+
		"}\3\26\3\26\2\27\3\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1\21\n\1\23"+
		"\13\1\25\f\1\27\r\1\31\16\1\33\17\1\35\20\1\37\21\1!\22\1#\23\1%\24\1"+
		"\'\25\1)\26\1+\27\2\3\2\6\3\2\62;\6\2&&C\\aac|\7\2&&\62;C\\aac|\5\2\13"+
		"\f\17\17\"\"\u0084\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\3-\3"+
		"\2\2\2\5/\3\2\2\2\7\64\3\2\2\2\t=\3\2\2\2\13?\3\2\2\2\rA\3\2\2\2\17F\3"+
		"\2\2\2\21K\3\2\2\2\23M\3\2\2\2\25R\3\2\2\2\27T\3\2\2\2\31X\3\2\2\2\33"+
		"]\3\2\2\2\35a\3\2\2\2\37c\3\2\2\2!e\3\2\2\2#g\3\2\2\2%i\3\2\2\2\'l\3\2"+
		"\2\2)s\3\2\2\2+{\3\2\2\2-.\7}\2\2.\4\3\2\2\2/\60\7\"\2\2\60\61\7\61\2"+
		"\2\61\62\7?\2\2\62\63\7\"\2\2\63\6\3\2\2\2\64\65\7h\2\2\65\66\7w\2\2\66"+
		"\67\7p\2\2\678\7e\2\289\7v\2\29:\7k\2\2:;\7q\2\2;<\7p\2\2<\b\3\2\2\2="+
		">\7+\2\2>\n\3\2\2\2?@\7.\2\2@\f\3\2\2\2AB\7\"\2\2BC\7/\2\2CD\7?\2\2DE"+
		"\7\"\2\2E\16\3\2\2\2FG\7\"\2\2GH\7-\2\2HI\7?\2\2IJ\7\"\2\2J\20\3\2\2\2"+
		"KL\7*\2\2L\22\3\2\2\2MN\7\"\2\2NO\7,\2\2OP\7?\2\2PQ\7\"\2\2Q\24\3\2\2"+
		"\2RS\7\177\2\2S\26\3\2\2\2TU\7\"\2\2UV\7?\2\2VW\7\"\2\2W\30\3\2\2\2XY"+
		"\7\"\2\2YZ\7\'\2\2Z[\7?\2\2[\\\7\"\2\2\\\32\3\2\2\2]^\7x\2\2^_\7c\2\2"+
		"_`\7t\2\2`\34\3\2\2\2ab\7-\2\2b\36\3\2\2\2cd\7/\2\2d \3\2\2\2ef\7,\2\2"+
		"f\"\3\2\2\2gh\7\61\2\2h$\3\2\2\2ij\7\'\2\2j&\3\2\2\2km\7/\2\2lk\3\2\2"+
		"\2lm\3\2\2\2mo\3\2\2\2np\t\2\2\2on\3\2\2\2pq\3\2\2\2qo\3\2\2\2qr\3\2\2"+
		"\2r(\3\2\2\2sw\t\3\2\2tv\t\4\2\2ut\3\2\2\2vy\3\2\2\2wu\3\2\2\2wx\3\2\2"+
		"\2x*\3\2\2\2yw\3\2\2\2z|\t\5\2\2{z\3\2\2\2|}\3\2\2\2}{\3\2\2\2}~\3\2\2"+
		"\2~\177\3\2\2\2\177\u0080\b\26\2\2\u0080,\3\2\2\2\7\2lqw}";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}