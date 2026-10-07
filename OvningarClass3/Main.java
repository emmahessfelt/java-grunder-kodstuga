package OvningarClass3;

public class Main 
{
    public static void main(String[] args) 
    {
        Fleet myFleet = new Fleet();
        Spaceship mySpaceship = new Spaceship();

        Spaceship enterprise = new Spaceship("Enterprise", "NCC-1701", "James Kirk", 430, 95.0, 9.0, 100);
        
        Spaceship voyager = new Spaceship("Voyager", "Intrepid", "Kathryn Janeway", 150, 88.0, 9.975, 90);
                
        myFleet.addSpaceship(enterprise);
        myFleet.addSpaceship(voyager);
        myFleet.addSpaceship(mySpaceship);
        
        System.out.println("Fleet size: " + myFleet.getFleetSize());
        for (int i = 0; i < myFleet.getFleetSize(); i++)
        {
            
            myFleet.getSpaceship(i).present();;
           
        }
          
                
        
    }    
}
