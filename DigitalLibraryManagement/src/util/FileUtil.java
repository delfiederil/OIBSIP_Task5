package util;

import java.io.*;
import java.util.*;
import model.Book;

public class FileUtil {

    private static final String FILE_PATH = "data/books.txt";

    public static List<Book> loadBooks() {
        List<Book> books = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;

            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                Book book = new Book(
                        Integer.parseInt(data[0]),
                        data[1],
                        data[2],
                        Boolean.parseBoolean(data[3])
                );
                books.add(book);
            }

        } catch (Exception e) {
            System.out.println("No existing data found.");
        }

        return books;
    }

    public static void saveBooks(List<Book> books) {
        try (PrintWriter pw = new PrintWriter(new FileWriter(FILE_PATH))) {
            for (Book b : books) {
                pw.println(b.toString());
            }
        } catch (Exception e) {
            System.out.println("Error saving books.");
        }
    }
}
