package xwang10_lab3;

import java.util.Scanner;

/**
 * The lab3 is a guessing game, allowing users to guess a number between certain range,
 * and it tells the user whether the guess is too high, too low, or correct.
 * The number of guessed will be displayed at the end of each game.
 * It allows the user to play repeatedly.
 *
 * author: Xiaoyu Wang
 * version: 1.0
 */
public class lab3 {
    /**
     * The main method displays message to standard output.
     * @param args A string array containing the command line arguments.
     */
    public static void main(String[] args) {
        int guessNum; // The number that user guesses
        final int MAX_INT = 2000; // High end of the range for the target
        final int MIN_INT = 1000; // Low end of the range for the target
        int guessCount; // The number of guesses
        boolean guessFound = false; // To control when to find the target
        String again; // To control whether to repeat the game
        Scanner sc = new Scanner(System.in);
        displayWelcome();
        do {
            // Create a GuessGame object
            GuessGame game = new GuessGame(MIN_INT, MAX_INT);
            // Get the target number
            game.newTarget();
            do {
                // Prompt the user for a guess
                System.out.print("Guess a number between " + MIN_INT + " and " + MAX_INT + ": ");
                guessNum = sc.nextInt();
            } while (guessNum < MIN_INT || guessNum > MAX_INT); // Validates the guessed number
                                                                // is within given range
            // Processes the user's guess and displays hints
            guessFound = game.guess(guessNum);
            while (!guessFound) {
                System.out.print("Guess a number between " + MIN_INT + " and " + MAX_INT + ": ");
                guessNum = sc.nextInt();
                guessFound = game.guess(guessNum);
                if (guessFound) {
                    //guessFound = true;
                    System.out.println("That's correct!");
                }
           }
           // Display number of guesses
           game.displayStatistics();
           // Consume the remaining new line.
           sc.nextLine();
           // Ask whether the user wants to repeat
           System.out.print("\nReady to play again? (no to quit): ");
           again = sc.nextLine();
        } while (!again.equalsIgnoreCase("no"));
        // Close the Scanner object.
        sc.close();
        // Display goodbye message.
        displayGoodbye();
    }

    /**
     * The displayWelcome method displays welcome message to the user.
     */
    public static void displayWelcome() {
        System.out.println("Welcome to the guessing game! You will guess a number\n" +
                           "and I tell you if it is too low or too high.\n");
    }

    /**
     * The displayGoodbye method displays goodbye message.
     */
    public static void displayGoodbye() {
        System.out.println("""
                \nGoodbye! Thanks for playing the guessing game!""");
    }
}
