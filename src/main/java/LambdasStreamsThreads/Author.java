package LambdasStreamsThreads;

import java.util.ArrayList;
import java.util.List;

public class Author {

    public String getName() {
        return name;
    }

    private String name;
   private int age;
   private List<Book> books;

    public Author(String name, int age) {
        this.name = name;
        this.age = age;
        books = new ArrayList<Book>();
    }

    public List<Book> addBook(Book book) {
        books.add(book);
        return books;
    }

    public List<Book> getBooks() {
        return books;
    }


}
