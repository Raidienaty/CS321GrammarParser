// Generated from /mnt/d/Storage/CodingProjects/ANTLR/CS321GrammarParser/language-parser/src/main/antlr4/parser/Language.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LanguageParser extends Parser {
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
	public static final int
		RULE_start = 0, RULE_statement = 1, RULE_assignment = 2, RULE_functionCall = 3, 
		RULE_ifStatement = 4, RULE_ifStatementContext = 5, RULE_elseIf = 6, RULE_elseStatement = 7, 
		RULE_forLoop = 8, RULE_expression = 9;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "statement", "assignment", "functionCall", "ifStatement", "ifStatementContext", 
			"elseIf", "elseStatement", "forLoop", "expression"
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

	@Override
	public String getGrammarFileName() { return "Language.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LanguageParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StartContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(LanguageParser.EOF, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
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
			setState(23);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__5) | (1L << PRINT) | (1L << VARIABLENAME))) != 0)) {
				{
				{
				setState(20);
				statement();
				}
				}
				setState(25);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(26);
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

	public static class StatementContext extends ParserRuleContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(LanguageParser.SEMICOLON, 0); }
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public ForLoopContext forLoop() {
			return getRuleContext(ForLoopContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(36);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRINT:
				enterOuterAlt(_localctx, 1);
				{
				setState(28);
				functionCall();
				setState(29);
				match(SEMICOLON);
				}
				break;
			case VARIABLENAME:
				enterOuterAlt(_localctx, 2);
				{
				setState(31);
				assignment();
				setState(32);
				match(SEMICOLON);
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 3);
				{
				setState(34);
				ifStatement();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 4);
				{
				setState(35);
				forLoop();
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

	public static class AssignmentContext extends ParserRuleContext {
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
	 
		public AssignmentContext() { }
		public void copyFrom(AssignmentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AssignmentFuncContext extends AssignmentContext {
		public TerminalNode VARIABLENAME() { return getToken(LanguageParser.VARIABLENAME, 0); }
		public TerminalNode ASSIGNMENT() { return getToken(LanguageParser.ASSIGNMENT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentFuncContext(AssignmentContext ctx) { copyFrom(ctx); }
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_assignment);
		try {
			_localctx = new AssignmentFuncContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			match(VARIABLENAME);
			setState(39);
			match(ASSIGNMENT);
			setState(40);
			expression(0);
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
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
	 
		public FunctionCallContext() { }
		public void copyFrom(FunctionCallContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PrintFunctionCallContext extends FunctionCallContext {
		public TerminalNode PRINT() { return getToken(LanguageParser.PRINT, 0); }
		public TerminalNode LPARENTHESIS() { return getToken(LanguageParser.LPARENTHESIS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPARENTHESIS() { return getToken(LanguageParser.RPARENTHESIS, 0); }
		public PrintFunctionCallContext(FunctionCallContext ctx) { copyFrom(ctx); }
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_functionCall);
		try {
			_localctx = new PrintFunctionCallContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			match(PRINT);
			setState(43);
			match(LPARENTHESIS);
			setState(44);
			expression(0);
			setState(45);
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

	public static class IfStatementContext extends ParserRuleContext {
		public IfStatementContextContext ifStatementContext() {
			return getRuleContext(IfStatementContextContext.class,0);
		}
		public List<ElseIfContext> elseIf() {
			return getRuleContexts(ElseIfContext.class);
		}
		public ElseIfContext elseIf(int i) {
			return getRuleContext(ElseIfContext.class,i);
		}
		public ElseStatementContext elseStatement() {
			return getRuleContext(ElseStatementContext.class,0);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			ifStatementContext();
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(48);
				elseIf();
				}
				}
				setState(53);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(54);
				elseStatement();
				}
			}

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

	public static class IfStatementContextContext extends ParserRuleContext {
		public TerminalNode LPARENTHESIS() { return getToken(LanguageParser.LPARENTHESIS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPARENTHESIS() { return getToken(LanguageParser.RPARENTHESIS, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public IfStatementContextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatementContext; }
	}

	public final IfStatementContextContext ifStatementContext() throws RecognitionException {
		IfStatementContextContext _localctx = new IfStatementContextContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_ifStatementContext);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			match(T__0);
			setState(58);
			match(LPARENTHESIS);
			setState(59);
			expression(0);
			setState(60);
			match(RPARENTHESIS);
			setState(61);
			match(T__1);
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__5) | (1L << PRINT) | (1L << VARIABLENAME))) != 0)) {
				{
				setState(62);
				statement();
				}
			}

			setState(65);
			match(T__2);
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

	public static class ElseIfContext extends ParserRuleContext {
		public TerminalNode LPARENTHESIS() { return getToken(LanguageParser.LPARENTHESIS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPARENTHESIS() { return getToken(LanguageParser.RPARENTHESIS, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ElseIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseIf; }
	}

	public final ElseIfContext elseIf() throws RecognitionException {
		ElseIfContext _localctx = new ElseIfContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_elseIf);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			match(T__3);
			setState(68);
			match(LPARENTHESIS);
			setState(69);
			expression(0);
			setState(70);
			match(RPARENTHESIS);
			setState(71);
			match(T__1);
			setState(73);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__5) | (1L << PRINT) | (1L << VARIABLENAME))) != 0)) {
				{
				setState(72);
				statement();
				}
			}

			setState(75);
			match(T__2);
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

	public static class ElseStatementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ElseStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseStatement; }
	}

	public final ElseStatementContext elseStatement() throws RecognitionException {
		ElseStatementContext _localctx = new ElseStatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_elseStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(T__4);
			setState(78);
			match(T__1);
			setState(80);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__5) | (1L << PRINT) | (1L << VARIABLENAME))) != 0)) {
				{
				setState(79);
				statement();
				}
			}

			setState(82);
			match(T__2);
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

	public static class ForLoopContext extends ParserRuleContext {
		public TerminalNode LPARENTHESIS() { return getToken(LanguageParser.LPARENTHESIS, 0); }
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(LanguageParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(LanguageParser.SEMICOLON, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RPARENTHESIS() { return getToken(LanguageParser.RPARENTHESIS, 0); }
		public ForLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forLoop; }
	}

	public final ForLoopContext forLoop() throws RecognitionException {
		ForLoopContext _localctx = new ForLoopContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_forLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			match(T__5);
			setState(85);
			match(LPARENTHESIS);
			setState(86);
			assignment();
			setState(87);
			match(SEMICOLON);
			setState(88);
			expression(0);
			setState(89);
			match(SEMICOLON);
			setState(90);
			expression(0);
			setState(91);
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
	public static class ModulusFuncContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode MODULUS() { return getToken(LanguageParser.MODULUS, 0); }
		public ModulusFuncContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class EquivalenceExpressionContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode EQUIVALENT() { return getToken(LanguageParser.EQUIVALENT, 0); }
		public TerminalNode NOTEQUIVALENT() { return getToken(LanguageParser.NOTEQUIVALENT, 0); }
		public EquivalenceExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class BoolExpressionContext extends ExpressionContext {
		public TerminalNode BOOL() { return getToken(LanguageParser.BOOL, 0); }
		public BoolExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class SubtractOneFuncContext extends ExpressionContext {
		public TerminalNode VARIABLENAME() { return getToken(LanguageParser.VARIABLENAME, 0); }
		public SubtractOneFuncContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class SquareRootFuncContext extends ExpressionContext {
		public TerminalNode LPARENTHESIS() { return getToken(LanguageParser.LPARENTHESIS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPARENTHESIS() { return getToken(LanguageParser.RPARENTHESIS, 0); }
		public SquareRootFuncContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class NumberExpressionContext extends ExpressionContext {
		public TerminalNode NUMBER() { return getToken(LanguageParser.NUMBER, 0); }
		public NumberExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class NotExpressionContext extends ExpressionContext {
		public TerminalNode NOT() { return getToken(LanguageParser.NOT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NotExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ComparisonExpressionContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LESSTHAN() { return getToken(LanguageParser.LESSTHAN, 0); }
		public TerminalNode GREATERTHAN() { return getToken(LanguageParser.GREATERTHAN, 0); }
		public TerminalNode GREATERTHANEQUALS() { return getToken(LanguageParser.GREATERTHANEQUALS, 0); }
		public TerminalNode LESSTHANEQUALS() { return getToken(LanguageParser.LESSTHANEQUALS, 0); }
		public ComparisonExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class VariableExpressionContext extends ExpressionContext {
		public TerminalNode VARIABLENAME() { return getToken(LanguageParser.VARIABLENAME, 0); }
		public VariableExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class MultiplicationFuncContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode MULTIPLY() { return getToken(LanguageParser.MULTIPLY, 0); }
		public MultiplicationFuncContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class OrExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode OR() { return getToken(LanguageParser.OR, 0); }
		public OrExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class AndExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode AND() { return getToken(LanguageParser.AND, 0); }
		public AndExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class StringExpressionContext extends ExpressionContext {
		public TerminalNode STRING() { return getToken(LanguageParser.STRING, 0); }
		public StringExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class PowerFuncContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode POWER() { return getToken(LanguageParser.POWER, 0); }
		public PowerFuncContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class AdditionFuncContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ADD() { return getToken(LanguageParser.ADD, 0); }
		public AdditionFuncContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class DivisionFuncContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode DIVIDE() { return getToken(LanguageParser.DIVIDE, 0); }
		public DivisionFuncContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class AddOneFuncContext extends ExpressionContext {
		public TerminalNode VARIABLENAME() { return getToken(LanguageParser.VARIABLENAME, 0); }
		public AddOneFuncContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class SubtractionFuncContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode SUBTRACT() { return getToken(LanguageParser.SUBTRACT, 0); }
		public SubtractionFuncContext(ExpressionContext ctx) { copyFrom(ctx); }
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				_localctx = new StringExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(94);
				match(STRING);
				}
				break;
			case 2:
				{
				_localctx = new NumberExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(95);
				match(NUMBER);
				}
				break;
			case 3:
				{
				_localctx = new BoolExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(96);
				match(BOOL);
				}
				break;
			case 4:
				{
				_localctx = new VariableExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(97);
				match(VARIABLENAME);
				}
				break;
			case 5:
				{
				_localctx = new AddOneFuncContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(98);
				match(VARIABLENAME);
				setState(99);
				match(T__6);
				}
				break;
			case 6:
				{
				_localctx = new SubtractOneFuncContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(100);
				match(VARIABLENAME);
				setState(101);
				match(T__7);
				}
				break;
			case 7:
				{
				_localctx = new SquareRootFuncContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(102);
				match(T__8);
				setState(103);
				match(LPARENTHESIS);
				setState(104);
				expression(0);
				setState(105);
				match(RPARENTHESIS);
				}
				break;
			case 8:
				{
				_localctx = new NotExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(107);
				match(NOT);
				setState(108);
				expression(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(143);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(141);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						_localctx = new AdditionFuncContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(111);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(112);
						match(ADD);
						setState(113);
						expression(15);
						}
						break;
					case 2:
						{
						_localctx = new SubtractionFuncContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(114);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(115);
						match(SUBTRACT);
						setState(116);
						expression(13);
						}
						break;
					case 3:
						{
						_localctx = new MultiplicationFuncContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(117);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(118);
						match(MULTIPLY);
						setState(119);
						expression(11);
						}
						break;
					case 4:
						{
						_localctx = new DivisionFuncContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(120);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(121);
						match(DIVIDE);
						setState(122);
						expression(10);
						}
						break;
					case 5:
						{
						_localctx = new ModulusFuncContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(123);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(124);
						match(MODULUS);
						setState(125);
						expression(9);
						}
						break;
					case 6:
						{
						_localctx = new PowerFuncContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(126);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(127);
						match(POWER);
						setState(128);
						expression(8);
						}
						break;
					case 7:
						{
						_localctx = new ComparisonExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(129);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(130);
						((ComparisonExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GREATERTHANEQUALS) | (1L << LESSTHANEQUALS) | (1L << GREATERTHAN) | (1L << LESSTHAN))) != 0)) ) {
							((ComparisonExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(131);
						expression(6);
						}
						break;
					case 8:
						{
						_localctx = new EquivalenceExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(132);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(133);
						((EquivalenceExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==EQUIVALENT || _la==NOTEQUIVALENT) ) {
							((EquivalenceExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(134);
						expression(5);
						}
						break;
					case 9:
						{
						_localctx = new AndExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(135);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(136);
						match(AND);
						setState(137);
						expression(4);
						}
						break;
					case 10:
						{
						_localctx = new OrExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(138);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(139);
						match(OR);
						setState(140);
						expression(3);
						}
						break;
					}
					} 
				}
				setState(145);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 9:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 14);
		case 1:
			return precpred(_ctx, 12);
		case 2:
			return precpred(_ctx, 10);
		case 3:
			return precpred(_ctx, 9);
		case 4:
			return precpred(_ctx, 8);
		case 5:
			return precpred(_ctx, 7);
		case 6:
			return precpred(_ctx, 5);
		case 7:
			return precpred(_ctx, 4);
		case 8:
			return precpred(_ctx, 3);
		case 9:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3%\u0095\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\3\2\7\2\30\n\2\f\2\16\2\33\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\5\3\'\n\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\7\6\64\n"+
		"\6\f\6\16\6\67\13\6\3\6\5\6:\n\6\3\7\3\7\3\7\3\7\3\7\3\7\5\7B\n\7\3\7"+
		"\3\7\3\b\3\b\3\b\3\b\3\b\3\b\5\bL\n\b\3\b\3\b\3\t\3\t\3\t\5\tS\n\t\3\t"+
		"\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13p\n\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\7\13\u0090\n\13\f\13\16\13\u0093\13\13\3\13\2\3\24\f\2\4\6\b\n\f\16\20"+
		"\22\24\2\4\3\2\33\36\3\2\31\32\2\u00a4\2\31\3\2\2\2\4&\3\2\2\2\6(\3\2"+
		"\2\2\b,\3\2\2\2\n\61\3\2\2\2\f;\3\2\2\2\16E\3\2\2\2\20O\3\2\2\2\22V\3"+
		"\2\2\2\24o\3\2\2\2\26\30\5\4\3\2\27\26\3\2\2\2\30\33\3\2\2\2\31\27\3\2"+
		"\2\2\31\32\3\2\2\2\32\34\3\2\2\2\33\31\3\2\2\2\34\35\7\2\2\3\35\3\3\2"+
		"\2\2\36\37\5\b\5\2\37 \7\20\2\2 \'\3\2\2\2!\"\5\6\4\2\"#\7\20\2\2#\'\3"+
		"\2\2\2$\'\5\n\6\2%\'\5\22\n\2&\36\3\2\2\2&!\3\2\2\2&$\3\2\2\2&%\3\2\2"+
		"\2\'\5\3\2\2\2()\7!\2\2)*\7\r\2\2*+\5\24\13\2+\7\3\2\2\2,-\7\f\2\2-.\7"+
		"\16\2\2./\5\24\13\2/\60\7\17\2\2\60\t\3\2\2\2\61\65\5\f\7\2\62\64\5\16"+
		"\b\2\63\62\3\2\2\2\64\67\3\2\2\2\65\63\3\2\2\2\65\66\3\2\2\2\669\3\2\2"+
		"\2\67\65\3\2\2\28:\5\20\t\298\3\2\2\29:\3\2\2\2:\13\3\2\2\2;<\7\3\2\2"+
		"<=\7\16\2\2=>\5\24\13\2>?\7\17\2\2?A\7\4\2\2@B\5\4\3\2A@\3\2\2\2AB\3\2"+
		"\2\2BC\3\2\2\2CD\7\5\2\2D\r\3\2\2\2EF\7\6\2\2FG\7\16\2\2GH\5\24\13\2H"+
		"I\7\17\2\2IK\7\4\2\2JL\5\4\3\2KJ\3\2\2\2KL\3\2\2\2LM\3\2\2\2MN\7\5\2\2"+
		"N\17\3\2\2\2OP\7\7\2\2PR\7\4\2\2QS\5\4\3\2RQ\3\2\2\2RS\3\2\2\2ST\3\2\2"+
		"\2TU\7\5\2\2U\21\3\2\2\2VW\7\b\2\2WX\7\16\2\2XY\5\6\4\2YZ\7\20\2\2Z[\5"+
		"\24\13\2[\\\7\20\2\2\\]\5\24\13\2]^\7\17\2\2^\23\3\2\2\2_`\b\13\1\2`p"+
		"\7 \2\2ap\7$\2\2bp\7%\2\2cp\7!\2\2de\7!\2\2ep\7\t\2\2fg\7!\2\2gp\7\n\2"+
		"\2hi\7\13\2\2ij\7\16\2\2jk\5\24\13\2kl\7\17\2\2lp\3\2\2\2mn\7\37\2\2n"+
		"p\5\24\13\3o_\3\2\2\2oa\3\2\2\2ob\3\2\2\2oc\3\2\2\2od\3\2\2\2of\3\2\2"+
		"\2oh\3\2\2\2om\3\2\2\2p\u0091\3\2\2\2qr\f\20\2\2rs\7\21\2\2s\u0090\5\24"+
		"\13\21tu\f\16\2\2uv\7\22\2\2v\u0090\5\24\13\17wx\f\f\2\2xy\7\23\2\2y\u0090"+
		"\5\24\13\rz{\f\13\2\2{|\7\24\2\2|\u0090\5\24\13\f}~\f\n\2\2~\177\7\25"+
		"\2\2\177\u0090\5\24\13\13\u0080\u0081\f\t\2\2\u0081\u0082\7\26\2\2\u0082"+
		"\u0090\5\24\13\n\u0083\u0084\f\7\2\2\u0084\u0085\t\2\2\2\u0085\u0090\5"+
		"\24\13\b\u0086\u0087\f\6\2\2\u0087\u0088\t\3\2\2\u0088\u0090\5\24\13\7"+
		"\u0089\u008a\f\5\2\2\u008a\u008b\7\30\2\2\u008b\u0090\5\24\13\6\u008c"+
		"\u008d\f\4\2\2\u008d\u008e\7\27\2\2\u008e\u0090\5\24\13\5\u008fq\3\2\2"+
		"\2\u008ft\3\2\2\2\u008fw\3\2\2\2\u008fz\3\2\2\2\u008f}\3\2\2\2\u008f\u0080"+
		"\3\2\2\2\u008f\u0083\3\2\2\2\u008f\u0086\3\2\2\2\u008f\u0089\3\2\2\2\u008f"+
		"\u008c\3\2\2\2\u0090\u0093\3\2\2\2\u0091\u008f\3\2\2\2\u0091\u0092\3\2"+
		"\2\2\u0092\25\3\2\2\2\u0093\u0091\3\2\2\2\f\31&\659AKRo\u008f\u0091";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}