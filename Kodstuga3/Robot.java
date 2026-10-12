package Kodstuga3;
import java.util.Random;

public class Robot 
{
    private String name;
    private int batteryStatus;
    private int favoriteNumber; 
    
    Robot(String name, int batteryStatus)
    {
        this.name = name;
        this.batteryStatus = batteryStatus;
        this.favoriteNumber = generateNumber();
    }

    Robot()
    {
        this("Maxine", 80);
    }

    private int generateNumber()
    {
        Random r = new Random();
        int randomNumber = r.nextInt(1000);
        return randomNumber;
    }

    public void sayHi(String username)
    {
        System.out.println("Hej " + username + "! Jag är din robot, jag heter " + name + ". Mitt favoritnummer är " + favoriteNumber + ".");
    }
}
