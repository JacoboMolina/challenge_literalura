package com.ejemplo.libreria.repository;

import com.ejemplo.libreria.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Long> {
    List<Book> findByTitleContaining(String title);
    List<Book> findByAuthorContaining(String author);
    List<Book> findByYear(int year);
    List<Book> findByLanguage(String language);
    List<Book> findTop10ByOrderByDownloadsDesc();
}
