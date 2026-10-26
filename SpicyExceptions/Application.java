package SpicyExceptions;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Application 
{
    public static void main(String[] args) 
    {
        TheVault myVault = new TheVault(200);
        Scanner sc = new Scanner(System.in);
        boolean valid = false;
        int amount = 0;
        System.out.println("Welcome to the Vault.");
        
        while(!valid)
        {
            try
            {
                System.out.println("How much would you like to withdraw?");
                amount = sc.nextInt();
                myVault.withDraw(amount);
                valid = true;
            }
            catch(InputMismatchException e)
            {
                System.out.println("You have to enter a whole number.");
                sc.nextLine();    //remove invalid input 
            }    
            
            catch(IllegalArgumentException e)
            {
                System.out.println(e.getMessage());
                valid = false;
            }
            finally
            {
                System.out.println("The Vault has served.");
            }
        }    
        sc.close();
    }
}
