package Kodstuga2;

public class Animal 
{
    private String name;
    private int age;
    private String sound;    

    Animal(String name, int age, String sound)
    {
        this.name = name;
        this.age = age;
        this.sound = sound;
    }

    Animal()
    {
        this("Kira", 4, "Spacketitang");
    }

    public void getAnimal()
    {
        System.out.println("This animal " + this.name + " is " + this.age + " years old and sounds like this: " + this.sound + ".");
    }

    public void gorLjud()
    {
        System.out.println(this.sound);
    }
}
