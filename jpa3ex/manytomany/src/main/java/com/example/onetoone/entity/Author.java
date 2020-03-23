package com.example.onetoone.entity;


import javax.persistence.*;
import java.util.List;

@Entity
public class Author{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;


    @ElementCollection
    @CollectionTable(name = "subjects", joinColumns = @JoinColumn(name = "id"))
    @Column(name = "SubjectName")
    private List<String> subjects;


    @Embedded
    private Address address;


    @ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinTable(name = "Author_Book" ,joinColumns = @JoinColumn(name = "Author_id",referencedColumnName = "id"),inverseJoinColumns = @JoinColumn(name = "Book_id",referencedColumnName = "id"))
    private List<Book> bookList;

    public Author() {
    }

    public Author(int id, String name, List<String> subjects, Address address, List<Book> bookList) {
        this.id = id;
        this.name = name;
        this.subjects = subjects;
        this.address = address;
        this.bookList = bookList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<String> subjects) {
        this.subjects = subjects;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<Book> getBookList() {
        return bookList;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }

    @Override
    public String toString() {
        return "Author{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", subjects=" + subjects +
                ", address=" + address +
                ", bookList=" + bookList +
                '}';
    }

}