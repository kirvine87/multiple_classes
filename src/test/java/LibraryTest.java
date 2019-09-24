import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library library;
    Book book;
    Book differentBook;

    @Before
    public void setUp(){
        library = new Library(1);
        book = new Book("Animal Farm", "George Orwell", "Drama");
        differentBook = new Book("StormBreaker", "Anthony Horowitz", "Action");
    }

    @Test
    public void hasBookCount(){
        assertEquals(0, library.bookCount());
    }

    @Test
    public void canAddBook(){
        library.addBook(book);
        assertEquals(1, library.bookCount());
    }

    @Test
    public void cantAddBookIfStockFull(){
        library.addBook(book);
        library.addBook(differentBook);
        assertEquals(1, library.bookCount());
    }

    @Test
    public void canRemoveBook(){
        library.addBook(book);
        library.removeBook(book);
        assertEquals(0, library.bookCount());
    }

}
