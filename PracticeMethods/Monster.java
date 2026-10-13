package PracticeMethods;
import java.util.Random;

public class Monster 
{
    private String name;
    private int health;
    private int maxHealth;    
    
    Monster(String name, int health, int maxHealth)
    {
        this.name = name;
        this.health = health;
        this.maxHealth = maxHealth;
    }

    Monster()
    {
        this("Dragon", 40, 80);
    }

    public void setHealth(int newHealth)
    {
        this.health = newHealth;
    }

    public void attack()
    {
        int attackDamage = attackDamage();
        System.out.println("You are attacked by a monster. You take " + attackDamage + " in damage.");
    }

    public int attackDamage()
    {
        Random r = new Random();
        int attackDamage = r.nextInt(30);
        return attackDamage;
    }

    public void presentMonster()
    {
        System.out.println("I am a monster. My name is " + this.name + ".");
        System.out.println("I have a maximum health of " + this.maxHealth + ".");
        System.out.println("My current health status is " + this.health + ".");
    }

    public static void printName(String name)
    {
        System.out.println("Hej " + name + "! Den här metoden är statisk.");
    }

}
