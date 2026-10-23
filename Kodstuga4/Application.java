package Kodstuga4;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeMap;;

public class Application 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        boolean gameover = false;
        List<Monster> myMonsterArena = createMonsters();
        myMonsterArena.get(0).setGamePoints(5);
        myMonsterArena.get(1).setGamePoints(12);
        myMonsterArena.get(2).setGamePoints(2);
        Map<String, Integer> myLeaderBoard = new TreeMap<>();
        List<Monster> shuffledArena = new ArrayList<>();
        shuffledArena = shuffleMonsters(myMonsterArena);
        Queue<Monster> attackQueue = attackQueue(shuffledArena);
        
        Menu.createMenu();
        Menu.printMenu();
        int menuChoice = sc.nextInt();        

        
        
            switch (menuChoice) 
            {
                case 1:
                    showAllMonsters(myMonsterArena);
                    break;
                case 2:
                    game(attackQueue);
                    break;
                case 3:
                    leaderBoard(myMonsterArena);
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
        Map<String, Integer> leaderBoard = new TreeMap<>();        
        myMonsterArena.sort(Comparator.comparingInt(Monster::getGamePoints));      
       
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

    public static void game(Queue<Monster> attackQueue)
    {
        
        System.out.println("Our first contestant is: " + attackQueue.peek().getName());
        Monster participant1 = attackQueue.poll();             

        System.out.println("And the opponant is: " + attackQueue.peek().getName());
        Monster participant2 = attackQueue.poll();

        List<Monster> contestors = new ArrayList<>();
        contestors.add(participant1);
        contestors.add(participant2);

        Collections.shuffle(contestors);
        contestors.get(0).attack(contestors.get(1));
        System.out.println(contestors.get(0).getName() + " attacks " + contestors.get(1).getName());     

        
    }

    public static int randomTurn(int players)
    {
        Random r = new Random();
        int choice = r.nextInt(players);
        return choice;
    }
    
}

