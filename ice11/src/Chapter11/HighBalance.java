package Chapter11;

public class HighBalance extends Exception {
    public HighBalance() {
        super("High balance");
    }

    public HighBalance(double amount) {
        super("High balance: " + amount);
    }
}
