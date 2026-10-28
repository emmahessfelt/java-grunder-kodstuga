package GalacticCargoControl;
import java.util.Map;
import java.util.HashMap;

public interface Menu 
{
    Map<Integer, String> menu = new HashMap<>();

    public static void createMenu()
    {
        menu.put(1, "Register new cargo");
        menu.put(2, "Show all approved cargos");
        menu.put(3, "Quit");        
    }

    public static void printMenu()
    {
        System.out.println("Select an option from the menu (1-3): \n");
        for (int choice : menu.keySet()) 
        {
            System.out.println(choice + " " + menu.get(choice));
        }
    }
    

}

