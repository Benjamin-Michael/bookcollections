package za.ac.cput.bookcollections;

import java.util.ArrayList;
import java.util.Collection;

public class BookCollection {

    private Collection<Book> bookCollection;

    public BookCollection() {
        bookCollection = new ArrayList();
    }

    public void addToBookCollection(Book book){
        bookCollection.add(book);
    }

    public void removeFromBookCollection(Book book){
        bookCollection.remove(book);
    }

    public void findInBookCollection(){

    }
}
