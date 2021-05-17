package za.ac.cput.bookcollections;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookSetTest {
    private Book book1, book2;
    private BookSet bookSet;

    @BeforeEach
    void setUp() {
        book1 = new Book("Fiela se Kind", "E Adriaanse", "CPT Publishers");
        book2 = book1;
        bookSet = new BookSet();
    }

    @Test
    void addToBookSet() {
        int initialSize = bookSet.sizeOfBookSet();

        bookSet.addToBookSet(book1);
        initialSize++;

        assertEquals(initialSize, bookSet.sizeOfBookSet());
    }

    @Test
    void removeFromBookSet() {
        addToBookSet();
        int initialSize = bookSet.sizeOfBookSet();
        bookSet.removeFromBookSet(book1);
        initialSize--;
        assertEquals(initialSize, bookSet.sizeOfBookSet());
    }

    @Test
    void findInBookSet() {
        addToBookSet();

        assertEquals(book2, bookSet.findInBookSet("Fiela se Kind"));
    }
}