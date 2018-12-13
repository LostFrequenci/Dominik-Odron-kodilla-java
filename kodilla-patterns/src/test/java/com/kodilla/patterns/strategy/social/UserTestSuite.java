package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UserTestSuite {

    private  static int testCounter = 0;

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("");
        System.out.println("Preparing to execute test " + testCounter);
    }

    @Test
    public void testDefaultSharingStrategies(){
        //Given
        User user1 = new Millenials("Iron Man");
        User user2 = new YGeneration("Superman");
        User user3 = new ZGeneration("Ant Man");

        //When
        String user1UseSocialMedia = user1.sharePost();
        System.out.println("Iron Man use: "+user1UseSocialMedia);
        String user2UseSocialMedia = user2.sharePost();
        System.out.println("Superman use: "+user2UseSocialMedia);
        String user3UseSocialMedia = user3.sharePost();
        System.out.println("Ant Man use: "+user3UseSocialMedia);

        //Then
        Assert.assertEquals("Facebook",user1UseSocialMedia);
        Assert.assertEquals("Twitter",user2UseSocialMedia);
        Assert.assertEquals("Snapchat",user3UseSocialMedia);
    }

    @Test
    public void testIndividualSharingStrategy(){
        //Given
        User user1 = new Millenials("Iron Man");

        //When
        String user1UseSocialMedia = user1.sharePost();
        System.out.println("Iron Man use: "+user1UseSocialMedia);
        user1.setSocialPublisher(new SnapchatPublisher());
        user1UseSocialMedia = user1.sharePost();
        System.out.println("Iron Man use: "+user1UseSocialMedia);

        //Then
        Assert.assertEquals("Snapchat",user1UseSocialMedia);
    }
}
