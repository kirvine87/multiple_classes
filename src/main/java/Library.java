import java.util.ArrayList;
import java.util.HashMap;

public class Library {

    private ArrayList<Book> collection;
    private int capacity;
    private HashMap<String, Integer> genreCount;

    public Library(int capacity){
        collection = new ArrayList<Book>();
        this.capacity = capacity;
        this.genreCount = new HashMap<String, Integer>();
    }

    public int bookCount(){
        return this.collection.size();
    }

    public void addBook(Book book){
        if (this.bookCount() < capacity) {
            this.collection.add(book);
            this.bookGenreCounter(book.getGenre());
        }
    }

    public Book removeBook(Book book){
        this.collection.remove(book);
        return book;
    }

    private void bookGenreCounter(String genre){
        if (this.genreCount.containsKey(genre)){
            Integer total = this.genreCount.get(genre) + 1;
            this.genreCount.replace(genre, total);
        } else {
            this.genreCount.put(genre, 1);
        }
    }

    public int bookGenreCount(String genre){
        return this.genreCount.get(genre);
    }

}
