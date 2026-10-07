package OvningarClass3;

import java.util.ArrayList;
import java.util.List;

public class Fleet 
{
    private List<Spaceship> spaceships;

    public Fleet() 
    {
        spaceships = new ArrayList<>();
    }

    public void addSpaceship(Spaceship spaceship) 
    {
        spaceships.add(spaceship);
    }

    public Spaceship getSpaceship(int index) 
    {
        return spaceships.get(index);
    }

    public int getFleetSize() 
    {
        return spaceships.size();
    }
}
