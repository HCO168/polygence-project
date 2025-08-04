package com.example.demo.dto;

import jakarta.persistence.*;

@Entity
@Table(name = "users")

public class User{
    public User(){

    }

    @Id
    private String username;
    @Column(name = "firstname")
    private String firstName;
    @Column(name = "lastname")
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
    //serialized output text SOT
    public String toString(){
        return  "User{username="+username+",firstName="+firstName+",lastname="+lastName+"}";
    }
}
