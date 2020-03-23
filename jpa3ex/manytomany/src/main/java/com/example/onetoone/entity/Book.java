package com.example.onetoone.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.List;

@Entity
public class Book {
    @Id
    private int id;
    private String bookName;


    @ManyToMany(mappedBy = "bookList")
    private List<Author> authorList;

    public Book() {
    }

    public Book(int id, String bookName, List<Author> authorList) {
        this.id = id;
        this.bookName = bookName;
        this.authorList = authorList;
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

    public List<Author> getAuthorList() {
        return authorList;
    }

    public void setAuthorList(List<Author> authorList) {
        this.authorList = authorList;
    }

    @Override
    public String toString() {
        return "Books{" +
                "id=" + id +
                ", bookName='" + bookName + '\'' +
                ", authorList=" + authorList +
                '}';
    }
}