import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {
    private Library library;
    private Book book;
    private Book book1;
    private Book book2;
    private Book book3;
    private Borrower borrower;

    @Before
    public void before(){
        library = new Library();
        book = new Book("Alice In Wonderland", "Lewis Carrol", "fantasy");
        book1 = new Book("1984", "George Orwell", "dystopian");
        book2 = new Book("Animal Farm", "George Orwell", "dystopian");
        book3 = new Book("Book Of Dust", "Phillip Pullman", "fantasy");


        borrower = new Borrower("Sam");
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

    @Test
    public void can_check_if_book_is_in_stock(){
        library.addBook(book);
        assertEquals(true, library.checkIfBookIsInStock(book));
    }

    @Test
    public void can_check_if_book_is_in_stock__book_does_not_exit(){
        assertEquals(false, library.checkIfBookIsInStock(book));
    }

    @Test
    public void can_loan_book_new_customer_with_no_books_yet(){
        library.addBook(book);
        library.addBook(book1);
        library.loanBook(book, borrower);
        assertEquals(1, borrower.getCollection());
        assertEquals(1, library.getBooksLength());
    }

    @Test
    public void check_borrower_collection_length_is_limited_to_borrow_capacity(){
        library.addBook(book);
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.loanBook(book, borrower);
        library.loanBook(book1, borrower);
        library.loanBook(book2, borrower);
        library.loanBook(book3, borrower);
        assertEquals(3, borrower.getCollection());
        assertEquals(1, library.getBooksLength());

    }




}
