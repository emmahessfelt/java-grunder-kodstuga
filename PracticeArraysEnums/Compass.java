package PracticeArraysEnums;

public class Compass 
{
    private Direction currentDirection;
    
    Compass()
    {
        this.currentDirection = Direction.NORTH;
    }

    public void whereAreYouGoing()
    {
        switch (currentDirection)
        {
            case NORTH:
                System.out.println("You're heading north.");
                break;
            case EAST:
                System.out.println("You're heading east.");
                break;
            case SOUTH:
                System.out.println("You're heading south.");
                break;
            case WEST:
                System.out.println("You're heading west.");
                break;
            default:
                System.out.println("You're heading nowhere.");
                break;
        }       
    }

    public void setDirection(Direction newDirection)
    {
        this.currentDirection = newDirection;
    }

    public void printAllDirections()
    {
        for (Direction d : Direction.values())
        {
            System.out.println(d);
        }
    }
    
}
