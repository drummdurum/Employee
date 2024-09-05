package com.example.useremployee.controller;

import com.example.useremployee.model.Employee;
import com.example.useremployee.repositoryUser.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployerRestController {

    @Autowired
    EmployeeRepository employeeRepository;

    @GetMapping("/employee")
    public List<Employee> getUser(){
    return employeeRepository.findAll();
    }

}
