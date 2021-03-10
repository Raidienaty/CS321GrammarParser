package nerdalert;

import parser.*;

import java.util.Stack;

public class Listener extends CalculatorBaseListener
{
    private Stack<Double> stack = new Stack<>();

    @Override
    public void enterAddition(CalculatorParser.AdditionContext additionContext)
    {
        /*
        if (stack.empty())
            System.out.println("Empty!");

        Double num1 = stack.pop();
        Double num2 = stack.pop();

        stack.push(num1 + num2);*/

        System.out.println("In addition");
    }

    @Override
    public void enterNumber(CalculatorParser.NumberContext numberContext)
    {
        // Double number = Double.parseDouble(numberContext.getText());

        // stack.push(number);

        System.out.println("In number");
    }

    public Double getResult()
    {
        return stack.pop();
    }
}
