public class PersonCard
{
    public static void main(String[] args)
    {
        String firstName = "Emma";
        String lastName = "Hessfelt";
        int age = 50;
        double height = 1.63;
        char grade = 'A';
        boolean likesJava = false;
        int ageNextYear = age + 1;

        System.out.println("Namn: " + firstName + " " + lastName);
        System.out.println("Ålder: " + age);
        System.out.println("Längd: " + height + " m");
        System.out.println("Betyg: " + grade);
        System.out.println("Gillar Java: " + likesJava);
        System.out.println("Nästa år är " + firstName + " " + ageNextYear);
        
    }
}