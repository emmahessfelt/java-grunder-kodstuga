package Zoo;

public class Dog extends Animal
{    
    
    Dog()
    {
        super("Dog");
    }

    Dog(String name)
    {
        super(name);
    }

    @Override 
    public void makeSound()
    {
        System.out.println("This is the sound of Dog");
    }
}
