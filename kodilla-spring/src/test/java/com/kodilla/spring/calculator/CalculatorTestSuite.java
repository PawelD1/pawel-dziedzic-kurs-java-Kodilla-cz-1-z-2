package com.kodilla.spring.calculator;

import com.kodilla.spring.shape.Shape;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {
    @Test
    public void testCalculations() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        Double val = calculator.add(7, 1);
        //Then
        Assert.assertEquals((Double) 8.0, val);

        //When
        Double val2 = calculator.sub(7, 1);
        //Then
        Assert.assertEquals((Double) 6.0, val2);

        //When
        Double val3 = calculator.mul(7, 1);
        //Then
        Assert.assertEquals((Double) 7.0, val3);

        //When
        Double val4 = calculator.div(7, 1);
        //Then
        Assert.assertEquals((Double) 7.0, val4);

        //When
        Double val5 = calculator.div(7, 0);
        //Then
        Assert.assertEquals((Double) 0.0, val5);
    }
}