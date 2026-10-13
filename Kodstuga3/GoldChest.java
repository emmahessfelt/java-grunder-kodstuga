package Kodstuga3;
import java.util.Arrays;

public class GoldChest 
{
    public int gold[];

    GoldChest()
    {
        this.gold = new int[]{354, 237, 782, 34, 35};
    }

    public int countGold(int gold[])
    {
        int sumGold = 0;
        for (int chest : gold)
        {
            sumGold += chest;
        }
        return sumGold;
    }

    public int mostGold(int gold[])
    {
        int mostGold = Arrays.stream(gold).max().getAsInt();
        return mostGold;
    }
}
