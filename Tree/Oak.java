package Tree;

public class Oak extends Tree
{

    Oak(double height)
    {
        super(height);
    }
    
    Oak()
    {
        super(2);
    }

    public void describe()
    {
        System.out.println("This tree is an oak.");
        System.out.println("My height is " + height);
    }  


}
