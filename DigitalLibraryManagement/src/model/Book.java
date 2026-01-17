package model;
public class Book {
    private int id;
    private String title;
    private String author;
    private boolean issued;
    public Book(int id, String title, String author, boolean issued) {
        if (id <= 0) {
            throw new IllegalArgumentException("ID must be positive");
        }
        if (title == null || title.isEmpty()) {
            throw new IllegalArgumentException("Title cannot be null or empty");
        }
        if (author == null || author.isEmpty()) {
            throw new IllegalArgumentException("Author cannot be null or empty");
        }
        this.id = id;
        this.title = title;
        this.author = author;
        this.issued = issued;
    }
    public int getId() {
        return id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        if (title == null || title.isEmpty()) {
            throw new IllegalArgumentException("Title cannot be null or empty");
        }
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        if (author == null || author.isEmpty()) {
            throw new IllegalArgumentException("Author cannot be null or empty");
        }
        this.author = author;
    }
    public boolean isIssued() {
        return issued;
    }
    public void setIssued(boolean issued) {
        this.issued = issued;
    }
    @Override
    public String toString() {
        return id + "," + title + "," + author + "," + issued;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return id == book.id;
    }
    @Override
    public int hashCode() {
        return Integer.hashCode(id);
    }
}