package Test;

import java.io.IOException;
import java.util.Scanner;
import java.util.Random;
import java.io.*;

public class Chutes {
    public static void main(String[] args) throws IOException {
        final int BOARD_SIZE = 101;
        String filename = "/home/fac/mthayer/submit/24rq5001/files/p3input.txt";
        char again;
        int playerNum = 0;

        int[] squareNum = new int[BOARD_SIZE];
        for (int i = 1; i < BOARD_SIZE; i++) {
            squareNum[i] = i;
        }

        // Call populateFile method
        populateFile(filename, squareNum);

        Scanner keyboard = new Scanner(System.in);

        do {
            do {
                System.out.print("How many players will play (between 2-6): ");
                playerNum = keyboard.nextInt();
            } while (playerNum < 2 || playerNum > 6);

            keyboard.nextLine();
            final int SIZE = playerNum;
            String[] playerNames = new String[SIZE];
            for (int i = 0; i < SIZE; i++) {
                System.out.printf("Enter player %d's name: ", i + 1);
                playerNames[i] = keyboard.nextLine();
                int[] positions = new int[SIZE];
                boolean gameOver = false;

                while (!gameOver) {
                    for (int playerIndex = 0; playerIndex < SIZE && gameOver == false; playerIndex++) {
                        int currentPosition = positions[playerIndex];
                        System.out.printf("%s, it's your turn. You are currently at space %d.\n",
                                playerNames[playerIndex], currentPosition);
                        // Call the getSpinNum method
                        int spinNum = getSpinNum();
                        System.out.printf("The spin was: %d.\n", spinNum);

                        if (currentPosition + spinNum < BOARD_SIZE) {
                            currentPosition += spinNum;
                            if (squareNum[currentPosition] >currentPosition) {
                                System.out.printf("Congrats, that is a ladder! You get to climb %d space.\n",
                                        squareNum[currentPosition] - currentPosition);
                            }
                            if (squareNum[currentPosition] < currentPosition) {
                                System.out.printf("Sorry, that is a chute! You are sent back %d space.\n",
                                        currentPosition - squareNum[currentPosition]);
                            }
                            currentPosition = squareNum[currentPosition];
                            System.out.printf("You are now at space %d.\n", currentPosition);
                            positions[playerIndex] = currentPosition;
                            if (currentPosition == BOARD_SIZE - 1) {
                                System.out.printf("%s, you have won the game!\n", playerNames[playerIndex]);
                                gameOver = true;
                            }
                        }
                        else {
                            System.out.println("Sorry, no player can go over 100.");
                        }
                    }
                }
            }
            System.out.print("Do you want to play again? (y/n): ");
            again = keyboard.nextLine().charAt(0);
        } while (again == 'y' || again == 'Y');
    }


    private static int[] populateFile(String filename, int[] squareNum) throws IOException {
        File file = new File(filename);
        Scanner inputFile = new Scanner(file);
        while (inputFile.hasNextInt()) {
            int index = inputFile.nextInt();
            int change = inputFile.nextInt();
            squareNum[index] = squareNum[index] + change;
        }
        return squareNum;
    }

    public static int getSpinNum() {
        final int MAX = 6;
        final int MIN = 1;
        Random rand = new Random();
        int num = rand.nextInt((MAX - MIN) + 1) + MIN;
        return num;
    }
}
