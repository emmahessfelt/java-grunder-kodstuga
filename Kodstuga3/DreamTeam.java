package Kodstuga3;


public class DreamTeam 
{
    public static void main(String[] args) 
    {
    
        String myDreamTeam[] = {"Sub-commander T'Pol", "Liutenant Malcolm Reed", "Doctor Phlox", "Ensign Hoshi Sato", "Commander Charles Tucker III"};
        
        printFirstAndLast(myDreamTeam);

        printNofPlayers(myDreamTeam);

        changeTeamMember(1, myDreamTeam, "Ensign Travis Mayweather");

        printAllTeamMembers(myDreamTeam);
        
    }
   
    private static void printFirstAndLast(String DreamTeam[])
    {
        int nofElements = getNofPlayers(DreamTeam);

        for (int i = 0; i < nofElements; i++)
        {
            if (i == 0 || i == (nofElements - 1))
            {
                System.out.println(DreamTeam[i]);
            }
            else
            {
                continue;
            }
        }
    }

    private static void changeTeamMember(int index, String DreamTeam[], String newName)
    {
        DreamTeam[index] = newName;
    }

   
    private static void printAllTeamMembers(String DreamTeam[])
    {
        for (String member : DreamTeam)
        {
            System.out.println(member);
        }
    }
    
    private static int getNofPlayers(String DreamTeam[])
    {
        int nofElements = DreamTeam.length;
        return nofElements;
    }

    private static void printNofPlayers(String DreamTeam[])
    {
        int nofElements = DreamTeam.length;
        System.out.println("This array has " + nofElements + " number of elements.");
    }


}
