package Kodstuga3;

public class Hero 
{
    private int points;
    
    Hero(int points)
    {
        this.points = points;
    }

    public int getPoints()
    {
        return this.points;
    }

    public void setPoints(int newPoints)
    {
        this.points = newPoints;
    }
}
