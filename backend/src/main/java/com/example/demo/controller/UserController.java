package com.example.demo.controller;

import com.example.demo.Logger;
import com.example.demo.dto.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.example.demo.Logger.log;

@RestController
@RequestMapping("/api/users")
public class UserController{
    private static final String PASSWORD="AdministratorPassword";
    @Autowired
    private UserService userService;
    @PostMapping
    public boolean addUser(@RequestBody User newUser){
        boolean result= userService.createUser(newUser);
        log("add user:"+newUser.toString()+(result?"success":"fail"));
        return result;
    }
    @GetMapping
    public List<User> getAllUsers(){
        List<User> result= userService.getAllUsers();
        log("getAllUsers result:{");
        result.forEach((user)->{log(user.toString());});
        log("}");
        return result;
    }
    @GetMapping("/{username}")
    public User getUser(@PathVariable String username){
        log("Try get user by username:"+username);
        User result= userService.getUser(username);
        log("Result:" + username+(result==null?"{no such user}":result.toString()));
        return result;
    }
    @DeleteMapping("/{username}")
    public void deleteUser(@PathVariable String username,@RequestParam String password){
        if(password.equals(PASSWORD)){
            log("Try delete by username: " + username);
            userService.deleteUser(username);
        }else{

        }
    }
}
