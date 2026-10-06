package OvningarClass;
/*
Skapa en klass Spelkaraktar med fields för namn och liv. 

Skapa en konstruktor som sätter namn och liv. 

Skapa en metod presentera() som skriver ut karaktärens namn och liv. 

Skapa två olika karaktärer i Main. 
*/
public class Spelkaraktar {
    
    String namn;
    int liv;

    Spelkaraktar(String namn, int liv)
    {
        this.namn = namn;
        this.liv = liv;
    }

    void presentera()
    {
        System.out.println("Din karaktär heter " + this.namn + " och du har " + this.liv + " liv.");        
    }
}
