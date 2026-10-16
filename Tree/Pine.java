package Tree;

public class Pine extends Tree
{
    Pine(double height)
    {
        super(height);
    }

    Pine()
    {
        super(3);
    }
    
    public void describe()
    {
        System.out.println("This tree is a pine.");
        System.out.println("My height is " + height);
    }

   
}
