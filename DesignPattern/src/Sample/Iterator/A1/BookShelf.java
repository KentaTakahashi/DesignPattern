package Sample.Iterator.A1;

import java.util.ArrayList;
import java.util.Iterator;

public class BookShelf implements Iterable<Book>{
    private ArrayList<Book> books;
    public BookShelf(int initialsize) {
        this.books = new ArrayList<Book>(initialsize);
    }
    public Book getBookAt(int index) {
        return books.get(index);
    }
    public void appendBook(Book book) {
        books.add(book);
    }
    public int getLength() {
        return books.size();
    }
    public Iterator<Book> iterator() {
        return new BookShelfIterator(this);
    }
}
