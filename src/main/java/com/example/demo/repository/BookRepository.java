package com.example.demo.repository;

import com.example.demo.model.Book;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository

public class BookRepository {
    private final Map<Integer, Book> bookStorage = new HashMap<>();
    private int currentId = 1;

    public Book addBook(Book book) {
        book.setId(currentId++);
        bookStorage.put(book.getId(), book);
        return book;
    }

    public List<Book> getAllBooks() {
        return new ArrayList<>(bookStorage.values());
    }

    public Optional<Book> getBookById(int id) {
        return Optional.ofNullable(bookStorage.get(id));
    }

    public boolean deleteBook(int id) {
        return bookStorage.remove(id) != null;
    }

    public Optional<Book> updateAvailability(int id, boolean available) {
        Book book = bookStorage.get(id);
        if (book != null) {
            book.setAvailable(available);
            return Optional.of(book);
        }
        return Optional.empty();
    }
}
