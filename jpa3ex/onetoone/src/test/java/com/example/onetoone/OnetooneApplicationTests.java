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
	//Q4
	@Test
	public void testCreateAuthor(){

		Author author1 =  new Author();
		author1.setName("Nikhil Kushwaha");
		author1.setSubjects(Arrays.asList("Hindi","English","Maths"));
		author1.setAddress(new Address(4,"NewDelhi","Delhi"));
		author1.setBook(new Book(2,"Harry Potter"));
		repository.save(author1);

		Author author2 =  new Author();
		author2.setName("Nehal Birla");
		author2.setSubjects(Arrays.asList("Science","English","Maths"));
		author2.setAddress(new Address(12,"Palam","Delhi"));
		author2.setBook(new Book(3,"Twilight"));
		repository.save(author2);
	}
	@Test
	public void testOneToOne(){
		Author author = new Author();
		author.setName("Nishant");
		author.setAddress(new Address(8,"Dwarka","Delhi"));
		author.setSubjects(Arrays.asList("English","Hindi","Science"));
		author.setBook(new Book(1,"xyz"));
		repository.save(author);
	}
}


