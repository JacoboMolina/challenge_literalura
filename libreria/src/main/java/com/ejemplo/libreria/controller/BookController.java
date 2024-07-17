package com.ejemplo.libreria.controller;

import com.ejemplo.libreria.model.Book;
import com.ejemplo.libreria.service.BookService;
import com.ejemplo.libreria.service.GutendexClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/books")
public class BookController {

    @Autowired
    private BookService bookService;

    @Autowired
    private GutendexClient gutendexClient;

    @PostMapping
    public Book addBook(@RequestBody Book book) {
        return bookService.addBook(book);
    }

    @GetMapping("/search")
    public List<Book> searchBooks(@RequestParam String title) {
        return bookService.searchBooks(title);
    }

    @GetMapping("/search/author")
    public List<Book> searchBooksByAuthor(@RequestParam String author) {
        return bookService.searchBooksByAuthor(author);
    }

    @GetMapping("/year")
    public List<Book> getBooksByYear(@RequestParam int year) {
        return bookService.getBooksByYear(year);
    }

    @GetMapping("/language")
    public List<Book> getBooksByLanguage(@RequestParam String language) {
        return bookService.getBooksByLanguage(language);
    }

    @GetMapping("/top10")
    public List<Book> getTop10DownloadedBooks() {
        return bookService.getTop10DownloadedBooks();
    }

    @GetMapping("/search/external")
    public List<Book> searchExternalBooks(@RequestParam String query) {
        return gutendexClient.searchBooks(query);
    }
}
