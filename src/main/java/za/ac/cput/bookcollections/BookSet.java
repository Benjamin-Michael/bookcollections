package za.ac.cput.bookcollections;

import java.util.Set;
import java.util.HashSet;

public class BookSet {
    private Set<Book> bookSet;

    public BookSet() {
        bookSet = new HashSet();
    }

    public void addToBookSet(Book book){
        bookSet.add(book);
    }

    public void removeFromBookSet(Book book){
        bookSet.remove(book);
    }

    public Book findInBookSet(String title){
        for(Book book: bookSet){
            if(book.getBookTitle().equals(title))
                return book;

        }
        return null;
    }
}
