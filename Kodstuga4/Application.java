package Kodstuga4;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Application 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        boolean gameover = false;
        List<Monster> myMonsterArena = createMonsters();
        Map<String, Integer> myLeaderBoard = new HashMap<>();
        leaderBoard(myMonsterArena);
        Menu.createMenu();
        Menu.printMenu();
        int menuChoice = sc.nextInt();        

        
        
            switch (menuChoice) 
            {
                case 1:
                    showAllMonsters(myMonsterArena);
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

    public static void leaderBoard(List<Monster> myMonsterArena)
    {
        //Set<String> monsterTypes = new HashSet<>();
        
        Collections.sort(myMonsterArena);

        //sort monsterArea for points and then put in map
       
        Map<String, Integer> leaderBoard = new HashMap<>();
        for (Monster monster : myMonsterArena) 
        {           
            leaderBoard.put(monster.getName(), monster.getGamePoints());
        }        
        
        System.out.println(leaderBoard);
        //loop through all monsters and sort
    }

    public static void showAllMonsters(List<Monster> myMonsterArena)
    {
        System.out.println("-----------------------------");
        for (Monster monster : myMonsterArena) 
        {
            monster.showMonster();
            System.out.println("-----------------------------");
        }
    }
}
