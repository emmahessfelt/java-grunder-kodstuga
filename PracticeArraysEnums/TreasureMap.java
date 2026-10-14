package PracticeArraysEnums;

public class TreasureMap 
{
    int[][] treasureMap = new int[3][3];
        
    TreasureMap()
    {
        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                treasureMap[i][j] = 0;
                System.out.println("hej" + i + j);
            }
        }
    }
}
