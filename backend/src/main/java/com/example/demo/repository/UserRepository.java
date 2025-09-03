package com.example.demo.repository;

import com.example.demo.dto.User;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,String>{
    //find user by username
    User findByUsername(String username);
    //create user
    void deleteUserByUsername(String username);

}
