// Generated from /mnt/d/Storage/CodingProjects/ANTLR/CS321PrintParser/print-parser/src/main/antlr4/parser/Printer.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PrinterParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PRINT=1, LPARENTHESIS=2, RPARENTHESIS=3, SEMICOLON=4, NUMBER=5, PHRASE=6, 
		Comment=7, Space=8;
	public static final int
		RULE_start = 0, RULE_expression = 1;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "expression"
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
			"PHRASE", "Comment", "Space"
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

	@Override
	public String getGrammarFileName() { return "Printer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PrinterParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StartContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(PrinterParser.EOF, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(5); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(4);
				expression();
				}
				}
				setState(7); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << LPARENTHESIS) | (1L << SEMICOLON) | (1L << PHRASE))) != 0) );
			setState(9);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SemicolonContext extends ExpressionContext {
		public TerminalNode SEMICOLON() { return getToken(PrinterParser.SEMICOLON, 0); }
		public SemicolonContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class PrintContext extends ExpressionContext {
		public TerminalNode PRINT() { return getToken(PrinterParser.PRINT, 0); }
		public PrintContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ParenthesisContext extends ExpressionContext {
		public TerminalNode LPARENTHESIS() { return getToken(PrinterParser.LPARENTHESIS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPARENTHESIS() { return getToken(PrinterParser.RPARENTHESIS, 0); }
		public ParenthesisContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class PhraseContext extends ExpressionContext {
		public TerminalNode PHRASE() { return getToken(PrinterParser.PHRASE, 0); }
		public PhraseContext(ExpressionContext ctx) { copyFrom(ctx); }
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_expression);
		try {
			setState(18);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRINT:
				_localctx = new PrintContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(11);
				match(PRINT);
				}
				break;
			case LPARENTHESIS:
				_localctx = new ParenthesisContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(12);
				match(LPARENTHESIS);
				setState(13);
				expression();
				setState(14);
				match(RPARENTHESIS);
				}
				break;
			case PHRASE:
				_localctx = new PhraseContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(16);
				match(PHRASE);
				}
				break;
			case SEMICOLON:
				_localctx = new SemicolonContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(17);
				match(SEMICOLON);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\n\27\4\2\t\2\4\3"+
		"\t\3\3\2\6\2\b\n\2\r\2\16\2\t\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3"+
		"\25\n\3\3\3\2\2\4\2\4\2\2\2\30\2\7\3\2\2\2\4\24\3\2\2\2\6\b\5\4\3\2\7"+
		"\6\3\2\2\2\b\t\3\2\2\2\t\7\3\2\2\2\t\n\3\2\2\2\n\13\3\2\2\2\13\f\7\2\2"+
		"\3\f\3\3\2\2\2\r\25\7\3\2\2\16\17\7\4\2\2\17\20\5\4\3\2\20\21\7\5\2\2"+
		"\21\25\3\2\2\2\22\25\7\b\2\2\23\25\7\6\2\2\24\r\3\2\2\2\24\16\3\2\2\2"+
		"\24\22\3\2\2\2\24\23\3\2\2\2\25\5\3\2\2\2\4\t\24";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}