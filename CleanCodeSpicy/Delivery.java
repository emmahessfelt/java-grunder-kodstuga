package CleanCodeSpicy;

public class Delivery 
{
    
    private String parcelName;
    private int tip;
    private boolean dangerOnTheRoad;
    private int distance;

    Delivery()
    {
        this.parcelName = "";
        this.tip = 0;
        this.dangerOnTheRoad = false;
        this.distance = 0;
    }

    Delivery(String parcelName, int tip, boolean dangerOnTheRoad, int distance)
    {
        this.parcelName = parcelName;
        this.tip = tip;
        this.dangerOnTheRoad = dangerOnTheRoad;
        this.distance = distance;
    }

    public int calculateTotalPrice()
    {
        int totalPrice = this.distance * Surcharges.DISTANCE.getMultiplier();

        if (this.dangerOnTheRoad)
        {
            totalPrice += Surcharges.DANGER.getMultiplier();
        }
        
        totalPrice += this.tip;

        return totalPrice;        
    }

    public void damageIfDanger(Player player)
    {
        if (this.dangerOnTheRoad == true)
        {
            player.takeDamage(Surcharges.DANGERDAMAGE.getMultiplier());
        }
    }

    public void printDeliverySummary(Player player)
    {
        System.out.println("=== Delivery complete ===");
        System.out.println("Courier: " + player.getName());
        System.out.println("Parcel: " + parcelName);
        System.out.println("Price: " + calculateTotalPrice() + " coins");
        System.out.println("Health points left: " + player.getHealthPoints());
        System.out.println("Amount left in wallet: " + player.getWallet());
    }

}
