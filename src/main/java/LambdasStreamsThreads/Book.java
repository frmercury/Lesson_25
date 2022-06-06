package LambdasStreamsThreads;

import java.util.ArrayList;
import java.util.List;

public class Book {
    String title;
    List<Author> authors;
    int numberOfPages;

    public Book(String title, int numberOfPages) {
        this.title = title;
        this.numberOfPages = numberOfPages;
        authors = new ArrayList<Author>();
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }
}
