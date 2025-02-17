package xwang10_lab6;

import java.util.EmptyStackException;

/**
 * The Stack class is based on Linked list, executes stack operations.
 */
public class Stack {
    /**
     * The Node class is used to implement the linked list.
     */
    private class Node {
        double value;
        Node next;

        Node(double value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    private Node top = null;
    private int size = 0;

    /**
     * Constructor with no-args.
     */
    public Stack() {
        top = null;
    }

    /**
     * The empty method checks for an empty stack.
     *
     * @return true if stack is empty, false otherwise.
     */
    public boolean isEmpty() {
        return top == null;
    }

    /**
     * The push method adds a new item to the stack.
     *
     * @param value The item to be pushed onto the stack.
     */
    public void push(double value) {
        top = new Node(value, top);
        size++;
    }

    /**
     * The pop method removes the value at the top of th stack.
     *
     * @return The value at the top of the stack.
     * @throws EmptyStackException When the stack is empty.
     */
    public double pop() {
        if (isEmpty())
            throw new EmptyStackException();
        else {
            double retValue = top.value;
            top = top.next;
            size--;
            return retValue;
        }
    }

    /**
     * The peek method returns the top value on the stack.
     * @return The value at the top of the stack.
     * @exception EmptyStackException When the stack is empty.
     */
    public double peek() {
        if (isEmpty())
            throw new EmptyStackException();
        else
            return top.value;
    }

    /**
     * The size method counts the number of elements in the stack.
     * @return The number of elements.
     */
    public int size() {return size;};

    /**
     * The toString method computes a string representation of the contents of the stack.
     * @return The string representation of the stack contents.
     */
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node current = top;
        while (current != null) {
            sb.append(current.value);
            current = current.next;
        }
        return sb.toString();
    }
}
