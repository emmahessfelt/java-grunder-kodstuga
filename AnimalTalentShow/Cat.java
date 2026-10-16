package AnimalTalentShow;

public class Cat extends Animal implements Playable
{
    public void play()
    {
        System.out.println("Making biscuits and chasing rats.");
    }

    public void makeSound()
    {
        System.out.println("Prrrrrr");
    }
}
