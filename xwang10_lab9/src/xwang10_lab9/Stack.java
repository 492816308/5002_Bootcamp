package xwang10_lab9;

import java.util.EmptyStackException;

/**
 * The Stack class is based on Linked list, executes stack operations.
 */
public class Stack<T> {
    /**
     * The Node class is used to implement the linked list.
     */
    private class Node {
        T value;
        Node next;

        Node(T value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    private Node top = null;

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
    public boolean empty() {
        return top == null;
    }

    /**
     * The push method adds a new item to the stack.
     *
     * @param value The item to be pushed onto the stack.
     */
    public void push(T value) {
        top = new Node(value, top);
    }

    /**
     * The pop method removes the value at the top of th stack.
     *
     * @return The value at the top of the stack.
     * @throws EmptyStackException When the stack is empty.
     */
    public T pop() {
        if (empty())
            throw new EmptyStackException();
        else {
            T retValue = top.value;
            top = top.next;
            return retValue;
        }
    }

    /**
     * The peek method returns the top value on the stack.
     * @return The value at the top of the stack.
     * @exception EmptyStackException When the stack is empty.
     */
    public T peek() {
        if (empty())
            throw new EmptyStackException();
        else
            return top.value;
    }

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
