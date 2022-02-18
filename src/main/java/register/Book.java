package register;

public class Book {
    private String author;
    private String title;
    private String isbn;

    public Book() {}

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }

    public void register(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return String.format("Author: %s\nTitle: %s\nISBN: %s\n", author, title, isbn);
    }
}
