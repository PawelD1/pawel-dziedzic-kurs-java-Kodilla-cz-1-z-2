package com.kodilla.stream.array;

import java.util.stream.IntStream;

public interface ArrayOperations
{
    static double getAverage(int[] numbers)
    {
        IntStream numberOfAmount = IntStream.range(0, 20);
        System.out.println(numberOfAmount);
        IntStream numberOfAmountAverage = IntStream.range(0, 20)
        .average()  ;

    }
}
