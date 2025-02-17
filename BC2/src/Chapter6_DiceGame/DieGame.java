package Chapter6_DiceGame;

import java.util.Scanner;

/**
 * The DieGame program plays a die game between the computer and the user.
 * It iterates 10 times, each time the loop iterates, it rolls both dice.
 * The die with the highest values wins. (In case of a tie, there is no winner
 * for that particular roll of dice.) The one with the higher number of wins
 * among the ten-time-roll is the grand winner.
 *
 * author: Xiaoyu Wang
 * version: 1.0
 */
public class DieGame {
    /**
     * The main method
     *
     * @param args A string array containing the command line arguments.
     */
    public static void main(String[] args) {
        final int DIE1_SIDES = 6; // Number of sides for die #1
        final int DIE2_SIDES = 6; // Number of sides for die #2
        final int MAZ_ROUND = 10; // Number of rounds
        char repeat;


        Scanner sc = new Scanner(System.in);
        // Call the displayIntro method
        displayIntro();
        // Roll the dice 10 times.
        do {
            // Create two instances of the Die class.
            Die dieComputer = new Die(DIE1_SIDES);
            Die dieUser = new Die(DIE2_SIDES);
            for (int round = 0; round < MAZ_ROUND; round++) {
                System.out.println("\nRoll " + (round + 1) + " of " + MAZ_ROUND);
                // Computer rolls the dice.
                dieComputer.roll();
                // Display the values of the dice from computer.
                System.out.println("I rolled a " + dieComputer.getValues());
                // User's turn when ready
                rollReady();
                // User rolls the dice.
                dieUser.roll();
                // Display the values of the dice from user.
                System.out.println("You rolled a " + dieUser.getValues());
                // Check result of each roll
                checkValue(dieComputer, dieUser);
            }
            // calculate points and display winner
            calPoints(dieComputer, dieUser);

            // Ask whether the user want to repeat
            System.out.print("Do you want to play again? (y/n) ");
            repeat = sc.nextLine().charAt(0);
        } while (repeat == 'y' || repeat == 'Y');
        // Close the Scanner
        sc.close();
        // Display goodbye message
        displayEnding();
    }
    /**
     * The displayIntro method displays an introduction to the game.
     */
    public static void displayIntro() {
        System.out.println("\nThis is a game of you versus the computer. We will each\n" +
                           "have one die. We roll our own die and the higher number\n" +
                           "wins. We roll ten times and the one with the higher number\n" +
                           "of wins is the grand winner.");
    }

    /**
     * rollReady method let user hit enter when ready.
     */
    public static void rollReady() {
        // Create Scanner object.
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Ready to roll? (Press ENTER when ready) ");
        keyboard.nextLine();
    }

    /**
     * The checkValue method check the result of each round of dice.
     * @param player1 Computer
     * @param player2 User
     */
    public static void checkValue(Die player1, Die player2) {
        final int POINTS_TO_ADD = 1;
        if (player1.getValues() > player2.getValues()) {
            player1.addPoints(POINTS_TO_ADD);
        }
        else if (player2.getValues() > player1.getValues()) {
            player2.addPoints(POINTS_TO_ADD);
        }
    }

    /**
     * The calPoints method calculate how many times each player wins.
     * @param player1 Computer
     * @param player2 User
     */
    public static void calPoints(Die player1, Die player2) {
        // Display how many times the computer wins
        System.out.println("I won " + player1.getPoints() + " times.");
        // Display how many times the user wins
        System.out.println("You won " + player2.getPoints() + " times.");
        // Calculate points and display the winner
        if (player1.getPoints() > player2.getPoints()) {
            System.out.println("Grand winner is me!");
        } else if (player1.getPoints() < player2.getPoints()) {
            System.out.println("You are the Grand winner!");
        } else
            System.out.println("It's a tie!");
    }

    /**
     * The displayEnding method displays the goodbye message.
     */
    public static void displayEnding() {
        System.out.println("Thanks for playing!");
    }
}
