package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

import static com.kodilla.stream.array.ArrayOperations.getAverage;

public class ArrayOperationsTestSuite
{
    @Test
    public void testGetAverage()
    {
        int[]numbers={20,19,18,6,5,4,6,7,8,5,6,7,12,45,65,67,78,67,6,8};
        Assert.assertEquals(22.95, getAverage(numbers),0.1);
    }
    @Test
    public void testGetAverageWithNull()
    {
        int[] numbers=new int[0];
        getAverage(numbers);
        Assert.assertEquals(0, getAverage(numbers),0.1);
    }
}
