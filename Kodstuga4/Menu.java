package Kodstuga4;
import java.util.Map;
import java.util.HashMap;

public interface Menu 
{
    Map<Integer, String> menu = new HashMap<>();

    public static void createMenu()
    {
        menu.put(1, "Show all monsters");
        menu.put(2, "Start a game");
        menu.put(3, "Show leaderboard");
        menu.put(4, "Show monster types");
        menu.put(5, "Quit");
    }

    public static void printMenu()
    {
        System.out.println("Select an option from the menu (1-5):");
        for (int choice : menu.keySet()) 
        {
            System.out.println(choice + " " + menu.get(choice));
        }
    }
    

}
