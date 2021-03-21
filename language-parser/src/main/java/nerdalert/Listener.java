package nerdalert;

import java.util.Stack;
import java.util.HashMap;

import parser.*;

public class Listener extends LanguageBaseListener
{
    private HashMap<String, String> variableMap = new HashMap<String, String>();
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
        else{
            String variableName = context.getChild(0).getText();
            String value = context.getChild(2).getText();
            variableMap.put(variableName, value);            
            System.out.println(variableMap.get(variableName));
        }
        //Instruction Stack
        //Hash map containing variables
    }
}
