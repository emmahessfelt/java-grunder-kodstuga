package EnchantedArena;

public class Player extends AllObjects 
{
    private int health;

    Player(int health)
    {
        this.health = health;
        //this.placeRandomly(20);
        setMapChar('P');
    }

   
}
