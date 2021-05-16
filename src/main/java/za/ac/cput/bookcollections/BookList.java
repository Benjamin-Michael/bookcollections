package za.ac.cput.bookcollections;

import java.util.ArrayList;
import java.util.List;

public class BookList {
    private List<Book> bookList;

    public BookList() {
        bookList = new ArrayList();
    }

    public void addToBookList(Book book){
        bookList.add(book);
    }

    public void removeFromBookList(int index){
        bookList.remove(index);
    }

    public Book findInBookList(String title){
        for(Book book: bookList){
            if(book.getBookTitle().equals(title))
                return book;

        }
        return null;
    }
}
