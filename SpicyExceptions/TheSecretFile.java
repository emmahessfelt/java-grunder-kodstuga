package SpicyExceptions;
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
            System.out.println("File not found");
        }
    }

    public static void readSecretFile(String fileName) throws FileNotFoundException
    {
        File myFile = new File(fileName);
        Scanner myReader = new Scanner(myFile);
        
        String firstLine = myReader.nextLine();
        System.out.println(firstLine);
        myReader.close();
    }
}
