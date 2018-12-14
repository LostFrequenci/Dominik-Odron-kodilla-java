package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TaskFactoryTestSuite {

    @Before
    public void beforeEveryTest() {
        System.out.println("");
    }

    @Test
    public void testFactoryShoppingTask(){
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task shoppingtask = factory.makeTask(TaskFactory.SHOPPINGTASK);
        shoppingtask.executeTask();
        //Then
        Assert.assertEquals(shoppingtask.getTaskName(),"Shopping list");
        Assert.assertEquals(shoppingtask.isTaskExecuted(),true);
    }

    @Test
    public void testFactoryPaintingTask(){
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task paintingtask = factory.makeTask(TaskFactory.PAINTINGTASK);
        paintingtask.executeTask();
        //Then
        Assert.assertEquals(paintingtask.getTaskName(),"Painting task");
        Assert.assertEquals(paintingtask.isTaskExecuted(),true);
    }

    @Test
    public void testFactoryDrivingTask(){
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task drivingTask = factory.makeTask(TaskFactory.DRIVINGTASK);
        drivingTask.executeTask();
        //Then
        Assert.assertEquals(drivingTask.getTaskName(),"Driving task");
        Assert.assertEquals(drivingTask.isTaskExecuted(),true);
    }
}
