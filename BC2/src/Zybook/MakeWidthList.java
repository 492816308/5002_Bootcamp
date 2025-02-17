package Zybook;

import java.util.Scanner;
import java.util.ArrayList;

public class Purchases {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        ArrayList<Purchase> purchaseList = new ArrayList<Purchase>();
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
            currPurchase.setDetails(currFood, currQuantity);
            purchaseList.add(currPurchase);
        }

        for ( i = 0; i < purchaseList.size(); i++) {
            if (purchaseList.get(i).getQuantity() >= 6 && purchaseList.get(i).getQuantity() <= 20) {
                purchaseList.get(i).print();
            }
        }

    }

    public class Licenses {
        public static void main(String[] args) {
            Scanner scnr = new Scanner(System.in);
            ArrayList<License> licenseList = new ArrayList<License>();
            License currLicense;
            int entryNumber;
            int i;

            entryNumber = scnr.nextInt();
            while (entryNumber >= 0) {
                currLicense = new License();
                currLicense.readDetails(scnr);
                licenseList.add(currLicense);
                entryNumber = scnr.nextInt();
            }

            for (i = 0; i < licenseList.size(); ++i) {
                currLicense = licenseList.get(i);
                currLicense.print();
            }
        }
    }
}