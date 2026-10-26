package SpicyExceptions;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;


public class TheSecretFile 
{
    public static void main(String[] args) 
    {
        try
        {
            readSecretFile("myFile.txt");
        }
        catch(FileNotFoundException e)
        {
            //System.out.println("File not found");
            System.out.println(e.getMessage());
        }
    }

    public static void readSecretFile(String fileName) throws FileNotFoundException
    {
        File myFile = new File(fileName);
        Scanner myReader = new Scanner(myFile);

        try
        {
            String firstLine = myReader.nextLine();
            System.out.println(firstLine);
        }
        catch(NoSuchElementException e)
        {
            System.out.println("The file is empty.");
        }
        myReader.close();
    }
}
