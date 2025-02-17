package xwang10_lab8;

/**
 * This program tests the Stack and Queue generic classes.
 * @author Xiaoyu Wang
 * @version 1.0
 */
public class Lab8 {
    /**
     * The main method display message to standard output.
     * @param args A string array containing the command line arguments.
     */
    public static void main(String[] args) {
        // Test String stack
        Stack<String> stringStack = new Stack<>(); // Test constructor
        System.out.println("Pushing 2 strings onto stack...");
        stringStack.push("This is a test "); // Test push method
        stringStack.push("for generic stack. ");
        System.out.println("Testing toString: " + stringStack); // Test toString method
        System.out.println(stringStack.peek()); // Test peek method
        stringStack.pop(); // Test pop method
        System.out.println(stringStack); // Test pop method
        System.out.println("Testing empty(): (false) "
                           + stringStack.empty()); // Test empty method


        // Test Double stack
        Stack<Double> doubleStack = new Stack<>(); // Test constructor
        System.out.println("Pushing 2 doubles onto stack...");
        doubleStack.push(1.1); // Test push method
        doubleStack.push(2.2);
        System.out.println("Testing toString: " + doubleStack); // Test toString method
        System.out.println(doubleStack.peek()); // Test peek method
        doubleStack.pop(); // Test pop method
        System.out.println(doubleStack);
        System.out.println("Testing empty(): (false) "
                           + stringStack.empty()); // Test empty method


        // Test queue of String
        Queue<String> stringQueue = new Queue<>();
        System.out.println("Pushing 2 strings onto queue...");
        stringQueue.enqueue("This is a test ");
        stringQueue.enqueue("for generic queue. ");
        System.out.println("Testing toString: " + stringQueue);
        System.out.println(stringQueue.peek());
        System.out.println(stringQueue.dequeue());
        System.out.println("Testing empty(): (false) "
                           + stringQueue.empty());

        // Test queue of double
        Queue<Double> doubleQueue = new Queue<>();
        System.out.println("Pushing 2 doubles onto queue...");
        doubleQueue.enqueue(3.3);
        doubleQueue.enqueue(4.4);
        System.out.println("Testing toString: " + doubleQueue);
        System.out.println(doubleQueue.peek());
        System.out.println(doubleQueue.dequeue());
        System.out.println("Testing empty(): (false) "
                           + stringQueue.empty());
    }
}
