package PracticeArraysEnums;
import java.util.Arrays;

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
        int[] treasureCoords;
        System.out.println("Welcome to the treasure hunt! The treasure is in a matrix. You are looking for the value 100.");
        int[][] myMatrix = {{56, 39, 27}, {94, 100, 13}, {7, 72, 44}};
        TreasureMap myMap = new TreasureMap(myMatrix);
        myMap.printMap();
        treasureCoords = myMap.searchForTreasure(100);
        System.out.println("The treasure can be found at coordinates x = " + treasureCoords[0] + " and y = " + treasureCoords[1]);
        myMap.setValue(0, 2, 100); 
        myMap.setValue(1, 1, 27);
        myMap.printMap();
        treasureCoords = myMap.searchForTreasure(100);
        System.out.println("The treasure can be found at coordinates x = " + treasureCoords[0] + " and y = " + treasureCoords[1]);

        //Start of compass and directions
        Compass myCompass = new Compass();
        myCompass.whereAreYouGoing();
        myCompass.printAllDirections();
        myCompass.setDirection(Direction.SOUTH);
        myCompass.whereAreYouGoing();

        //Start of dice
        Dice myDice = new Dice();
        int sumOfRolls = 0;
        sumOfRolls = myDice.sumOfRolls();
        System.out.println("The sum of all rolls are: " + sumOfRolls);
        myDice.sortRolls();
        myDice.printRolls();
        myDice.highAndLow();
        myDice.findSix();
        int[] copyOfRolls = myDice.copyofRolls();
        System.out.println(Arrays.toString(copyOfRolls));






    }  
    
    
}
