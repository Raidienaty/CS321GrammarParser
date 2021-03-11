package nerdalert;

import java.util.Stack;

import parser.*;

public class Listener extends PrinterBaseListener
{
    private Stack<String> stack = new Stack<>();

    @Override
    public void enterPhrase(PrinterParser.PhraseContext phraseContext)
    {
        String phrase = phraseContext.getText();
        phrase = phrase.substring(1, phrase.length() - 1);
        stack.push(phrase);
    }

    public void printResult()
    {
        for (String item : stack) 
        {
            System.out.println(item);    
        }
    }

    public String getResult()
    {
        return stack.pop();
    }
}
