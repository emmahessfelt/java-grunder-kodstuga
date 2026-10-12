package Kodstuga2;

public class Tamagothi 
{
    public static void main(String[] args) 
    {
        int i = 0;
        boolean hungry;
        Pet mimi = new Pet("Mimi", 10, 30);

        while(i < 10)
        {
            hungry = mimi.play();
            i++;
            mimi.getPet();
            if (hungry == true)
            {
                mimi.eat();
            }
        }
    }    
}
