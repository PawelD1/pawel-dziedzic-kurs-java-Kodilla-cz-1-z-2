package com.kodilla.testing;
import java.util.ArrayList;

public class OddNumberExterminator
{
    public ArrayList exterminate(ArrayList<Integer> numbers)
    {
        ArrayList<Integer> oddNumbers=new ArrayList<Integer>();
        for(int i=0;i<numbers.size();i++)
        {
            if(numbers.get(i)%2==0)
                oddNumbers.add(numbers.get(i));

        }
        return oddNumbers;
    }
}
