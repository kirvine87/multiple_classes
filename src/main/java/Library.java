import java.util.ArrayList;

public class Library {

    private ArrayList<Book> collection;
    private int capacity;

    public Library(int capacity){
        collection = new ArrayList<Book>();
        this.capacity = capacity;
    }

    public int bookCount(){
        return this.collection.size();
    }

    public void addBook(Book book){
        if (this.bookCount() < capacity) {
            this.collection.add(book);
        }
    }

    public Book removeBook(Book book){
        this.collection.remove(book);
        return book;
    }

}
