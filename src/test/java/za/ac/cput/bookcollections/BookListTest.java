package za.ac.cput.bookcollections;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookListTest {

    private Book book1, book2;
    private BookList bookList;

    @BeforeEach
    void setUp() {
        book1 = new Book("Lord of The Flies", "M Benjamin", "Conch Publishers");
        book2 = book1;
        bookList = new BookList();
    }

    @Test
    void addToBookList() {
        int initialSize = bookList.sizeOfBookList();

        bookList.addToBookList(book1);
        initialSize++;

        assertEquals(initialSize, bookList.sizeOfBookList());
    }

    @Test
    void removeFromBookList() {
        addToBookList();
        int initialSize = bookList.sizeOfBookList();
        bookList.removeFromBookList(book1);
        initialSize--;
        assertEquals(initialSize, bookList.sizeOfBookList());
    }

    @Test
    void findInBookList() {
        addToBookList();

        assertEquals(book2, bookList.findInBookList("Lord of The Flies") );
    }
}