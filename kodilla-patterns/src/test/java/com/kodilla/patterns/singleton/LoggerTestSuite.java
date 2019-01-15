package com.kodilla.patterns.singleton;

import com.kodilla.patterns.Logger;
import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {
    @Test
    public void testLastLog()
    {
        //Given
        //When
        Logger.getInstance().log("log nr.1");
        String log1=Logger.getInstance().getLastLog();
        System.out.println(log1);
        //Then
        Assert.assertEquals("log nr.1",Logger.getInstance().getLastLog());
    }
}
//    @Test
//    public void testLog()
//    {
//        Logger logger=new Logger();
//        logger.log("log nr.1");
//        System.out.println(logger.getLastLog());
//        Assert.assertEquals("log nr.1", logger.getLastLog());
//    }

