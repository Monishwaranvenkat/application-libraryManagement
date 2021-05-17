package com.example.springrest.application.repositry;

import com.example.springrest.application.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface BookRepositry extends JpaRepository<Book,Integer> {
    List<Book> findByGenre(String genre);
    List<Book> findAllByGenre(String genre);
}
