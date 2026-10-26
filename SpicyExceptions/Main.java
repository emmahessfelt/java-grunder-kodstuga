package SpicyExceptions;


public class Main 
{
    public static void main(String[] args) 
    {
        int fuel = -5;
        try
        {
            launchRocket(fuel);
        }
        catch (NotEnoughFuelException e)
        {
            System.out.println(e.getMessage());
        }
        catch (IllegalArgumentException e)
        {
            System.out.println(e.getMessage());
        }
        
    }

    public static void launchRocket(int fuel) throws NotEnoughFuelException, IllegalArgumentException
    {
        if (fuel < 50 && fuel > 0)
        {
            throw new NotEnoughFuelException("The rocket doesn't have enough fuel to launch.");
        }
        else if (fuel < 0) 
        {
            throw new IllegalArgumentException("You cannot use negative numbers to enter fuel.");
        }       
        else
        {
            System.out.println("LAUNCH!");
        }
    }
    
}
