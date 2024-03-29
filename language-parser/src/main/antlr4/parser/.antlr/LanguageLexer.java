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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		PRINT=10, ASSIGNMENT=11, LPARENTHESIS=12, RPARENTHESIS=13, SEMICOLON=14, 
		ADD=15, SUBTRACT=16, MULTIPLY=17, DIVIDE=18, MODULUS=19, POWER=20, OR=21, 
		AND=22, EQUIVALENT=23, NOTEQUIVALENT=24, GREATERTHANEQUALS=25, LESSTHANEQUALS=26, 
		GREATERTHAN=27, LESSTHAN=28, NOT=29, STRING=30, VARIABLENAME=31, COMMENT=32, 
		WHITESPACE=33, NUMBER=34, BOOL=35;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"PRINT", "ASSIGNMENT", "LPARENTHESIS", "RPARENTHESIS", "SEMICOLON", "ADD", 
			"SUBTRACT", "MULTIPLY", "DIVIDE", "MODULUS", "POWER", "OR", "AND", "EQUIVALENT", 
			"NOTEQUIVALENT", "GREATERTHANEQUALS", "LESSTHANEQUALS", "GREATERTHAN", 
			"LESSTHAN", "NOT", "STRING", "VARIABLENAME", "COMMENT", "WHITESPACE", 
			"NUMBER", "BOOL", "INT", "DIGIT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'if'", "'{'", "'}'", "'else if'", "'else'", "'for'", "'++'", "'--'", 
			"'sqrt'", "'print'", "'='", "'('", "')'", "';'", "'+'", "'-'", "'*'", 
			"'/'", "'%'", "'^'", "'||'", "'&&'", "'=='", "'!='", "'>='", "'<='", 
			"'>'", "'<'", "'!'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, "PRINT", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2%\u00ff\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b"+
		"\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f"+
		"\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3"+
		"\23\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3"+
		"\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3"+
		"\36\3\37\3\37\3\37\3\37\7\37\u00a7\n\37\f\37\16\37\u00aa\13\37\3\37\3"+
		"\37\3\37\3\37\3\37\7\37\u00b1\n\37\f\37\16\37\u00b4\13\37\3\37\5\37\u00b7"+
		"\n\37\3 \6 \u00ba\n \r \16 \u00bb\3!\3!\3!\3!\7!\u00c2\n!\f!\16!\u00c5"+
		"\13!\3!\3!\3!\3!\7!\u00cb\n!\f!\16!\u00ce\13!\3!\3!\6!\u00d2\n!\r!\16"+
		"!\u00d3\3!\3!\3\"\6\"\u00d9\n\"\r\"\16\"\u00da\3\"\3\"\3#\3#\3#\6#\u00e2"+
		"\n#\r#\16#\u00e3\5#\u00e6\n#\3$\3$\3$\3$\3$\3$\3$\3$\3$\5$\u00f1\n$\3"+
		"%\3%\6%\u00f5\n%\r%\16%\u00f6\5%\u00f9\n%\3%\5%\u00fc\n%\3&\3&\3\u00cc"+
		"\2\'\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36"+
		";\37= ?!A\"C#E$G%I\2K\2\3\2\13\3\2$$\6\2\f\f\17\17$$^^\4\2\f\f\17\17\3"+
		"\2))\6\2\f\f\17\17))^^\4\2C\\c|\5\2\13\f\16\17\"\"\3\2\63;\3\2\62;\2\u010d"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2"+
		"\2\3M\3\2\2\2\5P\3\2\2\2\7R\3\2\2\2\tT\3\2\2\2\13\\\3\2\2\2\ra\3\2\2\2"+
		"\17e\3\2\2\2\21h\3\2\2\2\23k\3\2\2\2\25p\3\2\2\2\27v\3\2\2\2\31x\3\2\2"+
		"\2\33z\3\2\2\2\35|\3\2\2\2\37~\3\2\2\2!\u0080\3\2\2\2#\u0082\3\2\2\2%"+
		"\u0084\3\2\2\2\'\u0086\3\2\2\2)\u0088\3\2\2\2+\u008a\3\2\2\2-\u008d\3"+
		"\2\2\2/\u0090\3\2\2\2\61\u0093\3\2\2\2\63\u0096\3\2\2\2\65\u0099\3\2\2"+
		"\2\67\u009c\3\2\2\29\u009e\3\2\2\2;\u00a0\3\2\2\2=\u00b6\3\2\2\2?\u00b9"+
		"\3\2\2\2A\u00d1\3\2\2\2C\u00d8\3\2\2\2E\u00de\3\2\2\2G\u00f0\3\2\2\2I"+
		"\u00fb\3\2\2\2K\u00fd\3\2\2\2MN\7k\2\2NO\7h\2\2O\4\3\2\2\2PQ\7}\2\2Q\6"+
		"\3\2\2\2RS\7\177\2\2S\b\3\2\2\2TU\7g\2\2UV\7n\2\2VW\7u\2\2WX\7g\2\2XY"+
		"\7\"\2\2YZ\7k\2\2Z[\7h\2\2[\n\3\2\2\2\\]\7g\2\2]^\7n\2\2^_\7u\2\2_`\7"+
		"g\2\2`\f\3\2\2\2ab\7h\2\2bc\7q\2\2cd\7t\2\2d\16\3\2\2\2ef\7-\2\2fg\7-"+
		"\2\2g\20\3\2\2\2hi\7/\2\2ij\7/\2\2j\22\3\2\2\2kl\7u\2\2lm\7s\2\2mn\7t"+
		"\2\2no\7v\2\2o\24\3\2\2\2pq\7r\2\2qr\7t\2\2rs\7k\2\2st\7p\2\2tu\7v\2\2"+
		"u\26\3\2\2\2vw\7?\2\2w\30\3\2\2\2xy\7*\2\2y\32\3\2\2\2z{\7+\2\2{\34\3"+
		"\2\2\2|}\7=\2\2}\36\3\2\2\2~\177\7-\2\2\177 \3\2\2\2\u0080\u0081\7/\2"+
		"\2\u0081\"\3\2\2\2\u0082\u0083\7,\2\2\u0083$\3\2\2\2\u0084\u0085\7\61"+
		"\2\2\u0085&\3\2\2\2\u0086\u0087\7\'\2\2\u0087(\3\2\2\2\u0088\u0089\7`"+
		"\2\2\u0089*\3\2\2\2\u008a\u008b\7~\2\2\u008b\u008c\7~\2\2\u008c,\3\2\2"+
		"\2\u008d\u008e\7(\2\2\u008e\u008f\7(\2\2\u008f.\3\2\2\2\u0090\u0091\7"+
		"?\2\2\u0091\u0092\7?\2\2\u0092\60\3\2\2\2\u0093\u0094\7#\2\2\u0094\u0095"+
		"\7?\2\2\u0095\62\3\2\2\2\u0096\u0097\7@\2\2\u0097\u0098\7?\2\2\u0098\64"+
		"\3\2\2\2\u0099\u009a\7>\2\2\u009a\u009b\7?\2\2\u009b\66\3\2\2\2\u009c"+
		"\u009d\7@\2\2\u009d8\3\2\2\2\u009e\u009f\7>\2\2\u009f:\3\2\2\2\u00a0\u00a1"+
		"\7#\2\2\u00a1<\3\2\2\2\u00a2\u00a8\t\2\2\2\u00a3\u00a7\n\3\2\2\u00a4\u00a5"+
		"\7^\2\2\u00a5\u00a7\n\4\2\2\u00a6\u00a3\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a7"+
		"\u00aa\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00ab\3\2"+
		"\2\2\u00aa\u00a8\3\2\2\2\u00ab\u00b7\t\2\2\2\u00ac\u00b2\t\5\2\2\u00ad"+
		"\u00b1\n\6\2\2\u00ae\u00af\7^\2\2\u00af\u00b1\n\4\2\2\u00b0\u00ad\3\2"+
		"\2\2\u00b0\u00ae\3\2\2\2\u00b1\u00b4\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b2"+
		"\u00b3\3\2\2\2\u00b3\u00b5\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b5\u00b7\t\5"+
		"\2\2\u00b6\u00a2\3\2\2\2\u00b6\u00ac\3\2\2\2\u00b7>\3\2\2\2\u00b8\u00ba"+
		"\t\7\2\2\u00b9\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb"+
		"\u00bc\3\2\2\2\u00bc@\3\2\2\2\u00bd\u00be\7\61\2\2\u00be\u00bf\7\61\2"+
		"\2\u00bf\u00c3\3\2\2\2\u00c0\u00c2\n\4\2\2\u00c1\u00c0\3\2\2\2\u00c2\u00c5"+
		"\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00d2\3\2\2\2\u00c5"+
		"\u00c3\3\2\2\2\u00c6\u00c7\7\61\2\2\u00c7\u00c8\7,\2\2\u00c8\u00cc\3\2"+
		"\2\2\u00c9\u00cb\13\2\2\2\u00ca\u00c9\3\2\2\2\u00cb\u00ce\3\2\2\2\u00cc"+
		"\u00cd\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cd\u00cf\3\2\2\2\u00ce\u00cc\3\2"+
		"\2\2\u00cf\u00d0\7,\2\2\u00d0\u00d2\7\61\2\2\u00d1\u00bd\3\2\2\2\u00d1"+
		"\u00c6\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d3\u00d4\3\2"+
		"\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d6\b!\2\2\u00d6B\3\2\2\2\u00d7\u00d9"+
		"\t\b\2\2\u00d8\u00d7\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00d8\3\2\2\2\u00da"+
		"\u00db\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00dd\b\"\2\2\u00ddD\3\2\2\2"+
		"\u00de\u00e5\5I%\2\u00df\u00e1\7\60\2\2\u00e0\u00e2\5K&\2\u00e1\u00e0"+
		"\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4"+
		"\u00e6\3\2\2\2\u00e5\u00df\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6F\3\2\2\2"+
		"\u00e7\u00e8\7v\2\2\u00e8\u00e9\7t\2\2\u00e9\u00ea\7w\2\2\u00ea\u00f1"+
		"\7g\2\2\u00eb\u00ec\7h\2\2\u00ec\u00ed\7c\2\2\u00ed\u00ee\7n\2\2\u00ee"+
		"\u00ef\7u\2\2\u00ef\u00f1\7g\2\2\u00f0\u00e7\3\2\2\2\u00f0\u00eb\3\2\2"+
		"\2\u00f1H\3\2\2\2\u00f2\u00f8\t\t\2\2\u00f3\u00f5\5K&\2\u00f4\u00f3\3"+
		"\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7"+
		"\u00f9\3\2\2\2\u00f8\u00f4\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00fc\3\2"+
		"\2\2\u00fa\u00fc\7\62\2\2\u00fb\u00f2\3\2\2\2\u00fb\u00fa\3\2\2\2\u00fc"+
		"J\3\2\2\2\u00fd\u00fe\t\n\2\2\u00feL\3\2\2\2\24\2\u00a6\u00a8\u00b0\u00b2"+
		"\u00b6\u00bb\u00c3\u00cc\u00d1\u00d3\u00da\u00e3\u00e5\u00f0\u00f6\u00f8"+
		"\u00fb\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}