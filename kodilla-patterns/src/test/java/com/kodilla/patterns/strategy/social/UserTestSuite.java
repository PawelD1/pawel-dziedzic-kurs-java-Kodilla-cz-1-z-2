package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
        @Test
        public void testDefaultSharingStrategies() {
            //Given
            User pawel = new Millenials("Paweł");
            User jan = new YGeneration("Jan");
            User piotr = new ZGeneration("Piotr");

            //When
            String pawelShouldChoose = pawel.sharePost();
            System.out.println("Paweł should choose: " + pawelShouldChoose);
            String janShouldChoose = jan.sharePost();
            System.out.println("Jan should choose : " + janShouldChoose);
            String piotrShouldChoose = piotr.sharePost();
            System.out.println("Piotr should choose: " + piotrShouldChoose);

            //Then
            Assert.assertEquals("Facebook.", pawelShouldChoose);
            Assert.assertEquals("Twitter.", janShouldChoose);
            Assert.assertEquals("Snapchat.", piotrShouldChoose);
        }

        @Test
        public void testIndividualSharingStrategy()  {
            //Given
            User pawel = new Millenials("Paweł");

            //When
            String pawelShouldChoose = pawel.sharePost();
            System.out.println("Paweł should choose: " + pawelShouldChoose);
            pawel.setChoosingStrategy(new SnapchatPublisher());
            pawelShouldChoose = pawel.sharePost();
            System.out.println("Paweł now should choose: " + pawelShouldChoose);

            //Then
            Assert.assertEquals("Snapchat.", pawelShouldChoose);
        }
    }