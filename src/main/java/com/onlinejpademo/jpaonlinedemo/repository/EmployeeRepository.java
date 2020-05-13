package com.onlinejpademo.jpaonlinedemo.repository;

import com.onlinejpademo.jpaonlinedemo.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
}
