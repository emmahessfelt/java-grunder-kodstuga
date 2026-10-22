package PracticeCollections;
import java.util.LinkedList; 
import java.util.Queue; 

public class MysteriousQueue 
{
    public static void main(String[] args) 
    { 

        Queue<String> ko = new LinkedList<>(); 
        ko.offer("Alex");
        ko.offer("Kim");         
        ko.offer("Kim"); 

        System.out.println(ko.peek()); 
        System.out.println(ko.poll()); 
        System.out.println(ko.size()); 
        System.out.println(ko); 

    } 
}
