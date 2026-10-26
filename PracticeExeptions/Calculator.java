package PracticeExeptions;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int number1 = 0;
        int number2 = 0;
        int result;
        boolean valid = false;
        System.out.println("Welcome! I can divide to integer numbers.");
        while(!valid)
        {
            try
            {
                System.out.println("Enter the first number:");
                number1 = sc.nextInt();

                System.out.println("Enter the second number:");
                number2 = sc.nextInt();

                result = number1 / number2;
                System.out.println("The result is " + result);
                valid = true;
                             
            }
            catch (InputMismatchException e)
            {
                System.out.println("You didn't enter an integer.");
                sc.nextLine();    //remove invalid input                    
            }       
            catch(ArithmeticException e)
            {
                System.out.println("Division by zero is not allowed.");                
            }
            finally
            {
                System.out.println("Getting out now?");
            }
            
        }       

        sc.close();
    }
}
