package xwang10_midtermReview;

public class Stock {
    private String symbol;
    private double sharePrice;

    public Stock(String sym, double price) {
        symbol = sym;
        sharePrice = price;
    }

    public String getSymbol() {
        return symbol;
    }

    public double getSharePrice() {
        return sharePrice;
    }

    public String toString() {
        String str = "Trading symbol: " + symbol + "\nShare price: " + sharePrice;
        return str;
    }

    public boolean equals(Stock obj) {
        boolean status;
        if (symbol.equals(obj.symbol) && sharePrice == obj.sharePrice) {
            status = true;
        }
        else {
            status = false;
        }
        return status;
    }

    public Stock copy() {
        Stock copyObject = new Stock(symbol, sharePrice);
        return copyObject;
    }

    public Stock(Stock obj) {
        symbol = obj.symbol;
        sharePrice = obj.sharePrice;
    }
}
