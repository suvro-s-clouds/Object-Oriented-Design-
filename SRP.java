import java.util.ArrayList;
import java.util.List;

/**
 * Title: Java program demonstrating Single Responsibility Principle (SRP)
 * Author: [Name - Suvro Dev Mojumder , Student ID - 220237 , Discipline - CSE , Khulna University ]
 
 */

/**
 * Class representing a Book.
 * This class has the responsibility of storing book details.
 */
class Book {
    private String title;
    private String author;
    private int pageCount;

    /**
     * Constructs a Book object with the given title, author, and page count.
     *
     * @param title     The title of the book.
     * @param author    The author of the book.
     * @param pageCount The page count of the book.
     */
    public Book(String title, String author, int pageCount) {
        this.title = title;
        this.author = author;
        this.pageCount = pageCount;
    }

    // Getters and setters

    /**
     * Retrieves the title of the book.
     *
     * @return The title of the book.
     */
    public String getTitle() {
        return title;
    }

    /**
     * Retrieves the author of the book.
     *
     * @return The author of the book.
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Retrieves the page count of the book.
     *
     * @return The page count of the book.
     */
    public int getPageCount() {
        return pageCount;
    }
}

/**
 * Class responsible for managing a library.
 * This class has the responsibility of adding, removing, and retrieving books from the library.
 */
class Library {
    private List<Book> books;

    /**
     * Constructs a Library object with an empty list of books.
     */
    public Library() {
        this.books = new ArrayList<>();
    }

    /**
     * Adds a book to the library.
     *
     * @param book The book to be added.
     */
    public void addBook(Book book) {
        books.add(book);
    }

    /**
     * Removes a book from the library.
     *
     * @param book The book to be removed.
     */
    public void removeBook(Book book) {
        books.remove(book);
    }

    /**
     * Retrieves all books in the library.
     *
     * @return A list of all books in the library.
     */
    public List<Book> getAllBooks() {
        return new ArrayList<>(books);
    }
}

/**
 * Main class to demonstrate the usage of the Library class with SRP.
 */
public class LibraryDemo {
    /**
     * The main entry point of the program.
     *
     * @param args The command line arguments (not used in this program).
     */
    public static void main(String[] args) {
        // Create a Library object
        Library library = new Library();

        // Add some books to the library
        library.addBook(new Book("The Great Gatsby", "F. Scott Fitzgerald", 180));
        library.addBook(new Book("To Kill a Mockingbird", "Harper Lee", 281));

        // Retrieve all books in the library and display their details
        List<Book> books = library.getAllBooks();
        System.out.println("Books in the Library:");
        for (Book book : books) {
            System.out.println("Title: " + book.getTitle() + ", Author: " + book.getAuthor() + ", Page Count: " + book.getPageCount());
        }
    }
}
