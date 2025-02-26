package Chapter11;

/**
   This program demonstrates how the BankAccount
   class constructor throws custom exceptions.
*/

public class AccountTest
{
   public static void main(String [] args)
   {
      // Force a NegativeStartingBalance exception.
      try
      {
         BankAccount account =
                     new BankAccount(-100);
      }
      catch(NegativeStartingBalance | HighBalance e)
      {
         System.out.println(e.getMessage());
      }

      try {
         BankAccount account2 = new BankAccount(600000);
      }
      catch(NegativeStartingBalance | HighBalance e)
      {
         System.out.println(e.getMessage());
      }

   }
}