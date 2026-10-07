package Kodstuga2;
import java.util.Scanner;

public class RollerCoaster 
{
    public static void main(String[] args) 
    {
        int age;
        int height;
        Scanner sc = new Scanner(System.in);
        int height_limit = 130;
        int age_limit = 12;

        System.out.println("How old are you?");
        age = sc.nextInt();

        System.out.println("How tall are you (in cm)?");
        height = sc.nextInt();

        if (height < height_limit)
        {
            System.out.println("I'm sorry, you are not tall enough to ride the Rollercoaster.");
        }
        else if (age < age_limit)
        {
            System.out.println("I'm sorry, you are not old enough to ride the Rollercoaster");
        }
        else
        {
            System.out.println("Welcome to the Rollercoaster!");
        }

        sc.close();
        
    }
}
