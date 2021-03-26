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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, PRINT=7, LPARENTHESIS=8, 
		RPARENTHESIS=9, SEMICOLON=10, TRUE=11, FALSE=12, STRING=13, VARIABLENAME=14, 
		COMMENT=15, WHITESPACE=16, NUMBER=17, BOOL=18;
	public static final int
		RULE_start = 0, RULE_statement = 1, RULE_assignment = 2, RULE_functionCall = 3, 
		RULE_printFunction = 4, RULE_expression = 5, RULE_addition = 6, RULE_subtraction = 7, 
		RULE_multiplication = 8, RULE_division = 9, RULE_modulus = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "statement", "assignment", "functionCall", "printFunction", 
			"expression", "addition", "subtraction", "multiplication", "division", 
			"modulus"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'+'", "'-'", "'*'", "'/'", "'%'", "'print'", "'('", "')'", 
			"';'", "'true'", "'false'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, "PRINT", "LPARENTHESIS", "RPARENTHESIS", 
			"SEMICOLON", "TRUE", "FALSE", "STRING", "VARIABLENAME", "COMMENT", "WHITESPACE", 
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
			setState(25);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PRINT || _la==VARIABLENAME) {
				{
				{
				setState(22);
				statement();
				}
				}
				setState(27);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(28);
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
			setState(36);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRINT:
				_localctx = new GeneralFunctionCallContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(30);
				functionCall();
				setState(31);
				match(SEMICOLON);
				}
				break;
			case VARIABLENAME:
				_localctx = new AssignmentFunctionCallContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(33);
				assignment();
				setState(34);
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
			setState(38);
			match(VARIABLENAME);
			setState(39);
			match(T__0);
			setState(40);
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
			setState(42);
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
			setState(44);
			match(PRINT);
			setState(45);
			match(LPARENTHESIS);
			setState(46);
			expression();
			setState(47);
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
			setState(58);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new AdditionFuncContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(49);
				addition();
				}
				break;
			case 2:
				_localctx = new StringExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(50);
				match(STRING);
				}
				break;
			case 3:
				_localctx = new NumberExpressionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(51);
				match(NUMBER);
				}
				break;
			case 4:
				_localctx = new BoolExpressionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(52);
				match(BOOL);
				}
				break;
			case 5:
				_localctx = new VariableExpressionContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(53);
				match(VARIABLENAME);
				}
				break;
			case 6:
				_localctx = new SubtractionFuncContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(54);
				subtraction();
				}
				break;
			case 7:
				_localctx = new DivisionFuncContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(55);
				division();
				}
				break;
			case 8:
				_localctx = new MultiplicationFuncContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(56);
				multiplication();
				}
				break;
			case 9:
				_localctx = new ModulusFuncContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(57);
				modulus();
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
			setState(72);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(60);
				match(VARIABLENAME);
				setState(61);
				match(T__1);
				setState(62);
				match(VARIABLENAME);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(63);
				match(NUMBER);
				setState(64);
				match(T__1);
				setState(65);
				match(NUMBER);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(66);
				match(VARIABLENAME);
				setState(67);
				match(T__1);
				setState(68);
				match(NUMBER);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(69);
				match(NUMBER);
				setState(70);
				match(T__1);
				setState(71);
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
			setState(86);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(74);
				match(VARIABLENAME);
				setState(75);
				match(T__2);
				setState(76);
				match(VARIABLENAME);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(77);
				match(NUMBER);
				setState(78);
				match(T__2);
				setState(79);
				match(NUMBER);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(80);
				match(VARIABLENAME);
				setState(81);
				match(T__2);
				setState(82);
				match(NUMBER);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(83);
				match(NUMBER);
				setState(84);
				match(T__2);
				setState(85);
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
			setState(100);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(88);
				match(VARIABLENAME);
				setState(89);
				match(T__3);
				setState(90);
				match(VARIABLENAME);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(91);
				match(NUMBER);
				setState(92);
				match(T__3);
				setState(93);
				match(NUMBER);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(94);
				match(VARIABLENAME);
				setState(95);
				match(T__3);
				setState(96);
				match(NUMBER);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(97);
				match(NUMBER);
				setState(98);
				match(T__3);
				setState(99);
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
			setState(114);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(102);
				match(VARIABLENAME);
				setState(103);
				match(T__4);
				setState(104);
				match(VARIABLENAME);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(105);
				match(NUMBER);
				setState(106);
				match(T__4);
				setState(107);
				match(NUMBER);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(108);
				match(VARIABLENAME);
				setState(109);
				match(T__4);
				setState(110);
				match(NUMBER);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(111);
				match(NUMBER);
				setState(112);
				match(T__4);
				setState(113);
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
			setState(128);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(116);
				match(VARIABLENAME);
				setState(117);
				match(T__5);
				setState(118);
				match(VARIABLENAME);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(119);
				match(NUMBER);
				setState(120);
				match(T__5);
				setState(121);
				match(NUMBER);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(122);
				match(VARIABLENAME);
				setState(123);
				match(T__5);
				setState(124);
				match(NUMBER);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(125);
				match(NUMBER);
				setState(126);
				match(T__5);
				setState(127);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\24\u0085\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\3\2\7\2\32\n\2\f\2\16\2\35\13\2\3\2\3\2\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\5\3\'\n\3\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7=\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\5\bK\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\5\tY\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\ng\n\n"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13u\n\13"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u0083\n\f\3\f\2\2"+
		"\r\2\4\6\b\n\f\16\20\22\24\26\2\2\2\u0092\2\33\3\2\2\2\4&\3\2\2\2\6(\3"+
		"\2\2\2\b,\3\2\2\2\n.\3\2\2\2\f<\3\2\2\2\16J\3\2\2\2\20X\3\2\2\2\22f\3"+
		"\2\2\2\24t\3\2\2\2\26\u0082\3\2\2\2\30\32\5\4\3\2\31\30\3\2\2\2\32\35"+
		"\3\2\2\2\33\31\3\2\2\2\33\34\3\2\2\2\34\36\3\2\2\2\35\33\3\2\2\2\36\37"+
		"\7\2\2\3\37\3\3\2\2\2 !\5\b\5\2!\"\7\f\2\2\"\'\3\2\2\2#$\5\6\4\2$%\7\f"+
		"\2\2%\'\3\2\2\2& \3\2\2\2&#\3\2\2\2\'\5\3\2\2\2()\7\20\2\2)*\7\3\2\2*"+
		"+\5\f\7\2+\7\3\2\2\2,-\5\n\6\2-\t\3\2\2\2./\7\t\2\2/\60\7\n\2\2\60\61"+
		"\5\f\7\2\61\62\7\13\2\2\62\13\3\2\2\2\63=\5\16\b\2\64=\7\17\2\2\65=\7"+
		"\23\2\2\66=\7\24\2\2\67=\7\20\2\28=\5\20\t\29=\5\24\13\2:=\5\22\n\2;="+
		"\5\26\f\2<\63\3\2\2\2<\64\3\2\2\2<\65\3\2\2\2<\66\3\2\2\2<\67\3\2\2\2"+
		"<8\3\2\2\2<9\3\2\2\2<:\3\2\2\2<;\3\2\2\2=\r\3\2\2\2>?\7\20\2\2?@\7\4\2"+
		"\2@K\7\20\2\2AB\7\23\2\2BC\7\4\2\2CK\7\23\2\2DE\7\20\2\2EF\7\4\2\2FK\7"+
		"\23\2\2GH\7\23\2\2HI\7\4\2\2IK\7\20\2\2J>\3\2\2\2JA\3\2\2\2JD\3\2\2\2"+
		"JG\3\2\2\2K\17\3\2\2\2LM\7\20\2\2MN\7\5\2\2NY\7\20\2\2OP\7\23\2\2PQ\7"+
		"\5\2\2QY\7\23\2\2RS\7\20\2\2ST\7\5\2\2TY\7\23\2\2UV\7\23\2\2VW\7\5\2\2"+
		"WY\7\20\2\2XL\3\2\2\2XO\3\2\2\2XR\3\2\2\2XU\3\2\2\2Y\21\3\2\2\2Z[\7\20"+
		"\2\2[\\\7\6\2\2\\g\7\20\2\2]^\7\23\2\2^_\7\6\2\2_g\7\23\2\2`a\7\20\2\2"+
		"ab\7\6\2\2bg\7\23\2\2cd\7\23\2\2de\7\6\2\2eg\7\20\2\2fZ\3\2\2\2f]\3\2"+
		"\2\2f`\3\2\2\2fc\3\2\2\2g\23\3\2\2\2hi\7\20\2\2ij\7\7\2\2ju\7\20\2\2k"+
		"l\7\23\2\2lm\7\7\2\2mu\7\23\2\2no\7\20\2\2op\7\7\2\2pu\7\23\2\2qr\7\23"+
		"\2\2rs\7\7\2\2su\7\20\2\2th\3\2\2\2tk\3\2\2\2tn\3\2\2\2tq\3\2\2\2u\25"+
		"\3\2\2\2vw\7\20\2\2wx\7\b\2\2x\u0083\7\20\2\2yz\7\23\2\2z{\7\b\2\2{\u0083"+
		"\7\23\2\2|}\7\20\2\2}~\7\b\2\2~\u0083\7\23\2\2\177\u0080\7\23\2\2\u0080"+
		"\u0081\7\b\2\2\u0081\u0083\7\20\2\2\u0082v\3\2\2\2\u0082y\3\2\2\2\u0082"+
		"|\3\2\2\2\u0082\177\3\2\2\2\u0083\27\3\2\2\2\n\33&<JXft\u0082";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}