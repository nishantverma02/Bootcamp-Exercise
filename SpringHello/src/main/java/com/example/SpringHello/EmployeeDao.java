package com.example.SpringHello;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Component
public class EmployeeDao {
    private static List<Employee> employees = new ArrayList<>();
    private static Integer employeeCount = 3;

    static {
        employees.add(new Employee(1,"Nishant",21));
        employees.add(new Employee(2,"Prajjwal",22));
        employees.add(new Employee(3,"Vishal",23));

    }
    public List<Employee> findAll()
    {
        return employees;
    }
    public Employee save(Employee employee)
    {
        if (employee.getId()==null)
        {
            employee.setId(++employeeCount);
        }
        employees.add(employee);
        return employee;
    }
    public Employee findOne(int id)
    {
        for(Employee employee:employees)
        {
            if(employee.getId()==id)
            {
                return employee;
            }
        }
        return null;
    }
    public Employee deleteById(int id)
    {
        Iterator<Employee> iterator = employees.iterator();
        while (iterator.hasNext())
        {
            Employee employee = iterator.next();
            if(employee.getId() == id)
            {
                iterator.remove();
            }
        }

        return null;
    }



}
