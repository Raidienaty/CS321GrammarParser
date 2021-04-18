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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, PRINT=11, ASSIGNMENT=12, LPARENTHESIS=13, RPARENTHESIS=14, SEMICOLON=15, 
		ADD=16, SUBTRACT=17, MULTIPLY=18, DIVIDE=19, MODULUS=20, POWER=21, OR=22, 
		AND=23, EQUIVALENT=24, NOTEQUIVALENT=25, GREATERTHANEQUALS=26, LESSTHANEQUALS=27, 
		GREATERTHAN=28, LESSTHAN=29, NOT=30, STRING=31, VARIABLENAME=32, COMMENT=33, 
		WHITESPACE=34, NUMBER=35, BOOL=36;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "PRINT", "ASSIGNMENT", "LPARENTHESIS", "RPARENTHESIS", "SEMICOLON", 
			"ADD", "SUBTRACT", "MULTIPLY", "DIVIDE", "MODULUS", "POWER", "OR", "AND", 
			"EQUIVALENT", "NOTEQUIVALENT", "GREATERTHANEQUALS", "LESSTHANEQUALS", 
			"GREATERTHAN", "LESSTHAN", "NOT", "STRING", "VARIABLENAME", "COMMENT", 
			"WHITESPACE", "NUMBER", "BOOL", "INT", "DIGIT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'++'", "'--'", "'if'", "'{'", "'}'", "'else if'", "'else'", "'for'", 
			"'while'", "'sqrt'", "'print'", "'='", "'('", "')'", "';'", "'+'", "'-'", 
			"'*'", "'/'", "'%'", "'^'", "'||'", "'&&'", "'=='", "'!='", "'>='", "'<='", 
			"'>'", "'<'", "'!'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, "PRINT", 
			"ASSIGNMENT", "LPARENTHESIS", "RPARENTHESIS", "SEMICOLON", "ADD", "SUBTRACT", 
			"MULTIPLY", "DIVIDE", "MODULUS", "POWER", "OR", "AND", "EQUIVALENT", 
			"NOTEQUIVALENT", "GREATERTHANEQUALS", "LESSTHANEQUALS", "GREATERTHAN", 
			"LESSTHAN", "NOT", "STRING", "VARIABLENAME", "COMMENT", "WHITESPACE", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2&\u0107\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\3\2\3\2\3\2\3\3\3\3\3\3\3"+
		"\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b"+
		"\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3"+
		"\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21"+
		"\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\27"+
		"\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34"+
		"\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3 \3 \7 \u00af\n \f \16 \u00b2"+
		"\13 \3 \3 \3 \3 \3 \7 \u00b9\n \f \16 \u00bc\13 \3 \5 \u00bf\n \3!\6!"+
		"\u00c2\n!\r!\16!\u00c3\3\"\3\"\3\"\3\"\7\"\u00ca\n\"\f\"\16\"\u00cd\13"+
		"\"\3\"\3\"\3\"\3\"\7\"\u00d3\n\"\f\"\16\"\u00d6\13\"\3\"\3\"\6\"\u00da"+
		"\n\"\r\"\16\"\u00db\3\"\3\"\3#\6#\u00e1\n#\r#\16#\u00e2\3#\3#\3$\3$\3"+
		"$\6$\u00ea\n$\r$\16$\u00eb\5$\u00ee\n$\3%\3%\3%\3%\3%\3%\3%\3%\3%\5%\u00f9"+
		"\n%\3&\3&\6&\u00fd\n&\r&\16&\u00fe\5&\u0101\n&\3&\5&\u0104\n&\3\'\3\'"+
		"\3\u00d4\2(\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67"+
		"\359\36;\37= ?!A\"C#E$G%I&K\2M\2\3\2\13\3\2$$\6\2\f\f\17\17$$^^\4\2\f"+
		"\f\17\17\3\2))\6\2\f\f\17\17))^^\4\2C\\c|\5\2\13\f\16\17\"\"\3\2\63;\3"+
		"\2\62;\2\u0115\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3"+
		"\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2"+
		"\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3"+
		"\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2"+
		"\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\2"+
		"9\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3"+
		"\2\2\2\2G\3\2\2\2\2I\3\2\2\2\3O\3\2\2\2\5R\3\2\2\2\7U\3\2\2\2\tX\3\2\2"+
		"\2\13Z\3\2\2\2\r\\\3\2\2\2\17d\3\2\2\2\21i\3\2\2\2\23m\3\2\2\2\25s\3\2"+
		"\2\2\27x\3\2\2\2\31~\3\2\2\2\33\u0080\3\2\2\2\35\u0082\3\2\2\2\37\u0084"+
		"\3\2\2\2!\u0086\3\2\2\2#\u0088\3\2\2\2%\u008a\3\2\2\2\'\u008c\3\2\2\2"+
		")\u008e\3\2\2\2+\u0090\3\2\2\2-\u0092\3\2\2\2/\u0095\3\2\2\2\61\u0098"+
		"\3\2\2\2\63\u009b\3\2\2\2\65\u009e\3\2\2\2\67\u00a1\3\2\2\29\u00a4\3\2"+
		"\2\2;\u00a6\3\2\2\2=\u00a8\3\2\2\2?\u00be\3\2\2\2A\u00c1\3\2\2\2C\u00d9"+
		"\3\2\2\2E\u00e0\3\2\2\2G\u00e6\3\2\2\2I\u00f8\3\2\2\2K\u0103\3\2\2\2M"+
		"\u0105\3\2\2\2OP\7-\2\2PQ\7-\2\2Q\4\3\2\2\2RS\7/\2\2ST\7/\2\2T\6\3\2\2"+
		"\2UV\7k\2\2VW\7h\2\2W\b\3\2\2\2XY\7}\2\2Y\n\3\2\2\2Z[\7\177\2\2[\f\3\2"+
		"\2\2\\]\7g\2\2]^\7n\2\2^_\7u\2\2_`\7g\2\2`a\7\"\2\2ab\7k\2\2bc\7h\2\2"+
		"c\16\3\2\2\2de\7g\2\2ef\7n\2\2fg\7u\2\2gh\7g\2\2h\20\3\2\2\2ij\7h\2\2"+
		"jk\7q\2\2kl\7t\2\2l\22\3\2\2\2mn\7y\2\2no\7j\2\2op\7k\2\2pq\7n\2\2qr\7"+
		"g\2\2r\24\3\2\2\2st\7u\2\2tu\7s\2\2uv\7t\2\2vw\7v\2\2w\26\3\2\2\2xy\7"+
		"r\2\2yz\7t\2\2z{\7k\2\2{|\7p\2\2|}\7v\2\2}\30\3\2\2\2~\177\7?\2\2\177"+
		"\32\3\2\2\2\u0080\u0081\7*\2\2\u0081\34\3\2\2\2\u0082\u0083\7+\2\2\u0083"+
		"\36\3\2\2\2\u0084\u0085\7=\2\2\u0085 \3\2\2\2\u0086\u0087\7-\2\2\u0087"+
		"\"\3\2\2\2\u0088\u0089\7/\2\2\u0089$\3\2\2\2\u008a\u008b\7,\2\2\u008b"+
		"&\3\2\2\2\u008c\u008d\7\61\2\2\u008d(\3\2\2\2\u008e\u008f\7\'\2\2\u008f"+
		"*\3\2\2\2\u0090\u0091\7`\2\2\u0091,\3\2\2\2\u0092\u0093\7~\2\2\u0093\u0094"+
		"\7~\2\2\u0094.\3\2\2\2\u0095\u0096\7(\2\2\u0096\u0097\7(\2\2\u0097\60"+
		"\3\2\2\2\u0098\u0099\7?\2\2\u0099\u009a\7?\2\2\u009a\62\3\2\2\2\u009b"+
		"\u009c\7#\2\2\u009c\u009d\7?\2\2\u009d\64\3\2\2\2\u009e\u009f\7@\2\2\u009f"+
		"\u00a0\7?\2\2\u00a0\66\3\2\2\2\u00a1\u00a2\7>\2\2\u00a2\u00a3\7?\2\2\u00a3"+
		"8\3\2\2\2\u00a4\u00a5\7@\2\2\u00a5:\3\2\2\2\u00a6\u00a7\7>\2\2\u00a7<"+
		"\3\2\2\2\u00a8\u00a9\7#\2\2\u00a9>\3\2\2\2\u00aa\u00b0\t\2\2\2\u00ab\u00af"+
		"\n\3\2\2\u00ac\u00ad\7^\2\2\u00ad\u00af\n\4\2\2\u00ae\u00ab\3\2\2\2\u00ae"+
		"\u00ac\3\2\2\2\u00af\u00b2\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b0\u00b1\3\2"+
		"\2\2\u00b1\u00b3\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b3\u00bf\t\2\2\2\u00b4"+
		"\u00ba\t\5\2\2\u00b5\u00b9\n\6\2\2\u00b6\u00b7\7^\2\2\u00b7\u00b9\n\4"+
		"\2\2\u00b8\u00b5\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b9\u00bc\3\2\2\2\u00ba"+
		"\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bd\3\2\2\2\u00bc\u00ba\3\2"+
		"\2\2\u00bd\u00bf\t\5\2\2\u00be\u00aa\3\2\2\2\u00be\u00b4\3\2\2\2\u00bf"+
		"@\3\2\2\2\u00c0\u00c2\t\7\2\2\u00c1\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2"+
		"\u00c3\u00c1\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4B\3\2\2\2\u00c5\u00c6\7"+
		"\61\2\2\u00c6\u00c7\7\61\2\2\u00c7\u00cb\3\2\2\2\u00c8\u00ca\n\4\2\2\u00c9"+
		"\u00c8\3\2\2\2\u00ca\u00cd\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cb\u00cc\3\2"+
		"\2\2\u00cc\u00da\3\2\2\2\u00cd\u00cb\3\2\2\2\u00ce\u00cf\7\61\2\2\u00cf"+
		"\u00d0\7,\2\2\u00d0\u00d4\3\2\2\2\u00d1\u00d3\13\2\2\2\u00d2\u00d1\3\2"+
		"\2\2\u00d3\u00d6\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d5"+
		"\u00d7\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d7\u00d8\7,\2\2\u00d8\u00da\7\61"+
		"\2\2\u00d9\u00c5\3\2\2\2\u00d9\u00ce\3\2\2\2\u00da\u00db\3\2\2\2\u00db"+
		"\u00d9\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00de\b\""+
		"\2\2\u00deD\3\2\2\2\u00df\u00e1\t\b\2\2\u00e0\u00df\3\2\2\2\u00e1\u00e2"+
		"\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4"+
		"\u00e5\b#\2\2\u00e5F\3\2\2\2\u00e6\u00ed\5K&\2\u00e7\u00e9\7\60\2\2\u00e8"+
		"\u00ea\5M\'\2\u00e9\u00e8\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00e9\3\2"+
		"\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ee\3\2\2\2\u00ed\u00e7\3\2\2\2\u00ed"+
		"\u00ee\3\2\2\2\u00eeH\3\2\2\2\u00ef\u00f0\7v\2\2\u00f0\u00f1\7t\2\2\u00f1"+
		"\u00f2\7w\2\2\u00f2\u00f9\7g\2\2\u00f3\u00f4\7h\2\2\u00f4\u00f5\7c\2\2"+
		"\u00f5\u00f6\7n\2\2\u00f6\u00f7\7u\2\2\u00f7\u00f9\7g\2\2\u00f8\u00ef"+
		"\3\2\2\2\u00f8\u00f3\3\2\2\2\u00f9J\3\2\2\2\u00fa\u0100\t\t\2\2\u00fb"+
		"\u00fd\5M\'\2\u00fc\u00fb\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u00fc\3\2"+
		"\2\2\u00fe\u00ff\3\2\2\2\u00ff\u0101\3\2\2\2\u0100\u00fc\3\2\2\2\u0100"+
		"\u0101\3\2\2\2\u0101\u0104\3\2\2\2\u0102\u0104\7\62\2\2\u0103\u00fa\3"+
		"\2\2\2\u0103\u0102\3\2\2\2\u0104L\3\2\2\2\u0105\u0106\t\n\2\2\u0106N\3"+
		"\2\2\2\24\2\u00ae\u00b0\u00b8\u00ba\u00be\u00c3\u00cb\u00d4\u00d9\u00db"+
		"\u00e2\u00eb\u00ed\u00f8\u00fe\u0100\u0103\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}