package PracticeCollections;
import java.util.LinkedList; 
import java.util.Queue; 

public class Application 
{
    public static void main(String[] args) 
    {
        //start of Queue guests
        Guest cafeGuests = new Guest();

        cafeGuests.newGuest("Aphdrodite");
        cafeGuests.newGuest("Hera");
        cafeGuests.newGuest("Athena");
        cafeGuests.newGuest("Gaia");

        System.out.print("Guests in line: ");
        cafeGuests.printGuests();
        System.out.print("Take a peek of who's first in line: ");
        System.out.println(cafeGuests.peekGuest());
        System.out.println("Serving to guests.");
        cafeGuests.serveGuest();
        cafeGuests.serveGuest();
        System.out.print("Guests left in line: ");
        cafeGuests.printGuests();

        //start of HashSet members
        Member cafeMembers = new Member();
        cafeMembers.newMember("Aphrodite");
        cafeMembers.newMember("Gaia");
        cafeMembers.newMember("Hera");
        cafeMembers.newMember("Aphrodite");
        System.out.println("Members: ");
        cafeMembers.printMembers();

        //start of LinkedList game
        Game cafeGame = new Game();
        cafeGame.newGame(15);
        cafeGame.newGame(25);
        cafeGame.newGame(3);
        cafeGame.newGame(18);
        cafeGame.printGameList();
        cafeGame.getTopList();
        cafeGame.printGameList();

    }
}
