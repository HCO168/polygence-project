package com.example.demo;

import com.example.demo.service.WordService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Test {
    public static void main(String[] args) {
        SpringApplication.run(Test.class, args);
        WordService translateService = new WordService();
        System.out.println(translateService.getReadingWordCnByWord("morning"));
        System.out.println(translateService.getDefinitionFromInternet("morning").block());
    }
}
