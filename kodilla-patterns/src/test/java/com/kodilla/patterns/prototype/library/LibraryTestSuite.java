package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.time.Period;
import java.util.stream.IntStream;

public class LibraryTestSuite {

    @Test
    public void testGetBooks(){
        //Given
        Library library = new Library("Kodilla Library");
        IntStream.iterate(1, n -> n + 1)
                .limit(10)
                .forEach(n -> library.getBooks().add(new Book("Title"+n,"Author"+n, LocalDate.now().minus(Period.ofDays(n)))));

        //making a shallow clone of object library
        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("Kodilla library 2");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }
        System.out.println(library);
        System.out.println(clonedLibrary);

        //making a deep copy of object library
        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Kodilla library 3");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //When
        Book test = new Book("Title1","Author1", LocalDate.now().minus(Period.ofDays(1)));
        library.getBooks().remove(test);
        int result = library.getBooks().size();
        int result2 = clonedLibrary.getBooks().size();
        int result3 = deepClonedLibrary.getBooks().size();
        //Then
        System.out.println(library);
        System.out.println(clonedLibrary);
        System.out.println(deepClonedLibrary);
        Assert.assertEquals(9, result);
        Assert.assertEquals(9, result2);
        Assert.assertEquals(10, result3);
    }
}
