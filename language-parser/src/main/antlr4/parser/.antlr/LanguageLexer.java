// Generated from /mnt/d/Storage/CodingProjects/ANTLR/CS321GrammarParser/language-parser/src/main/antlr4/parser/Language.g4 by ANTLR 4.8
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
		T__0=1, T__1=2, PRINT=3, LPARENTHESIS=4, RPARENTHESIS=5, SEMICOLON=6, 
		STRING=7, VARIABLENAME=8, COMMENT=9, WHITESPACE=10, NUMBER=11, BOOL=12;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "PRINT", "LPARENTHESIS", "RPARENTHESIS", "SEMICOLON", 
			"STRING", "VARIABLENAME", "COMMENT", "WHITESPACE", "NUMBER", "BOOL", 
			"INT", "DIGIT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'+'", "'print'", "'('", "')'", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "PRINT", "LPARENTHESIS", "RPARENTHESIS", "SEMICOLON", 
			"STRING", "VARIABLENAME", "COMMENT", "WHITESPACE", "NUMBER", "BOOL"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\16\u008c\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\3\3\3\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\7\b\64\n\b\f\b"+
		"\16\b\67\13\b\3\b\3\b\3\b\3\b\3\b\7\b>\n\b\f\b\16\bA\13\b\3\b\5\bD\n\b"+
		"\3\t\6\tG\n\t\r\t\16\tH\3\n\3\n\3\n\3\n\7\nO\n\n\f\n\16\nR\13\n\3\n\3"+
		"\n\3\n\3\n\7\nX\n\n\f\n\16\n[\13\n\3\n\3\n\6\n_\n\n\r\n\16\n`\3\n\3\n"+
		"\3\13\6\13f\n\13\r\13\16\13g\3\13\3\13\3\f\3\f\3\f\6\fo\n\f\r\f\16\fp"+
		"\5\fs\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r~\n\r\3\16\3\16\6\16"+
		"\u0082\n\16\r\16\16\16\u0083\5\16\u0086\n\16\3\16\5\16\u0089\n\16\3\17"+
		"\3\17\3Y\2\20\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16"+
		"\33\2\35\2\3\2\13\3\2$$\6\2\f\f\17\17$$^^\4\2\f\f\17\17\3\2))\6\2\f\f"+
		"\17\17))^^\4\2C\\c|\5\2\13\f\16\17\"\"\3\2\63;\3\2\62;\2\u009a\2\3\3\2"+
		"\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17"+
		"\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2"+
		"\2\2\3\37\3\2\2\2\5!\3\2\2\2\7#\3\2\2\2\t)\3\2\2\2\13+\3\2\2\2\r-\3\2"+
		"\2\2\17C\3\2\2\2\21F\3\2\2\2\23^\3\2\2\2\25e\3\2\2\2\27k\3\2\2\2\31}\3"+
		"\2\2\2\33\u0088\3\2\2\2\35\u008a\3\2\2\2\37 \7?\2\2 \4\3\2\2\2!\"\7-\2"+
		"\2\"\6\3\2\2\2#$\7r\2\2$%\7t\2\2%&\7k\2\2&\'\7p\2\2\'(\7v\2\2(\b\3\2\2"+
		"\2)*\7*\2\2*\n\3\2\2\2+,\7+\2\2,\f\3\2\2\2-.\7=\2\2.\16\3\2\2\2/\65\t"+
		"\2\2\2\60\64\n\3\2\2\61\62\7^\2\2\62\64\n\4\2\2\63\60\3\2\2\2\63\61\3"+
		"\2\2\2\64\67\3\2\2\2\65\63\3\2\2\2\65\66\3\2\2\2\668\3\2\2\2\67\65\3\2"+
		"\2\28D\t\2\2\29?\t\5\2\2:>\n\6\2\2;<\7^\2\2<>\n\4\2\2=:\3\2\2\2=;\3\2"+
		"\2\2>A\3\2\2\2?=\3\2\2\2?@\3\2\2\2@B\3\2\2\2A?\3\2\2\2BD\t\5\2\2C/\3\2"+
		"\2\2C9\3\2\2\2D\20\3\2\2\2EG\t\7\2\2FE\3\2\2\2GH\3\2\2\2HF\3\2\2\2HI\3"+
		"\2\2\2I\22\3\2\2\2JK\7\61\2\2KL\7\61\2\2LP\3\2\2\2MO\n\4\2\2NM\3\2\2\2"+
		"OR\3\2\2\2PN\3\2\2\2PQ\3\2\2\2Q_\3\2\2\2RP\3\2\2\2ST\7\61\2\2TU\7,\2\2"+
		"UY\3\2\2\2VX\13\2\2\2WV\3\2\2\2X[\3\2\2\2YZ\3\2\2\2YW\3\2\2\2Z\\\3\2\2"+
		"\2[Y\3\2\2\2\\]\7,\2\2]_\7\61\2\2^J\3\2\2\2^S\3\2\2\2_`\3\2\2\2`^\3\2"+
		"\2\2`a\3\2\2\2ab\3\2\2\2bc\b\n\2\2c\24\3\2\2\2df\t\b\2\2ed\3\2\2\2fg\3"+
		"\2\2\2ge\3\2\2\2gh\3\2\2\2hi\3\2\2\2ij\b\13\2\2j\26\3\2\2\2kr\5\33\16"+
		"\2ln\7\60\2\2mo\5\35\17\2nm\3\2\2\2op\3\2\2\2pn\3\2\2\2pq\3\2\2\2qs\3"+
		"\2\2\2rl\3\2\2\2rs\3\2\2\2s\30\3\2\2\2tu\7v\2\2uv\7t\2\2vw\7w\2\2w~\7"+
		"g\2\2xy\7h\2\2yz\7c\2\2z{\7n\2\2{|\7u\2\2|~\7g\2\2}t\3\2\2\2}x\3\2\2\2"+
		"~\32\3\2\2\2\177\u0085\t\t\2\2\u0080\u0082\5\35\17\2\u0081\u0080\3\2\2"+
		"\2\u0082\u0083\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0086"+
		"\3\2\2\2\u0085\u0081\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0089\3\2\2\2\u0087"+
		"\u0089\7\62\2\2\u0088\177\3\2\2\2\u0088\u0087\3\2\2\2\u0089\34\3\2\2\2"+
		"\u008a\u008b\t\n\2\2\u008b\36\3\2\2\2\24\2\63\65=?CHPY^`gpr}\u0083\u0085"+
		"\u0088\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}