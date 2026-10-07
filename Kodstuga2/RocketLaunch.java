package Kodstuga2;

public class RocketLaunch 
{
    public static void main(String[] args) 
    {
          
        for (int i=10; i >= 1; i--)
        {
            
            if (i==5)
            {
                continue;
            }
            if (i==10)
            {
                System.out.println("Countdown starting for liftoff.");
            }
            
            System.out.println (i + ".....");
            wait(1000);            
        }
        
        System.out.println("LIFTOFF!");
        
    }

    public static void wait(int ms)
    {
        try
        {
            Thread.sleep(ms);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }
    }

}
