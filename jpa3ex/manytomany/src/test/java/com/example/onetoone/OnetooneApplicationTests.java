package com.example.onetoone;

import com.example.onetoone.entity.Address;
import com.example.onetoone.entity.Author;
import com.example.onetoone.entity.Book;
import com.example.onetoone.repos.Repository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.*;

@SpringBootTest
class OnetooneApplicationTests {
	@Autowired
	Repository repository;

	@Test
	void contextLoads() {
	}
	@Test
	public void testCreateAuthor(){
		Author author = new Author();
		author.setName("nishant verma");
		author.setSubjects(Arrays.asList("Hindi", "English", "Maths"));
		author.setAddress(new Address(7, "NewDelhi", "Delhi"));

		ArrayList<Book> books2ArrayList= new ArrayList<>();
		Book book1 = new Book();
		book1.setId(1);
		book1.setBookName("Harry Potter");
		books2ArrayList.add(book1);

		Book book2 = new Book();
		book2.setId(2);
		book2.setBookName("Tom Sawyer");
		books2ArrayList.add(book2);

		author.setBookList(books2ArrayList);
		repository.save(author);

	}

	@Test
	public void testLoadAuthorDetails() {
		Author author1 = new Author();
		Optional<Author> optionalAuthor1 = repository.findById(1);
		author1 = optionalAuthor1.get();
		System.out.println(author1.getName());

		List<Book> books1List = author1.getBookList();
		books1List.forEach(n -> System.out.println(n.getBookName()));

	}
}


