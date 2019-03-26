package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclassifier.librarya.BookA;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class MedianAdapterTestSuite {
    @Test
    public void testPublicationYearMedian() {
        //Given
        BookA bookA1 = new BookA("Sztuc", "Potop", 1970, "3");
        BookA bookA2 = new BookA("Sztuk", "Powódź", 1980, "5");
        BookA bookA3 = new BookA("Sztum", "Upał", 1990, "7");
        Set<BookA> booksA = new HashSet<>();
        booksA.add(bookA1);
        booksA.add(bookA2);
        booksA.add(bookA3);
        MedianAdapter medianAdapter = new MedianAdapter();
        //When
        int publicationYearMedian = medianAdapter.publicationYearMedian(booksA);
        //Then
        System.out.println(publicationYearMedian);
        assertEquals(publicationYearMedian, 1980);


    }
}
