package com.onlinejpademo.jpaonlinedemo.repository;

import com.onlinejpademo.jpaonlinedemo.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department,Integer> {
}
