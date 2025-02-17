package Chapter11;
import java.util.Scanner;
import java.util.InputMismatchException;
public class MaxOccupancyTracker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int maxOccupancy = 10;
        int totalOccupancy = 0;
        while (totalOccupancy < maxOccupancy) {
            try {
                totalOccupancy += input.nextInt();
                System.out.println("Occupancy: " + totalOccupancy);
            }
            catch (InputMismatchException e) {
                System.out.println("Invalid input");
            }
        }
        System.out.println("We are full!");
    }
}
