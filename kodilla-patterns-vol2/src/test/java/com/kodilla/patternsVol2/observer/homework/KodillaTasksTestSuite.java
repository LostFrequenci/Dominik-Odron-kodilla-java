package com.kodilla.patternsVol2.observer.homework;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KodillaTasksTestSuite {
    @Test
    public void testUpdate() {
        //Given
        KodillaTasks student1 = new KodillaTasks("Jan Kowalski");
        KodillaTasks student2 = new KodillaTasks("Adam Nowak");
        KodillaTasks student3 = new KodillaTasks("Ewa Adamska");
        KodillaMentor mentor1 = new KodillaMentor("Steve Jobs");
        KodillaMentor mentor2 = new KodillaMentor("Bil Gates");
        student1.registerObserver(mentor1);
        student2.registerObserver(mentor2);
        student3.registerObserver(mentor1);
        //When
        student1.addTask("Solved task 1: Spring Web");
        student1.addTask("Solved task 2: Dependency Injection");
        student1.addTask("Solved task 3: Test Driven Development");
        student2.addTask("Solved task 1: JavaScript");
        student2.addTask("Solved task 2: Singleton Strategy");
        student2.addTask("Solved task 3: Prototype Strategy");
        student2.addTask("Solved task 4: Factory Strategy");
        student3.addTask("Solved task 1: Code Smell");
        student3.addTask("Solved task 2: SOLID + DRY");
        //Then
        assertEquals(5, mentor1.getUpdateCount());
        assertEquals(4, mentor2.getUpdateCount());
    }
}
