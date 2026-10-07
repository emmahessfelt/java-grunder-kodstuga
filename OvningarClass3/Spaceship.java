package OvningarClass3;

public class Spaceship 
{
   
    private String name;
    private String model;
    private String captain;
    private int crewSize;
    private double fuelLevel;
    private double warpSpeed;
    private int shieldStrength;
       
    
    Spaceship(String name, String model, String captain, int crewSize, double fuelLevel, double warpSpeed, int shieldStrength)
    {
        this.name = name;
        this.model = model;
        this.captain = captain;
        this.crewSize = crewSize;
        this.fuelLevel = fuelLevel;
        this.warpSpeed = warpSpeed;
        this.shieldStrength = shieldStrength;
    }

    Spaceship()
    {
        this("Enterprise", "E-1907", "Jean-Luc Picard", 300, 5000, 8.9, 100);
    }

    void present()
    {
        System.out.println(this.name);
        System.out.println(this.model);
        System.out.println(this.captain);
        System.out.println(this.crewSize);
        System.out.println(this.fuelLevel);
        System.out.println(this.warpSpeed);
        System.out.println(this.shieldStrength);
    }


}
