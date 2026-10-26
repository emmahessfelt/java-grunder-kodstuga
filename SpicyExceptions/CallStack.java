package SpicyExceptions;

public class CallStack 
{
    public static void main(String[] args) 
    {
        try
        {       
            startGame();    
        }
        catch(ArithmeticException e)
        {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

    }

    public static void startGame()
    {
        int players = 0;
        enterDungeon(players);
    }

    public static void enterDungeon(int players)
    {
        openChest(players);
    }
    
    public static void openChest(int players)
    {
        int coins = 100;
        int coinsPerPlayer = coins / players;
        System.out.println("You open the chest and find " + coins + ".");
        System.out.println("You will get " + coinsPerPlayer + " each.");
    }

}
