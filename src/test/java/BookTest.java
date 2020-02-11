import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {
    private Book book;

    @Before
    public void before(){
        book = new Book("Alice In Wonderland", "Lewis Carrol", "fantasy");
    }

    @Test
    public void check_book_has_title(){
        assertEquals("Alice In Wonderland", book.getTitle());
    }

    @Test
    public void check_book_has_author(){
        assertEquals("Lewis Carrol", book.getAuthor());
    }

    @Test
    public void  check_book_has_genre(){
        assertEquals("fantasy", book.getGenre());
    }

}
