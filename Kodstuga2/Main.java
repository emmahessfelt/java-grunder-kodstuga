package Kodstuga2;

import java.util.Random;

public class Main 
{
    public static void main(String[] args) 
    {
        Monsters myMonsters = new Monsters();
        System.out.println("Welcome! Your monster is called " + myMonsters.borg1.name + ".");
        

        while(true)
        {
            int damage = attack();
            myMonsters.borg1.health -= damage; 
            System.out.println("Your monster is attacked. Your monster loses " + damage + " healthpoints.");
            System.out.println(myMonsters.borg1.name + " has " + myMonsters.borg1.health + " healthpoints left.");
            if (myMonsters.borg1.health < 1)
            {
                System.out.println("Your monster is dead!");
                break;
            }
            wait(1000);
        }
        
    }

    public static int attack()
    {
        Random r = new Random();
        int number = r.nextInt(100);
        return number;

    }
    
    public static void wait(int ms)
    {
        try
        {
            Thread.sleep(ms);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }
    }
}
