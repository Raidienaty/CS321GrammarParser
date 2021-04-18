package nerdalert;

import java.util.HashMap;

import parser.*;

public class Listener extends LanguageBaseListener
{
    /*
    private HashMap<String, String> variableMap = new HashMap<String, String>();
    @Override
    public void exitPrintFunctionCall(LanguageParser.PrintFunctionCallContext context)
    {

        if (context.isEmpty())
        {
            System.out.println("");
            return;
        }

        String string = context.getChild(0).getChild(2).getText();

        if (string.contains("\"") || string.contains("'"))
        {
            string = string.substring(1, string.length() - 1);

            System.out.println(string);
        }
        else
        {
            String value = variableMap.get(string);

            if (value == null)
            {
                throw new NullPointerException("Variable undefined");
            }

            System.out.println(value);
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

            if (value.contains("+"))
                return;

            variableMap.put(variableName, value);
            System.out.println(variableMap.get(variableName));
        }
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

            int total = num1 + num2;

            String variable = context.parent.getChild(0).getText();
            String value = Integer.toString(total);

            variableMap.put(variable, value);
        }
    }

    */
}
