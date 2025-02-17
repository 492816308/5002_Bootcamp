package xwang10_p2x;

import xwang10_p2.MessageDecoder;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * This program reads an encoded message from two files supplied by the user and
 * displays the merged contents of the message before it was encoded.
 *
 * @author: Xiaoyu Wang
 * @version: 1.o
 */
public class SecretMessage {
    /**
     * The main method takes in user input from the keyboard and prints message to console.
     * @param args A string array containing the command line arguments.
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        String answer;
        String fileName2 = "";
        Scanner keyboard = new Scanner(System.in); // Scanner object to get message from keyboard.
        // Display Introduction
        displayIntro();
        do {
            System.out.print("Enter secret file name: ");
            String fileName = keyboard.nextLine();
            // Check if the file exists
            boolean valid = isValidFile(fileName);
            String input = "";
            if (valid) {
                do {
                    System.out.print("Enter another secret file name 2 (or blank): ");
                    input = keyboard.nextLine();
                    if(!input.equals("")) {
                        fileName2 = input;
                    }
                } while (!input.equals(""));

                // Create a MessageDecoder object
                MessageDecoder messageDecoder = new MessageDecoder();
                // Call scanFile method
                messageDecoder.scanFile(fileName);
                // Display contents
                String file1Message = messageDecoder.getPlainMessage();

                if (isValidFile(fileName2)) {
                    // Create another MessageDecoder object
                    MessageDecoder messageDecoder2 = new MessageDecoder();
                    messageDecoder2.scanFile(fileName2);
                    String file2Message = messageDecoder2.getPlainMessage();

                    // Create a new object
                    MessageDecoder myCombineDecoder = new MessageDecoder();
                    // Separate the elements in each linked list
                    String[] words = file1Message.split(" ");
                    for(int i= 0 ; i< words.length; i++) {
                        myCombineDecoder.insert(words[i] + " ", i*2);
                    }
                    String[] words2 = file2Message.split(" ");
                    for(int i= 0 ; i< words2.length; i++) {
                        myCombineDecoder.insert(words2[i] + " ", i*2+1);
                    }
                    System.out.println("Decoded " + myCombineDecoder.getPlainMessage());
                }

            }
            // Ask whether the user wants to try again
            System.out.print("\nWould you like to try again? (no to exit): ");
            answer = keyboard.nextLine();
        } while(!answer.equalsIgnoreCase("no"));
        // Display goodbye
        displayGoodbye();
        keyboard.close();
    }

    /**
     * The displayIntro method displays an introduction.
     */
    public static void displayIntro() {
        System.out.println("Welcome to the Secret Messages!\n" +
                           "This program reads an encoded message from a file supplied by the user and\n" +
                           "displays the contents of the message before it was encoded.\n");
    }

    /**
     * The isValidFile checks if the file exists.
     * @param fname The file name.
     * @return The file exists or not.
     */
    public static boolean isValidFile(String fname) {
        File path = new File(fname);
        boolean isValid = path.exists() && !path.isDirectory();
        if (!isValid) {
            System.out.println("The file " + fname + " does not exist.");
        }
        return isValid;
    }

    /**
     * The displayGoodbye method displays a goodbye message.
     */
    public static void displayGoodbye() {
        System.out.println("\nThank you for using the message decoder. Goodbye!");
    }
}
