package Ovning5;

public class BugHunt 
{
    public static void main(String[] args) 
    { 
 
        String name = "Ada";  //gement s i början i string och semikolon saknas i slutet
        int age = 25; //age ska vara en int, inte en String, så citationstecken ska tas bort 
        /* Dessa variabler används inte, har rättat felen
        double height = 1.72;  //decimaltecknet ska vara punkt istället för komma
        char grade = 'A';  //Det ska var enkelt citattecken istället för dubbelt citattecken
        boolean likesJava = true;  //true ska inte vara inom citationstecken, då blir det en String
        */
        int apples = 5; 
        int bananas = 2; 
        int fruit = apples + bananas;  //frukt ska vara fruit, inte fruit, och plustecknet saknas mellan variablerna apples och bananas
 
        System.out.println("Fruit: " + fruit);  
        System.out.println("Fruit: " + (apples + bananas));
        System.out.println("Name: " + name);  //plustecknet saknas mellan strängen och variabeln name
        System.out.println(age == 25); //kommer skriva ut true om vi rättar variable age
    } 
    
}
