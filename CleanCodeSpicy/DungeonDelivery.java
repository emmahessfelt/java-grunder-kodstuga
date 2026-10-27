package CleanCodeSpicy;

public class DungeonDelivery { 
    static String n = "Mira"; 
    static int hp = 100; 
    static int c = 180; 
 
    static void x(String i, int d, boolean danger, int tip) { 
        // calculate price 
        int p = d * 8; 
        if (danger) { 
            p = p + 50; 
        } 
        if (tip > 0) { 
            p = p + tip; 
        } 
 
        // check if player can pay 
        if (c < p) { 
            System.out.println(n + " har inte råd med leveransen."); 
            return; 
        } 
 
        c = c - p; 
 
        // dangerous roads hurt the player 
        if (danger) { 
            hp = hp - 20; 
        } 
 
        if (hp < 0) { 
            hp = 0; 
        } 
 
        System.out.println("=== Leverans klar ==="); 
        System.out.println("Bud: " + n); 
        System.out.println("Paket: " + i); 
        System.out.println("Pris: " + p + " coins"); 
        System.out.println("HP kvar: " + hp); 
        System.out.println("Coins kvar: " + c); 
    } 
 
    public static void main(String[] args) { 
        x("Mystisk kista", 8, true, 10); 
    } 
} 