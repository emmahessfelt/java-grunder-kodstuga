package CleanCodeSpicy;

public class Player 
{
    private String name;
    private int healthPoints;
    private int wallet;

    Player(String name, int healthPoints, int wallet)
    {
        this.name = name;
        this.healthPoints = healthPoints;
        this.wallet = wallet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public int getWallet() {
        return wallet;
    }

    public void setWallet(int wallet) {
        this.wallet = wallet;
    }

    public void pay(int price)
    {
        wallet -= price;
    }

    public void takeDamage(int damage)
    {
        healthPoints -= damage;
    }

    public boolean canPlayerAffordDelivery(int price)
    {
        if (wallet >= price)
        {
            return true;
        }
        else
        {   
            return false;
        }
    }    

}
