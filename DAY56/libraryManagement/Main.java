package DAY56.libraryManagement;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        Supplier<Book> book1 = () -> new Book("Green Eggs and Ham", "Dr. Seuss", 1960, 64, "Children", true);
        Supplier<Book> book2 = () -> new Book("Dragons Love Farts", "Hollywood Kay", 2021, 31, "Children", true);
        Supplier<Book> book3 = () -> new Book("How to Catch a Dinosaur", "Adam Wallace", 2019, 40, "Children", true);

        Library library = new Library();

        Consumer<Book> addBookToLibrary = library::addBook;
        library.addBook(book1.get());
        library.addBook(book2.get());
        library.addBook(book3.get());

        List<Book> booksByYear = library.findBooksByPublicationYear(2021);
        System.out.println("Books published in 2021:");
        booksByYear.forEach(book -> System.out.println(book.getTitle()));

        List<Book> booksByAuthor = library.findBooksByAuthor("Author 3");
        System.out.println("Books by Author 3:");
        booksByAuthor.forEach(book -> System.out.println(book.getTitle()));

        Book bookWithMostPages = library.findBookWithMostPages();
        System.out.println("Book with the most pages:");
        System.out.println(bookWithMostPages.getTitle());

        List<Book> booksWithMoreThanPages = library.findBooksByMinPages(30);
        System.out.println("Books with more than 30 pages:");
        booksWithMoreThanPages.forEach(book -> System.out.println(book.getTitle()));

        List<String> sortedTitles = library.getAllBookTitlesSorted();
        System.out.println("All book titles in the library (sorted):");
        sortedTitles.forEach(System.out::println);

        List<Book> booksByCategory = library.findBooksByCategory("Children");
        System.out.println("Books in the Children category:");
        booksByCategory.forEach(book -> System.out.println(book.getTitle()));

        User user1 = new User("Avis", "101");
        User user2 = new User("Kian", "102");
        User user3 = new User("Nowen", "103");
        User user4 = new User("Paisli", "104");

        Consumer<Book> loanBookToUser1 = user1::loanBook;
        loanBookToUser1.accept(book1.get());
        loanBookToUser1.accept(book2.get());

        Consumer<Book> loanBookToUser3 = user3::loanBook;
        loanBookToUser3.accept(book3.get());


        Consumer<Book> returnBookFromUser4 = user1::returnBook;
        returnBookFromUser4.accept(book2.get());


        double lateFeesUser2 = user2.calculateLateFees();
        System.out.println("Late fees for " + user2.getName() + ": $" + lateFeesUser2);
    }
}

