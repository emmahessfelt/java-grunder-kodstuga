package Tree;

public abstract class Tree 
{
    double height;

    public abstract void describe();
    
    Tree(double height)
    {
        this.height = height;
    }

    public void setHeight(double height)
    {
        this.height = height;
    }

    public double getHeight()
    {
        return this.height;
    }
}
