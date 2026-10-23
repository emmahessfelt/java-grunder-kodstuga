package Kodstuga4;

public class Slime extends Monster
{

    Slime(String name)
    {
        this.setName(name);        
    }   
   
    public void attack(Monster attackedMonster)
    {
        int currentHP;
        int damage = randomDamage(20);        
        currentHP = attackedMonster.getHealthPoints();
        attackedMonster.setHealthPoints(currentHP - damage);
    }
}
