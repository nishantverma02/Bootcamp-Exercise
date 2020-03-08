package com.example.SpringHello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.util.List;

@RestController
public class UserResource {

    @Autowired
    private EmployeeDao service;
    @GetMapping("/users")
    public List<Employee> retrieveAllEmployees()
    {
        return service.findAll();
    }
    @GetMapping("users/{id}")
    public Employee retrieveEmployee(@PathVariable int id)
    {
        Employee employee = service.findOne(id);
        if(employee == null)
            throw new UserNotFoundException("id-"+id);
        return employee;
    }

    @PostMapping("/users")
    public ResponseEntity<Object> createUser(@Valid @RequestBody Employee employee)
    {
        Employee savedEmployee   =service.save(employee);

        //Created
       URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(savedEmployee.getId()).toUri();

        return ResponseEntity.created(location).build();

    }
    @DeleteMapping("users/{id}")
    public void deleteEmployee(@PathVariable int id)
    {
        Employee employee = service.deleteById(id);
        if(employee == null)
            throw new UserNotFoundException("id-"+id);

    }


}
