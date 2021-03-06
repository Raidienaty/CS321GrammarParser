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
	 * Enter a parse tree produced by the {@code assingment}
	 * labeled alternative in {@link LanguageParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterAssingment(LanguageParser.AssingmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assingment}
	 * labeled alternative in {@link LanguageParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitAssingment(LanguageParser.AssingmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(LanguageParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(LanguageParser.AssignmentContext ctx);
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
}