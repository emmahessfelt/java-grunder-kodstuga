package EnchantedArena;

public enum Direction 
{
    NORTH ('N'),
    EAST ('E'),
    SOUTH ('S'),
    WEST ('W');

    private final char compass;

    Direction(char compass)
    {
        this.compass = compass;
    }

    public char getCompass() {
        return compass;
    }
}
