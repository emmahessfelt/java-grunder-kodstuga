package PotionShop;



public class Main 
{
    private static final int POTIONPRICE = 30;
    public static void main(String[] args) 
    {
        Player player1 = new Player("Emma", 100, 100);
        player1.printStatus();
        
        if (player1.canAffordPotion(POTIONPRICE))
        {
            player1.buyPotion(POTIONPRICE);
        }

        player1.printStatus();
    }
}
