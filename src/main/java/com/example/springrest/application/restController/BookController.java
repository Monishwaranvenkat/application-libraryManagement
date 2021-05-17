package com.example.springrest.application.restController;

import com.example.springrest.application.entity.Book;
import com.example.springrest.application.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@SuppressWarnings("unused")
public class BookController {
    @Autowired
    BookService bookService;

    @PostMapping("/saveBook")
    public void saveBook(@RequestBody Book book)
    {
        bookService.addBook(book);
    }

    @PostMapping("/editBook")
    public void editBook(@RequestBody Book book,@RequestParam("bookId")Integer id)
    {
        bookService.updateBook(id,book);
    }

    @PostMapping("/deleteBook")
    public String deleteBook(@RequestParam("bookId")Integer id)
    {
        return bookService.deleteBook(id);
    }

    @GetMapping("/getBooks")
    public List<Book> getBooks()
    {
        return bookService.getAllBooks();
    }

    @GetMapping("/getByType")
    public List<Book> getByType(@RequestParam("id")String genre)
    {
        return bookService.getByGenre(genre);
    }
}
