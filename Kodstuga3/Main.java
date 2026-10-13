package Kodstuga3;
import java.util.Scanner;
import java.util.Arrays;

public class Main 
{
    public static void main(String[] args) 
    {
    
        //Start of Robot 
        Robot myRobot = new Robot();
        Scanner sc = new Scanner(System.in);

        myRobot.sayHi("Emma");
        myRobot.sayHi("Johanna");
        myRobot.sayHi("Malin");

        //Start of Candy
        Candy myCandy = new Candy();
        double myPrice;
        int nofCandy;
        System.out.println("Ange antal godisbitar du vill ha: ");
        nofCandy = sc.nextInt();
        myPrice = myCandy.totalPrice(nofCandy, myCandy);
        String myTypeOfCandy = myCandy.getTypeOfCandy(myCandy);
        System.out.println(nofCandy + " bitar av " + myTypeOfCandy + " kostar totalt " + myPrice + " kronor.");

        //Start of gold chests
        GoldChest myGoldChest = new GoldChest();
        int sum = myGoldChest.countGold(myGoldChest.gold);
        int largest = myGoldChest.mostGold(myGoldChest.gold);
        System.out.println("Summan av guld i alla kistor: " + sum);
        System.out.println("Kistan med mest guld i innehåller: " + largest);

        //Start of superpower enum
        SuperPower mySuperPower = SuperPower.FIRE;
        switch (mySuperPower) 
        {
            case FIRE:
                System.out.println("Your superpower is fire!");
                break;
            case ICE:
                System.out.println("Your superpower is ice!");
                break;
            case WIND:
                System.out.println("Your superpower is wind!");
                break;
            case LIGHTNING:
                System.out.println("Your superpower is lightning!");
                break;
            default:
                System.out.println("You don't have a superpower yet!");
                break;
        }

        for (SuperPower powers : SuperPower.values())
        {
            System.out.println(powers);
        }
        
        //start of Hero
        Hero xena = new Hero(25);
        int heroPoints[] = {22, 13, 5, 2, 17};
        int sumPoints = 0;
        int heighestPoints;
        for (int points : heroPoints)
        {
            sumPoints += points;
        }
        xena.setPoints(sumPoints);
        System.out.println("Your hero has " + xena.getPoints() + " points.");
        heighestPoints = highestPoints(heroPoints);
        System.out.println("The highest point in the array is " + heighestPoints + " points.");
        sc.close();

    }    

    public static int highestPoints (int hero[])
    {
        int highestPoints= Arrays.stream(hero).max().getAsInt();
        return highestPoints;
    }
}
