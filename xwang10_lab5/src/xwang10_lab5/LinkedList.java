package xwang10_lab5;

/**
 * The xwang10_lab5.LinkedList class implements a linked list.
 */
public class LinkedList {
    /**
     * The Node class represents a list node
     * and a reference to the next node.
     */
    private class Node {
        int value;
        Node next;

        /**
         * Constructor.
         *
         * @param val The element to store in this node.
         * @param n   The reference to the next node.
         */
        Node(int val, Node n) {
            value = val;
            next = n;
        }

        /**
         * Constructor.
         *
         * @param val The element to store in this node.
         */
        Node(int val) {
            value = val;
            next = null;
        }
    }

    // Reference to the first node in the list
    private Node head;

    /**
     * Constructor
     * Build a linkedlist.
     */
    public LinkedList() {
        head = null;
    }

    /**
     * The insertInOrder method append the number in ascending order.
     * @param val The number to be inserted.
     */
    public void insertInOrder(int val) {
        // Create a newNode object
        Node newNode = new Node(val);
        // If the Linked list is empty or the first value is equal to val, insert val before the first/ as first
        if (head == null || head.value == val) {
            newNode.next = head;
            head = newNode;
        }
        else {
            Node current = head;
            // Loop until the node's value is greater than val, then insert it before that node
            while (current.next != null && current.next.value < val) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
        }
    }

    /**
     * The removeDuplicates method check if there are duplicates in the linked list.
     * If so, keep only one of them.n
     */
    public void removeDuplicates() {
        Node current = head;
        // Check if the adjacent values are the same, if so delete the first one
        while (current != null && current.next != null) {
            if (current.value == current.next.value) {
                current.next = current.next.next;
                current = current.next;
            }
            else { // If they are not the same, check the next two value
                current = current.next;
            }
        }
    }

    /**
     * The toString method computes the string representation of the list.
     * @return The string form of the list.
     */
    public String toString() {
        StringBuilder strBuilder = new StringBuilder();
        Node p = head;
        while (p != null) {
            strBuilder.append(p.value + "\n");
            p = p.next;
        }
        return strBuilder.toString();
    }
}
