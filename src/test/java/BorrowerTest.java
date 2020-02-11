import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    private Borrower borrower;

    @Before
    public void before(){
        this.borrower = new Borrower("Jim");
    }

    @Test
    public void can_get_borrower_name(){
        assertEquals("Jim", borrower.getName());
    }

    @Test
    public void borrower_collection_starts_empty(){
        assertEquals(0, borrower.getCollection());

    }
}
