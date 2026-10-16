package Zoo;

public class Application 
{
    public static void main(String[] args) 
    {
        Animal myCat = new Cat("Gösta");
        Animal myDog = new Dog("Demo");   
        
        myCat.makeSound();
        myDog.makeSound();
    }
}
