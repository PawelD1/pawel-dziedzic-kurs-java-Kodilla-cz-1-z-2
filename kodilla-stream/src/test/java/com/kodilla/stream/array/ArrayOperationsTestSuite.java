package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

import static com.kodilla.stream.array.ArrayOperations.getAverage;

public class ArrayOperationsTestSuite
{
    @Test
    public void testGetAverage()
    {
        int[]numbers=new int[20];
        for(int i=0;i<20;i++)
        {
            numbers[i]=i+1;
        }
        getAverage(numbers);
        Assert.assertEquals(9.5, getAverage(numbers),0.1);

    }
}
