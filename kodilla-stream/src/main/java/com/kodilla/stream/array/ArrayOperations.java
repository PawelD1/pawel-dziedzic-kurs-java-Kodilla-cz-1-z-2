package com.kodilla.stream.array;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public interface ArrayOperations {
    static double getAverage(int[] numbers) {
        IntStream.range(0, numbers.length)
                .map(n->numbers[n])
                .forEach(number -> System.out.println(number));
        OptionalDouble obj = IntStream.range(0, numbers.length)
                .map(n->numbers[n])
                .average();


        //OptionalDouble obj=numberOfAmountAverage.average();
        if (obj.isPresent()) {
            System.out.println(obj.getAsDouble());
            return obj.getAsDouble();
        } else {
            return 0;
        }


    }
}


