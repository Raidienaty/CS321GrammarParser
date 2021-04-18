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
	 * Enter a parse tree produced by {@link LanguageParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(LanguageParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(LanguageParser.StatementContext ctx);
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
	 * Enter a parse tree produced by the {@code addOneFunc}
	 * labeled alternative in {@link LanguageParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAddOneFunc(LanguageParser.AddOneFuncContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addOneFunc}
	 * labeled alternative in {@link LanguageParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAddOneFunc(LanguageParser.AddOneFuncContext ctx);
	/**
	 * Enter a parse tree produced by the {@code subtractOneFunc}
	 * labeled alternative in {@link LanguageParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterSubtractOneFunc(LanguageParser.SubtractOneFuncContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subtractOneFunc}
	 * labeled alternative in {@link LanguageParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitSubtractOneFunc(LanguageParser.SubtractOneFuncContext ctx);
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
	 * Enter a parse tree produced by {@link LanguageParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(LanguageParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(LanguageParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageParser#ifStatementContext}.
	 * @param ctx the parse tree
	 */
	void enterIfStatementContext(LanguageParser.IfStatementContextContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#ifStatementContext}.
	 * @param ctx the parse tree
	 */
	void exitIfStatementContext(LanguageParser.IfStatementContextContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageParser#elseIf}.
	 * @param ctx the parse tree
	 */
	void enterElseIf(LanguageParser.ElseIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#elseIf}.
	 * @param ctx the parse tree
	 */
	void exitElseIf(LanguageParser.ElseIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageParser#elseStatement}.
	 * @param ctx the parse tree
	 */
	void enterElseStatement(LanguageParser.ElseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#elseStatement}.
	 * @param ctx the parse tree
	 */
	void exitElseStatement(LanguageParser.ElseStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageParser#forLoop}.
	 * @param ctx the parse tree
	 */
	void enterForLoop(LanguageParser.ForLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#forLoop}.
	 * @param ctx the parse tree
	 */
	void exitForLoop(LanguageParser.ForLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageParser#forLoopContext}.
	 * @param ctx the parse tree
	 */
	void enterForLoopContext(LanguageParser.ForLoopContextContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#forLoopContext}.
	 * @param ctx the parse tree
	 */
	void exitForLoopContext(LanguageParser.ForLoopContextContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageParser#whileLoop}.
	 * @param ctx the parse tree
	 */
	void enterWhileLoop(LanguageParser.WhileLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#whileLoop}.
	 * @param ctx the parse tree
	 */
	void exitWhileLoop(LanguageParser.WhileLoopContext ctx);
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
	 * Enter a parse tree produced by the {@code equivalenceExpression}
	 * labeled alternative in {@link LanguageParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterEquivalenceExpression(LanguageParser.EquivalenceExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code equivalenceExpression}
	 * labeled alternative in {@link LanguageParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitEquivalenceExpression(LanguageParser.EquivalenceExpressionContext ctx);
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
	 * Enter a parse tree produced by the {@code squareRootFunc}
	 * labeled alternative in {@link LanguageParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterSquareRootFunc(LanguageParser.SquareRootFuncContext ctx);
	/**
	 * Exit a parse tree produced by the {@code squareRootFunc}
	 * labeled alternative in {@link LanguageParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitSquareRootFunc(LanguageParser.SquareRootFuncContext ctx);
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
	 * Enter a parse tree produced by the {@code notExpression}
	 * labeled alternative in {@link LanguageParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNotExpression(LanguageParser.NotExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notExpression}
	 * labeled alternative in {@link LanguageParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNotExpression(LanguageParser.NotExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code comparisonExpression}
	 * labeled alternative in {@link LanguageParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterComparisonExpression(LanguageParser.ComparisonExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code comparisonExpression}
	 * labeled alternative in {@link LanguageParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitComparisonExpression(LanguageParser.ComparisonExpressionContext ctx);
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
	 * Enter a parse tree produced by the {@code orExpression}
	 * labeled alternative in {@link LanguageParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterOrExpression(LanguageParser.OrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code orExpression}
	 * labeled alternative in {@link LanguageParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitOrExpression(LanguageParser.OrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code andExpression}
	 * labeled alternative in {@link LanguageParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAndExpression(LanguageParser.AndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code andExpression}
	 * labeled alternative in {@link LanguageParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAndExpression(LanguageParser.AndExpressionContext ctx);
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
	 * Enter a parse tree produced by the {@code powerFunc}
	 * labeled alternative in {@link LanguageParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPowerFunc(LanguageParser.PowerFuncContext ctx);
	/**
	 * Exit a parse tree produced by the {@code powerFunc}
	 * labeled alternative in {@link LanguageParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPowerFunc(LanguageParser.PowerFuncContext ctx);
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
}