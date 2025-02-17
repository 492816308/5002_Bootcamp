import java.util.Scanner;

public class TestCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 10: ");
        int loopCount = sc.nextInt();

        for (int i = 0; i < loopCount; i++) {
            Counter.incrementCount();
        }

        System.out.println(Counter.getInstanceCount());

        System.out.println(Counter.timesTwo(5, 7));
        System.out.println(Counter.timesTwo(4, 9));
        System.out.println(Counter.timesTwo(8, 6));
    }
}
