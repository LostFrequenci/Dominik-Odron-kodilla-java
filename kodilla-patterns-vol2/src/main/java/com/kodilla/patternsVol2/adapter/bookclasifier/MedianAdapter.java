package com.kodilla.patternsVol2.adapter.bookclasifier;

import com.kodilla.patternsVol2.adapter.bookclasifier.librarya.Book;
import com.kodilla.patternsVol2.adapter.bookclasifier.librarya.Classifier;
import com.kodilla.patternsVol2.adapter.bookclasifier.libraryb.BookSignature;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MedianAdapter extends MedianAdaptee implements Classifier {
    @Override
    public int publicationYearMedian(Set<Book> bookSet) {
        Map<BookSignature, com.kodilla.patternsVol2.adapter.bookclasifier.libraryb.Book> booksMap = new HashMap<>();
        for (Book theBooks : bookSet ){
            booksMap.put(new BookSignature(theBooks.getSignature()),new com.kodilla.patternsVol2.adapter.bookclasifier.libraryb.Book(theBooks.getAuthor(),theBooks.getTitle(),theBooks.getPublicationYear()));
        }
        return medianPublicationYear(booksMap);
    }
}
