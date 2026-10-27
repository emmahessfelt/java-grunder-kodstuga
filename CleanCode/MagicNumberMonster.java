package CleanCode;

public class MagicNumberMonster 
{

    private static final int LEVEL2SCORE = 100;
    public static void main(String[] args) 
    {
        int playerScore = 120;
  
        if (playerScore >= LEVEL2SCORE) 
        { 
            System.out.println("Level up!"); 
        } 
    }
}
