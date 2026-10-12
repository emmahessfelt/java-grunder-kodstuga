package PracticeMethods;

public class Pizza 
{
    public static void main(String[] args) 
    {
        double price;
        price = totalPricePizzas(5, 125);
        System.out.print(price);
    }   
    
    public static double totalPricePizzas(int nofPizzas, double pricePizza)
    {
        double totalPrice = nofPizzas * pricePizza;
        return totalPrice;
    }
}
