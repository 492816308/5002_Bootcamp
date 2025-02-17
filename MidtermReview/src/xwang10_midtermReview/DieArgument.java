package xwang10_midtermReview;

public class DieArgument {
    public static void main(String[] args) {
        final int SIX_SIDES = 6;
        final int TWENTY_SIDES = 20;
        Die sixDie = new Die(SIX_SIDES);
        Die twentyDie = new Die(TWENTY_SIDES);

        rollDie(sixDie);
        rollDie(twentyDie);
    }

    // Passing the object as an argument to a method.
    public static void rollDie(Die d) {
        System.out.println("Rolling a " + d.getSides() + " sided die.");
        d.roll();
        System.out.println("The die's value: " + d.getValue());
    }
}
