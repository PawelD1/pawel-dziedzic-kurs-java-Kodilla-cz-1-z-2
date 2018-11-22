package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum
{
    private final List<ForumUser> fu=new ArrayList<ForumUser>();
    public Forum()
    {
        fu.add(new ForumUser(1,"John",'M',LocalDate.of(1998,11,22),13));
        fu.add(new ForumUser(2,"Sam",'M',LocalDate.of(1999,11,19),1));
        fu.add(new ForumUser(3,"Max",'M',LocalDate.of(1998,11,23),18));
        fu.add(new ForumUser(4,"Joe",'M',LocalDate.of(1985,12,12),0));
        fu.add(new ForumUser(5,"Brad",'M',LocalDate.of(1990,12,12),1));
        fu.add(new ForumUser(6,"Chloe",'K',LocalDate.of(1980,12,12),13));
        fu.add(new ForumUser(7,"Kate",'K',LocalDate.of(2000,12,12),13));
        fu.add(new ForumUser(8,"Mia",'K',LocalDate.of(1980,12,12),0));
    }

    public List<ForumUser> getList()
    {
        return new ArrayList<ForumUser>(fu);
    }
}
