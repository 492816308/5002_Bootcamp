package xwang10_lab8;

import java.util.EmptyStackException;

/**
 * The Queue class implements a queue based on doubly linked lists' operations.
 * @author Xiaoyu Wang
 * @version 1.0
 */
public class Queue<T> {
    private class Node {
        T value; // The value of a RenderCommand object
        Node next;
        Node prev;

        Node(T val, Node n, Node p) {
            value = val;
            next = n;
            prev = p;
        }
    }
    private Node head = null;
    private Node tail = null;

    /**
     * The enqueue method adds a value to a queue.
     * @param s The value to be added.
     */
    public void enqueue(T s)
    {
        if (tail != null)
        {
            // The node with the value s will be add the end of the list.
            tail.next = new Node(s, null, tail);
            tail = tail.next;
        }
        else
        {
            tail = new Node(s, null, null);
            head = tail;
        }
    }

    /**
     * The empty method checks if the queue is empty.
     * @return true if the queue is empty.
     */
    public boolean empty() {
        return head == null;
    }

    /**
     * The dequeue method removes and returns the item at the front of the queue.
     * @return item at the front of the queue.
     * @exception EmptyStackException When the queue is empty.
     */
    public T dequeue() {
        if(empty())
            throw new EmptyStackException();
        else {
            T c = head.value;
            head = head.next;
            if (head == null) {
                tail = null;
            }
            return c;
        }
    }

    public T peek() {
        if (empty()) {
            throw new EmptyStackException();
        }
        else
            return head.value;
    }


    /**
     * The toString method concatenates all strings in the queue to give a string representation
     * of the contents of the queue.
     * @return string representation of this queue.
     */
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node p = head;
        while (p != null) {
            sb.append(p.value);
            p = p.next;
        }
        return sb.toString();
    }

}
