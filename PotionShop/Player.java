package PotionShop;

public class Player 
{
    private String name;
    private int health;
    private int wallet;

    Player(String name, int health, int wallet)
    {
        this.name = name;
        this.health = health;
        this.wallet = wallet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getWallet() {
        return wallet;
    }

    public void setWallet(int wallet) {
        this.wallet = wallet;
    }

    public boolean canAffordPotion(int priceOfPotion)
    {
        if(wallet >= priceOfPotion)
        {
            return true;
        }
        else 
        {
            return false;
        }
    }

    public void buyPotion(int priceOfPotion)
    {
        wallet -= priceOfPotion;
    }

    public void heal(int healthPoints)
    {
        health += healthPoints;
        if (health > 100)
        {
            health = 100;
        }
    }

    public void printStatus()
    {
        System.out.println("I am a player. My name is " + name + ".");
        System.out.println("I have " + health + " healthpoins.");
        System.out.println("In my wallet I have " + wallet + " coins.");
    }
}
