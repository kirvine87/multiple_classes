import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    Borrower borrower;
    Book book;
    Library library;

    @Before
    public void setUp(){
        borrower = new Borrower();
        book = new Book("Animal Farm", "George Orwell", "Drama");
        library = new Library(5);
        library.addBook(book);
    }

    @Test
    public void canAddBookToOwnCollection(){
        borrower.obtainBook(library.removeBook(book));
        assertEquals(1, borrower.numberOfBooks());
    }

}
