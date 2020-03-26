package com.TTNProject.EcommerceWebsite.Service;

import com.TTNProject.EcommerceWebsite.Entity.User.User;
import com.TTNProject.EcommerceWebsite.RepositoryOperation.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

   /* public User FindById(int id){
        return userRepository.findById(id);
    }*/

    /*public User createUserEntity(User user){
        return userRepository.save(user);
    }*/

}
