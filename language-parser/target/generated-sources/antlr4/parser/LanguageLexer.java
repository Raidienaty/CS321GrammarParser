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
		T__0=1, T__1=2, PRINT=3, LPARENTHESIS=4, RPARENTHESIS=5, SEMICOLON=6, 
		TRUE=7, FALSE=8, STRING=9, VARIABLENAME=10, COMMENT=11, WHITESPACE=12, 
		NUMBER=13, BOOL=14;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "PRINT", "LPARENTHESIS", "RPARENTHESIS", "SEMICOLON", 
			"TRUE", "FALSE", "STRING", "VARIABLENAME", "COMMENT", "WHITESPACE", "NUMBER", 
			"BOOL", "INT", "DIGIT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'+'", "'print'", "'('", "')'", "';'", "'true'", "'false'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "PRINT", "LPARENTHESIS", "RPARENTHESIS", "SEMICOLON", 
			"TRUE", "FALSE", "STRING", "VARIABLENAME", "COMMENT", "WHITESPACE", "NUMBER", 
			"BOOL"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\20\u0094\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3"+
		"\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b"+
		"\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\7\nC\n\n\f\n\16\nF\13"+
		"\n\3\n\3\n\3\n\3\n\3\n\7\nM\n\n\f\n\16\nP\13\n\3\n\5\nS\n\n\3\13\6\13"+
		"V\n\13\r\13\16\13W\3\f\3\f\3\f\3\f\7\f^\n\f\f\f\16\fa\13\f\3\f\3\f\3\f"+
		"\3\f\7\fg\n\f\f\f\16\fj\13\f\3\f\3\f\6\fn\n\f\r\f\16\fo\3\f\3\f\3\r\6"+
		"\ru\n\r\r\r\16\rv\3\r\3\r\3\16\3\16\3\16\6\16~\n\16\r\16\16\16\177\5\16"+
		"\u0082\n\16\3\17\3\17\5\17\u0086\n\17\3\20\3\20\6\20\u008a\n\20\r\20\16"+
		"\20\u008b\5\20\u008e\n\20\3\20\5\20\u0091\n\20\3\21\3\21\3h\2\22\3\3\5"+
		"\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\2!"+
		"\2\3\2\13\3\2$$\6\2\f\f\17\17$$^^\4\2\f\f\17\17\3\2))\6\2\f\f\17\17))"+
		"^^\4\2C\\c|\5\2\13\f\16\17\"\"\3\2\63;\3\2\62;\2\u00a2\2\3\3\2\2\2\2\5"+
		"\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2"+
		"\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33"+
		"\3\2\2\2\2\35\3\2\2\2\3#\3\2\2\2\5%\3\2\2\2\7\'\3\2\2\2\t-\3\2\2\2\13"+
		"/\3\2\2\2\r\61\3\2\2\2\17\63\3\2\2\2\218\3\2\2\2\23R\3\2\2\2\25U\3\2\2"+
		"\2\27m\3\2\2\2\31t\3\2\2\2\33z\3\2\2\2\35\u0085\3\2\2\2\37\u0090\3\2\2"+
		"\2!\u0092\3\2\2\2#$\7?\2\2$\4\3\2\2\2%&\7-\2\2&\6\3\2\2\2\'(\7r\2\2()"+
		"\7t\2\2)*\7k\2\2*+\7p\2\2+,\7v\2\2,\b\3\2\2\2-.\7*\2\2.\n\3\2\2\2/\60"+
		"\7+\2\2\60\f\3\2\2\2\61\62\7=\2\2\62\16\3\2\2\2\63\64\7v\2\2\64\65\7t"+
		"\2\2\65\66\7w\2\2\66\67\7g\2\2\67\20\3\2\2\289\7h\2\29:\7c\2\2:;\7n\2"+
		"\2;<\7u\2\2<=\7g\2\2=\22\3\2\2\2>D\t\2\2\2?C\n\3\2\2@A\7^\2\2AC\n\4\2"+
		"\2B?\3\2\2\2B@\3\2\2\2CF\3\2\2\2DB\3\2\2\2DE\3\2\2\2EG\3\2\2\2FD\3\2\2"+
		"\2GS\t\2\2\2HN\t\5\2\2IM\n\6\2\2JK\7^\2\2KM\n\4\2\2LI\3\2\2\2LJ\3\2\2"+
		"\2MP\3\2\2\2NL\3\2\2\2NO\3\2\2\2OQ\3\2\2\2PN\3\2\2\2QS\t\5\2\2R>\3\2\2"+
		"\2RH\3\2\2\2S\24\3\2\2\2TV\t\7\2\2UT\3\2\2\2VW\3\2\2\2WU\3\2\2\2WX\3\2"+
		"\2\2X\26\3\2\2\2YZ\7\61\2\2Z[\7\61\2\2[_\3\2\2\2\\^\n\4\2\2]\\\3\2\2\2"+
		"^a\3\2\2\2_]\3\2\2\2_`\3\2\2\2`n\3\2\2\2a_\3\2\2\2bc\7\61\2\2cd\7,\2\2"+
		"dh\3\2\2\2eg\13\2\2\2fe\3\2\2\2gj\3\2\2\2hi\3\2\2\2hf\3\2\2\2ik\3\2\2"+
		"\2jh\3\2\2\2kl\7,\2\2ln\7\61\2\2mY\3\2\2\2mb\3\2\2\2no\3\2\2\2om\3\2\2"+
		"\2op\3\2\2\2pq\3\2\2\2qr\b\f\2\2r\30\3\2\2\2su\t\b\2\2ts\3\2\2\2uv\3\2"+
		"\2\2vt\3\2\2\2vw\3\2\2\2wx\3\2\2\2xy\b\r\2\2y\32\3\2\2\2z\u0081\5\37\20"+
		"\2{}\7\60\2\2|~\5!\21\2}|\3\2\2\2~\177\3\2\2\2\177}\3\2\2\2\177\u0080"+
		"\3\2\2\2\u0080\u0082\3\2\2\2\u0081{\3\2\2\2\u0081\u0082\3\2\2\2\u0082"+
		"\34\3\2\2\2\u0083\u0086\5\17\b\2\u0084\u0086\5\21\t\2\u0085\u0083\3\2"+
		"\2\2\u0085\u0084\3\2\2\2\u0086\36\3\2\2\2\u0087\u008d\t\t\2\2\u0088\u008a"+
		"\5!\21\2\u0089\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u0089\3\2\2\2\u008b"+
		"\u008c\3\2\2\2\u008c\u008e\3\2\2\2\u008d\u0089\3\2\2\2\u008d\u008e\3\2"+
		"\2\2\u008e\u0091\3\2\2\2\u008f\u0091\7\62\2\2\u0090\u0087\3\2\2\2\u0090"+
		"\u008f\3\2\2\2\u0091 \3\2\2\2\u0092\u0093\t\n\2\2\u0093\"\3\2\2\2\24\2"+
		"BDLNRW_hmov\177\u0081\u0085\u008b\u008d\u0090\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}