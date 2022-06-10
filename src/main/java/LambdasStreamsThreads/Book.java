package LambdasStreamsThreads;

import java.util.ArrayList;
import java.util.List;

public class Book {

    static final int PAGES = 500;
   private String title;
   private List<Author> authors;
   private int numberOfPages;

    public Book(String title, int numberOfPages) {
        this.title = title;
        this.numberOfPages = numberOfPages;
        authors = new ArrayList<Author>();
    }

    public List<Author> addAuthor(Author author) {
        authors.add(author);
        return authors;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public String getTitle() {
        return title;
    }
}
