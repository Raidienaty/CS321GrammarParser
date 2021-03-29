package nerdalert;

import java.util.HashMap;

import org.antlr.v4.codegen.SourceGenTriggers;

import parser.*;

public class Listener extends LanguageBaseListener
{
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
    public void exitAssignmentFunctionCall(LanguageParser.AssignmentFunctionCallContext context) // Fixme: variable = variable case
    {
        if (context.isEmpty())
            return;
        else{
            String variableName = context.getChild(0).getChild(0).getText();
            String value = context.getChild(0).getChild(2).getText();

            if (value.contains("+")) // Has to be added for every operator
                return;
            else if (value.contains("-"))
                return;
            else if (value.contains("*"))
                return;
            else if (value.contains("/"))
                return;
            else if (value.contains("%"))
                return;
            else if (value.contains("^"))
                return;
            else if (value.contains("/*"))
                return;
            variableMap.put(variableName, value);
        }
    }


    /*
    * All the below functions cover arithmatic functionality of the programming language
    */

    // Addition function, takes String context and returns the final answer from the context into variableMap
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
    
    // Subtraction function, takes String context and returns the final answer from the context into variableMap
    @Override
    public void exitSubtractionFunc(LanguageParser.SubtractionFuncContext context) 
    {

        // All defined variables are in variableMap
        if (context.isEmpty())
            return;
        else 
        {
            String key1 = context.getChild(0).getChild(0).getText(); // num
            String key2 = context.getChild(0).getChild(2).getText(); // secNum
            int num1 = 0, num2 = 0;

            num1 = getValue(key1);
            num2 = getValue(key2);

            // values exist and are integers (logic done in try-parse above)
            int sum = num1 - num2;

            String var = context.parent.getChild(0).getText(); // var = VARIABLENAME
            String value = Integer.toString(sum); // value = sum of arithmatic 

            variableMap.put(var, value); // Puts in hashmap
        }
    }

    // Multiplication function, takes String context and returns the final answer from the context into variableMap
    @Override
    public void exitMultiplicationFunc(LanguageParser.MultiplicationFuncContext context) 
    {
        if (context.isEmpty())
            return;
        else 
        {
            String key1 = context.getChild(0).getChild(0).getText(); // num
            String key2 = context.getChild(0).getChild(2).getText(); // secNum
            int num1 = 0, num2 = 0;

            num1 = getValue(key1);
            num2 = getValue(key2);

            // values exist and are integers (logic done in try-parse above)
            int sum = num1 * num2;

            String var = context.parent.getChild(0).getText(); // var = VARIABLENAME
            String value = Integer.toString(sum); // value = sum of arithmatic 

            variableMap.put(var, value); // Puts in hashmap
        }
    }

    // Division function, takes String context and returns the final answer from the context into variableMap
    @Override
    public void exitDivisionFunc(LanguageParser.DivisionFuncContext context) 
    {
        if (context.isEmpty())
            return;
        else 
        {
            String key1 = context.getChild(0).getChild(0).getText(); // num
            String key2 = context.getChild(0).getChild(2).getText(); // secNum
            int num1 = 0, num2 = 0;

            num1 = getValue(key1);
            num2 = getValue(key2);

            // values exist and are integers (logic done in try-parse above)
            double sum = (double) num1 / (double) num2;

            String var = context.parent.getChild(0).getText(); // var = VARIABLENAME
            String value = Double.toString(sum); // value = sum of arithmatic 

            variableMap.put(var, value); // Puts in hashmap
        }
    }

    // Modulus function, takes String context and returns the final answer from the context into variableMap
    @Override
    public void exitModulusFunc(LanguageParser.ModulusFuncContext context) 
    {
        if (context.isEmpty())
            return;
        else 
        {
            String key1 = context.getChild(0).getChild(0).getText(); // num
            String key2 = context.getChild(0).getChild(2).getText(); // secNum
            int num1 = 0, num2 = 0;

            num1 = getValue(key1);
            num2 = getValue(key2);

            // values exist and are integers (logic done in try-parse above)
            int sum = num1 % num2;

            String var = context.parent.getChild(0).getText(); // var = VARIABLENAME
            String value = Integer.toString(sum); // value = sum of arithmatic 

            variableMap.put(var, value); // Puts in hashmap
        }
    }

    @Override
    public void exitSquareFunc(LanguageParser.SquareFuncContext context) {
        if (context.isEmpty())
            return;
        else 
        {
            String key1 = context.getChild(0).getChild(0).getText(); // num
            String key2 = context.getChild(0).getChild(2).getText(); // secNum
            int num1 = 0, num2 = 0;

            num1 = getValue(key1);
            num2 = getValue(key2);

            // values exist and are integers (logic done in try-parse above)
            double sum = Math.pow(num1, num2); // Math.pow accepts two doubles so I just have it converted here

            String var = context.parent.getChild(0).getText(); // var = VARIABLENAME
            String value = Double.toString(sum); // value = sum of arithmatic 

            variableMap.put(var, value); // Puts in hashmap
        }
    }

    // Square root function. The syntax is '/* NUM' OR '/* VAR', it's a bit weird, but I wanted to spice it up a bit. 
    @Override
    public void exitSquareRootFunc(LanguageParser.SquareRootFuncContext context) {
        if (context.isEmpty())
            return;
        else {
            String key1 = context.getChild(0).getChild(1).getText(); // INT/VARIABLENAME
            int num = 0;

            num = getValue(key1);

            double sum = Math.sqrt(num); // Square Root

            String var = context.parent.getChild(0).getText();
            String value = Double.toString(sum);
            
            variableMap.put(var, value);
        }
    }

    // This functions allows us to parse the given string back into an integer. It's incredibly simplistic, but it's elegant when we do the same operation 500 thousand times above
    private int getValue(String key)
    {
        int parsedValue = 0; // Figurative int
        try
        {
            parsedValue = Integer.parseInt(key); // Is it a pure integer? (6, not something like "abc = 6")
        }
        catch (NumberFormatException e) // If it's a variable
        {
            if (variableMap.get(key) == null) // Does the variable exist?
            {
                throw new NullPointerException("Undefined variable");
            }
            else // The variable exists, now does it parse?
            {
                parsedValue = Integer.parseInt(variableMap.get(key));
            }
        }
        return parsedValue;
    }
}
