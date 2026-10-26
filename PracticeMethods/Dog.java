package PracticeMethods;

public class Dog 
{
    private int hunger;
    private String name;

    Dog(int hunger, String name)
    {
        this.hunger = hunger;
        this.name = name;
    }
    
    
    public int getHunger() {
        return hunger;
    }


    public void setHunger(int hunger) {
        this.hunger = hunger;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public void eat()
    {
        this.hunger -= 10;
    }

    public void showHunger()
    {
        System.out.println("My hunger level is " + hunger + ".");
    }
}
