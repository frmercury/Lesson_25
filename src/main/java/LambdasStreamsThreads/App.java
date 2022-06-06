package LambdasStreamsThreads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class App {

    public static void main(String[] args) {

        Author[] authors = new Author[3];
        authors[0] = new Author("Ray Bradbury", 66);
        authors[1] = new Author("Chuck Palahniuk", 44);
        authors[2] = new Author("Ken Kesey", 74);

        Book[] books = new Book[3];
        books[0] = new Book("Long After Midnight", 967);
        books[1] = new Book("One Flew Over the Cuckoo's Nest", 544);
        books[2] = new Book("Fight Club", 644);

        System.out.println("a. check if all book(s) have more than 200 pages");
        Arrays.stream(books).
                filter(s -> s.numberOfPages > 200)
                .map(t -> t.title)
                .forEach(System.out::println);

        System.out.println("b. find the books with max number of pages");
        Arrays.stream(books)
                .max(Comparator.comparingInt(Book::getNumberOfPages))
                .map(t -> t.title)
                .ifPresent(System.out::println);

        System.out.println("b. find the books with min number of pages");
        Arrays.stream(books)
                .min(Comparator.comparingInt(Book::getNumberOfPages))
                .map(t -> t.title)
                .ifPresent(System.out::println);

        System.out.println("d. sort the books by number of title");
        Arrays.stream(books)
                .map(t -> t.title)
                .peek(e -> System.out.println(e + " SORTED!"))
                .sorted()
                .forEach(System.out::println);

        System.out.println("d. sort the books by number of pages");
        Arrays.stream(books)
                .sorted(Comparator.comparingInt(Book::getNumberOfPages))
                .map(t -> t.title)
                .peek(e -> System.out.println(e + " SORTED!"))
                .forEach(System.out::println);

        System.out.println("e. get list of all titles:");
        Arrays.stream(books)
                .map(t -> t.title)
                .forEach(System.out::println);

        System.out.println("g. Get distinct list of all authors:");
        Arrays.stream(authors)
                .map(a -> a.name)
                .distinct()
                .forEach(System.out::println);


//        System.out.println("Use parallel stream with subtask #3");
//        Arrays.stream(books).parallel()
//                .filter(s -> { s.numberOfPages > 200;
//
//                })
    }
}
