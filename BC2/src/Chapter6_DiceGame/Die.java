package Chapter6_DiceGame;
import java.util.Random;
/**
 * The Die class simulates a six-sided die.
 */
public class Die {
    private int sides; // Number of sides
    private int values; // The die's value
    private final Random RAND = new Random();

    private int points;
    /**
     * The constructor performs an initial roll of the die.
     * @param numSides The number o sides for this die.
     */
    public Die(int numSides) {
        sides = numSides;
        points = 0;
        roll();
    }

    /**
     * The roll method simulates the rolling of the die.
     */
    public void roll() {
        // Get a random value for the die.
        values = RAND.nextInt(sides) + 1;
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
     * getSides method
     * @return The number of sides for this die.
     */
    public int getSides() { return sides; }

    /**
     * getValue method
     * @return The value of the die.
     */
    public int getValues() { return values; }

    /**
     * getPoints method
     * @return The value of the points field.
     */
    public int getPoints() { return points; }
}
