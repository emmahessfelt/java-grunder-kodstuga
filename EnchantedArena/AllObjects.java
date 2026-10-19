package EnchantedArena;
import java.util.Random;

public abstract class AllObjects implements GameObject
{
    private int row;
    private int column;
    private char mapChar;
    private Random random = new Random();

    @Override
    public void setPosition(int row, int column) 
    {
        this.row = row;
        this.column = column;
    }

    @Override
    public int getRow() 
    {        
        return this.row;
    }

    @Override
    public int getColumn() 
    {        
        return this.column;
    }

    public void setMapChar(char mapChar)
    {
        this.mapChar = mapChar;
    }

    public char getMapChar()
    {
        return this.mapChar;
    }
 
    public void placeRandomly(GameMap gameMap) 
    {         
        boolean free = false;
        int length = gameMap.getMapLength();
        this.row = random.nextInt(length); 
        this.column = random.nextInt(length); 
        free = gameMap.positionAvailable(this.row, this.column);
        
        if (free == false)
        {
            placeRandomly(gameMap);
        }                         
        
        gameMap.writeChar(this.row, this.column, this.mapChar);
    }


}
