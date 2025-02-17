package Zybook;

import java.util.Scanner;
import java.util.ArrayList;

public class Ledger {
    private ArrayList<Purchase> purchaseList = new ArrayList<Purchase>();

    public void inputPurchases(Scanner scnr) {
        Purchase currPurchase;
        String currFood;
        int currQuantity;
        int purchaseCount;
        int i;

        purchaseCount = scnr.nextInt();
        for (i = 0; i < purchaseCount; ++i) {
            currFood = scnr.next();
            currQuantity = scnr.nextInt();
            currPurchase = new Purchase();
            currPurchase.setFoodAndQuantity(currFood, currQuantity);
            purchaseList.add(currPurchase);
        }
    }

    public int findAveragePurchaseQuantity() {
        int i;
        int totalQuantity = 0;
        int averageQuantity = 0;
        for (i = 0; i < purchaseList.size(); i++) {
            totalQuantity += purchaseList.get(i).getQuantity();
        }
        averageQuantity = totalQuantity / purchaseList.size();
        return averageQuantity;
    }
}