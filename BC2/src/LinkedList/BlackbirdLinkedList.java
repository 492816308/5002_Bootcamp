package LinkedList;

import java.util.Scanner;

public class BlackbirdLinkedList {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        BlackbirdNode headBlackbird = null;
        BlackbirdNode currBlackbird = null;
        BlackbirdNode lastBlackbird = null;
        int blackbirdCount;
        int inputValue;
        int i;

        blackbirdCount = scnr.nextInt();

        headBlackbird = new BlackbirdNode(blackbirdCount);
        lastBlackbird = headBlackbird;


        currBlackbird = new BlackbirdNode(scnr.nextInt());
        headBlackbird.insertAfter(currBlackbird);


        currBlackbird = headBlackbird;
        while (currBlackbird != null) {
            currBlackbird.printNodeData();
            currBlackbird = currBlackbird.getNext();
        }
    }
}
