package Vehicle;

public class Application 
{
    public static void main(String[] args) 
    {
        Drivable myCar = new Car();
        Drivable myBicycle = new Bicycle(); 
        
        myCar.drive();
        myBicycle.drive();

        startTrip(myBicycle);
        startTrip(myCar);

        
    }

    public static void startTrip(Drivable vehicle)
    {
        vehicle.drive();    
    }
}
