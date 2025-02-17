package Zybook;

import java.util.Scanner;
import java.util.ArrayList;

public class PurchaseSystem {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        Ledger ledger = new Ledger();

        ledger.inputPurchases(scnr);
        System.out.println("Average purchase quantity: " + ledger.findAveragePurchaseQuantity());
    }
}