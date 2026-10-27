package CleanCodeSpicy;

public enum Surcharges 
{
    DISTANCE(8), 
    DANGER(50);

    private int mulitplier;
    
    private Surcharges(int multiplier)
    {
        this.mulitplier = multiplier;
    }

    public int getMultiplier()
    {
        return mulitplier;
    }
}
