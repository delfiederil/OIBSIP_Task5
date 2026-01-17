package service;
import java.util.*;
import model.Book;
import util.FileUtil;
public class LibraryService {
    private List<Book> books;
   public LibraryService() {
    books = new ArrayList<>();  

        if (books == null) {
            books = new ArrayList<>();
        }
    }
    public void addBook(Book book) {
        books.add(book);
        FileUtil.saveBooks(books);
    }
    public List<Book> getAllBooks() {
        return books;
    }
    public Book searchBookById(int id) {
        for (Book b : books) {
            if (b.getId() == id)
                return b;
        }
        return null;
    }
    public void saveChanges() {
        FileUtil.saveBooks(books);
    }
    public void deleteBook(int id) {
        books.removeIf(b -> b.getId() == id);
        FileUtil.saveBooks(books);
    }
}