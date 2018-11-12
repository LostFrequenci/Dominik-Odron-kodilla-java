package com.kodilla.testing.forum.statistics;

import com.kodilla.testing.forum.statistics.Statistics;
import com.kodilla.testing.forum.statistics.ForumStatistics;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.Assert;

import java.util.LinkedList;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class ForumStatisticsTestSuites {

    private  static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTest(){
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    public void testZeroPost() {
        //Given
        Statistics forumStatisticsMock = mock(Statistics.class);
        when(forumStatisticsMock.postsCount()).thenReturn(0);

        ForumStatistics newStatistic = new ForumStatistics(forumStatisticsMock);
        newStatistic.calculateAdvStatistics(forumStatisticsMock);
        //When
        int postsQuantity = newStatistic.numberOfPosts;
        //Then
        Assert.assertEquals(0, postsQuantity);
    }

    @Test
    public void testThousandPost() {
        //Given
        Statistics forumStatisticsMock = mock(Statistics.class);
        when(forumStatisticsMock.postsCount()).thenReturn(1000);

        ForumStatistics newStatistic = new ForumStatistics(forumStatisticsMock);
        newStatistic.calculateAdvStatistics(forumStatisticsMock);
        //When
        int postsQuantity = newStatistic.numberOfPosts;
        //Then
        Assert.assertEquals(1000, postsQuantity);
    }

    @Test
    public void testZeroComment() {
        //Given
        Statistics forumStatisticsMock = mock(Statistics.class);
        when(forumStatisticsMock.commentsCount()).thenReturn(0);

        ForumStatistics newStatistic = new ForumStatistics(forumStatisticsMock);
        newStatistic.calculateAdvStatistics(forumStatisticsMock);
        //When
        int commentQuantity = newStatistic.numberOfComment;
        //Then
        Assert.assertEquals(0, commentQuantity);
    }

    @Test
    public void testThousandComment() {
        //Given
        Statistics forumStatisticsMock = mock(Statistics.class);
        when(forumStatisticsMock.commentsCount()).thenReturn(1000);

        ForumStatistics newStatistic = new ForumStatistics(forumStatisticsMock);
        newStatistic.calculateAdvStatistics(forumStatisticsMock);
        //When
        int commentQuantity = newStatistic.numberOfComment;
        //Then
        Assert.assertEquals(1000, commentQuantity);
    }

    @Test
    public void testUsersNumberZero() {
        //Given
        LinkedList<String> usersList = new LinkedList<>();
        Statistics forumStatisticsMock = mock(Statistics.class);
        when(forumStatisticsMock.usersNames()).thenReturn(usersList);

        ForumStatistics newStatistic = new ForumStatistics(forumStatisticsMock);
        newStatistic.calculateAdvStatistics(forumStatisticsMock);
        //When
        int userQuantity = newStatistic.numberOfUsers;
        //Then
        Assert.assertEquals(0, userQuantity);
    }

    @Test
    public void testUsersNumberHundred() {
        //Given
        LinkedList<String> usersList = new LinkedList<String>();

        for (int i=0;i<100;i++){
            usersList.add("Admin"+i);
        }

        Statistics forumStatisticsMock = mock(Statistics.class);
        when(forumStatisticsMock.usersNames()).thenReturn(usersList);

        ForumStatistics newStatistic = new ForumStatistics(forumStatisticsMock);
        newStatistic.calculateAdvStatistics(forumStatisticsMock);
        //When
        int userQuantity = newStatistic.numberOfUsers;
        //Then
        Assert.assertEquals(100, userQuantity);
    }

    @Test
    public void testNumberOfCommentsLowerThenPosts() {
        //Given
        Statistics forumStatisticsMock = mock(Statistics.class);
        when(forumStatisticsMock.postsCount()).thenReturn(10);
        when(forumStatisticsMock.commentsCount()).thenReturn(5);

        ForumStatistics newStatistic = new ForumStatistics(forumStatisticsMock);
        newStatistic.calculateAdvStatistics(forumStatisticsMock);
        //When
        int postQuantity = newStatistic.numberOfPosts;
        int commentQuantity = newStatistic.numberOfComment;
        boolean result;
        if (postQuantity > commentQuantity){
            result = true;
        } else {
            result = false;
        }
        //Then
        Assert.assertEquals(true, result);

    }

    @Test
    public void testNumberOfCommentsBiggerThenPosts() {
        //Given
        Statistics forumStatisticsMock = mock(Statistics.class);
        when(forumStatisticsMock.postsCount()).thenReturn(25);
        when(forumStatisticsMock.commentsCount()).thenReturn(50);

        ForumStatistics newStatistic = new ForumStatistics(forumStatisticsMock);
        newStatistic.calculateAdvStatistics(forumStatisticsMock);
        //When
        int postQuantity = newStatistic.numberOfPosts;
        int commentQuantity = newStatistic.numberOfComment;
        boolean result;
        if (postQuantity < commentQuantity){
            result = true;
        } else {
            result = false;
        }
        //Then
        Assert.assertEquals(true, result);

    }

    @Test
    public void testAveragesPostZero() {
        //Given
        LinkedList<String> usersList = new LinkedList<String>();

        for (int i=0;i<10;i++){
            usersList.add("Admin"+i);
        }
        Statistics forumStatisticsMock = mock(Statistics.class);
        when(forumStatisticsMock.postsCount()).thenReturn(0);
        when(forumStatisticsMock.commentsCount()).thenReturn(50);
        when(forumStatisticsMock.usersNames()).thenReturn(usersList);

        ForumStatistics newStatistic = new ForumStatistics(forumStatisticsMock);
        newStatistic.calculateAdvStatistics(forumStatisticsMock);
        //When
        double averagePostsByUser = newStatistic.averageNumberOfPostsByUser;
        double averageCommentsByUser = newStatistic.averageNumberOfCommentByUser;
        double averageCommentsByPost = newStatistic.averageNumberOfCommentByPost;

        //Then
        Assert.assertEquals(0, averagePostsByUser,0.1);
        Assert.assertEquals(5.0, averageCommentsByUser,0.1);
        Assert.assertEquals(0, averageCommentsByPost,0.1);
    }

    @Test
    public void testAveragesPostThousand() {
        //Given
        LinkedList<String> usersList = new LinkedList<String>();

        for (int i=0;i<10;i++){
            usersList.add("Admin"+i);
        }
        Statistics forumStatisticsMock = mock(Statistics.class);
        when(forumStatisticsMock.postsCount()).thenReturn(1000);
        when(forumStatisticsMock.commentsCount()).thenReturn(50);
        when(forumStatisticsMock.usersNames()).thenReturn(usersList);

        ForumStatistics newStatistic = new ForumStatistics(forumStatisticsMock);
        newStatistic.calculateAdvStatistics(forumStatisticsMock);
        //When
        double averagePostsByUser = newStatistic.averageNumberOfPostsByUser;
        double averageCommentsByUser = newStatistic.averageNumberOfCommentByUser;
        double averageCommentsByPost = newStatistic.averageNumberOfCommentByPost;

        //Then
        Assert.assertEquals(100.0, averagePostsByUser,0.1);
        Assert.assertEquals(5.0, averageCommentsByUser,0.1);
        Assert.assertEquals(0.05, averageCommentsByPost,0.01);
    }

    @Test
    public void testAveragesUsersZero() {
        //Given
        LinkedList<String> usersList = new LinkedList<String>();

        //for (int i=0;i<10;i++){
        //    usersList.add("Admin"+i);
        //}
        Statistics forumStatisticsMock = mock(Statistics.class);
        when(forumStatisticsMock.postsCount()).thenReturn(1000);
        when(forumStatisticsMock.commentsCount()).thenReturn(50);
        when(forumStatisticsMock.usersNames()).thenReturn(usersList);

        ForumStatistics newStatistic = new ForumStatistics(forumStatisticsMock);
        newStatistic.calculateAdvStatistics(forumStatisticsMock);
        //When
        double averagePostsByUser = newStatistic.averageNumberOfPostsByUser;
        double averageCommentsByUser = newStatistic.averageNumberOfCommentByUser;
        double averageCommentsByPost = newStatistic.averageNumberOfCommentByPost;

        //Then
        Assert.assertEquals(0.0, averagePostsByUser,0.1);
        Assert.assertEquals(0.0, averageCommentsByUser,0.1);
        Assert.assertEquals(0.05, averageCommentsByPost,0.01);
    }

    @Test
    public void testAveragesUsersHundred() {
        //Given
        LinkedList<String> usersList = new LinkedList<String>();

        for (int i=0;i<100;i++){
            usersList.add("Admin"+i);
        }
        Statistics forumStatisticsMock = mock(Statistics.class);
        when(forumStatisticsMock.postsCount()).thenReturn(1000);
        when(forumStatisticsMock.commentsCount()).thenReturn(50);
        when(forumStatisticsMock.usersNames()).thenReturn(usersList);

        ForumStatistics newStatistic = new ForumStatistics(forumStatisticsMock);
        newStatistic.calculateAdvStatistics(forumStatisticsMock);
        //When
        double averagePostsByUser = newStatistic.averageNumberOfPostsByUser;
        double averageCommentsByUser = newStatistic.averageNumberOfCommentByUser;
        double averageCommentsByPost = newStatistic.averageNumberOfCommentByPost;

        //Then
        Assert.assertEquals(10, averagePostsByUser,0.1);
        Assert.assertEquals(0.5, averageCommentsByUser,0.1);
        Assert.assertEquals(0.05, averageCommentsByPost,0.01);
    }


    @Test
    public void testAveragesCommentsZero() {
        //Given
        LinkedList<String> usersList = new LinkedList<String>();

        for (int i=0;i<100;i++){
            usersList.add("Admin"+i);
        }
        Statistics forumStatisticsMock = mock(Statistics.class);
        when(forumStatisticsMock.postsCount()).thenReturn(1000);
        when(forumStatisticsMock.commentsCount()).thenReturn(0);
        when(forumStatisticsMock.usersNames()).thenReturn(usersList);

        ForumStatistics newStatistic = new ForumStatistics(forumStatisticsMock);
        newStatistic.calculateAdvStatistics(forumStatisticsMock);
        //When
        double averagePostsByUser = newStatistic.averageNumberOfPostsByUser;
        double averageCommentsByUser = newStatistic.averageNumberOfCommentByUser;
        double averageCommentsByPost = newStatistic.averageNumberOfCommentByPost;

        //Then
        Assert.assertEquals(10, averagePostsByUser,0.1);
        Assert.assertEquals(0.0, averageCommentsByUser,0.1);
        Assert.assertEquals(0.0, averageCommentsByPost,0.01);
    }

    @Test
    public void testAveragesCommentsLowerPosts() {
        //Given
        LinkedList<String> usersList = new LinkedList<String>();

        for (int i=0;i<100;i++){
            usersList.add("Admin"+i);
        }
        Statistics forumStatisticsMock = mock(Statistics.class);
        when(forumStatisticsMock.postsCount()).thenReturn(100);
        when(forumStatisticsMock.commentsCount()).thenReturn(50);
        when(forumStatisticsMock.usersNames()).thenReturn(usersList);

        ForumStatistics newStatistic = new ForumStatistics(forumStatisticsMock);
        newStatistic.calculateAdvStatistics(forumStatisticsMock);
        //When
        double averagePostsByUser = newStatistic.averageNumberOfPostsByUser;
        double averageCommentsByUser = newStatistic.averageNumberOfCommentByUser;
        double averageCommentsByPost = newStatistic.averageNumberOfCommentByPost;

        //Then
        Assert.assertEquals(1, averagePostsByUser,0.1);
        Assert.assertEquals(0.5, averageCommentsByUser,0.1);
        Assert.assertEquals(0.5, averageCommentsByPost,0.01);
    }

    @Test
    public void testAveragesCommentsBiggerPosts() {
        //Given
        LinkedList<String> usersList = new LinkedList<String>();

        for (int i=0;i<100;i++){
            usersList.add("Admin"+i);
        }
        Statistics forumStatisticsMock = mock(Statistics.class);
        when(forumStatisticsMock.postsCount()).thenReturn(50);
        when(forumStatisticsMock.commentsCount()).thenReturn(100);
        when(forumStatisticsMock.usersNames()).thenReturn(usersList);

        ForumStatistics newStatistic = new ForumStatistics(forumStatisticsMock);
        newStatistic.calculateAdvStatistics(forumStatisticsMock);
        //When
        double averagePostsByUser = newStatistic.averageNumberOfPostsByUser;
        double averageCommentsByUser = newStatistic.averageNumberOfCommentByUser;
        double averageCommentsByPost = newStatistic.averageNumberOfCommentByPost;

        //Then
        Assert.assertEquals(0.5, averagePostsByUser,0.1);
        Assert.assertEquals(1.0, averageCommentsByUser,0.1);
        Assert.assertEquals(2.0, averageCommentsByPost,0.01);
    }
}
