package nerdalert;

import parser.*;

import java.util.Stack;

public class Listener extends CalculatorBaseListener
{
    private Stack<Double> stack = new Stack<>();

    @Override
    public void exitAddition(CalculatorParser.AdditionContext additionContext)
    {
        Double num1 = stack.pop();
        Double num2 = stack.pop();

        stack.push(num1 + num2);
    }

    @Override
    public void exitNumber(CalculatorParser.NumberContext numberContext)
    {
        Double number = Double.parseDouble(numberContext.getText());

        stack.push(number);
    }

    public Double getResult()
    {
        return stack.pop();
    }
}
