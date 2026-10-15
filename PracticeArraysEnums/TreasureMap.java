package PracticeArraysEnums;
import java.util.Arrays;

public class TreasureMap 
{
    private int[][] treasureMap = new int[3][3];
        
    TreasureMap(int[][] newTreasureMap)
    {
        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                this.treasureMap[i][j] = newTreasureMap[i][j];                
            }
        }
    }

    public void printMap()
    {
        for (int i = 0; i < 3; i++)
        {
            System.out.println(Arrays.toString(this.treasureMap[i]));
        }
       
    }

    public int getValue(int x, int y)    
    {
        return this.treasureMap[x][y];
    }

    public void setValue(int x, int y, int value)
    {
        this.treasureMap[x][y]= value;
    }


    public int[] searchForTreasure(int treasure)
    {
        int[] treasureCoordinates = {0, 0};
        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                if (this.treasureMap[i][j] == treasure)
                {
                    treasureCoordinates[0] = i;
                    treasureCoordinates[1] = j;
                }
            }
        }

        return treasureCoordinates;

    }



}
