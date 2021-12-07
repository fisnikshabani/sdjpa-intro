package com.fisnikshabani.sdjpaintro.bootstrap;

import com.fisnikshabani.sdjpaintro.domain.AuthorUuid;
import com.fisnikshabani.sdjpaintro.domain.Book;
import com.fisnikshabani.sdjpaintro.repositories.AuthorUuidRepository;
import com.fisnikshabani.sdjpaintro.repositories.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile({"local","default"})
@Component
public class DataInitializer implements CommandLineRunner {

    private final BookRepository bookRepository;
    private final AuthorUuidRepository authorUuidRepository;

    public DataInitializer(BookRepository bookRepository, AuthorUuidRepository authorUuidRepository) {
        this.bookRepository = bookRepository;
        this.authorUuidRepository = authorUuidRepository;
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

        AuthorUuid authorUuid = new AuthorUuid();
        authorUuid.setFirstName("Joe");
        authorUuid.setLastName("Buck");
        AuthorUuid savedAuthor = authorUuidRepository.save(authorUuid);
        System.out.printf("Saved Author UUID: " + savedAuthor.getId());

    }
}
