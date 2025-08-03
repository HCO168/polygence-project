package com.example.demo.repository;

import com.example.demo.dto.User;
import com.example.demo.dto.Word;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TranslateRepository extends JpaRepository<Word,String> {
}
