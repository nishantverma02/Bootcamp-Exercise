package com.example.singletable;

import com.example.singletable.entity.Employee;
import com.example.singletable.entity.Salary;
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
	void createEmbeddedTable(){
		Employee employee=new Employee();
		employee.setFname("Nishant");
		employee.setLname("Verma");
		employee.setAge(23);
		Salary salary=new Salary();
		salary.setBasicsalary(10000);
		salary.setBonoussalary(12000);
		salary.setTaxamount(2000);
		salary.setSpecialallowencesalary(29990);
		employee.setSalary(salary);
		repository.save(employee);
	}

}
