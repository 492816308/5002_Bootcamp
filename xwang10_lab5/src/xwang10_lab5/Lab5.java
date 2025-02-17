package xwang10_lab5;

import java.io.*;
import java.util.Scanner;

/**
 * This program implements an application of sorted linked list with and without duplicates.
 * author: Xiaoyu Wang
 * version: 1.0
 */
public class Lab5 {
    /**
     * The main method displays the message to standard outputs.
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        // Create a LinkedList object to hold the integer read from the file
        LinkedList listObj = new LinkedList();
        // Display introduction to the program
        displayIntro();
        // Call readFile method
        listObj = readFile();
        // Call the removeDuplicates method
        listObj.removeDuplicates();
        // print the sorted linked list
        listObj.toString();
        System.out.println("Linked list contents: " + listObj);
        // Display goodbye message
        displayGoodbye();
    }

    /**
     * The displayIntro method display a brief introduction to this program.
     */
    public static void displayIntro() {
        System.out.println("This program reads the file lab4.dat and inserts the elements\n" +
                           "into a linked list in non-descending order.\n" +
                           "The contents of the linked list are then displayed to the user\n" +
                           "in column form.\n");
    }

    /**
     * The readFile method reads the contents from a file.
     * And insert them into a linked list in non-descending order.
     * @return The sorted Linked list.
     * @throws IOException
     */
    public static LinkedList readFile() throws IOException {
        final String FILENAME = "src/lab4.dat";
        LinkedList list = new LinkedList();

        // Open the File object to read the file content
        File file = new File(FILENAME);
        Scanner reader = new Scanner(file);
        // Read the content till the end
        while (reader.hasNext()) {
            // To hold the integer from the file
            int listNum  = reader.nextInt();
            // Put the integer in the linked list in sorted order
            list.insertInOrder(listNum);
        }
        // Close the reader object
        reader.close();
        return list;
    }

    /**
     * The displayGoodbye method display a goodbye message.
     */
    public static void displayGoodbye() {
        System.out.println("\nGoodbye! Thank you for using the linked list program!");
    }
}