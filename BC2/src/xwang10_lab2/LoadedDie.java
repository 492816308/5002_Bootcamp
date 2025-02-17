package xwang10_lab2;
import java.util.Random;
/**
 * The Die class simulates a six-sided die.
 */
public class LoadedDie {
    private int value; // The die's value
    private final Random RAND = new Random(); // Create the Random object
    private final int favoredNum;
    private final int favoredDie;
    private int points;
    /**
     * The constructor performs an initial roll of the die.
     * @param loadedNumber        which number should come up more often
     * @param moreTimesPerHundred how many times per 100 rolls to come up with
     *                            the loaded number (instead of uniform random)
     */
    public LoadedDie(int loadedNumber, int moreTimesPerHundred) {
        favoredDie = loadedNumber;
        favoredNum = moreTimesPerHundred;
        points = 0;
        roll();
    }

    /**
     * The roll method simulates the rolling of the die.
     * It will typically set this die's value to a random value
     * with uniform distribution between 1 and 6. Occasionally,
     * it will return the favored value (with frequency
     * determined by the moreTimesPerHundred argument that was passed
     * to the constructor).
     */
    public void roll() {
        int MAX_NUM = 100;
        int DIE_SIDES = 6;
        // Get a random integer between 0-99 and if the integer is less than 30,
        // Dice will be 6
        if (RAND.nextInt(MAX_NUM) < favoredNum) {
            value = favoredDie;
        }
        // If the integer is greater than 30, get a random integer between 1-6
        else
            value = RAND.nextInt(DIE_SIDES) + 1;
    }

    /**
     * The addPoints method adds a specified number of points to the player's
     * current balance.
     * @param newPoints The points to add.
     */
    public void addPoints(int newPoints) {
        points += newPoints;
    }

    /**
     * getValue method
     * @return The value of the die.
     */
    public int getValues() { return value; }

    /**
     * getPoints method
     * @return The value of the points field.
     */
    public int getPoints() { return points; }
}
