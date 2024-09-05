package com.example.useremployee.config;

import com.example.useremployee.model.Employee;
import com.example.useremployee.model.Gender;
import com.example.useremployee.model.User;
import com.example.useremployee.repositoryUser.EmployeeRepository;
import com.example.useremployee.repositoryUser.RepositoryUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class initData implements CommandLineRunner {
    @Autowired
    RepositoryUser repositoryUser;
    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public void run(String... args) throws Exception {
        User us1 = new User();
        us1.setEmail("erik@aol.com");
        us1.setPassword("lasdfkjalk");
        repositoryUser.save(us1);

        us1.setUserId(0);
        us1.setEmail("kurt@aol.com");
        us1.setPassword("masrdjalk");
        repositoryUser.save(us1);

        us1.setUserId(0);
        us1.setEmail("jens@aol.com");
        us1.setPassword("pasrdjalk");
        repositoryUser.save(us1);

        Employee emp1 = new Employee();
        emp1.setBorn(LocalDateTime.of(1990, 5, 10, 16, 10, 12));
        emp1.setName("Jens");
        emp1.setGender(Gender.male);
        emp1.setVegatrian(true);
        emp1.setUser(us1);
        employeeRepository.save(emp1);
    }
}
