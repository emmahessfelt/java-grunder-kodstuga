package EnchantedArena;

public interface GameObject 
{
    int getRow(); 
    int getColumn(); 
    void setPosition(int row, int column); 
    void setMapChar(char mapChar);
    char getMapChar();
}
