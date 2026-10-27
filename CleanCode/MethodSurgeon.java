package CleanCode;

public class MethodSurgeon 
{
    private static final int POTIONPRICE = 30;
    public static void main(String[] args) 
    {
        int wallet = 100; 
        int numberOfPotions = 5; 
        int totalCost = calculateCost(numberOfPotions);
        printPurchase(wallet, totalCost);
    }    
    
    public static int calculateCost(int numberOfPotions)
    {
        int totalCost = 0;
        totalCost = numberOfPotions * POTIONPRICE;
        return totalCost;
    }

    public static void printPurchase(int wallet, int totalCost)
    {
        if (wallet >= totalCost) 
        { 
            System.out.println("Purchase successful. Total cost: " + totalCost + " coins."); 
        } 
        else 
        { 
            System.out.println("You don't have enough coins in your wallet."); 
        } 
    }

}
