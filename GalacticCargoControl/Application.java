package GalacticCargoControl;

import java.util.InputMismatchException;
//import java.util.List;
import java.util.Scanner;

public class Application 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        boolean quitProgram = false;        
        Menu.createMenu();  
        ApprovedCargos approvedCargos = new ApprovedCargos();
        int menuChoice;   
        System.out.println("Welcome to the Galactic Cargo Control!");        
        
        try
        {
            while(!quitProgram)
            {       

                while (true) 
                {
                    Menu.printMenu();		
                    try 
                    {                    
                        menuChoice = scanner.nextInt();
                        scanner.nextLine();
                        break;
                    }    
                    catch (InputMismatchException e) 
                    {
                        System.out.println("Please enter a whole number.");
                        scanner.nextLine(); // Discard the invalid input
                    }            
                }      

                switch (menuChoice) 
                {
                    //Register new cargo
                    case 1:                    
                        approvedCargos.addApprovedCargo(registerNewCargo(scanner));
                        break;
                    //Show all approved cargos
                    case 2:
                        approvedCargos.showApprovedCargos();
                        break;
                    //Quit the program                    
                    case 3:
                        quitProgram = true;                   
                        break;                   
                    default:
                        break;
                }  
            }    
        }
        finally
        {
            scanner.close();  
        }
    }

    public static Cargo registerNewCargo(Scanner scanner)
    {
        String newCargoName = "";
        int newCargoWeight = 0;
        
        while(newCargoName.isBlank())
        {
            System.out.println("Enter the name of the cargo: ");            
            newCargoName = scanner.nextLine();
           
            if (newCargoName.isBlank())
            {
                System.out.println("The name can not be empty.");
            }
        }    
        
        while (true) 
        {
            System.out.println("Enter the weight of the cargo: ");
            try 
            {
                newCargoWeight = scanner.nextInt();
                scanner.nextLine(); // Consume the rest of the line
                controlCargoMaxWeight(newCargoWeight);
                break;
            } 
            catch (InputMismatchException e) 
            {
                System.out.println("Please enter a whole number.");
                scanner.nextLine(); // Discard the invalid input
            }
            catch(MaxWeightExceededException e)
            {
                System.out.println(e.getMessage());
            }
        }      
        
        System.out.println("Cargo successfully registered.\n");
        return new Cargo(newCargoName, newCargoWeight);

    }

    public static void controlCargoMaxWeight(int weight) throws MaxWeightExceededException
    {
        if (weight > MaxMinValues.MAXWEIGHT.getMaximum())
        {
            throw new MaxWeightExceededException();            
        }       
    }   
}
