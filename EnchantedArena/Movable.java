package EnchantedArena;

public interface Movable 
{
    void moving(int x, int y, GameMap myMap);
    int move(GameMap myMap);
    void display();
}
