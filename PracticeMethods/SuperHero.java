package PracticeMethods;

public class SuperHero 
{
    private int strength;
    private int speed;
    private int intelligence;
    private int powerLevel;

    SuperHero(int strength, int speed, int intelligence)
    {
        this.strength = strength;
        this.speed = speed;
        this.intelligence = intelligence;
    }
    
    public int getPowerLevel()
    {
        powerLevel = strength + speed + intelligence;
        return powerLevel;
    }
    
}
