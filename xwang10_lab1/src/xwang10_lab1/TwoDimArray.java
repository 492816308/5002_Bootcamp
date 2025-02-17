package xwang10_lab1;

import java.util.Scanner;
import java.util.Random;
/**
 * This program asks for the size of a 2d square array of integers, then creates
 * the square array, fills it with random numbers, then prints it out along with
 * sums in both direction and along the diagonals.
 *
 * author: Xiaoyu Wang
 * version: 1.0
 */
public class TwoDimArray {
    /**
     * The main method displays the message to standard output.
     *
     * @param args A string array containing the command line arguments.
     */
    public static void main(String[] args) {
        int size; // To hold the array's size from the user
        final int MAX_SIZE = 10; // Maximum of array's size
        final int MIN_SIZE = 1; // Minimum of array's size
        int primaryDiagonal, secondaryDiagonal;
        char again; // Control the repetition of the game

        // Call the displayIntro method
        displayIntro();
        Scanner keyboard = new Scanner(System.in);
        do {
            do {
                // Call the getSize method
                size = getSize();

            } while (size < MIN_SIZE || size > MAX_SIZE);
            int[][] twoDArray = createArray(size);
            // Display all the elements in the array
            for (int row = 0; row < size; row++) {
                System.out.print("\n     ");

                for (int col = 0; col < size; col++) {
                    System.out.printf("%4d", twoDArray[row][col]);
                }
                // Call the rowSum method
                int[] rowSum = rowSum(twoDArray);
                // Print out the sum of each row at the end of each row
                System.out.printf(" =%5d", rowSum[row]);
            }
            System.out.println();
            // Call the secondaryDiagonal method
            secondaryDiagonal = sDiagonalSum(twoDArray, size);
            // Print out the result
            System.out.printf("%5d", secondaryDiagonal);
            // Call the colSum method
            int[] colSum = colSum(twoDArray);
            // Print out the sum of each column
            for (int i = 0; i < colSum.length; i++) {
                System.out.printf("%4d", colSum[i]);
            }
            // Call the primaryDiagonal method
            primaryDiagonal = pDiagonalSum(twoDArray, size);
            // Print out the result
            System.out.printf("%7d\n", primaryDiagonal);

            // Ask the user whether to repeat the program
            System.out.print("\nGo again (y/n)? ");
            again = keyboard.nextLine().charAt(0);
        } while (again == 'y' || again == 'Y');
        // Call the displayGoobye method
        displayGoobye();
        // Close the keyboard
        keyboard.close();
    }

    /**
     * The displayIntro method prints out the welcome message to the user.
     */
    public static void displayIntro() {
        System.out.println("""
                This program asks for the size of a 2d square array of integers, then creates
                the square array, fills it with random numbers, then prints it out along with
                sums in both direction and along the diagonals.
                """);
    }

    /**
     * The getSize method prompts user for the size of the 2d array
     *
     * @return size The size of the 2d array
     */
    public static int getSize() {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("How many rows (something between 1 and 10)? ");
        int i = keyboard.nextInt();
        return i;
    }

    /**
     * The createArray method uses the Random object to create a 2d array with random integers.
     *
     * @param size The size of the 2d array.
     */
    public static int[][] createArray(int size) {
        Random rand = new Random();
        int[][] array = new int[size][size];
        final int MAX = 100;
        final int MIN = 1;
        // Create the 2d array with random integers between 1 and 100.
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                array[row][col] = rand.nextInt(MAX - MIN + 1) + MIN;
            }
        }
        return array;
    }

    /**
     * The rowSum method calculates the sum of each row from the 2d array.
     * @param array The reference to the 2d array.
     * @return sum The total of each row.
     */
    public static int[] rowSum(int[][] array) {
        int[] sum = new int[array.length];
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                sum[row] += array[row][col];
            }
        }
        return sum;
    }

    /**
     * The sDiagonalSum method
     * @param array The reference to the 2d array.
     * @param size The size of the 2d array.
     * @return sum The sum of secondary diagonal.
     */
    public static int sDiagonalSum(int[][] array, int size) {
        int sum = 0;
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                // Condition for the secondary diagonal
                if ((row + col) == (size - 1)) {
                    sum += array[row][col];
                }
            }
        }
        return sum;
    }

    /**
     * The colSum method calculates the sum of each column from the 2d array.
     * @param array The reference to the 2d array.
     * @return sum The total of each column.
     */
    public static int[] colSum(int[][] array) {
        int[] sum = new int[array.length];
        for (int col = 0; col < array[0].length; col++) {
            for (int row = 0; row < array.length; row++) {
                sum[col] += array[row][col];
            }
        }
        return sum;
    }

    /**
     * The pDiagonalSum method
     * @param array The reference to the 2d array.
     * @param size The size of the 2d array.
     * @return sum The sum of primary diagonal.
     */
    public static int pDiagonalSum(int[][] array, int size) {
        int sum = 0;
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                // Condition for the primary diagonal
                if (row == col) {
                    sum += array[row][col];
                }
            }
        }
        return sum;
    }

    /**
     * The displayGoodbye method prints out the goodbye message
     */
    public static void displayGoobye() {
        System.out.println("\nThanks for playing xwang10_lab1.TwoDimArray!");
    }
}