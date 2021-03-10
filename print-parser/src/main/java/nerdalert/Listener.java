package nerdalert;

import java.util.Stack;

import parser.*;

public class Listener extends PrinterBaseListener
{
    private Stack<String> stack = new Stack<>();

    @Override
    public void exitPhrase(PrinterParser.PhraseContext phraseContext)
    {
        System.out.println("\nIn phrase!\n");
        stack.push(phraseContext.getText());
    }

    @Override
    public void exitPrint(PrinterParser.PrintContext printContext)
    {
        System.out.println("\n" + printContext.getText());
    }

    @Override
    public void exitParenthesis(PrinterParser.ParenthesisContext parenthesisContext)
    {
        System.out.println("\n" + parenthesisContext.toString());
    }

    @Override
    public void exitQuote(PrinterParser.QuoteContext quoteContext)
    {
        System.out.println("\n" + quoteContext.toString());
    }

    @Override
    public void exitSemicolon(PrinterParser.SemicolonContext semicolonContext)
    {
        System.out.println("\n" + semicolonContext.toString());
    }

    public String getResult()
    {
        return "";//stack.pop();
    }
}
