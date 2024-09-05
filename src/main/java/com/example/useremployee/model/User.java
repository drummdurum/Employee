package com.example.useremployee.model;

import jakarta.persistence.*;

@Entity
public class User {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private long userId;
    @Column(unique = true)
    private String email;
    private String password;
    @OneToOne(mappedBy = "user")
    private Employee employee;


    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
