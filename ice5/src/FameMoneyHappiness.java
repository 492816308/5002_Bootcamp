public class FameMoneyHappiness {
    public static enum FMH {FAME, MONEY, HAPPINESS}
    private FMH value;
    public FameMoneyHappiness(FMH value) {
        this.value = FMH.FAME;
    }

    public FMH getValue() {
        return value;
    }

    public static void main(String[] args) {
        // Create 1 FMH object
        FameMoneyHappiness  fmh = new FameMoneyHappiness(FMH.FAME);

        switch (fmh.getValue()) {
            case MONEY:
                System.out.println("MONEY");
                break;
            case HAPPINESS:
                System.out.println("HAPPINESS");
                break;
            default:
                System.out.println("FAME");
        }
    }
}


