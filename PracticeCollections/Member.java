package PracticeCollections;
import java.util.Set;
import java.util.HashSet;

public class Member 
{
    Set<String> members = new HashSet<String>();

    public Set<String> getMembers()
    {
        return members;
    }

    public void newMember(String name)
    {
        boolean available;
        available = members.add(name);
        if (available)
        {
            System.out.println("New member " + name + " successfully added.");
        }
        else
        {            
            System.out.println("Member " + name + " already exists. Unable to register.");
        }
    }

    public int sizeOfMembers()
    {
        return members.size();
    }

    public void printMembers()
    {
        for (String member : members)
        {
            System.out.println(member);
        }
    }


}
