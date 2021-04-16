package nerdalert;

import java.util.HashMap;

import parser.*;
import parser.LanguageParser.AdditionFuncContext;
import parser.LanguageParser.AssignmentFuncContext;
import parser.LanguageParser.BoolExpressionContext;
import parser.LanguageParser.DivisionFuncContext;
import parser.LanguageParser.ModulusFuncContext;
import parser.LanguageParser.MultiplicationFuncContext;
import parser.LanguageParser.NumberExpressionContext;
import parser.LanguageParser.PowerFuncContext;
import parser.LanguageParser.PrintFunctionCallContext;
import parser.LanguageParser.SquareRootFuncContext;
import parser.LanguageParser.SubtractionFuncContext;

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

        if (value.asString().contains("+") || value.asString().contains("-") || value.asString().contains("*") || value.asString().contains("/") || value.asString().contains("%") || value.asString().contains("sqrt"))
        {
            return this.visit(context.expression());
        }

        variableMap.put(variable, value);

        return new DecafValue();
    }

    @Override
    public DecafValue visitAdditionFunc(AdditionFuncContext context)
    {
        DecafValue leftAddend = getValue(this.visit(context.expression(0)));
        DecafValue rightAddend = getValue(this.visit(context.expression(1)));
        DecafValue parentVariable = new DecafValue(context.getParent().getChild(0).getText());

        DecafValue sum;

        if (leftAddend.isInt() && rightAddend.isInt())
        {
            sum = new DecafValue(leftAddend.asInt() + rightAddend.asInt());
        }
        else if (leftAddend.isDouble() && rightAddend.isDouble())
        {
            sum = new DecafValue(leftAddend.asDouble() + rightAddend.asDouble());
        }
        else if (leftAddend.isString() && rightAddend.isString())
        {
            sum = new DecafValue(leftAddend.asString() + rightAddend.asString());
        }
        else
        {
            throw new RuntimeException("Illegal addition operation!");
        }

        variableMap.put(parentVariable.asString(), sum);

        return new DecafValue();
    }

    @Override
    public DecafValue visitSubtractionFunc(SubtractionFuncContext context)
    {
        DecafValue minuend = getValue(this.visit(context.expression(0)));
        DecafValue subtrahend = getValue(this.visit(context.expression(1)));
        DecafValue parentVariable = new DecafValue(context.getParent().getChild(0).getText());

        DecafValue difference;

        if (minuend.isInt() && subtrahend.isInt())
        {
            difference = new DecafValue(minuend.asInt() - subtrahend.asInt());
        }
        else if (minuend.isDouble() && subtrahend.isDouble())
        {
            difference = new DecafValue(minuend.asDouble() - subtrahend.asDouble());
        }
        else
        {
            throw new RuntimeException("Illegal subtraction operation!");
        }

        variableMap.put(parentVariable.asString(), difference);

        return new DecafValue();
    }

    @Override
    public DecafValue visitMultiplicationFunc(MultiplicationFuncContext context)
    {
        DecafValue leftFactor = getValue(this.visit(context.expression(0)));
        DecafValue rightFactor = getValue(this.visit(context.expression(1)));
        DecafValue parentVariable = new DecafValue(context.getParent().getChild(0).getText());

        DecafValue product;

        if (leftFactor.isInt() && rightFactor.isInt())
        {
            product = new DecafValue(leftFactor.asInt() * rightFactor.asInt());
        }
        else if (leftFactor.isDouble() && rightFactor.isDouble())
        {
            product = new DecafValue(leftFactor.asDouble() * rightFactor.asDouble());
        }
        else
        {
            throw new RuntimeException("Illegal multiplication operation!");
        }

        variableMap.put(parentVariable.asString(), product);

        return new DecafValue();
    }

    @Override
    public DecafValue visitDivisionFunc(DivisionFuncContext context)
    {
        DecafValue dividend = getValue(this.visit(context.expression(0)));
        DecafValue divisor = getValue(this.visit(context.expression(1)));
        DecafValue parentVariable = new DecafValue(context.getParent().getChild(0).getText());

        DecafValue quotient;

        if (dividend.isInt() && divisor.isInt())
        {
            quotient = new DecafValue(dividend.asInt() / divisor.asInt());
        }
        else if (dividend.isDouble() && divisor.isDouble())
        {
            quotient = new DecafValue(dividend.asDouble() / divisor.asDouble());
        }
        else
        {
            throw new RuntimeException("Illegal division operation!");
        }

        variableMap.put(parentVariable.asString(), quotient);

        return new DecafValue();
    }

    @Override
    public DecafValue visitModulusFunc(ModulusFuncContext context)
    {
        DecafValue leftOperand = getValue(this.visit(context.expression(0)));
        DecafValue rightOperand = getValue(this.visit(context.expression(1)));
        DecafValue parentVariable = new DecafValue(context.getParent().getChild(0).getText());

        DecafValue quotient;

        if (leftOperand.isInt() && rightOperand.isInt())
        {
            quotient = new DecafValue(leftOperand.asInt() % rightOperand.asInt());
        }
        else if (leftOperand.isDouble() && rightOperand.isDouble())
        {
            quotient = new DecafValue(leftOperand.asDouble() % rightOperand.asDouble());
        }
        else
        {
            throw new RuntimeException("Illegal division operation!");
        }

        variableMap.put(parentVariable.asString(), quotient);

        return new DecafValue();
    }

    @Override
    public DecafValue visitPowerFunc(PowerFuncContext context)
    {
        DecafValue leftOperand = getValue(this.visit(context.expression(0)));
        DecafValue rightOperand = getValue(this.visit(context.expression(1)));
        DecafValue parentVariable = new DecafValue(context.getParent().getChild(0).getText());

        DecafValue quotient;

        if (leftOperand.isInt() && rightOperand.isInt())
        {
            quotient = new DecafValue(Math.pow(leftOperand.asInt(), rightOperand.asInt()));
        }
        else if (leftOperand.isDouble() && rightOperand.isDouble())
        {
            quotient = new DecafValue(Math.pow(leftOperand.asDouble(), rightOperand.asDouble()));
        }
        else
        {
            throw new RuntimeException("Illegal division operation!");
        }

        variableMap.put(parentVariable.asString(), quotient);

        return new DecafValue();
    }

    @Override
    public DecafValue visitSquareRootFunc(SquareRootFuncContext context)
    {
        DecafValue sqrtContext = this.visit(context.expression());
        DecafValue parentVariable = new DecafValue(context.getParent().getChild(0).getText());

        double root = Math.sqrt(sqrtContext.asDouble());

        variableMap.put(parentVariable.asString(), new DecafValue(root));

        return new DecafValue();
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
