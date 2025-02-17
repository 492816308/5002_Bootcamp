package xwang10_lab7;

import java.util.EmptyStackException;

/**
 * The RenderQueue class implements a queue based on doubly linked lists' operations.
 * @author Xiaoyu Wang
 * @version 1.0
 */
public class RenderQueue {
    private class Node {
        RenderCommand value; // The value of a RenderCommand object
        Node next;
        Node prev;

        Node(RenderCommand val, Node n, Node p) {
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
    public void enqueue(RenderCommand s)
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
     * @return true if the the queue is empty.
     */
    public boolean empty() {
        return head == null;
    }

    /**
     * The dequeue method removes and returns the item at the front of the queue.
     * @return item at the front of the queue.
     * @exception EmptyStackException When the queue is empty.
     */
    public RenderCommand dequeue() {
        if(empty())
            throw new EmptyStackException();
        else {
            RenderCommand c = head.value;
            head = head.next;
            if (head == null) {
                tail = null;
            }
            return c;
        }
    }

    /**
     * The copy method copys the queue and return to a new one.
     * @return The new queue copied.
     */
    public RenderQueue copy() {
        RenderQueue copyQueue = new RenderQueue();
        Node copyHead = new Node(head.value, head.next, head.prev);
        while (copyHead != null) {
            copyQueue.enqueue(copyHead.value);
            copyHead = copyHead.next;
        }
        return copyQueue;
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

    /**
     * The fromString method takes a String element as parameter and translate it.
     * @param s The item to be translated.
     * @return The RenderQueue object after translation.
     */
    public static RenderQueue fromString(String s) {
        RenderQueue queue = new RenderQueue();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            switch (c) {
                case 'F':
                    queue.enqueue(RenderCommand.FORWARD);
                    break;
                case 'R':
                    queue.enqueue(RenderCommand.FORWARD2);
                    break;
                case 'X':
                    queue.enqueue(RenderCommand.IGNORE);
                    break;
                case '-':
                    queue.enqueue(RenderCommand.RIGHT);
                    break;
                case '+':
                    queue.enqueue(RenderCommand.LEFT);
                    break;
                case '[':
                    queue.enqueue(RenderCommand.PUSH);
                    break;
                case ']':
                    queue.enqueue(RenderCommand.POP);
                    break;
            }
        }
        return queue;
    }

    /**
     * The append method copies the elements from that queue onto the end of itself.
     * @param s The object to be appended.
     */
    public void append(RenderQueue s) {
        Node p = s.head;
        while (p != null) {
            this.enqueue(p.value);
            p = p.next;
        }
    }
}
