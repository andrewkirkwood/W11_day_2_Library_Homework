import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {
    private Library library;

    @Before
    public void before(){
        library = new Library();
    }

    @Test
    public void check_books_start_empty(){
        assertEquals(0,library.getBooksLength());
    }

}
