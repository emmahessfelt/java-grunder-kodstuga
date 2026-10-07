package Kodstuga2;

public class Monster 
{
    String name;
    int health;
    
    Monster(String name, int health)
    {
        this.name = name;
        this.health = health;
    }

    Monster()
    {
        this("BomBang", 300);
    }

}
