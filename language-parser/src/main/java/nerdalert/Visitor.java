package nerdalert;

import java.util.HashMap;

import parser.*;

public class Visitor extends LanguageBaseVisitor<DecafValue>
{
    private HashMap<String, DecafValue> variableMap = new HashMap<String, DecafValue>();

    @Override
    public DecafValue visitAssignmentFunctionCall(LanguageParser.AssignmentFunctionCallContext context)
    {
        return visitChildren(context);
    }

    @Override
    public DecafValue visitPrintFunctionCall(LanguageParser.PrintFunctionCallContext context)
    {
        if (context.isEmpty())
        {
            System.out.println("");
            return new DecafValue();
        }

        String printString = context.getChild(0).getChild(2).getText();
        printString = removeIllegalCharacters(printString);

        DecafValue printDecafValue = getValue(printString);

        System.out.println(printDecafValue.asString());

        return visitChildren(context);
    }

    @Override
    public DecafValue visitAssignmentFunc(LanguageParser.AssignmentFuncContext context)
    {
        String variable = context.getChild(0).getText();
        DecafValue value = getValue(context.getChild(2).getText());

        variableMap.put(variable, value);

        return visitChildren(context);
    }

    private String removeIllegalCharacters(String string)
    {
        if (string.contains("\"") || string.contains("'"))
        {
            string = string.substring(1, string.length() - 1);

            return string;
        }

        return string;
    }

    private DecafValue getValue(String key)
    {
        DecafValue decafValue;

        if (variableMap.get(key) != null)
        {
            decafValue = variableMap.get(key);
        }
        else
        {
            decafValue = new DecafValue(key);
        }

        return decafValue;
    }
}
