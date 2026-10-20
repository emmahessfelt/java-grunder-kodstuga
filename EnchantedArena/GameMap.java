package EnchantedArena;

import java.util.Arrays;

public class GameMap 
{
    private char[][] gameMap; 
            
    GameMap(int size)
    { 
        this.gameMap = new char[size][size]; 
        
        for (int i = 0; i < gameMap.length; i++)
        {
            for (int j = 0; j < gameMap.length; j++)
            {
                gameMap[i][j] = 'X';                          
            }         
        }
    }

    public char[][] getGameMap() {
        return gameMap;
    }

    public boolean positionAvailable(int x, int y)
    {
        if(gameMap[y][x] != 'X')
        {
            return false;
        }
        else
        {
            return true;
        }
    }

    public void printMap()
    {
        for (int i = 0; i < gameMap.length; i++)
        {
            System.out.println(Arrays.toString(gameMap[i]));    
        }
    }
    
    public int getMapLength()
    {
        int length = gameMap.length;
        return length;
    }

    public void writeChar(int x, int y, char mapChar)
    {
        gameMap[y][x] = mapChar;
    }

    public char getChar(int x, int y)
    {
        char mapChar = gameMap[y][x];
        return mapChar;
    }
    
}