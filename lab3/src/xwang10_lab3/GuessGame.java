package xwang10_lab3;

import java.util.Random;

/**
 * The GuessGame class allows you to guess an integer and tells you whether the number
 * is too high or too low.
 * It also counts the number of guesses.
 */
public class GuessGame {
    private final Random random; // Random object
    private final int min; // The low end of the target's range
    private final int max; // The high end of the target's range

    private int totalGuess; // Number of guesses
    private int target; // Integer that randomly created

    /**
     * Constructor initializes all variables, pass in the range for choosing target integers.
     * @param minimum The low end of the target's range
     * @param maximum  The high end of the target's range
     */
    public GuessGame(int minimum, int maximum) {
        random = new Random();
        totalGuess = 0;
        min = minimum;
        max = maximum;
        target = random.nextInt(max - min) + min;
    }

    /**
     * The displayStatistics method counts the number of guesses and displays it.
     */
    public void displayStatistics() {
        System.out.println("You guessed " + totalGuess + " times.");
    }

    /**
     * The newTarget method creates a random integer as the target.
     */
    public void newTarget() {
        target = random.nextInt(getRangeMaximum() - getRangeMinimum()) + getRangeMinimum();
    }

    /**
     * The guess method processes the user's guess, returns false if number is incorrect;
     * otherwise, returns true.
     * @param num The number guessed by the user.
     * @return True of false.
     */
    public boolean guess(int num) {
        totalGuess++;
        if (num != target) {
            displayHint(num);
            return false;
        }
        else {
            return true;
        }
    }

    /**
     * The displayHint method displays whether the guess was too high or too low.
     * @param num The number guessed by the user.
     */
    private void displayHint(int num) {
        if (num < target) {
            System.out.println(num + " is too low.");
        }
        else if (num > target) {
            System.out.println(num + " is too high.");
        }
    }

    /**
     * getRangeMinimum method
     * @return The low end of the range used by the newTarget.
     */
    public int getRangeMinimum() {
        return min;
    }

    /**
     * getRangeMaximum method
     * @return The high end of the range used by the newTarget.
     */
    public int getRangeMaximum() {
        return max;
    }
}
