// Generated from /home/ttt/repos/CS321GrammarParser/language-parser/src/main/antlr4/parser/Language.g4 by ANTLR 4.8
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
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, PRINT=2, LPARENTHESIS=3, RPARENTHESIS=4, SEMICOLON=5, TRUE=6, 
		FALSE=7, STRING=8, VARIABLENAME=9, DATATYPE=10, COMMENT=11, WHITESPACE=12, 
		NUMBER=13, BOOL=14;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "PRINT", "LPARENTHESIS", "RPARENTHESIS", "SEMICOLON", "TRUE", 
			"FALSE", "STRING", "VARIABLENAME", "DATATYPE", "COMMENT", "WHITESPACE", 
			"NUMBER", "BOOL", "INT", "DIGIT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'print'", "'('", "')'", "';'", "'true'", "'false'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "PRINT", "LPARENTHESIS", "RPARENTHESIS", "SEMICOLON", "TRUE", 
			"FALSE", "STRING", "VARIABLENAME", "DATATYPE", "COMMENT", "WHITESPACE", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\20\u00a7\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3"+
		"\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\7\tA\n\t\f\t\16\tD\13\t\3\t\3"+
		"\t\3\t\3\t\3\t\7\tK\n\t\f\t\16\tN\13\t\3\t\5\tQ\n\t\3\n\6\nT\n\n\r\n\16"+
		"\nU\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\5\13k\n\13\3\f\3\f\3\f\3\f\7\fq\n\f\f\f\16"+
		"\ft\13\f\3\f\3\f\3\f\3\f\7\fz\n\f\f\f\16\f}\13\f\3\f\3\f\6\f\u0081\n\f"+
		"\r\f\16\f\u0082\3\f\3\f\3\r\6\r\u0088\n\r\r\r\16\r\u0089\3\r\3\r\3\16"+
		"\3\16\3\16\6\16\u0091\n\16\r\16\16\16\u0092\5\16\u0095\n\16\3\17\3\17"+
		"\5\17\u0099\n\17\3\20\3\20\6\20\u009d\n\20\r\20\16\20\u009e\5\20\u00a1"+
		"\n\20\3\20\5\20\u00a4\n\20\3\21\3\21\3{\2\22\3\3\5\4\7\5\t\6\13\7\r\b"+
		"\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\2!\2\3\2\13\3\2$$\6\2"+
		"\f\f\17\17$$^^\4\2\f\f\17\17\3\2))\6\2\f\f\17\17))^^\4\2C\\c|\5\2\13\f"+
		"\16\17\"\"\3\2\63;\3\2\62;\2\u00b8\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2"+
		"\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3"+
		"\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2"+
		"\2\3#\3\2\2\2\5%\3\2\2\2\7+\3\2\2\2\t-\3\2\2\2\13/\3\2\2\2\r\61\3\2\2"+
		"\2\17\66\3\2\2\2\21P\3\2\2\2\23S\3\2\2\2\25j\3\2\2\2\27\u0080\3\2\2\2"+
		"\31\u0087\3\2\2\2\33\u008d\3\2\2\2\35\u0098\3\2\2\2\37\u00a3\3\2\2\2!"+
		"\u00a5\3\2\2\2#$\7?\2\2$\4\3\2\2\2%&\7r\2\2&\'\7t\2\2\'(\7k\2\2()\7p\2"+
		"\2)*\7v\2\2*\6\3\2\2\2+,\7*\2\2,\b\3\2\2\2-.\7+\2\2.\n\3\2\2\2/\60\7="+
		"\2\2\60\f\3\2\2\2\61\62\7v\2\2\62\63\7t\2\2\63\64\7w\2\2\64\65\7g\2\2"+
		"\65\16\3\2\2\2\66\67\7h\2\2\678\7c\2\289\7n\2\29:\7u\2\2:;\7g\2\2;\20"+
		"\3\2\2\2<B\t\2\2\2=A\n\3\2\2>?\7^\2\2?A\n\4\2\2@=\3\2\2\2@>\3\2\2\2AD"+
		"\3\2\2\2B@\3\2\2\2BC\3\2\2\2CE\3\2\2\2DB\3\2\2\2EQ\t\2\2\2FL\t\5\2\2G"+
		"K\n\6\2\2HI\7^\2\2IK\n\4\2\2JG\3\2\2\2JH\3\2\2\2KN\3\2\2\2LJ\3\2\2\2L"+
		"M\3\2\2\2MO\3\2\2\2NL\3\2\2\2OQ\t\5\2\2P<\3\2\2\2PF\3\2\2\2Q\22\3\2\2"+
		"\2RT\t\7\2\2SR\3\2\2\2TU\3\2\2\2US\3\2\2\2UV\3\2\2\2V\24\3\2\2\2WX\7k"+
		"\2\2XY\7p\2\2Yk\7v\2\2Z[\7f\2\2[\\\7q\2\2\\]\7w\2\2]^\7d\2\2^_\7n\2\2"+
		"_k\7g\2\2`a\7u\2\2ab\7v\2\2bc\7t\2\2cd\7k\2\2de\7p\2\2ek\7i\2\2fg\7d\2"+
		"\2gh\7q\2\2hi\7q\2\2ik\7n\2\2jW\3\2\2\2jZ\3\2\2\2j`\3\2\2\2jf\3\2\2\2"+
		"k\26\3\2\2\2lm\7\61\2\2mn\7\61\2\2nr\3\2\2\2oq\n\4\2\2po\3\2\2\2qt\3\2"+
		"\2\2rp\3\2\2\2rs\3\2\2\2s\u0081\3\2\2\2tr\3\2\2\2uv\7\61\2\2vw\7,\2\2"+
		"w{\3\2\2\2xz\13\2\2\2yx\3\2\2\2z}\3\2\2\2{|\3\2\2\2{y\3\2\2\2|~\3\2\2"+
		"\2}{\3\2\2\2~\177\7,\2\2\177\u0081\7\61\2\2\u0080l\3\2\2\2\u0080u\3\2"+
		"\2\2\u0081\u0082\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083"+
		"\u0084\3\2\2\2\u0084\u0085\b\f\2\2\u0085\30\3\2\2\2\u0086\u0088\t\b\2"+
		"\2\u0087\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u0087\3\2\2\2\u0089\u008a"+
		"\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008c\b\r\2\2\u008c\32\3\2\2\2\u008d"+
		"\u0094\5\37\20\2\u008e\u0090\7\60\2\2\u008f\u0091\5!\21\2\u0090\u008f"+
		"\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093"+
		"\u0095\3\2\2\2\u0094\u008e\3\2\2\2\u0094\u0095\3\2\2\2\u0095\34\3\2\2"+
		"\2\u0096\u0099\5\r\7\2\u0097\u0099\5\17\b\2\u0098\u0096\3\2\2\2\u0098"+
		"\u0097\3\2\2\2\u0099\36\3\2\2\2\u009a\u00a0\t\t\2\2\u009b\u009d\5!\21"+
		"\2\u009c\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u009c\3\2\2\2\u009e\u009f"+
		"\3\2\2\2\u009f\u00a1\3\2\2\2\u00a0\u009c\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1"+
		"\u00a4\3\2\2\2\u00a2\u00a4\7\62\2\2\u00a3\u009a\3\2\2\2\u00a3\u00a2\3"+
		"\2\2\2\u00a4 \3\2\2\2\u00a5\u00a6\t\n\2\2\u00a6\"\3\2\2\2\25\2@BJLPUj"+
		"r{\u0080\u0082\u0089\u0092\u0094\u0098\u009e\u00a0\u00a3\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}