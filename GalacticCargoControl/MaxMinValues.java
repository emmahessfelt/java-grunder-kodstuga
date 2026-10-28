package GalacticCargoControl;

public enum MaxMinValues 
{
    MAXWEIGHT(500);

    private final int maximum;

    private MaxMinValues(int maximum)
    {
        this.maximum = maximum;
    }

    public int getMaximum()
    {
        return maximum;
    }


}
