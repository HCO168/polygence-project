package com.example.demo.dto;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class User{
    @Id
    private String username;
    @Column(name = "firstname", nullable = true)
    private String firstName;
    @Column(name = "lastname", nullable = true)
    private String lastName;

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public String getUsername(){
        return username;
    }

    public void setFirstName(String firstName){
        this.firstName=firstName;
    }

    public void setLastName(String lastName){
        this.lastName=lastName;
    }

    public void setUsername(String username){
        this.username=username;
    }
}
