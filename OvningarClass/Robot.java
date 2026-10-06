package OvningarClass;
/*
Skapa en klass Robot med ett public field namn och ett private field batteri. 

Sätt värdena med en konstruktor och använd this. 

Skapa en metod visaStatus() som skriver ut namn och batteri. 

Skapa en robot i Main. Testa vad som händer om du försöker ändra batteri direkt från Main. 
*/
public class Robot 
{

    public String namn;
    private int batteri;

    Robot(String namn, int batteri)
    {
        this.namn = namn;
        this.batteri = batteri;
    }

    Robot()
    {
        this("Default Name Nina", 100);
    }

    void visaStatus()
    {
        System.out.println("Din robot " + this.namn + " har " + this.batteri + " procent av sitt batteri kvar.");
    }

    
}
