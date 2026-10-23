package Kodstuga4;

public class Robot extends Monster implements SpecialAttack
{
    Robot(String name)
    {
        this.setName(name);        
    }
    
    @Override
    public void attack(Monster attackedMonster) 
    {
        int currentHP;
        int damage = randomDamage(20);        
        currentHP = attackedMonster.getHealthPoints();
        attackedMonster.setHealthPoints(currentHP - damage); 
    }

    @Override 
    public void useSpecialAttack(Monster attackedMonster)
    {
        int currentHP;
        int damage = randomDamage(30);        
        currentHP = attackedMonster.getHealthPoints();
        attackedMonster.setHealthPoints(currentHP - damage);
    }
}
