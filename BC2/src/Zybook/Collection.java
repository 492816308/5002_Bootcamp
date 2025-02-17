package Zybook;

import java.util.Scanner;
import java.util.ArrayList;

public class Collection {
    private ArrayList<Recording> recordingList = new ArrayList<Recording>();

    Scanner scnr = new Scanner(System.in);
    public void inputRecordings(Scanner scnr) {
        Recording newRecording;
        int recordCount;

        recordCount = scnr.nextInt();
        while (recordCount != -99) {
            newRecording = new Recording();
            newRecording.readDiscountAndTopic(scnr);
            recordingList.add(newRecording);
            recordCount = scnr.nextInt();
        }
    }
    public void inputProducts(Scanner scnr) {
        Product currProduct;
        int currPrice;
        String currName;

        currPrice = scnr.nextInt();
        while (currPrice >= 0) {
            currProduct = new Product();
            currName = scnr.next();
            currProduct.setPriceAndName(currPrice, currName);
            productList.add(currProduct);
            currPrice = scnr.nextInt();
        }
    }

    public void printRecordings() {
        Recording currRecording;
        int i;

        for (i = 0; i < recordingList.size(); ++i) {
            currRecording = recordingList.get(i);
            currRecording.print();
        }
    }
}