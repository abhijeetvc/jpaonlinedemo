package com.onlinejpademo.jpaonlinedemo.controller;

import com.onlinejpademo.jpaonlinedemo.model.Department;
import com.onlinejpademo.jpaonlinedemo.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/department")
public class DepartmentController {

    @Autowired
    private DepartmentRepository departmentRepository;

    @PostMapping(value="/save")
    public String saveDept(@RequestBody Department department){
        departmentRepository.save(department);
        return "Department saved";
    }
}
