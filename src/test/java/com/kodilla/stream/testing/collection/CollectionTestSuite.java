package com.kodilla.stream.testing.collection;

import com.kodilla.testing.OddNumberExterminator;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class CollectionTestSuite
{
    @Before
    public void before() {
        System.out.println("Test Case: begin");
    }
    @After
    public void after() {
        System.out.println("Test Case: after");
    }
    @Test
    public void testOddNumbersExterminatorEmptyList()
    {
        //Given
        OddNumberExterminator empty=new OddNumberExterminator();
        ArrayList<Integer> numbers=new ArrayList<Integer>();
        ArrayList<Integer> oddNumbers=new ArrayList<Integer>();
        //When
        oddNumbers=empty.exterminate(numbers);
//        for(int i=1;i<oddNumbers.size();i++)
//        {
//            System.out.println("Odd numbers nr. "+i+" "+oddNumbers.get(i));
//        }
        Assert.assertEquals(0, oddNumbers.size());
        System.out.println("The Array List is empty");
    }
    @Test
    public void testOddNumbersExterminatorNormalList()
    {
        OddNumberExterminator full=new OddNumberExterminator();
        ArrayList<Integer> numbers=new ArrayList<Integer>();
        ArrayList<Integer> oddNumbers=new ArrayList<Integer>();
        ArrayList<Integer> oddNumbers2=new ArrayList<Integer>();
        for(int i=0;i<10;i++)
        {
            numbers.add(i);
        }
        oddNumbers=full.exterminate(numbers);
//        for(int i=0;i<10;i++)
//        {
//            if(i%2==1)
//                oddNumbers2.add(i);
//        }
        //Assert.assertTrue(Arrays.equals(oddNumbers2, oddNumbers));
       // Assert.assertArrayEquals(new int[]{1,2,3},oddNumbers);
        //Assert.assertArrayEquals(oddNumbers2,oddNumbers);
        oddNumbers2.add(0);
        oddNumbers2.add(2);
        oddNumbers2.add(4);
        oddNumbers2.add(6);
        oddNumbers2.add(8);
        Assert.assertEquals(oddNumbers2.get(0),oddNumbers.get(0));
        Assert.assertEquals(oddNumbers2.get(1),oddNumbers.get(1));
        Assert.assertEquals(oddNumbers2.get(2),oddNumbers.get(2));
        Assert.assertEquals(oddNumbers2.get(3),oddNumbers.get(3));
        Assert.assertEquals(oddNumbers2.get(4),oddNumbers.get(4));
//        for(int i=0;i<oddNumbers.size();i++)
//        {
//            System.out.println("Odd numbers nr. "+i+": "+oddNumbers.get(i));
//            Assert.assertTrue(oddNumbers.get(i)%2==1);
//        }

    }
}

