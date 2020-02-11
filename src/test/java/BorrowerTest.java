import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    private Borrower borrower;
    private Book book;

    @Before
    public void before(){
        this.borrower = new Borrower("Jim");
        this.book = new Book("Alice In Wonderland", "Lewis Carrol", "fantasy");
    }

    @Test
    public void can_get_borrower_name(){
        assertEquals("Jim", borrower.getName());
    }

    @Test
    public void borrower_collection_starts_empty(){
        assertEquals(0, borrower.getCollection());
    }

    @Test
    public void can_get_borrower_remaining_reservation_count_when_no_books_in_collection(){
        assertEquals(3, borrower.getBorrowLimit());
    }

    @Test
    public void can_get_borrower_remaining_reservation_count_with_books_in_collection(){
        borrower.addBookToCollection(book);
        assertEquals(2, borrower.getBorrowLimit());
        assertEquals(1, borrower.getCollection());

    }
}
