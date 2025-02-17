/*
 * Mike McKee
 * CPSC 5002, Seattle University 
 * This is free an unencumbered software released into public domain. 
 */
package ICE11B;



/**
 * This program tests the Stack and Queue classes. 
 * @author Mike McKee
 */
public class ICE11Demo
{

    public static void main(String[] args) { 
        //Test String stack
        Stack stack = new Stack();
        int k = 77;
        stack.push(k*k);
        Stack<String> stringStack = new Stack<>();
        System.out.println("A STACK OF STRINGS");
        System.out.println("Testing empty method: (true) " 
                            + stringStack.empty());
        
        System.out.println("Pushing 3 Strings onto stack...");       
        stringStack.push("I love dogs.");
        stringStack.push("Dogs are cute.");
        stringStack.push("Go dogs!");
        
        System.out.println("Testing toString: " + stringStack);
        System.out.println("Testing empty(): (false) " 
                           + stringStack.empty());
        
        //Test queue of Strings
        Queue <String> stringQue = new Queue();
        System.out.println("\nA QUEUE OF STRINGS");
        System.out.println("Testing empty method: (true) " 
                            + stringQue.empty());
        System.out.println("Pushing 3 Strings onto queue...");
        stringQue.enqueue("I");
        stringQue.enqueue("love");
        stringQue.enqueue("dogs");
        System.out.println("(Ilovedogs) " + stringQue); //test toString method
        System.out.println("Reversed: " + stringQue.reverseQueue());

        //Test queue of Integers
        Queue <Integer> intQue = new Queue();
        System.out.println("\nA QUEUE OF Integers");
        System.out.println("Testing empty method: (true) "
                + stringQue.empty());
        System.out.println("Pushing 3 Integers onto queue...");
        intQue.enqueue(1);
        intQue.enqueue(2);
        intQue.enqueue(3);
        System.out.println("(1 23 ) " + intQue); //test toString method

     }
}