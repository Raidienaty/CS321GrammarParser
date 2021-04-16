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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, PRINT=9, 
		LPARENTHESIS=10, RPARENTHESIS=11, SEMICOLON=12, STRING=13, VARIABLENAME=14, 
		COMMENT=15, WHITESPACE=16, NUMBER=17, BOOL=18;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "PRINT", 
			"LPARENTHESIS", "RPARENTHESIS", "SEMICOLON", "STRING", "VARIABLENAME", 
			"COMMENT", "WHITESPACE", "NUMBER", "BOOL", "INT", "DIGIT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'+'", "'-'", "'/'", "'*'", "'%'", "'^'", "'sqrt'", "'print'", 
			"'('", "')'", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, "PRINT", "LPARENTHESIS", 
			"RPARENTHESIS", "SEMICOLON", "STRING", "VARIABLENAME", "COMMENT", "WHITESPACE", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\24\u00a7\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3"+
		"\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13"+
		"\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\7\16O\n\16\f\16\16\16R\13\16"+
		"\3\16\3\16\3\16\3\16\3\16\7\16Y\n\16\f\16\16\16\\\13\16\3\16\5\16_\n\16"+
		"\3\17\6\17b\n\17\r\17\16\17c\3\20\3\20\3\20\3\20\7\20j\n\20\f\20\16\20"+
		"m\13\20\3\20\3\20\3\20\3\20\7\20s\n\20\f\20\16\20v\13\20\3\20\3\20\6\20"+
		"z\n\20\r\20\16\20{\3\20\3\20\3\21\6\21\u0081\n\21\r\21\16\21\u0082\3\21"+
		"\3\21\3\22\3\22\3\22\6\22\u008a\n\22\r\22\16\22\u008b\5\22\u008e\n\22"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u0099\n\23\3\24\3\24"+
		"\6\24\u009d\n\24\r\24\16\24\u009e\5\24\u00a1\n\24\3\24\5\24\u00a4\n\24"+
		"\3\25\3\25\3t\2\26\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r"+
		"\31\16\33\17\35\20\37\21!\22#\23%\24\'\2)\2\3\2\13\3\2$$\6\2\f\f\17\17"+
		"$$^^\4\2\f\f\17\17\3\2))\6\2\f\f\17\17))^^\4\2C\\c|\5\2\13\f\16\17\"\""+
		"\3\2\63;\3\2\62;\2\u00b5\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2"+
		"\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\3+\3\2\2\2\5-\3\2\2\2\7/\3\2\2\2"+
		"\t\61\3\2\2\2\13\63\3\2\2\2\r\65\3\2\2\2\17\67\3\2\2\2\219\3\2\2\2\23"+
		">\3\2\2\2\25D\3\2\2\2\27F\3\2\2\2\31H\3\2\2\2\33^\3\2\2\2\35a\3\2\2\2"+
		"\37y\3\2\2\2!\u0080\3\2\2\2#\u0086\3\2\2\2%\u0098\3\2\2\2\'\u00a3\3\2"+
		"\2\2)\u00a5\3\2\2\2+,\7?\2\2,\4\3\2\2\2-.\7-\2\2.\6\3\2\2\2/\60\7/\2\2"+
		"\60\b\3\2\2\2\61\62\7\61\2\2\62\n\3\2\2\2\63\64\7,\2\2\64\f\3\2\2\2\65"+
		"\66\7\'\2\2\66\16\3\2\2\2\678\7`\2\28\20\3\2\2\29:\7u\2\2:;\7s\2\2;<\7"+
		"t\2\2<=\7v\2\2=\22\3\2\2\2>?\7r\2\2?@\7t\2\2@A\7k\2\2AB\7p\2\2BC\7v\2"+
		"\2C\24\3\2\2\2DE\7*\2\2E\26\3\2\2\2FG\7+\2\2G\30\3\2\2\2HI\7=\2\2I\32"+
		"\3\2\2\2JP\t\2\2\2KO\n\3\2\2LM\7^\2\2MO\n\4\2\2NK\3\2\2\2NL\3\2\2\2OR"+
		"\3\2\2\2PN\3\2\2\2PQ\3\2\2\2QS\3\2\2\2RP\3\2\2\2S_\t\2\2\2TZ\t\5\2\2U"+
		"Y\n\6\2\2VW\7^\2\2WY\n\4\2\2XU\3\2\2\2XV\3\2\2\2Y\\\3\2\2\2ZX\3\2\2\2"+
		"Z[\3\2\2\2[]\3\2\2\2\\Z\3\2\2\2]_\t\5\2\2^J\3\2\2\2^T\3\2\2\2_\34\3\2"+
		"\2\2`b\t\7\2\2a`\3\2\2\2bc\3\2\2\2ca\3\2\2\2cd\3\2\2\2d\36\3\2\2\2ef\7"+
		"\61\2\2fg\7\61\2\2gk\3\2\2\2hj\n\4\2\2ih\3\2\2\2jm\3\2\2\2ki\3\2\2\2k"+
		"l\3\2\2\2lz\3\2\2\2mk\3\2\2\2no\7\61\2\2op\7,\2\2pt\3\2\2\2qs\13\2\2\2"+
		"rq\3\2\2\2sv\3\2\2\2tu\3\2\2\2tr\3\2\2\2uw\3\2\2\2vt\3\2\2\2wx\7,\2\2"+
		"xz\7\61\2\2ye\3\2\2\2yn\3\2\2\2z{\3\2\2\2{y\3\2\2\2{|\3\2\2\2|}\3\2\2"+
		"\2}~\b\20\2\2~ \3\2\2\2\177\u0081\t\b\2\2\u0080\177\3\2\2\2\u0081\u0082"+
		"\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0084\3\2\2\2\u0084"+
		"\u0085\b\21\2\2\u0085\"\3\2\2\2\u0086\u008d\5\'\24\2\u0087\u0089\7\60"+
		"\2\2\u0088\u008a\5)\25\2\u0089\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b"+
		"\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008e\3\2\2\2\u008d\u0087\3\2"+
		"\2\2\u008d\u008e\3\2\2\2\u008e$\3\2\2\2\u008f\u0090\7v\2\2\u0090\u0091"+
		"\7t\2\2\u0091\u0092\7w\2\2\u0092\u0099\7g\2\2\u0093\u0094\7h\2\2\u0094"+
		"\u0095\7c\2\2\u0095\u0096\7n\2\2\u0096\u0097\7u\2\2\u0097\u0099\7g\2\2"+
		"\u0098\u008f\3\2\2\2\u0098\u0093\3\2\2\2\u0099&\3\2\2\2\u009a\u00a0\t"+
		"\t\2\2\u009b\u009d\5)\25\2\u009c\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e"+
		"\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a1\3\2\2\2\u00a0\u009c\3\2"+
		"\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a4\3\2\2\2\u00a2\u00a4\7\62\2\2\u00a3"+
		"\u009a\3\2\2\2\u00a3\u00a2\3\2\2\2\u00a4(\3\2\2\2\u00a5\u00a6\t\n\2\2"+
		"\u00a6*\3\2\2\2\24\2NPXZ^ckty{\u0082\u008b\u008d\u0098\u009e\u00a0\u00a3"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}