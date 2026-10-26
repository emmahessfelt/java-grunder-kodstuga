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

    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBatteryStatus() {
        return batteryStatus;
    }

    public void setBatteryStatus(int batteryStatus) {
        this.batteryStatus = batteryStatus;
    }

    public int getFavoriteNumber() {
        return favoriteNumber;
    }

    public void setFavoriteNumber(int favoriteNumber) {
        this.favoriteNumber = favoriteNumber;
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
