package CleanCodeSpicy;

public class Main 
{
    public static void main(String[] args) 
    {
        Player player1 = new Player("Mira", 100, 200);
        Delivery delivery1 = new Delivery("Mystisk kista", 8, true, 10);   
        Delivery delivery2 = new Delivery("Envelope", 2, false, 3);         
        
        //a dangerous delivery
        deliver(player1, delivery1);

        //a safe delivery
        deliver(player1, delivery2);
        
    }

    public static void deliver(Player player, Delivery delivery)
    {
        int totalDeliveryPrice = delivery.calculateTotalPrice();
                
        if(player.canPlayerAffordDelivery(totalDeliveryPrice))
        {
            //pay and deliver
            player.pay(totalDeliveryPrice);
            delivery.damageIfDanger(player);
            delivery.printDeliverySummary(player);
        }
        else
        {
            System.out.println(player.getName() + " cannot afford the delivery.");
        }
    }
}
