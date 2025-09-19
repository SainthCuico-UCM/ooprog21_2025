// This class calculates a waitperson's tip as 15% of the bill
import java.util.Scanner;

class DebugThree1
{
   public static void main(String args[])
   {
      double check1;
      double check2;
      Scanner input = new Scanner(System.in);
      System.out.print("Enter the amount of your check >> ");
      check1 = input.nextDouble(); 
      System.out.print("Enter the amount of your friend's check >> ");
      check2 = input.nextDouble(); 
      calcTip(check1); 
      calcTip(check2); 
    }
    public static void calcTip(double bill)
    {
      final double RATE = 0.15; 
      double tip;
      tip = bill * RATE; 
      System.out.println("The tip should be at least $" + tip);
    }
}

/*
Bugs found:
1. Changed "nextInt()" to "nextDouble()" since declared variable is double instead of integer
2. Changed "inputnextInt()" to "input.nextDouble()" same with bug 1
3. Changed "nextInt()" to "nextDouble()" same with 2 previous bugs
4. Added parameters to calcTip method
5. Corrected typo "doubel" to "double"
6. Changed division to multipilcation to calculate the correct tip value
*/