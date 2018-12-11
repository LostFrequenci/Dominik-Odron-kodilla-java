package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BoardTestSuite {

    @Test
    public void testTaskAdd(){
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);

        //When
        board.getToDoList().getTasks().add("listOne");
        board.getDoneList().getTasks().add("listTwo1");
        board.getDoneList().getTasks().add("listTwo2");
        board.getInProgressList().getTasks().add("listThree");

        //Then
        Assert.assertEquals(1,board.getToDoList().getTasks().size());
        Assert.assertEquals(2,board.getDoneList().getTasks().size());
        Assert.assertEquals(1,board.getInProgressList().getTasks().size());
    }

}
