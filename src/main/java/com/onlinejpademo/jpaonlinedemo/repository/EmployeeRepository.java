package com.onlinejpademo.jpaonlinedemo.repository;

import com.onlinejpademo.jpaonlinedemo.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

    List<Employee> findByFirstNameAndLastName(String firstName, String lastName);

    Employee findByFirstName(String firstName);
}
