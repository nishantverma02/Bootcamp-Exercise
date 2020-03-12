package com.example.jpaexercise;

import com.example.jpaexercise.employee.entities.Employee;
import com.example.jpaexercise.repos.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;

@SpringBootTest
class JpaexerciseApplicationTests {

	@Autowired
	EmployeeRepository repository;




	@Test
	void contextLoads() {

	}

	@Test
	public void testCreate(){
		Employee employee=new Employee();
		employee.setId(5);
		employee.setName("Lewandowski");
		employee.setAge(32);
		employee.setLocation("Poland");

		repository.save(employee);
	}
	@Test
	public void testCount(){
		System.out.println("total record------------------------>"+repository.count());
	}

	@Test
	public void updateTest(){
		Employee employee =repository.findById(4).get();
		employee.setAge(26);
		repository.save(employee);
	}
	@Test
	public void testDelete(){
		if (repository.existsById(1)){
			repository.deleteById(1);
		}
	}

	@Test
	public void testPagingAndSorting(){
		Pageable pageable= PageRequest.of(0,2, Sort.Direction.ASC,"age");
		Page<Employee> results=repository.findAll(pageable);
		results.forEach(p-> System.out.println(p.getName()+"------------"+p.getAge()));
	}

	@Test
	public void testFindByName(){
		List<Employee> employees=repository.findByName("Lionel");
		employees.forEach(p-> System.out.println(p.getName()+"---"+p.getAge()));
	}

	@Test
	public void testFindByAgeBetween(){
		List<Employee> employees=repository.findByAgeBetween(25,30);
		employees.forEach(p-> System.out.println(p.getName()+"---"+p.getAge()));
	}

	@Test
	public void testFindByAlphabet()
	{
		List<Employee> employees = repository.findByNameStartingWith("l");
		employees.forEach(p-> System.out.println(p.getName()+"----"+p.getAge()));
	}

}
