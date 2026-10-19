package EnchantedArena;

public class Food extends AllObjects 
{
    private int healthBoost;

    Food(int healthBoost)
    {
        this.healthBoost = healthBoost;
        //this.placeRandomly(20);
        setMapChar('F');
    }
    
    
}
