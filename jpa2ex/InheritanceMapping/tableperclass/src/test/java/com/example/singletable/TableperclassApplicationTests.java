package com.example.singletable;

import com.example.singletable.entity.Employee;
import com.example.singletable.entity.RegularEmployee;
import com.example.singletable.entity.TraineeEmployee;
import com.example.singletable.repos.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TableperclassApplicationTests {
	@Autowired
	EmployeeRepository repository;

	@Test
	void contextLoads() {
	}

	@Test
	public void createTable(){
		Employee employee=new RegularEmployee("Nishant","Verma",21,15100,"hibernate");
		repository.save(employee);
		Employee employee1=new TraineeEmployee("Vishal","Deshwal",25,10000,100);
		repository.save(employee1);

		Employee employee2=new TraineeEmployee("Tushar","Verma",20,10000,100);
		repository.save(employee2);

	}

}
