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
}
