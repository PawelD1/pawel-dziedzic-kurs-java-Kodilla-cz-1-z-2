package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class LibraryTestSuite {
    @Test
    public void testGetBooks(){
        //Given
        Book book1=new Book("Lord of the Rings","Tolkien", LocalDate.of(1940,12,30));
        Book book2=new Book("Hobbit","Tolkien", LocalDate.of(1930,12,30));
        Book book3=new Book("Pan Tadeusz","Mickiewicz",LocalDate.of(1815,6,30));
        Library library=new Library("Library 1");
        library.books.add(book1);
        library.books.add(book2);
        library.books.add(book3);
        //When
        int size=library.getBooks().size();
        //Then
        Assert.assertEquals(3,size);

        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }
        //making a deep copy of object board
        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //When
        library.getBooks().remove(book3);

        //Then
        System.out.println(library.toString());
        System.out.println(clonedLibrary.toString());
        System.out.println(deepClonedLibrary.toString());
        Assert.assertEquals(2, library.getBooks().size());
        Assert.assertEquals(2, clonedLibrary.getBooks().size());
        Assert.assertEquals(3, deepClonedLibrary.getBooks().size());
        Assert.assertEquals(clonedLibrary.getBooks(), library.getBooks());
        Assert.assertNotEquals(deepClonedLibrary.getBooks(), library.getBooks());
    }
}
