package Kodstuga4;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;

public class Application 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        boolean gameover = false;
        List<Monster> myMonsterArena = createMonsters();
        Menu.createMenu();
        Menu.printMenu();
        int menuChoice = sc.nextInt();        

        //while(gameover != true)
        //{
            switch (menuChoice) 
            {
                case 1:
                    System.out.println(myMonsterArena);
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    gameover = true;
                    break;        
                default:
                    break;
            }
        //}

        sc.close();
    }

    public static List<Monster> createMonsters()
    {
        List<Monster> monsterArena = new ArrayList<>();
        
        monsterArena.add(new Dragon("Katla"));
        monsterArena.add(new Slime("Buster"));
        monsterArena.add(new Robot("R2"));   
        return monsterArena;      
        
    }

    public static void leaderBoard()
    {
        Map<String, Integer> leaderBoard = new HashMap<>();
        Set<String> monsterTypes = new HashSet<>();

        //loop through all monsters and sort
    }
}
