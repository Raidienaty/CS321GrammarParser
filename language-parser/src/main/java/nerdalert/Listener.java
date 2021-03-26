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
            variableMap.put(variableName, value);
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

            /*
            // key1
            try 
            {
                // Case 1, pure integer
                num1 = Integer.parseInt(key1);
            }
            catch (NumberFormatException e)
            {
                if(variableMap.containsKey(key1)) 
                { // If a variable does exist that matches
                    
                    try 
                    {
                        num1 = Integer.parseInt(variableMap.get(key1));
                    } 
                    catch (NumberFormatException exc) 
                    { // num1 exists as variable but cannot be parsed
                        exc.printStackTrace();
                    }
                }
            } 
            
            // key2 var
            try
            { // is the second integer a pure integer?
                num2 = Integer.parseInt(key2);
            } 
            catch (NumberFormatException e) 
            {
                
                if (variableMap.containsKey(key2)) 
                {
                    try 
                    {
                        num2 = Integer.parseInt(variableMap.get(key2));
                    } 
                    catch (NumberFormatException exc) 
                    {
                        exc.printStackTrace();
                    }
                }
            }
            */

            // values exist and are integers (logic done in try-parse above)
            int sum = num1 - num2;

            String var = context.parent.getChild(0).getText(); // var = VARIABLENAME
            String value = Integer.toString(sum); // value = sum of arithmatic 

            variableMap.put(var, value); // Puts in hashmap
        }
    }

    @Override
    public void exitMultiplicationFunc(LanguageParser.MultiplicationFuncContext context) 
    {
        if (context.isEmpty())
            return;
        else 
        {
            
        }
    }

    @Override
    public void exitDivisionFunc(LanguageParser.DivisionFuncContext context) 
    {
        if (context.isEmpty())
            return;
        else 
        {
            
        }
    }

    @Override
    public void exitModulusFunc(LanguageParser.ModulusFuncContext context) 
    {
        if (context.isEmpty())
            return;
        else 
        {
            
        }
    }

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
