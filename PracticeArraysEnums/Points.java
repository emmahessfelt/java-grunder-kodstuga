package PracticeArraysEnums;
import java.util.Arrays;

public class Points 
{
    int[] points = new int[5];
    
    Points(int[] points)
    {
        int i = 0;
        for (int point : points)
        {
            this.points[i] = point;
            i++;
        }
    }

    Points()
    {
        int[] defaultPoints = {5, 5, 5, 5, 5};
        this(defaultPoints);
    }

    public void printAllPoints()
    {
        for (int point : this.points)
        {
            System.out.println("Points: " + point);
        }
    }

    public int sumOfPoints()
    {
        int sumOfPoints = 0;
        for (int point : this.points)
        {
            sumOfPoints += point;
        }

        return sumOfPoints;
    }

    public void sortPoints()
    {
        Arrays.sort(this.points);
        this.printAllPoints();
    }

    public int highestPoint()
    {
       int highestPoints = Arrays.stream(this.points).max().getAsInt();
       return highestPoints;
    }

    public void printWithStrings()
    {
        System.out.println(Arrays.toString(this.points));
    }
}
