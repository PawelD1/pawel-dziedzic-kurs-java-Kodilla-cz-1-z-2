package com.kodilla.patterns.prototype.library;

import com.kodilla.patterns.prototype.Board;
import com.kodilla.patterns.prototype.Prototype;
import com.kodilla.patterns.prototype.Task;
import com.kodilla.patterns.prototype.TasksList;

import java.util.HashSet;
import java.util.Set;

public final class Library extends Prototype {
    private final String name;
    Set<Book> books = new HashSet<>();

    public Library(final String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Set<Book> getBooks() {
        return books;
    }
    public String toString()
    {
        return "Name: "+getName()+", books: "+getBooks();
    }
    public Library shallowCopy() throws CloneNotSupportedException {
    return (Library)super.clone();
}

    public Library deepCopy() throws CloneNotSupportedException {
        Library clonedLibrary = (Library)super.clone();
        clonedLibrary.books = new HashSet<>();
        for(Book theSet : books) {
            Book clonedSet = new Book(theSet.getTitle(),theSet.getAuthor(),theSet.getPublicationDate());
            clonedLibrary.getBooks().add(clonedSet);
        }
        return clonedLibrary;
    }
}