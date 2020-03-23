package com.example.onetoone.entity;

import javax.persistence.*;

//Q5
@Entity
public class Book {

    @Id
    private int id;
    private String bookName;

    //Q6
    @OneToOne(mappedBy = "book")
    private Author author;

    public Book() {
    }

    public Book(int id, String bookName) {
        this.id = id;
        this.bookName = bookName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    @Override
    public String toString() {
        return "Books{" +
                "id=" + id +
                ", bookName='" + bookName + '\'' +
                ", author=" + author +
                '}';
    }
}
