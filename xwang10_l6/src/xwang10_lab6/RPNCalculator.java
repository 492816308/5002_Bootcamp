package xwang10_lab6;

import java.util.Scanner;

/**
 * This program simulates the RPN calculator. It takes inputs from the user and checks them,
 * display the output to the console, using the stack concept based on linked list.
 * @author Xiaoyu Wang
 * @version 1.0
 */
public class RPNCalculator {
    /**
     * The main method prompt user for inputs and call objects from other class.
     * It displays the output message after that.
     * @param args A string array containing the command line arguments.
     */
    public static void main(String[] args) {
        String input = "";
        double result;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("RPN Calculator\n\n(blank line to quit)");
        do {
            System.out.print("calc> ");
            input = keyboard.nextLine();
            if(!input.equals("")) {
                // Create a RPN object and pass the input into it as argument.
                RPN evaluator = new RPN(input);
                result = evaluator.evaluate();
                System.out.println(result);
            }
        } while (!input.equals(""));
        keyboard.close(); // Close the keyboard.
        System.out.println("\nBye!");
    }
}
