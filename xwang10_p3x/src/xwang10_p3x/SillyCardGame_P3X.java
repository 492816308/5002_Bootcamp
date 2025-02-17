package xwang10_p3x;

import java.util.Scanner;

/**
 * The SillyCardGame class simulates a card game. The cards contain 4 copies of cards
 * with numbers from 1 to 13. The first person th play all the cards in their hand wins.
 * The game allows 2 - 6 players, and it can be played as many times as the user wants.
 *
 * @author Xiaoyu Wang
 * @version 1.0
 */
public class SillyCardGame_P3X {
    /**
     * The main method creates objects from other classes and calls different methods.
     * It displays message to standard output.
     * @param args A string array containing the command line arguments.
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String again; // To hold the String variable to repeat the game.
        int playerNum; // To hold the number of players.
        boolean gameOver;

        // Display welcome message.
        System.out.println("Welcome to the silly card game!");

        do {
            do {
                // Ask the user for the number of players.
                System.out.print("\nHow many players do you want to play?(2-6) ");
                playerNum = keyboard.nextInt();
                keyboard.nextLine(); // To consume the remaining newline.
                if (playerNum < 2 || playerNum > 6) {
                    System.out.println("Invalid number. Please try again.");
                }
            } while (playerNum < 2 || playerNum > 6);

            // Create a GameModel object with players.
            GameModel game = new GameModel(playerNum);
            // Push the top card from the shuffledCards onto the discardedCards.
            game.discardedStack.push(game.popShuffledStack());
            do {
                // Continue to player if the game is not over
                gameOver = playGame(game, playerNum);
            } while (!gameOver);

            System.out.print("\nPlay again? (no to quit) ");
            again = keyboard.nextLine();
        } while(!again.equalsIgnoreCase("no"));
        // Close the keyboard
        keyboard.close();
        // Display goodbye message
        System.out.println("\nThank you for playing silly card game. Goodbye!");
    }

    /**
     * The playGame method plays the game in turns and checks if there's a winner.
     * @param game The GameModel object which plays the game.
     * @param playerNum The number of players.
     * @return True if there's a winner, otherwise false.
     */
    private static boolean playGame(GameModel game, int playerNum) {
        for (int i = 0; i < playerNum; i++) {

            System.out.printf("\n%s's turn, cards:\n", game.getPlayerName(i));
            System.out.println(game.toString(i));
            System.out.printf("Discarded pile card: %s\n", game.peekDiscardedStack());
            // The card to be played by the player
            int cardToPlay = game.dequeueCards(i);
            System.out.printf("Your current card: %s\n", cardToPlay);

            // If the cardToPlay is lower than the card from discardedCards
            if (cardToPlay < game.peekDiscardedStack()) {
                System.out.println("Your card is LOWER, pick up 2 cards.");
                // Push the cardToPlay onto the discardedCards
                game.discardedStack.push(cardToPlay);
                // The player picks up 2 cards from the shuffledCards
                game.enqueueCards(i, game.popShuffledStack());
                game.enqueueCards(i, game.popShuffledStack());
            }
            // If the cardToPlay is equal to the card from discardedCards
            else if (cardToPlay == game.peekDiscardedStack()) {
                System.out.println("Both cards are the same, pick up 1 card.");
                // Push the cardToPlay onto the discardedCards
                game.discardedStack.push(cardToPlay);
                // The player picks up 1 card
                game.enqueueCards(i, game.popShuffledStack());
            }
            // If the cardToPlay is Higher than the card from discardedCards
            else {
                System.out.println("Your card is HIGHER, turn is over.");
                // Push the cardToPlay onto the discardedCards
                game.discardedStack.push(cardToPlay);
            }

            // Check if one player has played all the cards/ if one player has won.
            if (game.playIsEmpty(i)) {
                System.out.println("You have won the game!\n\nThe game has finished.");
                return true;
            }
        }
        return false;
    }
}
