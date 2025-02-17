package xwang10_p1;

import java.util.Scanner;

/**
 * This program simulates the TicTacToe game. It allows 2 players to play the game in a 3 X 3 board.
 * Each player takes turns to play. Once one row or one column or one full diagonal
 * or all the spaces have been filled, the game ends.
 * The scoreboard will be displayed after each game.
 * The players can play the game as many times as they want.
 *
 * author: Xiaoyu Wang
 * version: 1.0
 */
public class P1 {
    /**
     * main method creates TicTacToe objects, calls methods and displays message to standard outputs.
     * @param args command line arguments.
     */
    public static void main(String[] args) {
        char repeat; // Control whether to repeat the program.
        String firstPlayer = " X"; // First player
        String secondPlayer = " O"; // Second player
        final int BOARD_SIZE = 3; // Board size is 3
        int countTie = 0; // Initialize the number of tie game to 0.

        // Create 2 TicTacToe objects
        TicTacToe player1 = new TicTacToe(firstPlayer);
        TicTacToe player2 = new TicTacToe(secondPlayer);

        displayWelcome();

        do {
            // Create a board as a 2D array.
            String[][] board = new String[BOARD_SIZE][BOARD_SIZE];
            // Reset the board after each game for 2 players
            player1.resetGame(board);
            player2.resetGame(board);
            // Display the original board.
            player1.printBoard();

            // If none of the three conditions is met, player1 starts to play.
            while (!player1.getHasWon() && !player2.getHasWon() && !boardIsFull(board)) {
                player1.playOnce();
                // If player1 has not won and the board is not full, player2 starts to play.
                if (!player1.getHasWon() && !boardIsFull(board)) {
                    player2.playOnce();
                }
            }
            // If no one has won and the game board is full, count the number of tie games.
            if (!player1.getHasWon() && !player2.getHasWon() && boardIsFull(board)) {
                countTie++;
            }
            // Display game stats after the winner is found or game is tie.
            displayStatistics(player1, player2, countTie);
            // Ask if play again.
            repeat = playAgain();
        } while (repeat == 'y' || repeat == 'Y');
        displayGoodbye();
    }

    /**
     * The displayWelcome method displays a welcome message.
     */
    public static void displayWelcome() {
        System.out.println("\nWelcome to TicTacToe!\n");
    }

    /**
     * The displayStatistics method displays the number of games the player wins.
     * Or the number of tie games.
     */
    public static void displayStatistics(TicTacToe player1, TicTacToe player2, int countTie) {
        System.out.println("\nGame Stats");
        System.out.printf("%s has won %d games.\n", player1.getPlayer(), player1.getCountWin());
        System.out.printf("%s has won %d games.\n", player2.getPlayer(), player2.getCountWin());
        System.out.printf("There have been %d tie game.\n", countTie);
    }

    /**
     * The playAgain method prompt user for the response to repeat the game.
     * @return The variable to control whether to repeat the gain or not.
     */
    public static char playAgain() {
        char again;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Do you want to play again? (y/n) ");
        again = scanner.next().charAt(0);
        return again;
    }

    /**
     * The boardIsFull method checks if all the spaces are occupied.
     * @param array The board.
     * @return True is the board is full. Otherwise, false.
     */
    public static boolean boardIsFull(String[][] array) {
        for (int r = 0; r < array.length; r++) {
            for (int c = 0; c < array[0].length; c++) {
                if (array[r][c] == null) {
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * The displayGoodbye method prints out a goodbye message.
     */
    public static void displayGoodbye() {
        System.out.println("\nGoodbye! Thank you for playing TicTacToe!\n");
    }
}
