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
}