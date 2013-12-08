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
		T__6=1, T__5=2, T__4=3, T__3=4, T__2=5, T__1=6, T__0=7, ASSIGNMENT=8, 
		PLUS=9, MINUS=10, MUL=11, DIV=12, MOD=13, INT=14, ID=15, WS=16;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'{'", "'function'", "')'", "','", "'('", "'}'", "'var'", "'='", "'+'", 
		"'-'", "'*'", "'/'", "'%'", "INT", "ID", "WS"
	};
	public static final String[] ruleNames = {
		"T__6", "T__5", "T__4", "T__3", "T__2", "T__1", "T__0", "ASSIGNMENT", 
		"PLUS", "MINUS", "MUL", "DIV", "MOD", "INT", "ID", "WS"
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
		case 15: WS_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\22\\\b\1\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3"+
		"\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17"+
		"\5\17H\n\17\3\17\6\17K\n\17\r\17\16\17L\3\20\3\20\7\20Q\n\20\f\20\16\20"+
		"T\13\20\3\21\6\21W\n\21\r\21\16\21X\3\21\3\21\2\22\3\3\1\5\4\1\7\5\1\t"+
		"\6\1\13\7\1\r\b\1\17\t\1\21\n\1\23\13\1\25\f\1\27\r\1\31\16\1\33\17\1"+
		"\35\20\1\37\21\1!\22\2\3\2\6\3\2\62;\6\2&&C\\aac|\7\2&&\62;C\\aac|\5\2"+
		"\13\f\17\17\"\"_\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\3#\3\2\2\2\5%\3\2\2\2\7.\3\2\2\2\t\60\3\2\2\2\13\62\3\2\2\2"+
		"\r\64\3\2\2\2\17\66\3\2\2\2\21:\3\2\2\2\23<\3\2\2\2\25>\3\2\2\2\27@\3"+
		"\2\2\2\31B\3\2\2\2\33D\3\2\2\2\35G\3\2\2\2\37N\3\2\2\2!V\3\2\2\2#$\7}"+
		"\2\2$\4\3\2\2\2%&\7h\2\2&\'\7w\2\2\'(\7p\2\2()\7e\2\2)*\7v\2\2*+\7k\2"+
		"\2+,\7q\2\2,-\7p\2\2-\6\3\2\2\2./\7+\2\2/\b\3\2\2\2\60\61\7.\2\2\61\n"+
		"\3\2\2\2\62\63\7*\2\2\63\f\3\2\2\2\64\65\7\177\2\2\65\16\3\2\2\2\66\67"+
		"\7x\2\2\678\7c\2\289\7t\2\29\20\3\2\2\2:;\7?\2\2;\22\3\2\2\2<=\7-\2\2"+
		"=\24\3\2\2\2>?\7/\2\2?\26\3\2\2\2@A\7,\2\2A\30\3\2\2\2BC\7\61\2\2C\32"+
		"\3\2\2\2DE\7\'\2\2E\34\3\2\2\2FH\7/\2\2GF\3\2\2\2GH\3\2\2\2HJ\3\2\2\2"+
		"IK\t\2\2\2JI\3\2\2\2KL\3\2\2\2LJ\3\2\2\2LM\3\2\2\2M\36\3\2\2\2NR\t\3\2"+
		"\2OQ\t\4\2\2PO\3\2\2\2QT\3\2\2\2RP\3\2\2\2RS\3\2\2\2S \3\2\2\2TR\3\2\2"+
		"\2UW\t\5\2\2VU\3\2\2\2WX\3\2\2\2XV\3\2\2\2XY\3\2\2\2YZ\3\2\2\2Z[\b\21"+
		"\2\2[\"\3\2\2\2\7\2GLRX";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}