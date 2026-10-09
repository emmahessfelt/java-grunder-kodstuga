package Kodstuga2;

public class Tamagothi 
{
    public static void main(String[] args) 
    {
        int i = 0;
        boolean hungry;
        Pet Mimi = new Pet("Mimi", 10, 30);

        while(i < 10)
        {
            hungry = Mimi.play();
            i++;
            Mimi.getPet();
            if (hungry == true)
            {
                Mimi.eat();
            }
        }
    }    
}
