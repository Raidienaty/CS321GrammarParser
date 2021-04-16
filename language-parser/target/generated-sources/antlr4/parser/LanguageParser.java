// Generated from parser/Language.g4 by ANTLR 4.9
package parser;
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
	static { RuntimeMetaData.checkVersion("4.9", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, PRINT=9, 
		LPARENTHESIS=10, RPARENTHESIS=11, SEMICOLON=12, TRUE=13, FALSE=14, STRING=15, 
		VARIABLENAME=16, COMMENT=17, WHITESPACE=18, NUMBER=19, BOOL=20;
	public static final int
		RULE_start = 0, RULE_statement = 1, RULE_assignment = 2, RULE_functionCall = 3, 
		RULE_printFunction = 4, RULE_expression = 5, RULE_addition = 6, RULE_subtraction = 7, 
		RULE_multiplication = 8, RULE_division = 9, RULE_modulus = 10, RULE_square = 11, 
		RULE_squareRoot = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "statement", "assignment", "functionCall", "printFunction", 
			"expression", "addition", "subtraction", "multiplication", "division", 
			"modulus", "square", "squareRoot"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'+'", "'-'", "'*'", "'/'", "'%'", "'^'", "'/*'", "'print'", 
			"'('", "')'", "';'", "'true'", "'false'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, "PRINT", "LPARENTHESIS", 
			"RPARENTHESIS", "SEMICOLON", "TRUE", "FALSE", "STRING", "VARIABLENAME", 
			"COMMENT", "WHITESPACE", "NUMBER", "BOOL"
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitStart(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PRINT || _la==VARIABLENAME) {
				{
				{
				setState(26);
				statement();
				}
				}
				setState(31);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(32);
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
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AssignmentFunctionCallContext extends StatementContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(LanguageParser.SEMICOLON, 0); }
		public AssignmentFunctionCallContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterAssignmentFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitAssignmentFunctionCall(this);
		}
	}
	public static class GeneralFunctionCallContext extends StatementContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(LanguageParser.SEMICOLON, 0); }
		public GeneralFunctionCallContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterGeneralFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitGeneralFunctionCall(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(40);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRINT:
				_localctx = new GeneralFunctionCallContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(34);
				functionCall();
				setState(35);
				match(SEMICOLON);
				}
				break;
			case VARIABLENAME:
				_localctx = new AssignmentFunctionCallContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(37);
				assignment();
				setState(38);
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentFuncContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterAssignmentFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitAssignmentFunc(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_assignment);
		try {
			_localctx = new AssignmentFuncContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			match(VARIABLENAME);
			setState(43);
			match(T__0);
			setState(44);
			expression();
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
		public PrintFunctionContext printFunction() {
			return getRuleContext(PrintFunctionContext.class,0);
		}
		public PrintFunctionCallContext(FunctionCallContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterPrintFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitPrintFunctionCall(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_functionCall);
		try {
			_localctx = new PrintFunctionCallContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			printFunction();
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
		public TerminalNode PRINT() { return getToken(LanguageParser.PRINT, 0); }
		public TerminalNode LPARENTHESIS() { return getToken(LanguageParser.LPARENTHESIS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPARENTHESIS() { return getToken(LanguageParser.RPARENTHESIS, 0); }
		public PrintFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterPrintFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitPrintFunction(this);
		}
	}

	public final PrintFunctionContext printFunction() throws RecognitionException {
		PrintFunctionContext _localctx = new PrintFunctionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_printFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			match(PRINT);
			setState(49);
			match(LPARENTHESIS);
			setState(50);
			expression();
			setState(51);
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
		public ModulusContext modulus() {
			return getRuleContext(ModulusContext.class,0);
		}
		public ModulusFuncContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterModulusFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitModulusFunc(this);
		}
	}
	public static class StringExpressionContext extends ExpressionContext {
		public TerminalNode STRING() { return getToken(LanguageParser.STRING, 0); }
		public StringExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterStringExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitStringExpression(this);
		}
	}
	public static class SquareFuncContext extends ExpressionContext {
		public SquareContext square() {
			return getRuleContext(SquareContext.class,0);
		}
		public SquareFuncContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterSquareFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitSquareFunc(this);
		}
	}
	public static class BoolExpressionContext extends ExpressionContext {
		public TerminalNode BOOL() { return getToken(LanguageParser.BOOL, 0); }
		public BoolExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterBoolExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitBoolExpression(this);
		}
	}
	public static class SquareRootFuncContext extends ExpressionContext {
		public SquareRootContext squareRoot() {
			return getRuleContext(SquareRootContext.class,0);
		}
		public SquareRootFuncContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterSquareRootFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitSquareRootFunc(this);
		}
	}
	public static class NumberExpressionContext extends ExpressionContext {
		public TerminalNode NUMBER() { return getToken(LanguageParser.NUMBER, 0); }
		public NumberExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterNumberExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitNumberExpression(this);
		}
	}
	public static class AdditionFuncContext extends ExpressionContext {
		public AdditionContext addition() {
			return getRuleContext(AdditionContext.class,0);
		}
		public AdditionFuncContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterAdditionFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitAdditionFunc(this);
		}
	}
	public static class DivisionFuncContext extends ExpressionContext {
		public DivisionContext division() {
			return getRuleContext(DivisionContext.class,0);
		}
		public DivisionFuncContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterDivisionFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitDivisionFunc(this);
		}
	}
	public static class VariableExpressionContext extends ExpressionContext {
		public TerminalNode VARIABLENAME() { return getToken(LanguageParser.VARIABLENAME, 0); }
		public VariableExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterVariableExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitVariableExpression(this);
		}
	}
	public static class MultiplicationFuncContext extends ExpressionContext {
		public MultiplicationContext multiplication() {
			return getRuleContext(MultiplicationContext.class,0);
		}
		public MultiplicationFuncContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterMultiplicationFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitMultiplicationFunc(this);
		}
	}
	public static class SubtractionFuncContext extends ExpressionContext {
		public SubtractionContext subtraction() {
			return getRuleContext(SubtractionContext.class,0);
		}
		public SubtractionFuncContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterSubtractionFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitSubtractionFunc(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_expression);
		try {
			setState(64);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new AdditionFuncContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(53);
				addition();
				}
				break;
			case 2:
				_localctx = new StringExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(54);
				match(STRING);
				}
				break;
			case 3:
				_localctx = new NumberExpressionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(55);
				match(NUMBER);
				}
				break;
			case 4:
				_localctx = new BoolExpressionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(56);
				match(BOOL);
				}
				break;
			case 5:
				_localctx = new VariableExpressionContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(57);
				match(VARIABLENAME);
				}
				break;
			case 6:
				_localctx = new SubtractionFuncContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(58);
				subtraction();
				}
				break;
			case 7:
				_localctx = new DivisionFuncContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(59);
				division();
				}
				break;
			case 8:
				_localctx = new MultiplicationFuncContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(60);
				multiplication();
				}
				break;
			case 9:
				_localctx = new ModulusFuncContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(61);
				modulus();
				}
				break;
			case 10:
				_localctx = new SquareFuncContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(62);
				square();
				}
				break;
			case 11:
				_localctx = new SquareRootFuncContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(63);
				squareRoot();
				}
				break;
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

	public static class AdditionContext extends ParserRuleContext {
		public List<TerminalNode> VARIABLENAME() { return getTokens(LanguageParser.VARIABLENAME); }
		public TerminalNode VARIABLENAME(int i) {
			return getToken(LanguageParser.VARIABLENAME, i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(LanguageParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(LanguageParser.NUMBER, i);
		}
		public AdditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterAddition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitAddition(this);
		}
	}

	public final AdditionContext addition() throws RecognitionException {
		AdditionContext _localctx = new AdditionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_addition);
		try {
			setState(78);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(66);
				match(VARIABLENAME);
				setState(67);
				match(T__1);
				setState(68);
				match(VARIABLENAME);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(69);
				match(NUMBER);
				setState(70);
				match(T__1);
				setState(71);
				match(NUMBER);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(72);
				match(VARIABLENAME);
				setState(73);
				match(T__1);
				setState(74);
				match(NUMBER);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(75);
				match(NUMBER);
				setState(76);
				match(T__1);
				setState(77);
				match(VARIABLENAME);
				}
				break;
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

	public static class SubtractionContext extends ParserRuleContext {
		public List<TerminalNode> VARIABLENAME() { return getTokens(LanguageParser.VARIABLENAME); }
		public TerminalNode VARIABLENAME(int i) {
			return getToken(LanguageParser.VARIABLENAME, i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(LanguageParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(LanguageParser.NUMBER, i);
		}
		public SubtractionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subtraction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterSubtraction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitSubtraction(this);
		}
	}

	public final SubtractionContext subtraction() throws RecognitionException {
		SubtractionContext _localctx = new SubtractionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_subtraction);
		try {
			setState(92);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(80);
				match(VARIABLENAME);
				setState(81);
				match(T__2);
				setState(82);
				match(VARIABLENAME);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(83);
				match(NUMBER);
				setState(84);
				match(T__2);
				setState(85);
				match(NUMBER);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(86);
				match(VARIABLENAME);
				setState(87);
				match(T__2);
				setState(88);
				match(NUMBER);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(89);
				match(NUMBER);
				setState(90);
				match(T__2);
				setState(91);
				match(VARIABLENAME);
				}
				break;
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

	public static class MultiplicationContext extends ParserRuleContext {
		public List<TerminalNode> VARIABLENAME() { return getTokens(LanguageParser.VARIABLENAME); }
		public TerminalNode VARIABLENAME(int i) {
			return getToken(LanguageParser.VARIABLENAME, i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(LanguageParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(LanguageParser.NUMBER, i);
		}
		public MultiplicationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplication; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterMultiplication(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitMultiplication(this);
		}
	}

	public final MultiplicationContext multiplication() throws RecognitionException {
		MultiplicationContext _localctx = new MultiplicationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_multiplication);
		try {
			setState(106);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(94);
				match(VARIABLENAME);
				setState(95);
				match(T__3);
				setState(96);
				match(VARIABLENAME);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(97);
				match(NUMBER);
				setState(98);
				match(T__3);
				setState(99);
				match(NUMBER);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(100);
				match(VARIABLENAME);
				setState(101);
				match(T__3);
				setState(102);
				match(NUMBER);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(103);
				match(NUMBER);
				setState(104);
				match(T__3);
				setState(105);
				match(VARIABLENAME);
				}
				break;
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

	public static class DivisionContext extends ParserRuleContext {
		public List<TerminalNode> VARIABLENAME() { return getTokens(LanguageParser.VARIABLENAME); }
		public TerminalNode VARIABLENAME(int i) {
			return getToken(LanguageParser.VARIABLENAME, i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(LanguageParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(LanguageParser.NUMBER, i);
		}
		public DivisionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_division; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterDivision(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitDivision(this);
		}
	}

	public final DivisionContext division() throws RecognitionException {
		DivisionContext _localctx = new DivisionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_division);
		try {
			setState(120);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(108);
				match(VARIABLENAME);
				setState(109);
				match(T__4);
				setState(110);
				match(VARIABLENAME);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(111);
				match(NUMBER);
				setState(112);
				match(T__4);
				setState(113);
				match(NUMBER);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(114);
				match(VARIABLENAME);
				setState(115);
				match(T__4);
				setState(116);
				match(NUMBER);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(117);
				match(NUMBER);
				setState(118);
				match(T__4);
				setState(119);
				match(VARIABLENAME);
				}
				break;
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

	public static class ModulusContext extends ParserRuleContext {
		public List<TerminalNode> VARIABLENAME() { return getTokens(LanguageParser.VARIABLENAME); }
		public TerminalNode VARIABLENAME(int i) {
			return getToken(LanguageParser.VARIABLENAME, i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(LanguageParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(LanguageParser.NUMBER, i);
		}
		public ModulusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modulus; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterModulus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitModulus(this);
		}
	}

	public final ModulusContext modulus() throws RecognitionException {
		ModulusContext _localctx = new ModulusContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_modulus);
		try {
			setState(134);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(122);
				match(VARIABLENAME);
				setState(123);
				match(T__5);
				setState(124);
				match(VARIABLENAME);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(125);
				match(NUMBER);
				setState(126);
				match(T__5);
				setState(127);
				match(NUMBER);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(128);
				match(VARIABLENAME);
				setState(129);
				match(T__5);
				setState(130);
				match(NUMBER);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(131);
				match(NUMBER);
				setState(132);
				match(T__5);
				setState(133);
				match(VARIABLENAME);
				}
				break;
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

	public static class SquareContext extends ParserRuleContext {
		public List<TerminalNode> VARIABLENAME() { return getTokens(LanguageParser.VARIABLENAME); }
		public TerminalNode VARIABLENAME(int i) {
			return getToken(LanguageParser.VARIABLENAME, i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(LanguageParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(LanguageParser.NUMBER, i);
		}
		public SquareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_square; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterSquare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitSquare(this);
		}
	}

	public final SquareContext square() throws RecognitionException {
		SquareContext _localctx = new SquareContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_square);
		try {
			setState(148);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(136);
				match(VARIABLENAME);
				setState(137);
				match(T__6);
				setState(138);
				match(VARIABLENAME);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(139);
				match(NUMBER);
				setState(140);
				match(T__6);
				setState(141);
				match(NUMBER);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(142);
				match(VARIABLENAME);
				setState(143);
				match(T__6);
				setState(144);
				match(VARIABLENAME);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(145);
				match(NUMBER);
				setState(146);
				match(T__6);
				setState(147);
				match(VARIABLENAME);
				}
				break;
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

	public static class SquareRootContext extends ParserRuleContext {
		public TerminalNode VARIABLENAME() { return getToken(LanguageParser.VARIABLENAME, 0); }
		public TerminalNode NUMBER() { return getToken(LanguageParser.NUMBER, 0); }
		public SquareRootContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_squareRoot; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterSquareRoot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitSquareRoot(this);
		}
	}

	public final SquareRootContext squareRoot() throws RecognitionException {
		SquareRootContext _localctx = new SquareRootContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_squareRoot);
		try {
			setState(154);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(150);
				match(T__7);
				setState(151);
				match(VARIABLENAME);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(152);
				match(T__7);
				setState(153);
				match(NUMBER);
				}
				break;
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\26\u009f\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\7\2\36\n\2\f\2\16\2!\13\2\3\2\3\2"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\5\3+\n\3\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\6"+
		"\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7C\n\7\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bQ\n\b\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t_\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\5\nm\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\5\13{\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\5\f\u0089\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r"+
		"\u0097\n\r\3\16\3\16\3\16\3\16\5\16\u009d\n\16\3\16\2\2\17\2\4\6\b\n\f"+
		"\16\20\22\24\26\30\32\2\2\2\u00b0\2\37\3\2\2\2\4*\3\2\2\2\6,\3\2\2\2\b"+
		"\60\3\2\2\2\n\62\3\2\2\2\fB\3\2\2\2\16P\3\2\2\2\20^\3\2\2\2\22l\3\2\2"+
		"\2\24z\3\2\2\2\26\u0088\3\2\2\2\30\u0096\3\2\2\2\32\u009c\3\2\2\2\34\36"+
		"\5\4\3\2\35\34\3\2\2\2\36!\3\2\2\2\37\35\3\2\2\2\37 \3\2\2\2 \"\3\2\2"+
		"\2!\37\3\2\2\2\"#\7\2\2\3#\3\3\2\2\2$%\5\b\5\2%&\7\16\2\2&+\3\2\2\2\'"+
		"(\5\6\4\2()\7\16\2\2)+\3\2\2\2*$\3\2\2\2*\'\3\2\2\2+\5\3\2\2\2,-\7\22"+
		"\2\2-.\7\3\2\2./\5\f\7\2/\7\3\2\2\2\60\61\5\n\6\2\61\t\3\2\2\2\62\63\7"+
		"\13\2\2\63\64\7\f\2\2\64\65\5\f\7\2\65\66\7\r\2\2\66\13\3\2\2\2\67C\5"+
		"\16\b\28C\7\21\2\29C\7\25\2\2:C\7\26\2\2;C\7\22\2\2<C\5\20\t\2=C\5\24"+
		"\13\2>C\5\22\n\2?C\5\26\f\2@C\5\30\r\2AC\5\32\16\2B\67\3\2\2\2B8\3\2\2"+
		"\2B9\3\2\2\2B:\3\2\2\2B;\3\2\2\2B<\3\2\2\2B=\3\2\2\2B>\3\2\2\2B?\3\2\2"+
		"\2B@\3\2\2\2BA\3\2\2\2C\r\3\2\2\2DE\7\22\2\2EF\7\4\2\2FQ\7\22\2\2GH\7"+
		"\25\2\2HI\7\4\2\2IQ\7\25\2\2JK\7\22\2\2KL\7\4\2\2LQ\7\25\2\2MN\7\25\2"+
		"\2NO\7\4\2\2OQ\7\22\2\2PD\3\2\2\2PG\3\2\2\2PJ\3\2\2\2PM\3\2\2\2Q\17\3"+
		"\2\2\2RS\7\22\2\2ST\7\5\2\2T_\7\22\2\2UV\7\25\2\2VW\7\5\2\2W_\7\25\2\2"+
		"XY\7\22\2\2YZ\7\5\2\2Z_\7\25\2\2[\\\7\25\2\2\\]\7\5\2\2]_\7\22\2\2^R\3"+
		"\2\2\2^U\3\2\2\2^X\3\2\2\2^[\3\2\2\2_\21\3\2\2\2`a\7\22\2\2ab\7\6\2\2"+
		"bm\7\22\2\2cd\7\25\2\2de\7\6\2\2em\7\25\2\2fg\7\22\2\2gh\7\6\2\2hm\7\25"+
		"\2\2ij\7\25\2\2jk\7\6\2\2km\7\22\2\2l`\3\2\2\2lc\3\2\2\2lf\3\2\2\2li\3"+
		"\2\2\2m\23\3\2\2\2no\7\22\2\2op\7\7\2\2p{\7\22\2\2qr\7\25\2\2rs\7\7\2"+
		"\2s{\7\25\2\2tu\7\22\2\2uv\7\7\2\2v{\7\25\2\2wx\7\25\2\2xy\7\7\2\2y{\7"+
		"\22\2\2zn\3\2\2\2zq\3\2\2\2zt\3\2\2\2zw\3\2\2\2{\25\3\2\2\2|}\7\22\2\2"+
		"}~\7\b\2\2~\u0089\7\22\2\2\177\u0080\7\25\2\2\u0080\u0081\7\b\2\2\u0081"+
		"\u0089\7\25\2\2\u0082\u0083\7\22\2\2\u0083\u0084\7\b\2\2\u0084\u0089\7"+
		"\25\2\2\u0085\u0086\7\25\2\2\u0086\u0087\7\b\2\2\u0087\u0089\7\22\2\2"+
		"\u0088|\3\2\2\2\u0088\177\3\2\2\2\u0088\u0082\3\2\2\2\u0088\u0085\3\2"+
		"\2\2\u0089\27\3\2\2\2\u008a\u008b\7\22\2\2\u008b\u008c\7\t\2\2\u008c\u0097"+
		"\7\22\2\2\u008d\u008e\7\25\2\2\u008e\u008f\7\t\2\2\u008f\u0097\7\25\2"+
		"\2\u0090\u0091\7\22\2\2\u0091\u0092\7\t\2\2\u0092\u0097\7\22\2\2\u0093"+
		"\u0094\7\25\2\2\u0094\u0095\7\t\2\2\u0095\u0097\7\22\2\2\u0096\u008a\3"+
		"\2\2\2\u0096\u008d\3\2\2\2\u0096\u0090\3\2\2\2\u0096\u0093\3\2\2\2\u0097"+
		"\31\3\2\2\2\u0098\u0099\7\n\2\2\u0099\u009d\7\22\2\2\u009a\u009b\7\n\2"+
		"\2\u009b\u009d\7\25\2\2\u009c\u0098\3\2\2\2\u009c\u009a\3\2\2\2\u009d"+
		"\33\3\2\2\2\f\37*BP^lz\u0088\u0096\u009c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}