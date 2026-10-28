package GalacticCargoControl;

public class Cargo 
{
    private String name;
    private int weight;

    Cargo(String name, int weight)
    {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) 
    {
        if (name == null || name.isBlank()) 
        {
            throw new IllegalArgumentException("Cargo name cannot be blank.");
        }       

        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(int weight) 
    {
        if (weight < 0 || weight > MaxMinValues.MAXWEIGHT.getMaximum()) 
        {
            throw new IllegalArgumentException("Cargo weight must be between 0 and "+ MaxMinValues.MAXWEIGHT.getMaximum());
        }
        this.weight = weight;
    }
}


