package Ovning4;

public class StringWorkshop 
{
    public static void main(String[] args)
    {
        String firstName = "Emma"; 
        String middleNames = "Johanna Larsdotter";
        String lastName = "Hessfelt";                
        String fullName = firstName + " " + middleNames + " " + lastName; 
        String city = "Göteborg";
        String profession = "Mjukvarutestare";
        
        //System.out.println(fullName); 
        //System.out.println(fullName.length()); 

        System.out.println("Hej! Jag heter " + fullName + ".");
        System.out.println("Mitt namn innehåller " + fullName.length() + " tecken.");
        System.out.println(fullName + " bor i " + city + " och utbildar sig till " + profession + ".");

    }    
}
