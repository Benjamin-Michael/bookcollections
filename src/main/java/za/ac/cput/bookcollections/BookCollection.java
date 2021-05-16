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

    public void removeFromBookCollection(int index){
        bookCollection.remove(index);
    }

    public Book findInBookCollection(String title){
        for(Book book: bookCollection){
            if(book.getBookTitle().equals(title))
                return book;

        }
        return null;
    }
}
