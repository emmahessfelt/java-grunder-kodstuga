package PracticeCollections;
import java.util.List;
import java.util.Collections;
import java.util.LinkedList;

public class Game 
{
    List<Integer> gameList = new LinkedList<>();

    public void newGame(int points)
    {
        gameList.add(points);
    }

    public List<Integer> getGameList()
    {
        return gameList;
    }

    public List<Integer> getTopList()
    {
        Collections.sort(gameList, Collections.reverseOrder());
        return gameList;
    }

    public void printGameList()
    {
        System.out.println(gameList);
    }
    
}
