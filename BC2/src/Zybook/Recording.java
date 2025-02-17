package Zybook;

import java.util.Scanner;
public class Recording {
    private char discount;
    private String topic;

    public void readDiscountAndTopic(Scanner scnr) {
        discount = scnr.next().charAt(0);
        topic = scnr.next();
    }

    public void print() {
        System.out.println("Recording discount: " + discount + ", Topic: " + topic);
    }
}