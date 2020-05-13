package com.onlinejpademo.jpaonlinedemo.controller;

import com.onlinejpademo.jpaonlinedemo.model.Employee;
import com.onlinejpademo.jpaonlinedemo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @PostMapping(value="/save")
    public String saveEmp(@RequestBody Employee employee){
        employeeRepository.save(employee);
        return "Emp saved";
    }
}
