package Zybook;

import java.util.Scanner;
public class License {
    private char group;
    private String state;

    public void readDetails(Scanner scnr) {
        group = scnr.next().charAt(0);
        state = scnr.next();
    }

    public void print() {
        System.out.println("License group: " + group + ", State: " + state);
    }
}