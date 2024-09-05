package com.example.useremployee.repositoryUser;

import com.example.useremployee.model.Employee;
import com.example.useremployee.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

    List<Employee> findAllByName(String name);

    List<Employee> findAll();

}
