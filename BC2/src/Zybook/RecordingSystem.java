package Zybook;
import java.util.Scanner;
import java.util.ArrayList;

public class RecordingSystem {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        Collection collection = new Collection();

        collection.inputRecordings(scnr);
        collection.printRecordings();
    }
}