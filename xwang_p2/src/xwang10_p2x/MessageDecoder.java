package xwang10_p2x;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * The MessageDecoder class reads a file and implements the content into a linked list.
 */
public class MessageDecoder {
    public Node head; // Reference to the first node in the list
    /**
     * The Node class represents a list node
     * and a reference to the next node.
     */
    public class Node {
        int value;
        String message;
        Node next;

        /**
         * Constructor.
         *
         * @param message The message to store in this node.
         * @param value The number to store in this node.
         */
        public Node(String message, int value) {
            this.value = value;
            this.message = message;
            next = null;
        }
    }

    /**
     * Constructor
     * Build a linkedlist.
     */
    public MessageDecoder() {
        head = null;
    }

    /**
     * The isEmpty method checks to see if the list is empty.
     * @return true if list is empty, false otherwise.
     */
    public boolean isEmpty() {
        return head == null;
    }

    /**
     * The scanFile method scans a file and call the insert method.
     * @param fname The file name to scan.
     * @throws IOException
     */
    public void scanFile(String fname) throws IOException {
        File file = new File(fname);
        Scanner scanner = new Scanner(file);
        // Read the file content and store them into a String array.
        while (scanner.hasNext()) {
            String line = scanner.nextLine();
            String[] tokens = line.split(" ");
            if (tokens.length == 3) {
                // Call insert method and insert them in ascending order.
                insert(" ", Integer.parseInt(tokens[2]));
            } else {
                insert(tokens[0], Integer.parseInt(tokens[1]));
            }
        }
    }

    /**
     * The insert method adds an element to the list in ascending order.
     * @param e The element to add to the list.
     * @param val the numbers to decide the position of the elements.
     */
    public void insert(String e, int val) {
        // Create a newNode object
        Node newNode = new Node(e, val);
        // If the Linked list is empty or the first value is greater than val, insert val before the first
        if (isEmpty() || head.value > val) {
            newNode.next = head;
            head = newNode;
        } else {
            Node current = head;
            // Loop until the node's value is greater than val, then insert it before that node
            while (current.next != null && current.next.value < val) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
        }
    }

    public void merge(Node first, Node second) {
        while (first.next != null && second.next != null) {

        }
    }

    /**
     * The gePlainMessage method computes the string representation of the list.
     * @return The string form of the list.
     */
    public String getPlainMessage() {
        StringBuilder str = new StringBuilder();
        Node ref = head;
        while (ref != null) {
            str.append(ref.message);
            ref = ref.next;
        }
        return str.toString();
    }
}
