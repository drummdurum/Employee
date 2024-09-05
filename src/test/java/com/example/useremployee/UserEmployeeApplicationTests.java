package com.example.useremployee;

import com.example.useremployee.model.Employee;
import com.example.useremployee.model.User;
import com.example.useremployee.repositoryUser.EmployeeRepository;
import com.example.useremployee.repositoryUser.RepositoryUser;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.dao.DataIntegrityViolationException;

import static org.junit.jupiter.api.Assertions.assertThrows;

@SpringBootTest
class UserEmployeeApplicationTests {
    @Autowired
    RepositoryUser repositoryUser;

    @Autowired
    EmployeeRepository employeeRepository;

    @Test
    void contextLoads() {
    }


    @Test
    public void testDeleteEmployee() {
        // Opret en ny User
        User user = new User();
        user.setEmail("test@example.com");
        user.setPassword("password123");
        repositoryUser.save(user);

        // Opret en ny Employee
        Employee employee = new Employee();
        employee.setName("Test Employee");
        employee.setUser(user);
        employeeRepository.save(employee);

        // Forsøg at slette User - skal kaste en exception fordi Employee stadig refererer til den
        assertThrows(DataIntegrityViolationException.class, () -> {
            repositoryUser.delete(user);
        });

        // Slet Employee og derefter User
        employeeRepository.delete(employee);
        repositoryUser.delete(user);
    }
}
