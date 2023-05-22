package DAY56.libraryManagement;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;


public class BookMain {
    private List<Book> books;
    public Predicate<Book> isBookAvailable = (book) -> book.getAvailable();

    public Consumer<Book> printBookDetails = (book) -> {
        System.out.println("Title: " + book.getTitle());
        System.out.println("Author: " + book.getAuthor());
        System.out.println("Publish Date: " + book.getPublishDate());
    };
    public Function<String[], Long> calculateDaysBetween = (dates) -> {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd MM yyyy");
        try {
            LocalDate date1 = LocalDate.parse(dates[0], dtf);
            LocalDate date2 = LocalDate.parse(dates[1], dtf);
            return ChronoUnit.DAYS.between(date1, date2);
        } catch (Exception e) {
            e.printStackTrace();
            return 0L;
        }
    };
    public BookMain(List<Book> books) {
        this.books = books;
    }
    public Book createBook() {
        // Implementation of createBook method goes here
        // You need to provide the logic to create a new book and return it
        return null;
    }
}
