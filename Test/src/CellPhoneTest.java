import java.util.Scanner;

/**
   This program runs a simple test
   of the CellPhone class.
*/

public class CellPhoneTest
{
   public static void main(String[] args)
   {
      String testMan;   // To hold a manufacturer
      String testMod;   // To hold a model number
      double testPrice; // To hold a price
      String testColor; // To hold color
      boolean testCam;  // To hold if it has a camera
      int testMemory;   // To hold memory in GB
      
      // Create a Scanner object for keyboard input.
      Scanner keyboard = new Scanner(System.in);
      
      // Get the manufacturer name.
      System.out.print("Enter the manufacturer: ");
      testMan = keyboard.nextLine();
      
      // Get the model number.
      System.out.print("Enter the model number: ");
      testMod = keyboard.nextLine();
      
      // Get the retail price.
      System.out.print("Enter the retail price: ");
      testPrice = keyboard.nextDouble();

      keyboard.nextLine();

      // Get the color
      System.out.print("Enter the color: ");
      testColor = keyboard.nextLine();

      // Get memory amount in GB
      System.out.print("Enter the memory in GB: ");
      testMemory = keyboard.nextInt();

      // Create an instance of the CellPhone class,
      // passing the data that was entered as arguments
      // to the constructor.
      CellPhone phone = new CellPhone(testMan, testMod, testPrice, testColor, testMemory);

      // Get the data from the phone and display it.
      System.out.println();
      System.out.println("Here is the data that you provided:");
      System.out.println("Manufacturer: " + phone.getManufact());
      System.out.println("Model number: " + phone.getModel());
      System.out.println("Retail price: " + phone.getRetailPrice());
      System.out.println("Color: " + phone.getColor());
      System.out.println("Memory: " + phone.getMemory());
   }
}