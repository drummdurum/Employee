package com.example.useremployee.repositoryUser;

import com.example.useremployee.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RepositoryUser extends JpaRepository<User,Integer> {

}
