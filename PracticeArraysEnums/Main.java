package PracticeArraysEnums;

public class Main 
{
    public static void main(String[] args) 
    {
        
        //start of items
        String[] myItems = {"peacebloom", "silverleaf", "earthbloom", "briarthorn", "mageroyal"};
        Items newItems = new Items(myItems);

        int itemsLength = newItems.lengthOfItems();

        System.out.println("My first item is " + newItems.getItem(0));
        System.out.println("My last item is " + newItems.getItem(itemsLength-1));
        newItems.setItem(2, "dandelion");
        System.out.println("I have " + itemsLength + " items in my bag.");

        //start of highscore
        int[] myPoints = {46, 77, 93, 24, 12};
        Points newPoints = new Points(myPoints);
        int sumOfPoints = 0;
        int heighestPoint = 0;

        newPoints.printAllPoints();
        sumOfPoints = newPoints.sumOfPoints();
        System.out.println("The sum of all points are: " + sumOfPoints);
        newPoints.sortPoints();
        heighestPoint = newPoints.highestPoint();
        System.out.println("The heighest point is: " + heighestPoint);
        newPoints.printWithStrings();

        //start of treasure map
        TreasureMap myMap = new TreasureMap();

    }  
    
    
}
