package com.example.SpringHello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.Resource;
import org.springframework.web.bind.annotation.*;

@RestController

public class Hello {
    @GetMapping(path = "/hello")
    public String m(){
        return "Welcome to Spring Boot!";
    }

    @GetMapping(path = "/helloworld/pathvariable/{name}")
    public HelloWorldBean helloWorldBean(@PathVariable String name)
    {
        HelloWorldBean helloWorldBean= new HelloWorldBean();
         helloWorldBean.setMessage(String.format("Hello World, %s",name));
         return (helloWorldBean);

    }





}
