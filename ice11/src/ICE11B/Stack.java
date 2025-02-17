/*
 * Mike McKee
 * CPSC 5002, Seattle University
 * This is free and unencumbered software released into the public domain.
 */
package ICE11B;

/**
 * The Stack class holds the major functionality for the creation of a generic
 * stack which can hold any identified type of object.
 * @author Mike McKee
 */
public class Stack<E> {

    /**
     * The Node class holds the functionality of storing values to a node and
     * linking nodes to one another.
     * @author Mike McKee
     */
    private class Node {
        
        /**
         * Stores value for a node.
         */
        public E payload;

        /**
         * Stores reference node to link.
         */
        public Node next;

        /**
         * The constructor takes in a value and assigns it a null node link.
         * @param payload Value to be added to a node
         * @param next Reference node to link
         */
        public Node(E payload, Node next) {
            this.payload = payload;
            this.next = next;
        }
    }

    private Node top; // Top of the stack

    /**
     * The constructor creates a fresh linked list stack with no entries.
     */
    public Stack() {
        top = null;
    }

    /**
     * The push method adds a new item to the top of the stack.
     * @param val item to add to the stack
     */
    public void push(E val) {
        top = new Node(val, top);
    }

    /**
     * The pop method returns and removes the top value of the stack.
     * @return item from top of stack
     * @exception IllegalArgumentException If the stack is empty
     */
    public E pop() {
        if (empty())
            throw new IllegalArgumentException("Error! The stack is empty.");
        else {
            E returnValue = top.payload;
            top = top.next;
            return returnValue;
        }
    }

    /**
     * The empty method checks for an empty stack.
     * @return true if stack is empty, else false
     */
    public boolean empty() {
        return top == null;
    }

    /**
     * The peek method returns the top value of the stack.
     * @return value of item sitting at the top of stack
     * @exception IllegalArgumentException If the stack is empty
     */
    public E peek() {
        if (empty())
            throw new IllegalArgumentException("Error! The stack is empty.");
        else
            return top.payload;
    }
    
    /**
     * The copy method takes the values of a Stack instance, creates a
     * deep copy of them and pushes them into another Stack instance. Returns
     * an empty stack if the original stack was empty.
     * @return a Stack copied with the values of another Stack
     */
    public Stack copy() {
        Stack<E> copiedStack = new Stack<>(); // Deep copy of object
        Stack<E> temp = new Stack (); // Temp copy to maintain item order
        Node q = top;
        
        while (q != null) {
            temp.push(q.payload);
            q = q.next;
        }
        
        // Transfers payload over in correct order to be returned
        while (!temp.empty()) {
            copiedStack.push(temp.pop());
        }
        return copiedStack;
    }

    /**
     * The toString method takes values of a Stack instance and copies them to
     * a single string which it then returns.
     * @return a string of the values contained within queue
     */
    public String toString() {
        StringBuilder strbldr = new StringBuilder();
        Node p = top; // Copy of instance stack

        while (p != null) {
            strbldr.append(p.payload + " ");
            p = p.next;
        }
        return strbldr.toString();
    }

    /**
     * The equals method checks to see if a given Stack instance contains
     * the same payload data as the current Stack instance.
     * @param stack Stack instance to compare to
     * @return true if the same, else false
     */
    public boolean equals(Stack stack) {
        Stack<E> stack1 = stack.copy();
        Stack<E> stack2 = this.copy();
        
        while (!stack1.empty()) {
            if (stack2.empty())
                return false;
            else {
                E val1 = stack1.pop();
                E val2 = stack2.pop();
                if (!val1.equals(val2))
                    return false;
            }
        }
        
        return true;
    }
}
