package com.kodilla.testing.statistics;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StatisticsWithMock {
    @Test
    public void test1CalculateAdvStatisticsWithMockWIth0UsersAnd0PostsAnd0Comments()
    {
        //Given
        Statistics sMock = mock(Statistics.class);
        ForumStatistics fs = new ForumStatistics();//
        fs.calculateAdvStatistics(sMock);//

        ArrayList<String> users = new ArrayList<String>();
        when(sMock.usersNames()).thenReturn(users);
        //When
        int quantityOfUsers = sMock.usersNames().size();
        int quantityOfPosts = fs.postsCount();
        int quantityOfComments = fs.commentsCount();
        //Then
        Assert.assertEquals(0, quantityOfUsers);
        Assert.assertEquals(0, quantityOfPosts);
        Assert.assertEquals(0, quantityOfComments);

        System.out.println("0 USERS and 0 POSTS and 0 COMMENTS:");
        fs.show();
        System.out.println(" ");
    }
    @Test
    public void test2CalculateAdvStatisticsWithMockWIth100UsersAnd0PostsAnd0Comments()
    {
        //Given
        Statistics sMock = mock(Statistics.class);
        ForumStatistics fs=new ForumStatistics();//
        fs.calculateAdvStatistics(sMock);//

        ArrayList<String> users = new ArrayList<String>();
        for(int i=1;i<=100;i++)
        {
            users.add("User nr: "+i);
        }
        fs.setQuantityOfUsers(100);
        when(sMock.usersNames()).thenReturn(users);
        //When
        int quantityOfUsers= sMock.usersNames().size();
        int quantityOfPosts=fs.postsCount();
        int quantityOfComments=fs.commentsCount();
        //Then
        Assert.assertEquals(100, quantityOfUsers);
        Assert.assertEquals(0, quantityOfPosts);
        Assert.assertEquals(0, quantityOfComments);

        System.out.println("100 USERS and 0 POSTS and 0 COMMENTS:");
        fs.show();
        System.out.println(" ");
    }
    @Test
    public void test3CalculateAdvStatisticsWithMockWIth100UsersAnd1000PostsAnd0Comments()
    {
        //Given
        Statistics sMock = mock(Statistics.class);
        ForumStatistics fs=new ForumStatistics();//
        ArrayList<String> users = new ArrayList<String>();
        for(int i=1;i<=100;i++)
        {
            users.add("User nr: "+i);
        }
        when(sMock.usersNames()).thenReturn(users);
        when(sMock.postsCount()).thenReturn(1000);
        fs.calculateAdvStatistics(sMock);
        //fs.setQuantityOfUsers(100);
        // fs.setQuantityOfPosts(1000);
        //When
        int quantityOfUsers= sMock.usersNames().size();
        int quantityOfPosts=fs.postsCount();
        int quantityOfComments=fs.commentsCount();
        //Then
        Assert.assertEquals(100, quantityOfUsers);
        Assert.assertEquals(1000, quantityOfPosts);
        Assert.assertEquals(0, quantityOfComments);

        System.out.println("100 USERS and 1000 POSTS and 0 COMMENTS:");
        fs.show();
        System.out.println(" ");
    }
    @Test
    public void test4CalculateAdvStatisticsWithMockWIth100UsersAndPostsMoreThanComments()
    {
        //Given
        Statistics sMock = mock(Statistics.class);
        ForumStatistics fs=new ForumStatistics();//
        ArrayList<String> users = new ArrayList<String>();
        for(int i=1;i<=100;i++)
        {
            users.add("User nr: "+i);
        }
        when(sMock.usersNames()).thenReturn(users);
        when(sMock.postsCount()).thenReturn(1000);
        when(sMock.commentsCount()).thenReturn(100);
        fs.calculateAdvStatistics(sMock);
        //When
        int quantityOfUsers= sMock.usersNames().size();
        int quantityOfPosts=fs.postsCount();
        int quantityOfComments=fs.commentsCount();
        //Then
        Assert.assertEquals(100, quantityOfUsers);
        Assert.assertEquals(1000, quantityOfPosts);
        Assert.assertEquals(100, quantityOfComments);

        System.out.println("100 USERS and MORE POSTS THAN COMMENTS:");
        fs.show();
        System.out.println(" ");
    }
    @Test
    public void test5CalculateAdvStatisticsWithMockWIth100UsersAndPostsLessThanComments()
    {
        //Given
        Statistics sMock = mock(Statistics.class);
        ForumStatistics fs=new ForumStatistics();//
        ArrayList<String> users = new ArrayList<String>();
        for(int i=1;i<=100;i++)
        {
            users.add("User nr: "+i);
        }
        when(sMock.usersNames()).thenReturn(users);
        when(sMock.postsCount()).thenReturn(100);
        when(sMock.commentsCount()).thenReturn(1000);
        fs.calculateAdvStatistics(sMock);
        //When
        int quantityOfUsers= sMock.usersNames().size();
        int quantityOfPosts=fs.postsCount();
        int quantityOfComments=fs.commentsCount();
        //Then
        Assert.assertEquals(100, quantityOfUsers);
        Assert.assertEquals(100, quantityOfPosts);
        Assert.assertEquals(1000, quantityOfComments);

        System.out.println("100 USERS and LESS POSTS THAN COMMENTS:");
        fs.show();
        System.out.println(" ");
    }
    @Test
    public void test6CalculateAdvStatisticsWithMockWIth0UsersAndPostsMoreThanComments()
    {
        //Given
        Statistics sMock = mock(Statistics.class);
        ForumStatistics fs=new ForumStatistics();//
        ArrayList<String> users = new ArrayList<String>();
        when(sMock.usersNames()).thenReturn(users);
        when(sMock.postsCount()).thenReturn(1000);
        when(sMock.commentsCount()).thenReturn(100);
        fs.calculateAdvStatistics(sMock);
        //When
        int quantityOfUsers= sMock.usersNames().size();
        int quantityOfPosts=fs.postsCount();
        int quantityOfComments=fs.commentsCount();
        //Then
        Assert.assertEquals( 0, quantityOfUsers);
        Assert.assertEquals(1000, quantityOfPosts);
        Assert.assertEquals(100, quantityOfComments);

        System.out.println("0 USERS and MORE POSTS THAN COMMENTS:");
        fs.show();
        System.out.println(" ");
    }
    @Test
    public void test7CalculateAdvStatisticsWithMockWIth0UsersAndPostsLessThanComments()
    {
        //Given
        Statistics sMock = mock(Statistics.class);
        ForumStatistics fs=new ForumStatistics();//
        ArrayList<String> users = new ArrayList<String>();
        when(sMock.usersNames()).thenReturn(users);
        when(sMock.postsCount()).thenReturn(100);
        when(sMock.commentsCount()).thenReturn(1000);
        fs.calculateAdvStatistics(sMock);
        //When
        int quantityOfUsers= sMock.usersNames().size();
        int quantityOfPosts=fs.postsCount();
        int quantityOfComments=fs.commentsCount();
        //Then
        Assert.assertEquals( 0, quantityOfUsers);
        Assert.assertEquals(100, quantityOfPosts);
        Assert.assertEquals(1000, quantityOfComments);

        System.out.println("0 USERS and LESS POSTS THAN COMMENTS:");
        fs.show();
        System.out.println(" ");
    }
    @Test
    public void test8CalculateAdvStatisticsWithMockWIth0UsersAnd1000PostsAnd0Comments()
    {
        //Given
        Statistics sMock = mock(Statistics.class);
        ForumStatistics fs=new ForumStatistics();//
        ArrayList<String> users = new ArrayList<String>();
        when(sMock.usersNames()).thenReturn(users);
        when(sMock.postsCount()).thenReturn(1000);
        when(sMock.commentsCount()).thenReturn(0);
        fs.calculateAdvStatistics(sMock);
        //When
        int quantityOfUsers= sMock.usersNames().size();
        int quantityOfPosts=fs.postsCount();
        int quantityOfComments=fs.commentsCount();
        //Then
        Assert.assertEquals( 0, quantityOfUsers);
        Assert.assertEquals(1000, quantityOfPosts);
        Assert.assertEquals(0, quantityOfComments);

        System.out.println("0 USERS and LESS POSTS THAN COMMENTS:");
        fs.show();
        System.out.println(" ");
    }

}
//testy od 1 do 8 :
//U-Users, P- posts, C- comments, M-more, L- less
//nr.   U     P     C
//1.    0     0     0
//2.    100   0     0
//3.    100   1000  0
//4.    100   M     L
//5.    100   L     M
//6.     0    M     L
//7.     0    L     M
//8.     0    1000  0