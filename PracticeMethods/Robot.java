package PracticeMethods;
import java.util.Scanner;

public class Robot 
{
    String name;
    int battery;    


    Robot(String name, int battery)
    {
        this.name = name;
        this.battery = battery;
    }

    Robot()
    {
        this("Robot",80 );
    }

    public void halsa()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Vad heter du?");
        String username = sc.nextLine();
        System.out.println("Hej " + username + "! Jag är en Robot och jag heter " + this.name + ".");
        sc.close();
    }
}
