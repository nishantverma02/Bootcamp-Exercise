package com.example.singletable.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name = "id")
public class TraineeEmployee extends Employee {
    private int assesmentScore;


    public TraineeEmployee( String fname, String lname, int age, int salary,int assesmentScore) {
        super(fname, lname, age, salary);
        this.assesmentScore=assesmentScore;
    }
}
