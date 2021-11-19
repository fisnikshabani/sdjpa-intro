package com.fisnikshabani.sdjpaintro.repositories;

import com.fisnikshabani.sdjpaintro.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
