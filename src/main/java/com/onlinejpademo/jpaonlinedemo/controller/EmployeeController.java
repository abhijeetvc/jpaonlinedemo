package com.onlinejpademo.jpaonlinedemo.controller;

import com.onlinejpademo.jpaonlinedemo.model.Employee;
import com.onlinejpademo.jpaonlinedemo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping(value="/employee")
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @PostMapping(value="/save")
    public String saveEmp(@RequestBody Employee employee){
        employeeRepository.save(employee);
        return "Emp saved";
    }

    @GetMapping(value="employeelist")
    public List<Employee> getEmpList(){
        List<Employee> empList=employeeRepository.findAll();
        return empList;
    }

    @GetMapping(value="/emp/{empId}")
    public Optional<Employee> getEmp(@PathVariable Integer empId){
        Optional<Employee> e=employeeRepository.findById(empId);
        return e;
    }

    @GetMapping(value="/empbyname/{firstName}")
    public Employee getEmp1(@PathVariable String firstName){
        Employee e=employeeRepository.findByFirstName(firstName);
        return e;
    }

    @GetMapping(value="/emp/{firstName}/{lastName}")
    public List<Employee> getEmpByFirstNameAndLastName(
            @PathVariable String firstName,
            @PathVariable String lastName){
        List<Employee> e=employeeRepository.findByFirstNameAndLastName(firstName,lastName);
        return e;
    }

    @GetMapping(value="/emp1")
    public List<Map<String,Object>> getEmpAndDept(){
        return employeeRepository.getJoinData();
    }
}
