package LambdasStreamsThreads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static LambdasStreamsThreads.Book.PAGES;

public class App {

    public static void main(String[] args) {

        Author bradbury = new Author("Ray Bradbury", 66);
        Book longAfterMidnight = new Book("Long After Midnight", 967);
        Book martianChronicles = new Book("The Martian Chronicles", 120);

        Author palahniuk = new Author("Chuck Palahniuk", 45);
        Book fightClub = new Book("Fight Club", 485);

        Author kesey = new Author("Ken Kesey", 59);
        Book oneFlew = new Book("One Flew Over the Cuckoo's Nest", 615);

        bradbury.addBook(longAfterMidnight);
        bradbury.addBook(martianChronicles);
        longAfterMidnight.addAuthor((bradbury));
        martianChronicles.addAuthor((bradbury));

        palahniuk.addBook(fightClub);
        fightClub.addAuthor(palahniuk);

        kesey.addBook(oneFlew);
        oneFlew.addAuthor(kesey);


        Author[] authors = new Author[3];
        Book[] books = new Book[4];

        authors[0] = bradbury;
        authors[1] = palahniuk;
        authors[2] = kesey;

        books[0] = longAfterMidnight;
        books[1] = martianChronicles;
        books[2] = fightClub;
        books[3] = oneFlew;


        System.out.printf("a. check if all books have more than %s pages\n", PAGES);
        if (Arrays.stream(books).
                    allMatch(s -> s.getNumberOfPages() > PAGES))
        {
            System.out.printf("All books have more than %s pages", PAGES);
        } else
        {
            System.out.println("Books that have less than %s pages:");
            Arrays.stream(books)
                    .filter(s -> s.getNumberOfPages() < PAGES)
                    .map(t -> t.getTitle())
                    .forEach(System.out::println);
        }

        System.out.println("b. find the books with max number of pages");
        Arrays.stream(books)
                .max(Comparator.comparingInt(Book::getNumberOfPages))
                .map(Book::getTitle)
                .ifPresent(System.out::println);

        System.out.println("b. find the books with min number of pages");
        Arrays.stream(books)
                .min(Comparator.comparingInt(Book::getNumberOfPages))
                .map(Book::getTitle)
                .ifPresent(System.out::println);

        System.out.println("d. sort the books by title");
        Arrays.stream(books)
                .map(Book::getTitle)
                .peek(e -> System.out.println(e + "Before SORT!"))
                .sorted()
                .forEach(System.out::println);

        System.out.println("d. sort the books by number of pages");
        Arrays.stream(books)
                .sorted(Comparator.comparingInt(Book::getNumberOfPages))
                .map(Book::getTitle)
                .peek(e -> System.out.println(e + "Before SORT!"))
                .forEach(System.out::println);

        System.out.println("e. get list of all titles:");
        Arrays.stream(books)
                .map(Book::getTitle)
                .forEach(System.out::println);

        System.out.println("g. Get distinct list of all authors:");
        Arrays.stream(authors)
                .map(Author::getName)
                .distinct()
                .forEach(System.out::println);

//        System.out.println("Use parallel stream with subtask #3");
//        Arrays.stream(books).parallel()
//                .filter(s -> { s.getNumberOfPages() > 200;
//
//                })
    }
}
