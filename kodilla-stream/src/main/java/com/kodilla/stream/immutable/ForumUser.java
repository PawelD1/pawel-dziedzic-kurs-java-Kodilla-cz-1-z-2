package com.kodilla.stream.immutable;

public final class ForumUser
{
   private  String username;
    private String realName;

    public ForumUser(String username, String realName) {
        this.username=username;
        this.realName = realName;
    }

    public String getRealName() {
        return realName;
    }

    public String getUsername() {
        return username;
    }
}


