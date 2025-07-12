package com.example.demo.service;

import com.example.demo.model.Book;
import com.example.demo.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public Book addBook(Book book) {
        return bookRepository.addBook(book);
    }

    public List<Book> getAllBooks() {
        return bookRepository.getAllBooks();
    }

    public Optional<Book> getBookById(int id) {
        return bookRepository.getBookById(id);
    }

    public boolean deleteBook(int id) {
        return bookRepository.deleteBook(id);
    }

    public Optional<Book> updateAvailability(int id, boolean available) {
        return bookRepository.updateAvailability(id, available);
    }
}
