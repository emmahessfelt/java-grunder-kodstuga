package PracticeArraysEnums;

public class Items 
{
    private String[] items = new String[5];    

    Items(String[] items)
    {
        int i = 0;
        for (String item : items)
        {
            this.items[i] = item;
            i++;
        }
    }

    public int lengthOfItems()
    {
        return items.length;
    }

    public String getItem(int index)
    {
        return items[index];
    }

    public void setItem(int index, String item)
    {
        this.items[index] = item;
    }


}
