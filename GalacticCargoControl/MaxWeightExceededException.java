package GalacticCargoControl;

public class MaxWeightExceededException extends Exception
{
    MaxWeightExceededException()
    {
        String errorMessage = "The cargo is too heavy. The cargo weight cannot exceed " + MaxMinValues.MAXWEIGHT.getMaximum();
        super(errorMessage);
    } 
}
