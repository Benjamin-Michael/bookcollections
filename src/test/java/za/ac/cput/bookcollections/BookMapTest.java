package za.ac.cput.bookcollections;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookMapTest {

    private Book book1, book2;
    private BookMap bookMap;

    @BeforeEach
    void setUp() {
        book1 = new Book("Twilight", "A Adams", "CCMP Publishers");
        book2 = book1;
        bookMap = new BookMap();
    }

    @Test
    void addToBookMap() {
        int initialSize = bookMap.sizeOfBookMap();

        bookMap.addToBookMap("AA-TWI", book1);
        initialSize++;

        assertEquals(initialSize, bookMap.sizeOfBookMap());
    }

    @Test
    void removeFromBookMap() {
        addToBookMap();
        int initialSize = bookMap.sizeOfBookMap();
        bookMap.removeFromBookMap("AA-TWI");
        initialSize--;
        assertEquals(initialSize, bookMap.sizeOfBookMap());
    }

    @Test
    void findInBookMap() {
        addToBookMap();

        assertEquals(book2, bookMap.findInBookMap("AA-TWI") );
    }
}