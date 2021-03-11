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
	 * Enter a parse tree produced by {@link PrinterParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(PrinterParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrinterParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(PrinterParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrinterParser#printFunction}.
	 * @param ctx the parse tree
	 */
	void enterPrintFunction(PrinterParser.PrintFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrinterParser#printFunction}.
	 * @param ctx the parse tree
	 */
	void exitPrintFunction(PrinterParser.PrintFunctionContext ctx);
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
}