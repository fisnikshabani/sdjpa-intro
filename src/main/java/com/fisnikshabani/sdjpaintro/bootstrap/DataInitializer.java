package com.fisnikshabani.sdjpaintro.bootstrap;

import com.fisnikshabani.sdjpaintro.domain.Book;
import com.fisnikshabani.sdjpaintro.repositories.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile({"local","default"})
@Component
public class DataInitializer implements CommandLineRunner {

    private final BookRepository bookRepository;

    public DataInitializer(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public void run(String... args) {

        bookRepository.deleteAll(); //delete all records and initialize again!

        Book book1 = new Book("Domain Driven Desing", "123", "RandomHouse", null);
        bookRepository.save(book1);

        Book book2 = new Book("Spring In Action", "456", "RandomHouse2", null);
        bookRepository.save(book2);

        bookRepository.findAll().forEach(book -> {
            System.out.println("Book id: " + book.getId());
            System.out.println("Book title: " + book.getTitle());
        });

    }
}
