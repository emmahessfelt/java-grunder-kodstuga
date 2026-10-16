package Zoo;

public class Animal 
{
    public String name;

    Animal(String name)
    {
        this.name = name;
    }

    Animal()
    {
        this("Default Animal");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void makeSound()
    {
        System.out.println("This is the sound of Animal");
    }
    


}
