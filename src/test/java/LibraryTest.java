import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {
    private Library library;
    private Book book;

    @Before
    public void before(){
        library = new Library();
        book = new Book("Alice In Wonderland", "Lewis Carrol", "fantasy");
    }

    @Test
    public void check_books_start_empty(){
        assertEquals(0,library.getBooksLength());
    }

    @Test
    public void check_book_can_be_added_to_library(){
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        assertEquals(5,library.getBooksLength());
    }

    @Test
    public void can_get_capacity(){
        assertEquals(5,library.getCapacity());
    }
    @Test
    public void can_remove_a_book(){
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.removeBook(book);
        assertEquals(2, library.getBooksLength());
    }

}
