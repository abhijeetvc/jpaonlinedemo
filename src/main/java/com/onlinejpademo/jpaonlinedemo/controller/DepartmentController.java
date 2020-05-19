package com.onlinejpademo.jpaonlinedemo.controller;

import com.onlinejpademo.jpaonlinedemo.model.Department;
import com.onlinejpademo.jpaonlinedemo.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

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

    @GetMapping(value="/getdept/{deptId}")
    public Optional<Department> getDeptList(@PathVariable Integer deptId){
        return departmentRepository.findById(deptId);
    }
}
