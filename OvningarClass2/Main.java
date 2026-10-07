package OvningarClass2;

import java.util.Scanner;


public class Main 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        Book title1 = new Book();
        
        System.out.println("This book has the title '" + title1.title + "' and it was published " + title1.myYear + ".");

        System.out.println("What is your name?");
        String name = sc.nextLine();
        System.out.println("How old are you?");
        int age = sc.nextInt();
        System.out.println("What's your current grade in programming?");
        double grade = sc.nextDouble();

        Student Emma = new Student(name, age, grade);
        System.out.println("Hej" + Emma.name + Emma.age + Emma.grade);


    }    
}
