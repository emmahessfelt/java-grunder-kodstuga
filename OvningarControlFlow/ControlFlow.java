package OvningarControlFlow;
import java.util.Scanner;

public class ControlFlow 
{
    public static void main(String[] args) 
    {
        //Create a variable to test scope. Commenting it out after testing.
        //String scopeTest = "This is a variable to be used for testing out of scope.";

        //create a variable to test if a number is greater than 10
        int number = 15;

        //print a message if number is greater than 10
        if (number > 10) 
        {
            System.out.println("The number " + number + " is greater than 10.");
        } 
        else 
        {
            System.out.println("The number " + number + " is not greater than 10.");
        }

        //checkAge();
        //checkNumber();
        //switchTest();
        //whileTest();
        //doWhileTest();
        //forTest();
        //breakTest();
        continueTest();
    }

    public static void checkAge()
    {
       //This will not work because scopeTest is out of scope. Commenting out the line below will allow the program to compile and run.
        //System.out.println(scopeTest); 

        //Create a program that checks if the user is 18 years old or older and prints out a message accordingly.
        Scanner sc = new Scanner(System.in);
        System.out.println("How old are you?: ");
        int age = sc.nextInt();
        if (age >= 18) 
        {
            System.out.println("You are an adult.");
        } 
        else 
        {
            System.out.println("You are a minor.");
        }
        sc.close();
    }

    public static void checkNumber() 
    {
        //Create a program that checks if a number is small, medium or large and prints out a message accordingly.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a whole number: ");
        int number = sc.nextInt();
        if (number >= 100) 
        {
            System.out.println("The number " + number + " is large.");
        } 
        else if (number >= 10 && number < 100) 
        {
            System.out.println("The number " + number + " is medium.");
        } 
        else if (number < 10 && number >= 0) 
        {
            System.out.println("The number " + number + " is small.");
        } 
        else 
        {
            System.out.println("This number is out of range.");
        }
        sc.close();       
    }

    public static void switchTest()
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number between 1 and 3: ");
            int switchNumber = sc.nextInt();
            switch (switchNumber)
            {
                case 1:
                    System.out.println("You entered 1.");
                    break;
                case 2:
                    System.out.println("You entered 2.");
                    break;
                case 3:
                    System.out.println("You entered 3.");
                    break;
                default:
                    System.out.println("Invalid input.");
            }
            sc.close();
        }
    
    public static void whileTest()
    {
       
        int i = 1;
        while(i < 6)
        {
            System.out.println("The value of i is: " + i);
            i++;
        }
    }
    
    public static void doWhileTest()
    {
        int i = 0;
        do 
        {
            System.out.println("This is a message from outer space.");
            i++;
        } while (i < 3);             
        
    }

    public static void forTest()
    {
        for (int i = 1; i < 11; i++)
        {
            System.out.println("i is equal to: " + i);
        }
    }

    public static void breakTest()
    {
        int i = 1;
        while (true)
        {
            System.out.println("i is " + i + ". I will stop counting when I reach 12.");
            i++;
            if (i == 13)
            {
                break;
            }

        }
    }

    public static void continueTest()
    {
        for (int i = 0; i < 11; i++)
        {
            if (i == 6)
            {
                continue;
            }
        System.out.println("This is round " + i + ". I will skip round 6.");
        }
    }

}
