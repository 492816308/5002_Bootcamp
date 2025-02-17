public class SuitDemo {

    public enum Suit{CLUBS, HEARTS, DIAMONDS, SPADES};
    public static void main(String[] args) {
        Suit aCard = Suit.CLUBS;

        if (isRed(aCard) == true)
            System.out.println("Red suit");

        if (isBlack(aCard) == true)
            System.out.println("Black suit");

    }

    public static boolean isRed(Suit aCard) {
        if ((aCard == Suit.DIAMONDS) || (aCard == Suit.HEARTS))
            return true;
        else
            return false;
    }

    public static boolean isBlack(Suit aCard) {
        return !isRed(aCard);
    }
}
