package OvningarClass;

public class Main 
{
    public static void main(String[] args) 
    {
        Djur katt = new Djur("Pprrrrrr");
        Djur hund = new Djur("Ggrrrrrr");

        Spelkaraktar firstPlayer = new Spelkaraktar("Neelix", 300);
        Spelkaraktar secondPlayer = new Spelkaraktar("Seven of Nine", 3000);

        Robot myRobot = new Robot("Staccato", 56);     
        Robot myDefaultRobot = new Robot();   

        katt.gorLjud();
        hund.gorLjud();
        
        firstPlayer.presentera();
        secondPlayer.presentera();

        myRobot.visaStatus();
        myDefaultRobot.visaStatus();
        //myRobot.batteri = 35; //Error: The field Robot.batteri is not visible
    }    
}
