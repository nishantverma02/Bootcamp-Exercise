package com.example.SpringHello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.Resource;
import org.springframework.hateoas.mvc.ControllerLinkBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.util.List;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

@RestController
public class UserResource {

    @Autowired
    private EmployeeDao service;
    @GetMapping("/employees")
    public List<Employee> retrieveAllEmployees()
    {
        return service.findAll();
    }
    //hateoas implementation
    @GetMapping("employees/{id}")
    public Employee retrieveEmployee(@PathVariable int id)
    {
        Employee employee = service.findOne(id);
        if(employee == null)
            throw new UserNotFoundException("id-"+id);
        Link link = linkTo(methodOn(UserResource.class)
                .retrieveAllEmployees()).withRel("All employees");

        employee.setLink(link);
        return employee;
    }

    @PostMapping("/employees")
    public ResponseEntity<Object> createUser(@Valid @RequestBody Employee employee)
    {
        Employee savedEmployee   =service.save(employee);

        //Created
       URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(savedEmployee.getId()).toUri();

        return ResponseEntity.created(location).build();

    }
    @DeleteMapping("employees/{id}")
    public void deleteEmployee(@PathVariable int id)
    {
        Employee employee = service.deleteById(id);
        if(employee == null)
            throw new UserNotFoundException("id-"+id);
        Resource<Employee> resource = new Resource<Employee>(employee);
        linkTo(methodOn(this.getClass()));

    }



}
