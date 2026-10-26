package PracticeExeptions;

public class TreasureChest 
{    
    public static void main(String[] args) 
    {
        int[] treasures = {100, 200, 300};
        try
        {
            System.out.println(treasures[5]);
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("You are trying to access an index out of range.");
            System.out.println("Size of array is " + treasures.length);
            System.out.println(e.getMessage());
        }
    }
    
}
