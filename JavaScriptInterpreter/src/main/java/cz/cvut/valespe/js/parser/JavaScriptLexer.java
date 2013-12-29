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
		INT=18, ID=19, STRING=20, WS=21, COMMENT=22, LINE_COMMENT=23;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'{'", "'function'", "')'", "'.'", "','", "'('", "'new'", "'}'", "'var'", 
		"'this.'", "'.prototype'", "'='", "'+'", "'-'", "'*'", "'/'", "'%'", "INT", 
		"ID", "STRING", "WS", "COMMENT", "LINE_COMMENT"
	};
	public static final String[] ruleNames = {
		"T__10", "T__9", "T__8", "T__7", "T__6", "T__5", "T__4", "T__3", "T__2", 
		"T__1", "T__0", "ASSIGNMENT", "PLUS", "MINUS", "MUL", "DIV", "MOD", "INT", 
		"ID", "STRING", "WS", "COMMENT", "LINE_COMMENT"
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

		case 21: COMMENT_action((RuleContext)_localctx, actionIndex); break;

		case 22: LINE_COMMENT_action((RuleContext)_localctx, actionIndex); break;
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\31\u00a3\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2"+
		"\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3"+
		"\7\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\17"+
		"\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\5\23m\n\23\3\23\6\23p\n\23\r"+
		"\23\16\23q\3\24\3\24\7\24v\n\24\f\24\16\24y\13\24\3\25\3\25\7\25}\n\25"+
		"\f\25\16\25\u0080\13\25\3\25\3\25\3\26\6\26\u0085\n\26\r\26\16\26\u0086"+
		"\3\26\3\26\3\27\3\27\3\27\3\27\7\27\u008f\n\27\f\27\16\27\u0092\13\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\7\30\u009d\n\30\f\30\16"+
		"\30\u00a0\13\30\3\30\3\30\3\u0090\31\3\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r"+
		"\b\1\17\t\1\21\n\1\23\13\1\25\f\1\27\r\1\31\16\1\33\17\1\35\20\1\37\21"+
		"\1!\22\1#\23\1%\24\1\'\25\1)\26\1+\27\2-\30\3/\31\4\3\2\b\3\2\62;\6\2"+
		"&&C\\aac|\7\2&&\62;C\\aac|\n\2##&&..\60;AAC\\aac|\5\2\13\f\17\17\"\"\4"+
		"\2\f\f\17\17\u00a9\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3"+
		"\2\2\2\2/\3\2\2\2\3\61\3\2\2\2\5\63\3\2\2\2\7<\3\2\2\2\t>\3\2\2\2\13@"+
		"\3\2\2\2\rB\3\2\2\2\17D\3\2\2\2\21H\3\2\2\2\23J\3\2\2\2\25N\3\2\2\2\27"+
		"T\3\2\2\2\31_\3\2\2\2\33a\3\2\2\2\35c\3\2\2\2\37e\3\2\2\2!g\3\2\2\2#i"+
		"\3\2\2\2%l\3\2\2\2\'s\3\2\2\2)z\3\2\2\2+\u0084\3\2\2\2-\u008a\3\2\2\2"+
		"/\u0098\3\2\2\2\61\62\7}\2\2\62\4\3\2\2\2\63\64\7h\2\2\64\65\7w\2\2\65"+
		"\66\7p\2\2\66\67\7e\2\2\678\7v\2\289\7k\2\29:\7q\2\2:;\7p\2\2;\6\3\2\2"+
		"\2<=\7+\2\2=\b\3\2\2\2>?\7\60\2\2?\n\3\2\2\2@A\7.\2\2A\f\3\2\2\2BC\7*"+
		"\2\2C\16\3\2\2\2DE\7p\2\2EF\7g\2\2FG\7y\2\2G\20\3\2\2\2HI\7\177\2\2I\22"+
		"\3\2\2\2JK\7x\2\2KL\7c\2\2LM\7t\2\2M\24\3\2\2\2NO\7v\2\2OP\7j\2\2PQ\7"+
		"k\2\2QR\7u\2\2RS\7\60\2\2S\26\3\2\2\2TU\7\60\2\2UV\7r\2\2VW\7t\2\2WX\7"+
		"q\2\2XY\7v\2\2YZ\7q\2\2Z[\7v\2\2[\\\7{\2\2\\]\7r\2\2]^\7g\2\2^\30\3\2"+
		"\2\2_`\7?\2\2`\32\3\2\2\2ab\7-\2\2b\34\3\2\2\2cd\7/\2\2d\36\3\2\2\2ef"+
		"\7,\2\2f \3\2\2\2gh\7\61\2\2h\"\3\2\2\2ij\7\'\2\2j$\3\2\2\2km\7/\2\2l"+
		"k\3\2\2\2lm\3\2\2\2mo\3\2\2\2np\t\2\2\2on\3\2\2\2pq\3\2\2\2qo\3\2\2\2"+
		"qr\3\2\2\2r&\3\2\2\2sw\t\3\2\2tv\t\4\2\2ut\3\2\2\2vy\3\2\2\2wu\3\2\2\2"+
		"wx\3\2\2\2x(\3\2\2\2yw\3\2\2\2z~\7$\2\2{}\t\5\2\2|{\3\2\2\2}\u0080\3\2"+
		"\2\2~|\3\2\2\2~\177\3\2\2\2\177\u0081\3\2\2\2\u0080~\3\2\2\2\u0081\u0082"+
		"\7$\2\2\u0082*\3\2\2\2\u0083\u0085\t\6\2\2\u0084\u0083\3\2\2\2\u0085\u0086"+
		"\3\2\2\2\u0086\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0088\3\2\2\2\u0088"+
		"\u0089\b\26\2\2\u0089,\3\2\2\2\u008a\u008b\7\61\2\2\u008b\u008c\7,\2\2"+
		"\u008c\u0090\3\2\2\2\u008d\u008f\13\2\2\2\u008e\u008d\3\2\2\2\u008f\u0092"+
		"\3\2\2\2\u0090\u0091\3\2\2\2\u0090\u008e\3\2\2\2\u0091\u0093\3\2\2\2\u0092"+
		"\u0090\3\2\2\2\u0093\u0094\7,\2\2\u0094\u0095\7\61\2\2\u0095\u0096\3\2"+
		"\2\2\u0096\u0097\b\27\3\2\u0097.\3\2\2\2\u0098\u0099\7\61\2\2\u0099\u009a"+
		"\7\61\2\2\u009a\u009e\3\2\2\2\u009b\u009d\n\7\2\2\u009c\u009b\3\2\2\2"+
		"\u009d\u00a0\3\2\2\2\u009e\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a1"+
		"\3\2\2\2\u00a0\u009e\3\2\2\2\u00a1\u00a2\b\30\4\2\u00a2\60\3\2\2\2\n\2"+
		"lqw~\u0086\u0090\u009e";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}