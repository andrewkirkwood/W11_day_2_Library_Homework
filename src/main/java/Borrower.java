import java.util.ArrayList;

public class Borrower {
    private String name;
    private ArrayList<Book> collection;
    private Integer borrowLimit;

    public Borrower(String name){
        this.name = name;
        this.borrowLimit = 3;
        this.collection = new ArrayList<Book>();
    }

    public String getName() {
        return this.name;
    }

    public int getCollection() {
        return this.collection.size();
    }

    public int getBorrowLimit() {
        if ( this.collection.size() == 0) {
            return this.borrowLimit;
        }
        return this.borrowLimit - this.getCollection();
    }

    public void addBookToCollection(Book book) {
        if ( this.getCollection() < this.borrowLimit) {
            this.collection.add(book);
        }
    }
}
