package Kodstuga4;
//import java.util.HashMap;
import java.util.Random;
//import java.util.Map;
//import java.util.HashSet;
//import java.util.Set;

public abstract class Monster implements Comparable<Monster>
{
    private String name;
    private int healthPoints;
    private int gamePoints;
    

    public abstract void attack(Monster myMonster);

    Monster()
    {
        healthPoints = 100;
        gamePoints = 0;
    }

    @Override 
    public int compareTo(Monster other)
    {
        return Integer.compare(other.getGamePoints(), this.getGamePoints());
    }

    public String getName() 
    {
        return name;
    }

    public void setName(String name) 
    {
        this.name = name;
    }

    public int getHealthPoints() 
    {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) 
    {
        this.healthPoints = healthPoints;
    }

    public int getGamePoints() 
    {
        return gamePoints;
    }

    public void setGamePoints(int gamePoints) 
    {
        this.gamePoints = gamePoints;
    }

    public void showMonster()
    {
        System.out.println("My name is " + name);
        System.out.println("I have " + healthPoints + " health points");
        System.out.println("I have " + gamePoints + " game points");
    }    

    public int randomDamage(int max)
    {
        int damage;
        Random r = new Random();
        damage = r.nextInt(5, max);
        return damage;
    }

    public boolean isAlive()
    {
        if (this.healthPoints <= 0)
        {
            return false;
        }
        else
        {
            return true;
        }
    }

    

    

    
}
