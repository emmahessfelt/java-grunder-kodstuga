package OvningarClass2;

import java.time.Year;

/*
Create a Book class with the following properties: 
title (String), author (String), and year (int). 
Implement a parameterless constructor that initializes the properties with default values. 
Create an instance of the Book class using the default constructor and print the details. 
*/
public class Book 
{
    String title;
    int year;
    Year myYear;

    Book()
    {
        this.title = "Title of the Book";
        this.year = 2026;
        this.myYear = Year.now();
    }
}
