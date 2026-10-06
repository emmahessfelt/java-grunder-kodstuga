package OvningarClass;
/*
Skapa en klass Djur med ett field som heter ljud. 

Skapa en konstruktor som tar emot ljudet. 

Skapa metoden gorLjud() som skriver ut ljudet. 

Skapa en hund och en katt i Main och låt dem göra olika ljud. 
*/
public class Djur
{
    String ljud;

    Djur(String ljud)
    {
        this.ljud = ljud;
    }

    void gorLjud()
    {
        System.out.println(this.ljud);
    }

}
