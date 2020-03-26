package com.TTNProject.EcommerceWebsite.RepositoryOperation;

import com.TTNProject.EcommerceWebsite.Entity.User.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Integer> {
}
