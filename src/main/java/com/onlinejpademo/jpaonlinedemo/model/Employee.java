package com.onlinejpademo.jpaonlinedemo.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "employee")
@Getter
@Setter
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name="f_name",length = 50)
    private String firstName;
    private String lastName;
    private String city;
    private Double salary;

    @ManyToOne
    @JoinColumn(name="dept_id")
    private Department department;

}
