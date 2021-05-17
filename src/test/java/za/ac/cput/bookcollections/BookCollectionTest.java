package za.ac.cput.bookcollections;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookCollectionTest {

    private Book book1, book2;
    private BookCollection bookCollection;

    @BeforeEach
    void setUp() {
        book1 = new Book("Harry Potter And The Half-Blood Prince", "J.K Rowling", "British Publishers");
        book2 = book1;
        bookCollection = new BookCollection();
    }

    @Test
    void addToBookCollection() {
        int initialSize = bookCollection.sizeOfBookCollection();

        bookCollection.addToBookCollection(book1);
        initialSize++;

        assertEquals(initialSize, bookCollection.sizeOfBookCollection());
    }

    @Test
    void removeFromBookCollection() {
        addToBookCollection();
        int initialSize = bookCollection.sizeOfBookCollection();
        bookCollection.removeFromBookCollection(book1);
        initialSize--;
        assertEquals(initialSize, bookCollection.sizeOfBookCollection());
    }

    @Test
    void findInBookCollection() {
        addToBookCollection();

        assertEquals(book2, bookCollection.findInBookCollection("Harry Potter And The Half-Blood Prince") );
    }
}