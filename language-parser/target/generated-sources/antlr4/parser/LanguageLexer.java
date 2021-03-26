// Generated from parser/Language.g4 by ANTLR 4.9
package parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LanguageLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, PRINT=7, LPARENTHESIS=8, 
		RPARENTHESIS=9, SEMICOLON=10, TRUE=11, FALSE=12, STRING=13, VARIABLENAME=14, 
		COMMENT=15, WHITESPACE=16, NUMBER=17, BOOL=18;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "PRINT", "LPARENTHESIS", 
			"RPARENTHESIS", "SEMICOLON", "TRUE", "FALSE", "STRING", "VARIABLENAME", 
			"COMMENT", "WHITESPACE", "NUMBER", "BOOL", "INT", "DIGIT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'+'", "'-'", "'*'", "'/'", "'%'", "'print'", "'('", "')'", 
			"';'", "'true'", "'false'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, "PRINT", "LPARENTHESIS", "RPARENTHESIS", 
			"SEMICOLON", "TRUE", "FALSE", "STRING", "VARIABLENAME", "COMMENT", "WHITESPACE", 
			"NUMBER", "BOOL"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public LanguageLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Language.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\24\u00a4\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3"+
		"\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3"+
		"\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\7\16S\n\16"+
		"\f\16\16\16V\13\16\3\16\3\16\3\16\3\16\3\16\7\16]\n\16\f\16\16\16`\13"+
		"\16\3\16\5\16c\n\16\3\17\6\17f\n\17\r\17\16\17g\3\20\3\20\3\20\3\20\7"+
		"\20n\n\20\f\20\16\20q\13\20\3\20\3\20\3\20\3\20\7\20w\n\20\f\20\16\20"+
		"z\13\20\3\20\3\20\6\20~\n\20\r\20\16\20\177\3\20\3\20\3\21\6\21\u0085"+
		"\n\21\r\21\16\21\u0086\3\21\3\21\3\22\3\22\3\22\6\22\u008e\n\22\r\22\16"+
		"\22\u008f\5\22\u0092\n\22\3\23\3\23\5\23\u0096\n\23\3\24\3\24\6\24\u009a"+
		"\n\24\r\24\16\24\u009b\5\24\u009e\n\24\3\24\5\24\u00a1\n\24\3\25\3\25"+
		"\3x\2\26\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17"+
		"\35\20\37\21!\22#\23%\24\'\2)\2\3\2\13\3\2$$\6\2\f\f\17\17$$^^\4\2\f\f"+
		"\17\17\3\2))\6\2\f\f\17\17))^^\4\2C\\c|\5\2\13\f\16\17\"\"\3\2\63;\3\2"+
		"\62;\2\u00b2\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2"+
		"\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2"+
		"\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2"+
		"\2\2\2#\3\2\2\2\2%\3\2\2\2\3+\3\2\2\2\5-\3\2\2\2\7/\3\2\2\2\t\61\3\2\2"+
		"\2\13\63\3\2\2\2\r\65\3\2\2\2\17\67\3\2\2\2\21=\3\2\2\2\23?\3\2\2\2\25"+
		"A\3\2\2\2\27C\3\2\2\2\31H\3\2\2\2\33b\3\2\2\2\35e\3\2\2\2\37}\3\2\2\2"+
		"!\u0084\3\2\2\2#\u008a\3\2\2\2%\u0095\3\2\2\2\'\u00a0\3\2\2\2)\u00a2\3"+
		"\2\2\2+,\7?\2\2,\4\3\2\2\2-.\7-\2\2.\6\3\2\2\2/\60\7/\2\2\60\b\3\2\2\2"+
		"\61\62\7,\2\2\62\n\3\2\2\2\63\64\7\61\2\2\64\f\3\2\2\2\65\66\7\'\2\2\66"+
		"\16\3\2\2\2\678\7r\2\289\7t\2\29:\7k\2\2:;\7p\2\2;<\7v\2\2<\20\3\2\2\2"+
		"=>\7*\2\2>\22\3\2\2\2?@\7+\2\2@\24\3\2\2\2AB\7=\2\2B\26\3\2\2\2CD\7v\2"+
		"\2DE\7t\2\2EF\7w\2\2FG\7g\2\2G\30\3\2\2\2HI\7h\2\2IJ\7c\2\2JK\7n\2\2K"+
		"L\7u\2\2LM\7g\2\2M\32\3\2\2\2NT\t\2\2\2OS\n\3\2\2PQ\7^\2\2QS\n\4\2\2R"+
		"O\3\2\2\2RP\3\2\2\2SV\3\2\2\2TR\3\2\2\2TU\3\2\2\2UW\3\2\2\2VT\3\2\2\2"+
		"Wc\t\2\2\2X^\t\5\2\2Y]\n\6\2\2Z[\7^\2\2[]\n\4\2\2\\Y\3\2\2\2\\Z\3\2\2"+
		"\2]`\3\2\2\2^\\\3\2\2\2^_\3\2\2\2_a\3\2\2\2`^\3\2\2\2ac\t\5\2\2bN\3\2"+
		"\2\2bX\3\2\2\2c\34\3\2\2\2df\t\7\2\2ed\3\2\2\2fg\3\2\2\2ge\3\2\2\2gh\3"+
		"\2\2\2h\36\3\2\2\2ij\7\61\2\2jk\7\61\2\2ko\3\2\2\2ln\n\4\2\2ml\3\2\2\2"+
		"nq\3\2\2\2om\3\2\2\2op\3\2\2\2p~\3\2\2\2qo\3\2\2\2rs\7\61\2\2st\7,\2\2"+
		"tx\3\2\2\2uw\13\2\2\2vu\3\2\2\2wz\3\2\2\2xy\3\2\2\2xv\3\2\2\2y{\3\2\2"+
		"\2zx\3\2\2\2{|\7,\2\2|~\7\61\2\2}i\3\2\2\2}r\3\2\2\2~\177\3\2\2\2\177"+
		"}\3\2\2\2\177\u0080\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0082\b\20\2\2\u0082"+
		" \3\2\2\2\u0083\u0085\t\b\2\2\u0084\u0083\3\2\2\2\u0085\u0086\3\2\2\2"+
		"\u0086\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u0089"+
		"\b\21\2\2\u0089\"\3\2\2\2\u008a\u0091\5\'\24\2\u008b\u008d\7\60\2\2\u008c"+
		"\u008e\5)\25\2\u008d\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u008d\3\2"+
		"\2\2\u008f\u0090\3\2\2\2\u0090\u0092\3\2\2\2\u0091\u008b\3\2\2\2\u0091"+
		"\u0092\3\2\2\2\u0092$\3\2\2\2\u0093\u0096\5\27\f\2\u0094\u0096\5\31\r"+
		"\2\u0095\u0093\3\2\2\2\u0095\u0094\3\2\2\2\u0096&\3\2\2\2\u0097\u009d"+
		"\t\t\2\2\u0098\u009a\5)\25\2\u0099\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b"+
		"\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009e\3\2\2\2\u009d\u0099\3\2"+
		"\2\2\u009d\u009e\3\2\2\2\u009e\u00a1\3\2\2\2\u009f\u00a1\7\62\2\2\u00a0"+
		"\u0097\3\2\2\2\u00a0\u009f\3\2\2\2\u00a1(\3\2\2\2\u00a2\u00a3\t\n\2\2"+
		"\u00a3*\3\2\2\2\24\2RT\\^bgox}\177\u0086\u008f\u0091\u0095\u009b\u009d"+
		"\u00a0\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}