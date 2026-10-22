package PracticeCollections;
import java.util.LinkedList; 
import java.util.Queue; 

public class Guest 
{
    private Queue<String> guests = new LinkedList<String>();

    /*Guest(LinkedList<String> guests)
    {
        this.guests = guests;
    }*/

    public Queue<String> getGuests() 
    {
        return guests;
    }

    public void newGuest(String name)
    {
        guests.add(name);
    }

    public String peekGuest()
    {
        String guest = guests.peek();
        return guest;
    }

    public String serveGuest()
    {
        String guest = guests.poll();
        return guest;
    }

    public int getGuestsSize()
    {
        int size = guests.size();
        return size;
    }

    public void printGuests()
    {
        System.out.println(guests);
    }

    
}
