package EnchantedArena;

import java.util.Arrays;

public class Application 
{
    public static void main(String[] args) 
    {
        GameMap myMap = new GameMap(20);
             
        AllObjects treasure = new Treasure();
        treasure.placeRandomly(myMap);      
        
        AllObjects zombie = new Enemy(4);
        zombie.placeRandomly(myMap);
        AllObjects demon = new Enemy(5);
        demon.placeRandomly(myMap);
        AllObjects fruit = new Food(3);
        fruit.placeRandomly(myMap);
        AllObjects meat = new Food(4);
        meat.placeRandomly(myMap);

        AllObjects player = new Player(80);
        player.placeRandomly(myMap);

        myMap.printMap();
    }
}
