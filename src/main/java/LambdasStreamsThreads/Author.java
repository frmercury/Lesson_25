package LambdasStreamsThreads;

import java.util.ArrayList;
import java.util.List;

public class Author {

    String name;
    int age;
    List<Book> books;

    public Author(String name, int age) {
        this.name = name;
        this.age = age;
        books = new ArrayList<Book>();
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
}
