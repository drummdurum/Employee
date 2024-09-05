package com.example.useremployee.model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
public class Employee {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private LocalDateTime born;
    private Gender gender;
    private boolean vegatrian;
    @OneToOne
    @JoinColumn(name = "useridfk", referencedColumnName = "userId", nullable = false)
    private User user;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getBorn() {
        return born;
    }

    public void setBorn(LocalDateTime born) {
        this.born = born;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public boolean isVegatrian() {
        return vegatrian;
    }

    public void setVegatrian(boolean vegatrian) {
        this.vegatrian = vegatrian;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
