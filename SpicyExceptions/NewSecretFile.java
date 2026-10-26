package SpicyExceptions;    
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;


public class NewSecretFile 
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
         catch(NoSuchElementException e)
        {
            System.out.println("The file is empty.");
        }
    }

    public static void readSecretFile(String fileName) throws FileNotFoundException, NoSuchElementException
    {
        File myFile = new File(fileName);
        Scanner myReader = new Scanner(myFile);
        String firstLine = myReader.nextLine();
        System.out.println(firstLine);       
       
        myReader.close();
    }
}




