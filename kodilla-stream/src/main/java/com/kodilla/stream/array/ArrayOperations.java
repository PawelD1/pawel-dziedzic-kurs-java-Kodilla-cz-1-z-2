package com.kodilla.stream.array;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public interface ArrayOperations
{
    static double getAverage(int[] numbers)
    {
        IntStream numberOfAmount = IntStream.range(0, 20);
        System.out.println(numberOfAmount.toArray().toString());
        IntStream numberOfAmountAverage = IntStream.range(0, 20);
        OptionalDouble obj=numberOfAmountAverage.average();
        if (obj.isPresent()) {
            System.out.println(obj.getAsDouble());
            return obj.getAsDouble();
        }
        else {
            System.out.println("-1");
            return -1;
        }


    }
    }


