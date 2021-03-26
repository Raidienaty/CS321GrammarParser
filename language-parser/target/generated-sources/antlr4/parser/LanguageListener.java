// Generated from parser/Language.g4 by ANTLR 4.9
package parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LanguageParser}.
 */
public interface LanguageListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LanguageParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(LanguageParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(LanguageParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by the {@code generalFunctionCall}
	 * labeled alternative in {@link LanguageParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterGeneralFunctionCall(LanguageParser.GeneralFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code generalFunctionCall}
	 * labeled alternative in {@link LanguageParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitGeneralFunctionCall(LanguageParser.GeneralFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignmentFunctionCall}
	 * labeled alternative in {@link LanguageParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentFunctionCall(LanguageParser.AssignmentFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignmentFunctionCall}
	 * labeled alternative in {@link LanguageParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentFunctionCall(LanguageParser.AssignmentFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignmentFunc}
	 * labeled alternative in {@link LanguageParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentFunc(LanguageParser.AssignmentFuncContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignmentFunc}
	 * labeled alternative in {@link LanguageParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentFunc(LanguageParser.AssignmentFuncContext ctx);
	/**
	 * Enter a parse tree produced by the {@code printFunctionCall}
	 * labeled alternative in {@link LanguageParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterPrintFunctionCall(LanguageParser.PrintFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code printFunctionCall}
	 * labeled alternative in {@link LanguageParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitPrintFunctionCall(LanguageParser.PrintFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageParser#printFunction}.
	 * @param ctx the parse tree
	 */
	void enterPrintFunction(LanguageParser.PrintFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#printFunction}.
	 * @param ctx the parse tree
	 */
	void exitPrintFunction(LanguageParser.PrintFunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code additionFunc}
	 * labeled alternative in {@link LanguageParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAdditionFunc(LanguageParser.AdditionFuncContext ctx);
	/**
	 * Exit a parse tree produced by the {@code additionFunc}
	 * labeled alternative in {@link LanguageParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAdditionFunc(LanguageParser.AdditionFuncContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringExpression}
	 * labeled alternative in {@link LanguageParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterStringExpression(LanguageParser.StringExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringExpression}
	 * labeled alternative in {@link LanguageParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitStringExpression(LanguageParser.StringExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numberExpression}
	 * labeled alternative in {@link LanguageParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNumberExpression(LanguageParser.NumberExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numberExpression}
	 * labeled alternative in {@link LanguageParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNumberExpression(LanguageParser.NumberExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolExpression}
	 * labeled alternative in {@link LanguageParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBoolExpression(LanguageParser.BoolExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolExpression}
	 * labeled alternative in {@link LanguageParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBoolExpression(LanguageParser.BoolExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code variableExpression}
	 * labeled alternative in {@link LanguageParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterVariableExpression(LanguageParser.VariableExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code variableExpression}
	 * labeled alternative in {@link LanguageParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitVariableExpression(LanguageParser.VariableExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code subtractionFunc}
	 * labeled alternative in {@link LanguageParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterSubtractionFunc(LanguageParser.SubtractionFuncContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subtractionFunc}
	 * labeled alternative in {@link LanguageParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitSubtractionFunc(LanguageParser.SubtractionFuncContext ctx);
	/**
	 * Enter a parse tree produced by the {@code divisionFunc}
	 * labeled alternative in {@link LanguageParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterDivisionFunc(LanguageParser.DivisionFuncContext ctx);
	/**
	 * Exit a parse tree produced by the {@code divisionFunc}
	 * labeled alternative in {@link LanguageParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitDivisionFunc(LanguageParser.DivisionFuncContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multiplicationFunc}
	 * labeled alternative in {@link LanguageParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicationFunc(LanguageParser.MultiplicationFuncContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multiplicationFunc}
	 * labeled alternative in {@link LanguageParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicationFunc(LanguageParser.MultiplicationFuncContext ctx);
	/**
	 * Enter a parse tree produced by the {@code modulusFunc}
	 * labeled alternative in {@link LanguageParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterModulusFunc(LanguageParser.ModulusFuncContext ctx);
	/**
	 * Exit a parse tree produced by the {@code modulusFunc}
	 * labeled alternative in {@link LanguageParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitModulusFunc(LanguageParser.ModulusFuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageParser#addition}.
	 * @param ctx the parse tree
	 */
	void enterAddition(LanguageParser.AdditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#addition}.
	 * @param ctx the parse tree
	 */
	void exitAddition(LanguageParser.AdditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageParser#subtraction}.
	 * @param ctx the parse tree
	 */
	void enterSubtraction(LanguageParser.SubtractionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#subtraction}.
	 * @param ctx the parse tree
	 */
	void exitSubtraction(LanguageParser.SubtractionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageParser#multiplication}.
	 * @param ctx the parse tree
	 */
	void enterMultiplication(LanguageParser.MultiplicationContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#multiplication}.
	 * @param ctx the parse tree
	 */
	void exitMultiplication(LanguageParser.MultiplicationContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageParser#division}.
	 * @param ctx the parse tree
	 */
	void enterDivision(LanguageParser.DivisionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#division}.
	 * @param ctx the parse tree
	 */
	void exitDivision(LanguageParser.DivisionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageParser#modulus}.
	 * @param ctx the parse tree
	 */
	void enterModulus(LanguageParser.ModulusContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#modulus}.
	 * @param ctx the parse tree
	 */
	void exitModulus(LanguageParser.ModulusContext ctx);
}