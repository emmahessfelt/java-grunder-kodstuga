package Kodstuga4;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
//import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
//import java.util.TreeMap;;

public class Application 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        boolean gameover = false;
        List<Monster> myMonsterArena = createMonsters();
        //myMonsterArena.get(0).setGamePoints(5);
        //myMonsterArena.get(1).setGamePoints(12);
        //myMonsterArena.get(2).setGamePoints(2);
        //Map<String, Integer> myLeaderBoard = new TreeMap<>();
        //List<Monster> shuffledArena = new ArrayList<>();
        //Set<Monster> monsterTypes = new HashSet<>();
        //shuffledArena = shuffleMonsters(myMonsterArena);
        //Queue<Monster> attackQueue = attackQueue(shuffledArena);        
        Menu.createMenu();       
        
        while(gameover == false)
        {
            Menu.printMenu();
            int menuChoice = sc.nextInt();   
            switch (menuChoice) 
            {
                case 1:
                    showAllMonsters(myMonsterArena);
                    break;
                case 2:
                    game(myMonsterArena);
                    break;
                case 3:
                    //leaderBoard(myMonsterArena); 
                    newLeaderboard(myMonsterArena);                   
                    break;
                case 4:
                    showMonsterTypes(myMonsterArena);
                    break;
                case 5:
                    gameover = true;
                    break;        
                default:
                    break;
            }
        
        }    
        sc.close();
    }

    public static List<Monster> createMonsters()
    {
        List<Monster> monsterArena = new ArrayList<>();
        
        monsterArena.add(new Dragon("Katla"));
        monsterArena.add(new Slime("Buster"));
        monsterArena.add(new Robot("R2"));
        monsterArena.add(new Dragon("Tiamat"));   
        return monsterArena;      
        
    }

    public static void leaderBoard(List<Monster> myMonsterArena)
    {
        Map<String, Integer> leaderBoard = new HashMap<>();        
        myMonsterArena.sort(Comparator.comparingInt(Monster::getGamePoints).reversed());      
       
        for (Monster monster : myMonsterArena) 
        {           
            leaderBoard.put(monster.getName(), monster.getGamePoints());
        }        
        
        System.out.println(leaderBoard);        
    }  
    
    public static void newLeaderboard(List<Monster> myMonsterArena)
    {
        Map<String, Integer> leaderBoard = new LinkedHashMap<>();        
        Collections.sort(myMonsterArena);

        for (Monster monster : myMonsterArena) 
        {           
            leaderBoard.put(monster.getName(), monster.getGamePoints());
        }        
        
        System.out.println(leaderBoard);   
    }

    public static List<Monster> shuffleMonsters(List<Monster> myMonsterArena)
    {
        List<Monster> shuffledArena = new ArrayList<>();
        shuffledArena = myMonsterArena;
        Collections.shuffle(shuffledArena);        
        return shuffledArena;
    }

    public static Queue<Monster> attackQueue(List<Monster> shuffledArena)
    {
        Queue<Monster> attackQueue = new LinkedList<>();

        for (Monster monster : shuffledArena) 
        {
            attackQueue.add(monster);
        }
        
        return attackQueue;        
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

    public static void game(List<Monster> myMonsterArena)
    {
        //shuffle the arena        
        //Create attack queue
        Queue<Monster> attackQueue = attackQueue(shuffleMonsters(myMonsterArena)); 
        System.out.println("Our first contestant is: " + attackQueue.peek().getName());
        Monster participant1 = attackQueue.poll();             

        System.out.println("And the opponant is: " + attackQueue.peek().getName());
        Monster participant2 = attackQueue.poll();

        List<Monster> contestors = new ArrayList<>();
        contestors.add(participant1);
        contestors.add(participant2);

        while(participant1.isAlive() && participant2.isAlive())
        {
            Collections.shuffle(contestors);
            contestors.get(0).attack(contestors.get(1));
            System.out.println(contestors.get(0).getName() + " attacks " + contestors.get(1).getName()); 
            System.out.println("HP1 " + contestors.get(0).getHealthPoints() + " HP2 " + contestors.get(1).getHealthPoints());  
        }  

        //fetch winning monster
        Monster winner = contestors.get(0);
        if (contestors.get(0).getHealthPoints() > 0)
        {
            winner = contestors.get(0);
        }
        else if (contestors.get(1).getHealthPoints() > 0)
        {
            winner = contestors.get(1);
        }

        int winnerPoints;
        winnerPoints = winner.getGamePoints();
        winner.setGamePoints(winnerPoints + 3);
        System.out.println("The winner is " + winner.getName() + "! " + winner.getName() + 
        " now has " + winner.getGamePoints() +" points. ");
        //resetting health points
        contestors.get(0).setHealthPoints(100);
        contestors.get(1).setHealthPoints(100);       
       
    }

    public static void showMonsterTypes(List<Monster> myMonsterArena)
    {
        Set<String> monsterTypes = new HashSet<>();
        Class myObjectClass;
        String type;
        for (Monster monster : myMonsterArena)
        {       
            myObjectClass = monster.getClass();
            type = myObjectClass.getName();            
            String shortType = type.replace("Kodstuga4.", "");            
            monsterTypes.add(shortType);
        }
        System.out.println(monsterTypes);
    }
    
    
}

