package PracticeArraysEnums;
import java.util.Random;
import java.util.Arrays;

public class Dice 
{
    int[] rolls = new int[5];    

    Dice()
    {
        for (int i = 0; i < rolls.length; i++)
        {
            int diceRoll = rollTheDice();
            rolls[i] = diceRoll;            
        }
    }

    private int rollTheDice()
    {
        Random r = new Random();
        int diceRoll;
        diceRoll = r.nextInt(1, 7);
        System.out.println("Throwing the dice: " + diceRoll);
        return diceRoll;
    }

    public void printRolls()
    {
        for (int roll : rolls)
        {
            System.out.println("Roll: " + roll);
        }
    }

    public int sumOfRolls()
    {
        int sumOfRolls = 0;
        for (int roll : rolls)
        {
            sumOfRolls += roll;
        }

        return sumOfRolls;
    }

    public void sortRolls()
    {
        Arrays.sort(this.rolls);
    }

    public void highAndLow()
    {
        int high = Arrays.stream(this.rolls).max().getAsInt(); 
        int low = Arrays.stream(this.rolls).min().getAsInt(); 
        System.out.println("The lowest roll is: " + low);
        System.out.println("The highest roll is: " + high);

    }

    public void findSix()
    {
        int index = Arrays.binarySearch(this.rolls, 6);
        //System.out.println(index);
        if(index == -6)
        {
            System.out.println("Roll of 6 is not found.");
        }
        else
        {
            System.out.println("Roll of 6 was found.");
        }
    }

    public int[] copyofRolls()
    {
        
        int[] newRolls = Arrays.copyOf(rolls, 7);
        return newRolls;
    }

}


