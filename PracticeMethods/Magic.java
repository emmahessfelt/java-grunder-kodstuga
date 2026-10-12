package PracticeMethods;

public class Magic 
{
    int iPower;
    String sPower;

    Magic()
    {
        iPower = 50;
        sPower = "Makten";
    }
    
    public void setPower(int power)
    {
        this.iPower = power;
    }   
    
    public void setPower(String power)
    {
        this.sPower = power;
    }

    public void showMagic()
    {
        System.out.println(sPower);
        System.out.println(iPower);
    }
}
