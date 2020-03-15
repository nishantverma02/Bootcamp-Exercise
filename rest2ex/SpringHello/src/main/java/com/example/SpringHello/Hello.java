package com.example.SpringHello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.hateoas.Resource;
import org.springframework.web.bind.annotation.*;

import java.util.Locale;

@RestController

public class Hello {

    @Autowired
    private MessageSource messageSource;


    @GetMapping(path = "/hello")
    public String m(){
        return "Welcome to Spring Boot!";
    }


    @GetMapping(path = "/helloworld-internationalized")
    public String helloWorldInternationalized(@RequestHeader(name = "Accept-Language", required = false) Locale locale)
    {
        return messageSource.getMessage("hello.message",null,locale);

    }


}
