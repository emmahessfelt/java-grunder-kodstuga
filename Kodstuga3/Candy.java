package Kodstuga3;

public class Candy 
{
    private String typeOfCandy;
    private String taste;
    private double price;   
    
    Candy(String typeOfCandy, String taste, double price)
    {
        this.typeOfCandy = typeOfCandy;
        this.taste = taste;
        this.price = price;
    }

    Candy()
    {
        this("Skum", "rhubarb", 2.50);
    }

    

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    public String getTypeOfCandy(Candy myCandy)
    {
        return myCandy.typeOfCandy;
    }

    public double totalPrice(int nofCandy, Candy myCandy)
    {
        double totalPrice = nofCandy * myCandy.price;
        return totalPrice;

    }
}
