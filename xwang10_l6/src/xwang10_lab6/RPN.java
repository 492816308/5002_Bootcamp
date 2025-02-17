package xwang10_lab6;

import java.util.Scanner;

/**
 * The RPN class evaluate the digits and operators and output the results,
 * as well as handling error exceptions.
 */
public class RPN {
    private String expression;

    /**
     * Constructor takes the input expression as parameter.
     * @param expression The input from the user.
     */
    public RPN(String expression) {
        this.expression = expression;
    }

    // Create a Stack object./
    Stack stack = new Stack();

    /**
     * The evaluate method checks whether the input is operands or operators
     * and call the other two methods to calculate the results.
     * @return The result.
     */
    public double evaluate () {
        double op1, op2, result = 0;
        String token;
        //Use a Scanner constructed from the String expression to parse the string expression
        Scanner parser = new Scanner(expression);
        while (parser.hasNext()) {
            token = parser.next();
             //When there's an operator, pop the two operands from the stack
            if (isOperator(token)) {
                if (stack.size() < 2) {
                    throw new IllegalArgumentException("too many operators!");
                }
                op2 = stack.pop();
                op1 = stack.pop();
                result = evaluateOperator(token.charAt(0), op1, op2);
                // Push the result back onto the stack
                stack.push(result);
            }
            else
                stack.push(Double.parseDouble(token)); // Push the number onto the stack
        }
        if(stack.isEmpty()) { // If there's no digits in the stack, return 0
            return 0;
        } else if(stack.size() == 1) { // If there's only 1 digit, pop it
            return stack.pop();
        } else { // Otherwise, throws an exception
            throw new IllegalArgumentException("not enough operators!");
        }
    }

    /**
     * The isOperator method takes a string as parameter and checks if it's an operator.
     * @param token The input from the user.
     * @return return true if it's an operator, false otherwise.
     */
    private boolean isOperator (String token) {
        try {
            Double.parseDouble(token);
            return false;
        } catch (NumberFormatException ex) {
            return true;
        }
    }

    /**
     * The evaluateOperator executes the calculation.
     * @param operation The operator.
     * @param op1 The first operand.
     * @param op2 The second operand.
     * @return The result.
     */
    private double evaluateOperator (char operation, double op1, double op2) {
        double result = 0;
        switch (operation) {
            case '+':
                result = op1 + op2;
                break;
            case '-':
                result = op1 - op2;
                break;
            case '*':
                result = op1 * op2;
                break;
            case '/':
                result = op1 / op2;
                break;
            case '%':
                result = op1 % op2;
                break;
            default: // Throws an exception if the operator is different from above stated ones.
                throw new IllegalArgumentException("Unknown operator: " + operation);
        }
        return result;
    }
}
