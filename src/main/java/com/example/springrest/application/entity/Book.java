package com.example.springrest.application.entity;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name="Book")
public class Book {
    public Book() {
    }

    public Book(Integer bookId, String bookName, Integer quantity, String genre) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.quantity = quantity;
        this.genre = genre;
    }

    @Id
    private Integer bookId;
    private String bookName;
    private Integer quantity;
    private String genre;

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", bookName='" + bookName + '\'' +
                ", quantity=" + quantity +
                ", genre='" + genre + '\'' +
                '}';
    }
}
