package EnchantedArena;

public class Enemy extends AllObjects 
{
    private int damage;    
    
    Enemy(int damage)
    {
        this.damage = damage;
        setMapChar('E');    
    }

    public int getDamage() 
    {
        return damage;
    }


    
    
    
   
}
