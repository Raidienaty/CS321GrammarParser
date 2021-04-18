// Generated from parser/Language.g4 by ANTLR 4.9
package parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LanguageParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LanguageVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link LanguageParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(LanguageParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link LanguageParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(LanguageParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignmentFunc}
	 * labeled alternative in {@link LanguageParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentFunc(LanguageParser.AssignmentFuncContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addOneFunc}
	 * labeled alternative in {@link LanguageParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddOneFunc(LanguageParser.AddOneFuncContext ctx);
	/**
	 * Visit a parse tree produced by the {@code subtractOneFunc}
	 * labeled alternative in {@link LanguageParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubtractOneFunc(LanguageParser.SubtractOneFuncContext ctx);
	/**
	 * Visit a parse tree produced by the {@code printFunctionCall}
	 * labeled alternative in {@link LanguageParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintFunctionCall(LanguageParser.PrintFunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link LanguageParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(LanguageParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link LanguageParser#ifStatementContext}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatementContext(LanguageParser.IfStatementContextContext ctx);
	/**
	 * Visit a parse tree produced by {@link LanguageParser#elseIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseIf(LanguageParser.ElseIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link LanguageParser#elseStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseStatement(LanguageParser.ElseStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link LanguageParser#forLoop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForLoop(LanguageParser.ForLoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link LanguageParser#forLoopContext}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForLoopContext(LanguageParser.ForLoopContextContext ctx);
	/**
	 * Visit a parse tree produced by {@link LanguageParser#whileLoop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileLoop(LanguageParser.WhileLoopContext ctx);
	/**
	 * Visit a parse tree produced by the {@code modulusFunc}
	 * labeled alternative in {@link LanguageParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModulusFunc(LanguageParser.ModulusFuncContext ctx);
	/**
	 * Visit a parse tree produced by the {@code equivalenceExpression}
	 * labeled alternative in {@link LanguageParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEquivalenceExpression(LanguageParser.EquivalenceExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolExpression}
	 * labeled alternative in {@link LanguageParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolExpression(LanguageParser.BoolExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code squareRootFunc}
	 * labeled alternative in {@link LanguageParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSquareRootFunc(LanguageParser.SquareRootFuncContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numberExpression}
	 * labeled alternative in {@link LanguageParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberExpression(LanguageParser.NumberExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code notExpression}
	 * labeled alternative in {@link LanguageParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotExpression(LanguageParser.NotExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code comparisonExpression}
	 * labeled alternative in {@link LanguageParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonExpression(LanguageParser.ComparisonExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code variableExpression}
	 * labeled alternative in {@link LanguageParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableExpression(LanguageParser.VariableExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multiplicationFunc}
	 * labeled alternative in {@link LanguageParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicationFunc(LanguageParser.MultiplicationFuncContext ctx);
	/**
	 * Visit a parse tree produced by the {@code orExpression}
	 * labeled alternative in {@link LanguageParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrExpression(LanguageParser.OrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code andExpression}
	 * labeled alternative in {@link LanguageParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpression(LanguageParser.AndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringExpression}
	 * labeled alternative in {@link LanguageParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringExpression(LanguageParser.StringExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code powerFunc}
	 * labeled alternative in {@link LanguageParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPowerFunc(LanguageParser.PowerFuncContext ctx);
	/**
	 * Visit a parse tree produced by the {@code additionFunc}
	 * labeled alternative in {@link LanguageParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditionFunc(LanguageParser.AdditionFuncContext ctx);
	/**
	 * Visit a parse tree produced by the {@code divisionFunc}
	 * labeled alternative in {@link LanguageParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivisionFunc(LanguageParser.DivisionFuncContext ctx);
	/**
	 * Visit a parse tree produced by the {@code subtractionFunc}
	 * labeled alternative in {@link LanguageParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubtractionFunc(LanguageParser.SubtractionFuncContext ctx);
}