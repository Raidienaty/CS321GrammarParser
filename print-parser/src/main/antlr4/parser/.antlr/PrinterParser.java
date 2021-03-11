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
		RULE_start = 0, RULE_functionCall = 1, RULE_printFunction = 2, RULE_expression = 3;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "functionCall", "printFunction", "expression"
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
		public List<FunctionCallContext> functionCall() {
			return getRuleContexts(FunctionCallContext.class);
		}
		public FunctionCallContext functionCall(int i) {
			return getRuleContext(FunctionCallContext.class,i);
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
			setState(9); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(8);
				functionCall();
				}
				}
				setState(11); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==PRINT );
			setState(13);
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

	public static class FunctionCallContext extends ParserRuleContext {
		public PrintFunctionContext printFunction() {
			return getRuleContext(PrintFunctionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(PrinterParser.SEMICOLON, 0); }
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_functionCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(15);
			printFunction();
			setState(16);
			match(SEMICOLON);
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

	public static class PrintFunctionContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(PrinterParser.PRINT, 0); }
		public TerminalNode LPARENTHESIS() { return getToken(PrinterParser.LPARENTHESIS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPARENTHESIS() { return getToken(PrinterParser.RPARENTHESIS, 0); }
		public PrintFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printFunction; }
	}

	public final PrintFunctionContext printFunction() throws RecognitionException {
		PrintFunctionContext _localctx = new PrintFunctionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_printFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18);
			match(PRINT);
			setState(19);
			match(LPARENTHESIS);
			setState(20);
			expression();
			setState(21);
			match(RPARENTHESIS);
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
	public static class PhraseContext extends ExpressionContext {
		public TerminalNode PHRASE() { return getToken(PrinterParser.PHRASE, 0); }
		public PhraseContext(ExpressionContext ctx) { copyFrom(ctx); }
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_expression);
		try {
			_localctx = new PhraseContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(23);
			match(PHRASE);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\n\34\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\4\5\t\5\3\2\6\2\f\n\2\r\2\16\2\r\3\2\3\2\3\3\3\3\3\3\3\4"+
		"\3\4\3\4\3\4\3\4\3\5\3\5\3\5\2\2\6\2\4\6\b\2\2\2\30\2\13\3\2\2\2\4\21"+
		"\3\2\2\2\6\24\3\2\2\2\b\31\3\2\2\2\n\f\5\4\3\2\13\n\3\2\2\2\f\r\3\2\2"+
		"\2\r\13\3\2\2\2\r\16\3\2\2\2\16\17\3\2\2\2\17\20\7\2\2\3\20\3\3\2\2\2"+
		"\21\22\5\6\4\2\22\23\7\6\2\2\23\5\3\2\2\2\24\25\7\3\2\2\25\26\7\4\2\2"+
		"\26\27\5\b\5\2\27\30\7\5\2\2\30\7\3\2\2\2\31\32\7\b\2\2\32\t\3\2\2\2\3"+
		"\r";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}