package Chapter6_07_22;

import java.util.Scanner;
import java.io.*;
import java.util.Random;

public class ObjectDemo {
    public static void main(String[] args) throws IOException {
        int maxNumbers;
        int number;
        Scanner keyboard = new Scanner(System.in);
        Random rand = new Random();
        PrintWriter outputFile = new PrintWriter("numbers.txt");

        System.out.print("How many random numbers should I write: ");
        maxNumbers = keyboard.nextInt();

        for (int count = 0; count < maxNumbers; count++) {
            number = rand.nextInt();
            outputFile.println(number);
        }
        outputFile.close();
        keyboard.close();
        System.out.println("Done!");
    }
}
