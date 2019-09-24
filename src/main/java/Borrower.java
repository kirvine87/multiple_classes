import java.util.ArrayList;

public class Borrower {

    private ArrayList<Book> privateCollection;

    public Borrower(){
        this.privateCollection = new ArrayList<Book>();
    }

    public void obtainBook(Book book){
        this.privateCollection.add(book);
    }

    public int numberOfBooks() {
        return this.privateCollection.size();
    }
}
