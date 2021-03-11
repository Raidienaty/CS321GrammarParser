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
		PRINT=1, LPARENTHESIS=2, RPARENTHESIS=3, SEMICOLON=4, NUMBER=5, STRING=6, 
		Comment=7, WhiteSpace=8;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"PRINT", "LPARENTHESIS", "RPARENTHESIS", "SEMICOLON", "NUMBER", "STRING", 
			"Comment", "WhiteSpace"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'print'", "'('", "')'", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PRINT", "LPARENTHESIS", "RPARENTHESIS", "SEMICOLON", "NUMBER", 
			"STRING", "Comment", "WhiteSpace"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\n[\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\6\6!\n\6\r\6\16\6\"\3\7\3\7\3\7\3"+
		"\7\7\7)\n\7\f\7\16\7,\13\7\3\7\3\7\3\7\3\7\3\7\7\7\63\n\7\f\7\16\7\66"+
		"\13\7\3\7\5\79\n\7\3\b\3\b\3\b\3\b\7\b?\n\b\f\b\16\bB\13\b\3\b\3\b\3\b"+
		"\3\b\7\bH\n\b\f\b\16\bK\13\b\3\b\3\b\6\bO\n\b\r\b\16\bP\3\b\3\b\3\t\6"+
		"\tV\n\t\r\t\16\tW\3\t\3\t\3I\2\n\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\3"+
		"\2\t\3\2\62;\3\2$$\6\2\f\f\17\17$$^^\4\2\f\f\17\17\3\2))\6\2\f\f\17\17"+
		"))^^\5\2\13\f\16\17\"\"\2e\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2"+
		"\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\3\23\3\2\2\2\5"+
		"\31\3\2\2\2\7\33\3\2\2\2\t\35\3\2\2\2\13 \3\2\2\2\r8\3\2\2\2\17N\3\2\2"+
		"\2\21U\3\2\2\2\23\24\7r\2\2\24\25\7t\2\2\25\26\7k\2\2\26\27\7p\2\2\27"+
		"\30\7v\2\2\30\4\3\2\2\2\31\32\7*\2\2\32\6\3\2\2\2\33\34\7+\2\2\34\b\3"+
		"\2\2\2\35\36\7=\2\2\36\n\3\2\2\2\37!\t\2\2\2 \37\3\2\2\2!\"\3\2\2\2\""+
		" \3\2\2\2\"#\3\2\2\2#\f\3\2\2\2$*\t\3\2\2%)\n\4\2\2&\'\7^\2\2\')\n\5\2"+
		"\2(%\3\2\2\2(&\3\2\2\2),\3\2\2\2*(\3\2\2\2*+\3\2\2\2+-\3\2\2\2,*\3\2\2"+
		"\2-9\t\3\2\2.\64\t\6\2\2/\63\n\7\2\2\60\61\7^\2\2\61\63\n\5\2\2\62/\3"+
		"\2\2\2\62\60\3\2\2\2\63\66\3\2\2\2\64\62\3\2\2\2\64\65\3\2\2\2\65\67\3"+
		"\2\2\2\66\64\3\2\2\2\679\t\6\2\28$\3\2\2\28.\3\2\2\29\16\3\2\2\2:;\7\61"+
		"\2\2;<\7\61\2\2<@\3\2\2\2=?\n\5\2\2>=\3\2\2\2?B\3\2\2\2@>\3\2\2\2@A\3"+
		"\2\2\2AO\3\2\2\2B@\3\2\2\2CD\7\61\2\2DE\7,\2\2EI\3\2\2\2FH\13\2\2\2GF"+
		"\3\2\2\2HK\3\2\2\2IJ\3\2\2\2IG\3\2\2\2JL\3\2\2\2KI\3\2\2\2LM\7,\2\2MO"+
		"\7\61\2\2N:\3\2\2\2NC\3\2\2\2OP\3\2\2\2PN\3\2\2\2PQ\3\2\2\2QR\3\2\2\2"+
		"RS\b\b\2\2S\20\3\2\2\2TV\t\b\2\2UT\3\2\2\2VW\3\2\2\2WU\3\2\2\2WX\3\2\2"+
		"\2XY\3\2\2\2YZ\b\t\2\2Z\22\3\2\2\2\16\2\"(*\62\648@INPW\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}