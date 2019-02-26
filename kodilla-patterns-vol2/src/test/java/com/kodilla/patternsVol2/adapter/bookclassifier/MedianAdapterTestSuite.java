package com.kodilla.patternsVol2.adapter.bookclassifier;

import com.kodilla.patternsVol2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patternsVol2.adapter.bookclasifier.librarya.Book;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class MedianAdapterTestSuite {
    @Test
    public void publicationYearMedianTest(){
        //Given
        Set<Book> theBooks = new HashSet<>();

        Book book1 = new Book("J.R.R. Tolkien","Lord of the rings - The Fellowship of the Ring",1954,"001");
        Book book2 = new Book("J.R.R. Tolkien","Lord of the rings - The Two Towers",1955,"002");
        Book book3 = new Book("J.R.R. Tolkien","Lord of the rings - The Return of The King",1956,"003");

        theBooks.add(book1);
        theBooks.add(book2);
        theBooks.add(book3);

        MedianAdapter medianAdapter = new MedianAdapter();
        //When
        int booksMedian = medianAdapter.publicationYearMedian(theBooks);
        //Then
        assertEquals(1955,booksMedian);
    }
}
