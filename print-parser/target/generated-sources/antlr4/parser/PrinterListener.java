// Generated from parser/Printer.g4 by ANTLR 4.9
package parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PrinterParser}.
 */
public interface PrinterListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PrinterParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(PrinterParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrinterParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(PrinterParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Print}
	 * labeled alternative in {@link PrinterParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPrint(PrinterParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Print}
	 * labeled alternative in {@link PrinterParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPrint(PrinterParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Parenthesis}
	 * labeled alternative in {@link PrinterParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterParenthesis(PrinterParser.ParenthesisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Parenthesis}
	 * labeled alternative in {@link PrinterParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitParenthesis(PrinterParser.ParenthesisContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Phrase}
	 * labeled alternative in {@link PrinterParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPhrase(PrinterParser.PhraseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Phrase}
	 * labeled alternative in {@link PrinterParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPhrase(PrinterParser.PhraseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Semicolon}
	 * labeled alternative in {@link PrinterParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterSemicolon(PrinterParser.SemicolonContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Semicolon}
	 * labeled alternative in {@link PrinterParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitSemicolon(PrinterParser.SemicolonContext ctx);
}