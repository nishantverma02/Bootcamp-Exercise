package com.example.everyuse;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class FilteringController {

    @GetMapping("/userinfo")
    public User retrieveDeatails(){
        return new User("Nishant","Verma",21);
    }

}