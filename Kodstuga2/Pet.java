package Kodstuga2;
import  java.awt.Toolkit;

public class Pet 
{
    private String name;
    private int hunger;
    private int energy;
    
    Pet(String name, int hunger, int energy)
    {
        this.name = name;
        this.hunger = hunger;
        this.energy = energy;
    }

    Pet()
    {
        this("Momo", 10, 100);
    }

    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHunger() {
        return hunger;
    }

    public void setHunger(int hunger) {
        this.hunger = hunger;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public void getPet()
    {
        System.out.println("Hunger: " + this.hunger + " Energy: " + this.energy);
    }

    public void eat()
    {
        this.hunger -= 2;        
    }

    public boolean play()
    {
        
        if (this.energy > 5)
        {
            this.energy -= 5;
            this.hunger += 2;
            if (this.energy < 10)
            {
                Toolkit.getDefaultToolkit().beep();   
                System.out.println("I am tired. I am tired. I am tired.");                             
            }           
        }
        else
        {
            System.out.println("I am to tired to play.");
        }
        if (this.hunger >= 20)
        {
            System.out.println("I am hungry. I am hungry. I am hungry.");
            Toolkit.getDefaultToolkit().beep();
            return true;
        }
        else
        {
            return false;
        }

    }
}
