package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public class Forum {

    private final List<ForumUser> theUserList = new ArrayList<>();

    public Forum () {
        theUserList.add(new ForumUser(1,"Dylan Murphy", 'M',1992,4,14,6));
        theUserList.add(new ForumUser(2,"Phoebe Pearson", 'F',1992,9,30,25));
        theUserList.add(new ForumUser(3,"Morgan Walsh", 'M',2000,2,5,66));
        theUserList.add(new ForumUser(4,"Aimee Murphy", 'F',2005,5,18,90));
        theUserList.add(new ForumUser(5,"Ryan Talley", 'M',1998,7,20,3));
        theUserList.add(new ForumUser(6,"Madelynn Carson", 'F',2002,11,1,200));
    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(theUserList);
    }
}
