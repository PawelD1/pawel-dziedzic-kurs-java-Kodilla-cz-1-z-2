package com.kodilla.testing.forum.statistics;

import java.util.ArrayList;

public class ForumStatistics
{
    private ArrayList<String> usersNames=new ArrayList();
    private int quantityOfUsers;
    private int quantityOfPosts;
    private int quantityOfComments;
    private int averageQuantityOfPostsOnOneUser;
    private int averageQuantityOfCommentsOnOneUser;
    private int averageQuantityOfCommentsOnOnePost;
    int postsCount()
    {
        ArrayList<String> posts = new ArrayList<String>();
        return posts.size();
    }
    int commentsCount()
    {
        ArrayList<String> comments = new ArrayList<String>();
        return comments.size();
    }
    public void calculateAdvStatistics(Statistics statistics)
    {
        this.quantityOfUsers=usersNames.size();
        this.quantityOfPosts=postsCount();
        this.quantityOfComments=commentsCount();
        this.averageQuantityOfPostsOnOneUser=quantityOfPosts/quantityOfUsers;
        this.averageQuantityOfCommentsOnOneUser=quantityOfComments/quantityOfUsers;
        this.averageQuantityOfCommentsOnOnePost=quantityOfComments/quantityOfPosts;

    }
    public void show()
    {
        System.out.println("Quantity of users is: "+quantityOfUsers);
        System.out.println("Quantity of posts is: "+quantityOfPosts);
        System.out.println("Quantity of comments is: "+quantityOfComments);
        System.out.println(" Average quantity of posts on one user is: "+averageQuantityOfPostsOnOneUser);
        System.out.println(" Average quantity of comments on one user is: "+averageQuantityOfCommentsOnOneUser);
        System.out.println(" Average quantity of comments on one post is: "+averageQuantityOfCommentsOnOnePost);
    }
}
