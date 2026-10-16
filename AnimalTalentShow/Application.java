package AnimalTalentShow;

public class Application 
{
    public static void main(String[] args) 
    {
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        myCat.makeSound();
        myDog.makeSound();    
        
        //Varför måste jag casta Dog till Playable? Dog implementerar ju Playable...#confusion
        showTalent((Playable)myDog);
        showTalent((Playable)myCat);
    }

    public static void showTalent(Playable participant)
    {
        participant.play();
    }
}
