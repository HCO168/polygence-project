package com.example.demo.service;

import com.example.demo.dto.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static com.example.demo.Logger.log;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Transactional
    public boolean createUser(User user) {
        if(userRepository.existsById(user.getUsername())){
            return false;
        }else{
            userRepository.save(user);
            return true;
        }
    }
    @Transactional
    public User getUser(String username) {
        log("trying to get user by username: " + username);
        return userRepository.findByUsername(username);
    }
    @Transactional
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
    @Transactional
    public void deleteUser(String username) {
        // Business logic to delete a user
        userRepository.deleteUserByUsername(username);
    }
}