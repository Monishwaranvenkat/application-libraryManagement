package com.example.springrest.application.service;

import com.example.springrest.application.entity.Book;
import com.example.springrest.application.repositry.BookRepositry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {
    @Autowired
    BookRepositry bookRepositry;
    public void addBook(Book book)
    {
        bookRepositry.save(book);
    }

    public void updateBook(Integer id,Book book)
    {
        Book oldBook = bookRepositry.findById(id).get();
        oldBook.setBookName(book.getBookName());
        oldBook.setGenre(book.getGenre());
        oldBook.setQuantity(book.getQuantity());
        bookRepositry.save(oldBook);
    }

    public String deleteBook(Integer id)
    {
        try {
            bookRepositry.delete(bookRepositry.findById(id).get());
            return "Deleted Successfully";
        }catch (Exception e)
        {
            return "Book Not found";
        }

    }

    public List<Book> getAllBooks()
    {
        return bookRepositry.findAll();
    }

    public List<Book> getByGenre(String genre)
    {
        String g = "Fantasy";

        System.out.println(bookRepositry.findAllByGenre(g));
        System.out.println(bookRepositry.findAllByGenre(genre));
        System.out.println(genre);
        return bookRepositry.findAllByGenre(genre);
    }
}
