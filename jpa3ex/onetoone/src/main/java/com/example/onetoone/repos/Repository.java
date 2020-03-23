package com.example.onetoone.repos;

import com.example.onetoone.entity.Author;
import org.springframework.data.repository.CrudRepository;

public interface Repository extends CrudRepository<Author, Integer> {

}

