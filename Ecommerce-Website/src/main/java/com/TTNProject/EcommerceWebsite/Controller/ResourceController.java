package com.TTNProject.EcommerceWebsite.Controller;

import com.TTNProject.EcommerceWebsite.Entity.User.User;
import com.TTNProject.EcommerceWebsite.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResourceController {
    @Autowired
    private UserService userService;

   /* @GetMapping("/user")
    public User Test(){
        return userService.FindById(1);
    }*/

   /* @PostMapping("/register-user")
    public User Entity(@RequestBody User user){
         userService.createUserEntity(user);
         return user;
    }*/

}