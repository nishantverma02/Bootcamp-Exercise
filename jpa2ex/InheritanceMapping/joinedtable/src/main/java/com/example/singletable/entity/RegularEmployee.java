package com.example.singletable.entity;


import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name = "id")

public class RegularEmployee extends Employee{

    private String project;


    public RegularEmployee(String fname, String lname, int age, int salary,String project) {
        super( fname, lname, age, salary);

        this.project=project;
    }
}
