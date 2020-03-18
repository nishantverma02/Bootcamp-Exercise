package com.example.jpa2exercise;

import com.example.jpa2exercise.employee.entity.Employee;
import com.example.jpa2exercise.repo.EmployeeRepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class Jpa2exerciseApplicationTests {
	@Autowired
	EmployeeRepo repository;

	@Test
	void contextLoads() {
	}


	@Test
	public void createEmployee() {
		Employee employee = new Employee();
		employee.setFname("Harbhajan");
		employee.setLname("Singh");
		employee.setAge(38);
		employee.setSalary(12000);

		repository.save(employee);
	}
	//MEthods for jpql_____________________________________________________________________________________________
	@Test
	public void AllEmployeeAscDesc() {
		System.out.println("________________________________________________________");
		System.out.println(repository.findAllEmployeeAscDesc());

		System.out.println("________________________________________________________");
	}

//	@Test
//	public void DeleteEmployee() {
//		repository.delete();
//	}


	//____________________________________________________________________________________________________________

	//Methods for native Query____________________________________________________________________________________
	@Test
	public void displayNameEnd(){
		List<Object[]> partialdata= repository.findEmployeeBYLastName();
		for (Object[] objects:partialdata){
			System.out.println(objects[0]);
			System.out.println(objects[1]);
			System.out.println(objects[2]);
		}
	}

	@Test
	public void deleteAge(){repository.deleteAgeGreater(45);}



}
