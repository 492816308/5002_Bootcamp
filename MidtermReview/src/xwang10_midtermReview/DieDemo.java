package xwang10_midtermReview;

public class DieDemo {
    public static void main(String[] args) {
        final int DIE1_SIDES = 6;
        final int DIE2_SIDES = 12;
        final int MAX_ROLLS = 5;

        Die die1 = new Die(DIE1_SIDES);
        Die die2 = new Die(DIE2_SIDES);
        Die myDie = new Die(6);
        showDieSides(myDie);
        System.out.println("This simulates the rolling of a " + DIE1_SIDES +
                           " sided die and a " + DIE2_SIDES + " sided die.");
        System.out.println("Initial value of the dice: ");
        System.out.println(die1.getValue() + " " + die2.getValue());
        System.out.println("Rolling the dice " + MAX_ROLLS + " times.");
        for (int i = 0; i < MAX_ROLLS; i++) {
            die1.roll();
            die2.roll();
            System.out.println(die1.getValue() + " " + die2.getValue());
        }
    }

    public static void showDieSides(Die d) {
        System.out.println("This die has " + d.getSides() + " sides.");
    }
}
