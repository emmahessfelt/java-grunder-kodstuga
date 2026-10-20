package EnchantedArena;

public class Food extends AllObjects 
{
    private int healthBoost;

    Food(int healthBoost)
    {
        this.healthBoost = healthBoost;        
        setMapChar('F');
    }

    public int getHealthBoost() 
    {
        return this.healthBoost;
    }
    
    
}
