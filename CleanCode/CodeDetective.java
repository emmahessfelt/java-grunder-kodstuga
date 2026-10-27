package CleanCode;

public class CodeDetective 
{    
    public static void main(String[] args) 
    {        
    
        String customerName = "Mira"; 
        int numberOfDrinks = 3; 
        double drinkPrice = 30.0; 
        double totalPrice = numberOfDrinks * drinkPrice; 
    
        System.out.println(customerName + " köper drycker för " + Math.round(totalPrice) + " kr."); 

    }
}
