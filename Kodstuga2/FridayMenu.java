package Kodstuga2;

import java.util.Scanner;

public class FridayMenu 
{
    public static void main(String[] args) 
    {
        int choice = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Please select a dish from then menu (1-4):");
        choice = sc.nextInt();
        
        switch(choice)
        {
            case 1:
                System.out.println("Here's your Sea Bass Tandoori.");
                break;
            case 2:
                System.out.println("Here's your Pad Khee Mao.");
                break;
            case 3:
                System.out.println("Here's your Sichuan Hot Pot.");
                break;
            case 4:
                System.out.println("Here's your Laksa Curry.");
                break;
            default:
                System.out.println("I'm sorry, you entered an invalid number.");
                break;
        }

        sc.close();
    }    
}
