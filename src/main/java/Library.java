import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;

    public Library(){
        books = new ArrayList<Book>();
    }

    public int getBooksLength() {
        return this.books.size();
    }
}
