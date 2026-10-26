package PracticeExeptions;
import java.util.Scanner;

public class ScoreGuard 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number between 0-100: ");
        int myNumber = sc.nextInt();
        
        try
        {
            checkScore(myNumber);
        }
        catch(IllegalArgumentException e)
        {
            System.out.println(e.getMessage());
        }
        
        sc.close();
    }

    public static void checkScore(int score)
    {
        if (score < 0 || score > 100)
        {
            throw new IllegalArgumentException("The score needs to be larger -1 or lesser than 101.");
        }
        else
        {
            System.out.println("Score is approved.");
        }
    }
}
