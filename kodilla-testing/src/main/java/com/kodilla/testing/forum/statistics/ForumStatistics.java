package com.kodilla.testing.forum.statistics;

import java.util.*;

public class ForumStatistics {

    Statistics statistics;
    List<String> usersList = new LinkedList<String>();
    int numberOfUsers = 0;
    int numberOfPosts = 0;
    int numberOfComment = 0;
    double averageNumberOfPostsByUser = 0;
    double averageNumberOfCommentByUser = 0;
    double averageNumberOfCommentByPost = 0;

    public ForumStatistics ( Statistics statistics) {
        this.statistics = statistics;
    }

    public void calculateAdvStatistics(Statistics statistics){
        numberOfPosts = statistics.postsCount();
        numberOfComment = statistics.commentsCount();
        usersList = statistics.usersNames();
        numberOfUsers = usersList.size();
        if (numberOfUsers !=0) {
            averageNumberOfPostsByUser = (numberOfPosts / (double) numberOfUsers);
            averageNumberOfCommentByUser = numberOfComment / (double) numberOfUsers;
        } else {
            averageNumberOfCommentByUser = 0;
            averageNumberOfPostsByUser = 0;
        }
        if (numberOfPosts != 0) {
            averageNumberOfCommentByPost = numberOfComment / (double) numberOfPosts;
        } else { averageNumberOfCommentByPost =0; }
    }

    public void showStatistics(){

    }
}
