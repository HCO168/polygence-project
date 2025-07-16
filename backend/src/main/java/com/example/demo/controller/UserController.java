package com.example.demo.controller;

import com.example.demo.dto.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController{
    @Autowired
    private UserService userService;
    @PostMapping
    public boolean addUser(@RequestBody User newUser){
        return userService.createUser(newUser);
    }
    @GetMapping
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }
    @GetMapping("/{username}")
    public User getUser(@PathVariable String username){
        return userService.getUser(username);
    }
    @DeleteMapping("/{username}")
    public void deleteUser(@PathVariable String username){
        userService.deleteUser(username);
    }
}
