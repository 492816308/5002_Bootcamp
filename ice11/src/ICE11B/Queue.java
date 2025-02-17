/*
 * Mike McKee
 * CPSC 5002, Seattle University
 * This is free and unencumbered software released into the public domain.
 */
package ICE11B;

/**
 * The Queue class holds the major functionality for creating a generic queue
 * which can hold any identified type of object.
 * @author Mike McKee
 */
public class Queue<E> {

    /**
     * The Node class holds the functionality of storing values to a node and
     * linking nodes bi-directionally to one another.
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
         * Stores previous reference node to link.
         */
        @SuppressWarnings("unused")
        public Node prev;

        /**
         * The constructor takes in a value and assigns it null node links.
         * @param payload Value to be added to a node
         * @param next Reference node to link (next node)
         * @param prev Reference node to link (previous node)
         */
        public Node(E payload, Node next, Node prev) {
            this.payload = payload;
            this.next = next;
            this.prev = prev;
        }
    }

    private Node head; // Front of the queue
    private Node tail; // Back of the queue

    /**
     * Constructor which sets the queue head and tail to null.
     */
    public Queue() {
        head = null;
        tail = null;
    }

    /**
     * The enqueue method takes a value and adds it to the tail of the queue.
     * If the queue is empty, the object is added as the queue's head (and thus
     * also its tail).
     * @param direction value to add to the queue
     */
    public void enqueue(E direction) {
        if (empty()) {
            tail = new Node (direction, null, null);
            head = tail;
        } else {
            tail.next = new Node (direction, null, tail);
            tail = tail.next;
        }
    }

    /**
     * The dequeue method removes a value from the head of the queue and sets
     * the queue's head value to the next object in line.
     * @return value from the head of the queue
     * @throws IllegalArgumentException thrown in the event of an empty queue
     */
    public E dequeue() {
        if (empty())
            throw new IllegalArgumentException("Error! Empty queue!");
        else {
            E returnVal = head.payload;
            if (head.next != null) {
                head = head.next;
                head.prev = null;
            } else {
                head = null;
            }
            return returnVal;
        }
    }

    /**
     * The peek method reveals - but does not remove - what the value at the
     * head of the queue is.
     * @return value of an object from the head of the queue
     * @throws IllegalArgumentException thrown in the event of an empty queue
     */
    public E peek() {
        if (empty())
            throw new IllegalArgumentException("Error! Empty queue!");
        else
            return head.payload;
    }

    /**
     * The empty method returns whether a queue is empty or not.
     * @return true if empty, else false
     */
    public boolean empty() {
        return head == null;
    }

    /**
     * The copy method takes the queue values of a Queue instance, creates a
     * deep copy of them and enqueues them into another Queue instance. Returns
     * an empty queue if the original queue was empty.
     * @return a Queue copied with the values of another Queue
     */
    public Queue<E> copy() {
        // TODO (DeepCopy)
        Queue<E> copiedQueue = new Queue<>();
        Queue<E> tmpQueue = new Queue<>();
        Node p = head;
        while (p != null) {
            tmpQueue.enqueue(p.payload);
            p = p.next;
        }
        return copiedQueue;
    }

    public Queue<E> reverseQueue() {
        Queue<E> revQueue = new Queue<>();
        Stack<E> tempStack = new Stack<>();
        Node p = head;
        while (p != null) {
            tempStack.push(p.payload);
            p = p.next;
        }
        while (!tempStack.empty()) {
            revQueue.enqueue(tempStack.pop());
        }
        return revQueue;
    }

    /**
     * The toString method takes values of a Queue instance and copies them to
     * a single string which it then returns.
     * @return a string of the values contained within queue
     */
    public String toString() {
        StringBuilder strbldr = new StringBuilder();
        Node p = head; // Copy of instance queue

        while (p != null) {
            strbldr.append(p.payload + " ");
            p = p.next;
        }
        return strbldr.toString();
    }

    /**
     * The append method takes any values contained within one Queue instance
     * and appends them to the tail of another instance.
     * @param addQueue queue to be added to another queue's tail
     */
    public void append(Queue<E> addQueue) {
        // TODO

    }

    /**
     * The equals method checks to see if a given Queue instance contains
     * the same payload data as the current Queue instance.
     * @param queue Queue instance to compare to
     * @return true if the same, else false
     */
    public boolean equals(Queue queue) {
        return queue == this;
    }
}
