package nerdalert;

import java.util.Stack;

import parser.*;

public class Listener extends LanguageBaseListener
{
    @Override
    public void exitPrintFunctionCall(LanguageParser.PrintFunctionCallContext context)
    {
        if (context != null)
        {
            String string = context.getChild(0).getChild(2).getText();
            string = string.substring(1, string.length() - 1);

            System.out.println(string);
        }
        else
        {
            System.out.println("");
        }
    }

    @Override
    public void exitAssignment(LanguageParser.AssignmentContext context)
    {
        if (context.isEmpty())
            return;

        //Instruction Stack
        //Hash map containing variables
    }
}
