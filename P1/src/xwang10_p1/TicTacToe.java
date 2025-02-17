package xwang10_p1;

import java.util.Scanner;

/**
 * The TicTacToe class allows player to select a location to mark, to play the game.
 * It will end once the player has filled one row or one column or one full diagonal
 * or if all the spaces have been filled.
 */
public class TicTacToe {
    private final String player;
    private int countWin;
    private final Scanner keyboard = new Scanner(System.in);
    private boolean hasWon;
    private String[][] board;

    /**
     * getPlayer method
     * @return player
     */
    public String getPlayer() {
        return player;
    }

    /**
     * Constructor initializes all variables, pass in the player.
     *
     * @param player The player.
     */
    public TicTacToe(String player) {
        this.player = player;
        countWin = 0;
        hasWon = false;
    }

    /**
     * getHasWon method
     * @return hasWon
     */
    public boolean getHasWon() {
        return hasWon;
    }

    /**
     * getCountWin method
     * @return countWin
     */
    public int getCountWin() {
        return countWin;
    }

    /**
     * resetGame method reset the board.
     * @param board The board
     */
    public void resetGame(String[][] board) {
        this.board = board;
        this.hasWon = false;
    }

    /**
     * printBoard method prints out the board.
     */
    public void printBoard() {
        //Print out the first line header
        System.out.println("\n    0  1  2");
        for (int i = 0; i < board.length; i++) {
            System.out.print("  " + i);
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] != null) {
                    System.out.print(board[i][j] + "|");
                } else {
                    System.out.print("  |");
                }
            }
            System.out.println();
            System.out.println("   ---------");
        }
    }

    /**
     * playOnce method allows each player to play once.
     */
    public void playOnce() {
        System.out.println(player + ", it's your turn.");
        System.out.print("Which row? ");
        int r = keyboard.nextInt();
        System.out.print("Which column? ");
        int c = keyboard.nextInt();
        while (r < 0 || c < 0 || r >= board.length || c >= board.length ||
               board[r][c] != null) {
            System.out.println("Bad location, try again...");
            System.out.print("Which row? ");
            r = keyboard.nextInt();
            System.out.print("Which column? ");
            c = keyboard.nextInt();
        }
        // Mark the location according player's choice.
        board[r][c] = player;
        // Print out the board after each round.
        printBoard();
        // If any player has won
        hasWon = hasPlayerWon();
    }

    /**
     * hasPlayer method checks if a player has won.
     * @return Player has won or not.
     */
    public boolean hasPlayerWon() {
        // Check if a player has filled one row
        for (int row = 0; row < board.length; row++) {
            // Assume the player has filled one row
            boolean hasWinningRow = true;
            for (int col = 0; col < board[row].length; col++) {
                // return false if one row is not filled
                if (!player.equals(board[row][col])) {
                    hasWinningRow = false;
                }
            }
            // return true if a winning row has found and count the number of wins
            if (hasWinningRow) {
                countWin++;
                return true;
            }
        }
        // Check if a player has filled one column
        for (int col = 0; col < board[0].length; col++) {
            // Assume the player has filled one column
            boolean hasWinningCol = true;
            for (int row = 0; row < board.length; row++) {
                // return false if one column is not filled
                if (!player.equals(board[row][col])) {
                    hasWinningCol = false;
                }
            }
            // return true if a winning column has found and count the number of wins
            if (hasWinningCol) {
                countWin++;
                return true;
            }
        }
        // Check if a player has filled the first diagonal
        boolean hasWinningDiagonal = true;
        for (int row = 0; row < board.length; row++) {
            if (!player.equals(board[row][row])) {
                hasWinningDiagonal = false;
            }
        }
        if (hasWinningDiagonal) {
            countWin++;
            return true;
        }
        // Check if a player has filled the second diagonal
        boolean hasWinningSecondDiagonal = true;
        for (int row = 0; row < board.length; row++) {
            if (!player.equals(board[row][board.length - row - 1])) {
                hasWinningSecondDiagonal = false;
            }
        }
        if (hasWinningSecondDiagonal) {
            countWin++;
            return true;
        }
        return false;
    }
}
