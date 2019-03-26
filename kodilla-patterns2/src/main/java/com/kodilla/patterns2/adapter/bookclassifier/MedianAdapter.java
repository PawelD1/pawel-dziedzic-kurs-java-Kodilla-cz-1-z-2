package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclassifier.libraryb.Book;
import com.kodilla.patterns2.adapter.bookclassifier.librarya.BookA;

import com.kodilla.patterns2.adapter.bookclassifier.librarya.Classifier;
import com.kodilla.patterns2.adapter.bookclassifier.libraryb.BookSignature;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MedianAdapter extends MedianAdaptee implements Classifier {


    @Override
    public int publicationYearMedian(Set<BookA> bookSet) {
        Map<BookSignature, Book> books = new HashMap<>();
        ArrayList<BookA> bookA = new ArrayList<>();
        for (BookA bookAS : bookSet) {
            bookA.add(bookAS);
        }
        for (int n = 0; n < bookSet.size(); n++) {
            books.put(new BookSignature(bookA.get(n).getSignature()), new Book(bookA.get(n).getAuthor(), bookA.get(n).getTitle(), bookA.get(n).getPublicationYear()));
        }
        return medianPublicationYear(books);

    }
}
