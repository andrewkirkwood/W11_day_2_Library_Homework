import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;
    private Integer capacity;

    public Library(){
        this.books = new ArrayList<Book>();
        this.capacity = 5;
    }

    public int getBooksLength() {
        return this.books.size();
    }

    public void addBook(Book book) {
        if (this.getBooksLength() < this.capacity){
            this.books.add(book);
        }
    }

    public int getCapacity() {
        return this.capacity;
    }

    public void removeBook(Book book) {
        int indexToDelete = this.books.indexOf(book);
        this.books.remove(indexToDelete);
    }

    public void loanBook(Book book, Borrower borrower) {
        if (borrower.getBorrowLimit() > 0 && this.checkIfBookIsInStock(book)) {
            this.removeBook(book);
            borrower.addBookToCollection(book);
        }
    }

    public boolean checkIfBookIsInStock(Book book) {
        return this.books.contains(book);
    }
}
