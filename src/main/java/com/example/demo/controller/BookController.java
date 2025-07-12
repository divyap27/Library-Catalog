package com.example.demo.controller;

import com.example.demo.model.Book;
import com.example.demo.service.BookService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/api/books")
public class BookController {

    @Autowired
    private BookService bookService;

    // Add a new book
    @PostMapping
    public ResponseEntity<Book> addBook(@Valid @RequestBody Book book) {
        Book savedBook = bookService.addBook(book);
        return new ResponseEntity<>(savedBook, HttpStatus.CREATED);
    }

    // Get all books
    @GetMapping
    public ResponseEntity<List<Book>> getAllBooks() {
        return ResponseEntity.ok(bookService.getAllBooks());
    }

    // Get book by ID
    @GetMapping("/{id}")
public ResponseEntity<?> getBookById(@PathVariable int id) {
    Optional<Book> optionalBook = bookService.getBookById(id);
    if (optionalBook.isPresent()) {
        return ResponseEntity.ok(optionalBook.get());
    } else {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Book not found");
    }
}

    // Delete book by ID
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteBook(@PathVariable int id) {
        boolean deleted = bookService.deleteBook(id);
        return deleted
                ? new ResponseEntity<>("Book deleted", HttpStatus.OK)
                : new ResponseEntity<>("Book not found", HttpStatus.NOT_FOUND);
    }

    // Update book availability
    @PatchMapping("/{id}/availability")
public ResponseEntity<?> updateAvailability(@PathVariable int id, @RequestParam boolean available) {
    Optional<Book> updatedBook = bookService.updateAvailability(id, available);
    if (updatedBook.isPresent()) {
        return ResponseEntity.ok(updatedBook.get());
    } else {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Book not found");
    }
}

}
