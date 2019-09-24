import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    Book book;

    @Before
    public void setUp(){
        book = new Book("Animal Farm", "George Orwell", "Drama");
    }

    @Test
    public void hasBook(){
        assertEquals("Animal Farm", book.getTitle());
        assertEquals("George Orwell", book.getAuthor());
        assertEquals("Drama", book.getGenre());
    }

}
