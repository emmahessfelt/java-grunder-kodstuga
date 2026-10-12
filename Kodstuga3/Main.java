package Kodstuga3;
import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) 
    {
    
        Robot myRobot = new Robot();
        Scanner sc = new Scanner(System.in);

        myRobot.sayHi("Emma");
        myRobot.sayHi("Johanna");
        myRobot.sayHi("Malin");

        Candy myCandy = new Candy();
        double myPrice;
        int nofCandy;
        System.out.println("Ange antal godisbitar du vill ha: ");
        nofCandy = sc.nextInt();
        myPrice = myCandy.totalPrice(nofCandy, myCandy);
        String myTypeOfCandy = myCandy.getTypeOfCandy(myCandy);
        System.out.println(nofCandy + " bitar av " + myTypeOfCandy + " kostar totalt " + myPrice + " kronor.");

        sc.close();

    }    
}
