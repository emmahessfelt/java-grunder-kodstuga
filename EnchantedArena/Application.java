package EnchantedArena;

import java.security.AllPermission;
import java.util.Arrays;
import java.util.Random;

public class Application 
{
    public static void main(String[] args) 
    {
        GameMap myMap = new GameMap(20);
        boolean gameover = false;
              
             
        AllObjects treasure = new Treasure();
        treasure.placeRandomly(myMap);    
        AllObjects[] myEnemies = createEnemies(50, myMap);
        AllObjects[] myFoods = createFoods(10, myMap);            

        Player player = new Player(20);
        player.placeRandomly(myMap);
        boolean dead = false;       

        myMap.printMap();
        int action = 0;

        System.out.println("Welcome to the matrix! Your mission is to find the treasure hidden in the matrix."); 
        System.out.println("The world is " + myMap.getMapLength() + " x " + myMap.getMapLength() + " squares big.");
        

        while (gameover == false)
        {            
            player.display();
            action = player.move(myMap);
            
            

            if (action == 1)
            {
                
                AllObjects currentFood = getFood(player, myFoods);                
                player.eatFood((Food)currentFood);      
                
            }
            else if (action == 2)
            {
                AllObjects currentEnemy = getEnemy(player, myEnemies);
                player.takeDamage((Enemy)currentEnemy);  
                dead = player.isPlayerDead();
                if (dead)
                {
                    gameover = true;
                }          
            }
            else if (action == 3)
            {
                gameover = true;
            }
            
        }
        
    }

    public static AllObjects[] createEnemies(int nofEnemies, GameMap myMap)
    {        
        AllObjects[] myEnemies = new Enemy[nofEnemies];  
        Random r = new Random();      

        for (int i = 0; i < nofEnemies; i++)
        {
            int randomDamage = r.nextInt(1, 6);
            myEnemies[i] = new Enemy(randomDamage);
            myEnemies[i].placeRandomly(myMap);
        }
        
        return myEnemies;
    }

    public static AllObjects[] createFoods(int nofFoods, GameMap myMap)
    {        
        AllObjects[] myFoods = new Food[nofFoods];
        Random r = new Random();      

        for (int i = 0; i < nofFoods; i++)
        {
            int randomBoost = r.nextInt(1, 5);
            myFoods[i] = new Food(randomBoost);
            myFoods[i].placeRandomly(myMap);
        } 
        
        return myFoods;
    }

    public static AllObjects getEnemy(Player player, AllObjects[] myEnemies)
    {
        AllObjects myObject = null;
        int x = player.getColumn();
        int y = player.getRow();       

        for (AllObjects enemy : myEnemies)
        {            
            if (enemy.getColumn() == x && enemy.getRow() == y)
            {
                myObject = enemy;
            }
        }  

        return myObject;    
    }

    public static AllObjects getFood(Player player, AllObjects[] myFoods)
    {
        AllObjects myObject = null;
        int x = player.getColumn();
        int y = player.getRow();       
        
        for (AllObjects food : myFoods)
        {            
            if (food.getColumn() == x && food.getRow() == y)
            {
                myObject = food;
            }
        }  

        return myObject;    
    }
}
