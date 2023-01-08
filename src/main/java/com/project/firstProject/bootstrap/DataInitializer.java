package com.project.firstProject.bootstrap;

import com.project.firstProject.domain.Book;

import com.project.firstProject.repositories.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer implements CommandLineRunner {


    private final BookRepository bookRepository;

    public DataInitializer(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public void run(String... args) throws Exception {
    Book bookDDD = new Book("Domain driver design","123","Random");

    System.out.println("!!!!!!!!!!!!" + bookDDD.getId());

    Book savedBook = bookRepository.save(bookDDD);
    System.out.println(savedBook.getId());

    Book bookSIA = new Book("Spring in action","231","Random2");

    Book saveBookSia = bookRepository.save(bookSIA);
    }
}
