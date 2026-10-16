package Tree;

public class Application 
{
    public static void main(String[] args) 
    {
        Tree myOak = new Oak(12.6);
        Tree myPine = new Pine(8.7);
   
        //myOak.setHeight(35);
        //myPine.setHeight(12.7);

        myOak.describe();
        myPine.describe();
    }    
}
