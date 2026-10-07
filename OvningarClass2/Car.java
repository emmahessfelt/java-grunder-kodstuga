package OvningarClass2;
/*
Create a Car class with the following properties: 
make (String), model (String), year (int), and color (String). 
Implement multiple constructors, including a parameterized constructor and constructor chaining. 
Create instances of the Car class using different constructors and print the details. 
*/
public class Car 
{
    String make;
    String model;
    int year;
    String color;

    Car(String make, String model, int year, String color)
    {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
    }
    
    Car()
    {
        this("Car brand", "Car model", 2023, "Black");
    }

}
