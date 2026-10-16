package Zoo;

public class Cat extends Animal
{
    Cat()
    {
        super("Cat");
    }

    Cat(String name)
    {
        super(name);
    }

    @Override 
    public void makeSound()
    {
        System.out.println("This is the sound of Cat");
    }
}
