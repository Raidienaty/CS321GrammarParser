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
		T__0=1, PRINT=2, LPARENTHESIS=3, RPARENTHESIS=4, SEMICOLON=5, STRING=6, 
		VARIABLENAME=7, DATATYPE=8, COMMENT=9, WHITESPACE=10, NUMBER=11, BOOL=12;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "PRINT", "LPARENTHESIS", "RPARENTHESIS", "SEMICOLON", "STRING", 
			"VARIABLENAME", "DATATYPE", "COMMENT", "WHITESPACE", "NUMBER", "BOOL", 
			"INT", "DIGIT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'print'", "'('", "')'", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "PRINT", "LPARENTHESIS", "RPARENTHESIS", "SEMICOLON", "STRING", 
			"VARIABLENAME", "DATATYPE", "COMMENT", "WHITESPACE", "NUMBER", "BOOL"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\16\u009f\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\7\7\62\n\7\f\7\16\7\65"+
		"\13\7\3\7\3\7\3\7\3\7\3\7\7\7<\n\7\f\7\16\7?\13\7\3\7\5\7B\n\7\3\b\6\b"+
		"E\n\b\r\b\16\bF\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\5\t\\\n\t\3\n\3\n\3\n\3\n\7\nb\n\n\f\n\16\ne\13"+
		"\n\3\n\3\n\3\n\3\n\7\nk\n\n\f\n\16\nn\13\n\3\n\3\n\6\nr\n\n\r\n\16\ns"+
		"\3\n\3\n\3\13\6\13y\n\13\r\13\16\13z\3\13\3\13\3\f\3\f\3\f\6\f\u0082\n"+
		"\f\r\f\16\f\u0083\5\f\u0086\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5"+
		"\r\u0091\n\r\3\16\3\16\6\16\u0095\n\16\r\16\16\16\u0096\5\16\u0099\n\16"+
		"\3\16\5\16\u009c\n\16\3\17\3\17\3l\2\20\3\3\5\4\7\5\t\6\13\7\r\b\17\t"+
		"\21\n\23\13\25\f\27\r\31\16\33\2\35\2\3\2\13\3\2$$\6\2\f\f\17\17$$^^\4"+
		"\2\f\f\17\17\3\2))\6\2\f\f\17\17))^^\4\2C\\c|\5\2\13\f\16\17\"\"\3\2\63"+
		";\3\2\62;\2\u00b0\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\3\37\3\2\2\2\5!\3\2\2\2\7\'\3\2\2\2\t)\3"+
		"\2\2\2\13+\3\2\2\2\rA\3\2\2\2\17D\3\2\2\2\21[\3\2\2\2\23q\3\2\2\2\25x"+
		"\3\2\2\2\27~\3\2\2\2\31\u0090\3\2\2\2\33\u009b\3\2\2\2\35\u009d\3\2\2"+
		"\2\37 \7?\2\2 \4\3\2\2\2!\"\7r\2\2\"#\7t\2\2#$\7k\2\2$%\7p\2\2%&\7v\2"+
		"\2&\6\3\2\2\2\'(\7*\2\2(\b\3\2\2\2)*\7+\2\2*\n\3\2\2\2+,\7=\2\2,\f\3\2"+
		"\2\2-\63\t\2\2\2.\62\n\3\2\2/\60\7^\2\2\60\62\n\4\2\2\61.\3\2\2\2\61/"+
		"\3\2\2\2\62\65\3\2\2\2\63\61\3\2\2\2\63\64\3\2\2\2\64\66\3\2\2\2\65\63"+
		"\3\2\2\2\66B\t\2\2\2\67=\t\5\2\28<\n\6\2\29:\7^\2\2:<\n\4\2\2;8\3\2\2"+
		"\2;9\3\2\2\2<?\3\2\2\2=;\3\2\2\2=>\3\2\2\2>@\3\2\2\2?=\3\2\2\2@B\t\5\2"+
		"\2A-\3\2\2\2A\67\3\2\2\2B\16\3\2\2\2CE\t\7\2\2DC\3\2\2\2EF\3\2\2\2FD\3"+
		"\2\2\2FG\3\2\2\2G\20\3\2\2\2HI\7k\2\2IJ\7p\2\2J\\\7v\2\2KL\7f\2\2LM\7"+
		"q\2\2MN\7w\2\2NO\7d\2\2OP\7n\2\2P\\\7g\2\2QR\7u\2\2RS\7v\2\2ST\7t\2\2"+
		"TU\7k\2\2UV\7p\2\2V\\\7i\2\2WX\7d\2\2XY\7q\2\2YZ\7q\2\2Z\\\7n\2\2[H\3"+
		"\2\2\2[K\3\2\2\2[Q\3\2\2\2[W\3\2\2\2\\\22\3\2\2\2]^\7\61\2\2^_\7\61\2"+
		"\2_c\3\2\2\2`b\n\4\2\2a`\3\2\2\2be\3\2\2\2ca\3\2\2\2cd\3\2\2\2dr\3\2\2"+
		"\2ec\3\2\2\2fg\7\61\2\2gh\7,\2\2hl\3\2\2\2ik\13\2\2\2ji\3\2\2\2kn\3\2"+
		"\2\2lm\3\2\2\2lj\3\2\2\2mo\3\2\2\2nl\3\2\2\2op\7,\2\2pr\7\61\2\2q]\3\2"+
		"\2\2qf\3\2\2\2rs\3\2\2\2sq\3\2\2\2st\3\2\2\2tu\3\2\2\2uv\b\n\2\2v\24\3"+
		"\2\2\2wy\t\b\2\2xw\3\2\2\2yz\3\2\2\2zx\3\2\2\2z{\3\2\2\2{|\3\2\2\2|}\b"+
		"\13\2\2}\26\3\2\2\2~\u0085\5\33\16\2\177\u0081\7\60\2\2\u0080\u0082\5"+
		"\35\17\2\u0081\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0081\3\2\2\2\u0083"+
		"\u0084\3\2\2\2\u0084\u0086\3\2\2\2\u0085\177\3\2\2\2\u0085\u0086\3\2\2"+
		"\2\u0086\30\3\2\2\2\u0087\u0088\7v\2\2\u0088\u0089\7t\2\2\u0089\u008a"+
		"\7w\2\2\u008a\u0091\7g\2\2\u008b\u008c\7h\2\2\u008c\u008d\7c\2\2\u008d"+
		"\u008e\7n\2\2\u008e\u008f\7u\2\2\u008f\u0091\7g\2\2\u0090\u0087\3\2\2"+
		"\2\u0090\u008b\3\2\2\2\u0091\32\3\2\2\2\u0092\u0098\t\t\2\2\u0093\u0095"+
		"\5\35\17\2\u0094\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0094\3\2\2\2"+
		"\u0096\u0097\3\2\2\2\u0097\u0099\3\2\2\2\u0098\u0094\3\2\2\2\u0098\u0099"+
		"\3\2\2\2\u0099\u009c\3\2\2\2\u009a\u009c\7\62\2\2\u009b\u0092\3\2\2\2"+
		"\u009b\u009a\3\2\2\2\u009c\34\3\2\2\2\u009d\u009e\t\n\2\2\u009e\36\3\2"+
		"\2\2\25\2\61\63;=AF[clqsz\u0083\u0085\u0090\u0096\u0098\u009b\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}