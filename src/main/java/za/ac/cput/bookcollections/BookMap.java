package za.ac.cput.bookcollections;

import java.util.Map;
import java.util.HashMap;

public class BookMap {
    private Map<String, Book> bookMap;

    public BookMap() {
        bookMap = new HashMap();
    }

    public void addToBookMap(String key, Book book){
        bookMap.put(key, book);
    }

    public void removeFromBookMap(String key){
        bookMap.remove(key);
    }

    public Book findInBookMap(String key){
        return bookMap.get(key);
    }
}
