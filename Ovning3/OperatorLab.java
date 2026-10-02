package Ovning3;

public class OperatorLab 
{
    public static void main(String[] args) 
    {
        int a = 10; 
        int b = 3; 
        int number = 17;
        int age = 20;

        boolean test1 = age > 18; 
        boolean test2 = age < 18; 
        boolean test3 = age == 20; 
        boolean test4 = age != 20;

        boolean hasTicket = true; 
        boolean isAdult = false; 

        boolean allowed = hasTicket || isAdult;
        
        System.out.println(a + b); //Prints 13
        System.out.println(a - b); //Prints 7
        System.out.println(a * b); //Prints 30
        System.out.println(a / b); //Prints 3
        System.out.println(a % b); //Prints 1
        
        System.out.println(number % 2); //resten blir 1, 8 och 8 = 16 och 1 över

        System.out.println(test1); //prints true
        System.out.println(test2); //prints false
        System.out.println(test3); //prints true
        System.out.println(test4); //prints false

        System.out.println(allowed); //prints true

        
    }    
}
