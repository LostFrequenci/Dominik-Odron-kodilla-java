package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListDaoTestSuite {

    @Autowired
    private TaskListDao taskListDao;
    private static final String DESCRIPTION = "Test: Task Module 13.2";

    @Test
    public void testFindByListName() {
        //Given
        TaskList taskList = new TaskList("Task List 1",DESCRIPTION);
        taskListDao.save(taskList);
        String listName = taskList.getListName();
        //When
        List<TaskList> readTasksList = taskListDao.findByListName(listName);
        TaskList testReadTasksList = readTasksList.get(0);
        //Then
        Assert.assertEquals("Task List 1",testReadTasksList.getListName());

        //CleanUp
        int id = readTasksList.get(0).getId();
        taskListDao.delete(id);

    }

}
