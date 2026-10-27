package CleanCodeSpicy;

public class Main 
{
    public static void main(String[] args) 
    {
        Player player1 = new Player("Mira", 100, 200);
        Delivery delivery1 = new Delivery("Mystisk kista", 8, true, 10);    
        int totalDeliveryPrice = delivery1.calculateTotalPrice();
        
        if(player1.canPlayerAffordDelivery(totalDeliveryPrice))
        {
            //deliver
            player1.pay(totalDeliveryPrice);
            delivery1.printDeliverySummary(player1);
        }
        else
        {
            System.out.println(player1.getName() + " cannot afford the delivery.");
        }
    }
}
