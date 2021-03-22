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
    public void exitAssignmentFunctionCall(LanguageParser.AssignmentFunctionCallContext context)
    {
        if (context.isEmpty())
            return;
        else{
            String variableName = context.getChild(0).getChild(0).getText();
            String value = context.getChild(0).getChild(2).getText();
            variableMap.put(variableName, value);  
            System.out.println(variableMap.get(variableName));
        }
        //Instruction Stack
        //Hash map containing variables
    }

    @Override
    public void exitAdditionFunc(LanguageParser.AdditionFuncContext context)
    {
        if (context.isEmpty())
            return;
        else{
            String key1 = context.getChild(0).getChild(0).getText();
            String key2 = context.getChild(0).getChild(2).getText();
            int num1, num2;
            try {
                num1 = Integer.parseInt(variableMap.get(key1));
                num2 = Integer.parseInt(variableMap.get(key2));    
            } catch (NumberFormatException e) {
                num1 = Integer.parseInt(key1);
                num2 = Integer.parseInt(key2);
            }
            System.out.println(num1 + num2);

        }
        //Instruction Stack
        //Hash map containing variables
    }
}
