package Kodstuga2;

public class Animals 
{
    public static void main(String[] args) 
    {
        Animal Kira = new Animal();
        Animal Dax = new Animal("Dax", 12, "Katiwatipatong");

        Kira.getAnimal();
        Dax.getAnimal();

        Kira.gorLjud();
        Dax.gorLjud();
    }    
}
