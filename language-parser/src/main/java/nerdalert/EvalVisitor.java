package nerdalert;

import java.util.HashMap;

import parser.*;
import parser.LanguageParser.AssignmentFuncContext;
import parser.LanguageParser.BoolExpressionContext;
import parser.LanguageParser.NumberExpressionContext;
import parser.LanguageParser.PrintFunctionCallContext;

public class EvalVisitor extends LanguageBaseVisitor<DecafValue>
{
    private HashMap<String, DecafValue> variableMap = new HashMap<String, DecafValue>();

    @Override
    public DecafValue visitPrintFunctionCall(PrintFunctionCallContext context)
    {
        if (context.isEmpty())
        {
            System.out.println("");
            return new DecafValue();
        }

        DecafValue printContext = this.visit(context.expression());

        DecafValue printDecafValue = getValue(printContext);

        System.out.println(printDecafValue.asString());

        return new DecafValue();
    }

    @Override
    public DecafValue visitAssignmentFunc(AssignmentFuncContext context)
    {
        String variable = context.getChild(0).getText();
        DecafValue value = getValue(context.getChild(2).getText());

        variableMap.put(variable, value);

        return visitChildren(context);
    }

    @Override
    public DecafValue visitNumberExpression(NumberExpressionContext context)
    {
        return new DecafValue(context.getChild(0).getText());
    }

    @Override
    public DecafValue visitBoolExpression(BoolExpressionContext context)
    {
        return new DecafValue(context.getChild(0).getText());
    }

    @Override
    public DecafValue visitStringExpression(LanguageParser.StringExpressionContext context)
    {
        String string = context.getChild(0).getText();
        string = removeIllegalCharacters(string);

        return new DecafValue(string);
    }

    @Override
    public DecafValue visitVariableExpression(LanguageParser.VariableExpressionContext context)
    {
        return new DecafValue(context.getChild(0).getText());
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

    private DecafValue getValue(DecafValue key)
    {
        if (variableMap.get(key.asString()) != null)
        {
            return variableMap.get(key.asString());
        }
        else
        {
            return key;
        }
    }
}
