package com.onlinejpademo.jpaonlinedemo.repository;

import com.onlinejpademo.jpaonlinedemo.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Map;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

    List<Employee> findByFirstNameAndLastName(String firstName, String lastName);

    Employee findByFirstName(String firstName);

    @Query(value="select a.f_name, a.last_name,a.salary,b.name from employee a, department b " +
            "where a.dept_id=b.id",nativeQuery = true)
    List<Map<String,Object>> getJoinData();
}
