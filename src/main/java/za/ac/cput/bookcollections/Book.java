package za.ac.cput.bookcollections;

public class Book {

    private String bookTitle, author, publisher, bookHolder;
    private boolean bookAvailable;

    public Book() {
        this.bookHolder = "";
    }

    public Book(String bookTitle, String author, String publisher, String bookHolder, boolean bookAvailable) {
        this.bookTitle = bookTitle;
        this.author = author;
        this.publisher = publisher;
        this.bookHolder = bookHolder;
        this.bookAvailable = bookAvailable;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setBookHolder(String bookHolder) {
        this.bookHolder = bookHolder;
    }

    public void setBookAvailable(boolean bookAvailable) {
        this.bookAvailable = bookAvailable;
    }


    public String getBookTitle() {
        return bookTitle;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getBookHolder() {
        return bookHolder;
    }

    public boolean isBookAvailable() {
        return bookAvailable;
    }

    public void returnBook(){
        this.bookAvailable = true;
        this.bookHolder = "";

    }
}
