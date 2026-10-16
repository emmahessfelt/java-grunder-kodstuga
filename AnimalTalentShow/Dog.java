package AnimalTalentShow;

public class Dog extends Animal implements Playable
{
    public void play()
    {
        System.out.println("Wagging my tail and chasing a bone.");
    }

    public void makeSound()
    {
        System.out.println("Growling growling");
    }
}
