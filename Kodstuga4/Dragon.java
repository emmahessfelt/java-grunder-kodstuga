package Kodstuga4;

public class Dragon extends Monster implements SpecialAttack
{
        
    Dragon(String name)
    {
       this.setName(name);       
    }
    
    @Override 
    public void attack(Monster attackedMonster)
    {
        int currentHP;
        int damage = randomDamage();        
        currentHP = attackedMonster.getHealthPoints();
        attackedMonster.setHealthPoints(currentHP - damage);        
    }

    @Override 
    public void useSpecialAttack()
    {

    }
}
