package com.example.demo.entities;

import com.example.demo.dto.PersonalWord;
import com.example.demo.service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/quiz")
public class QuizController {
    @Autowired
    QuizService quizService;
    @PostMapping("/make")
    public List<PersonalWord> generateQuiz(@RequestBody String username, @RequestBody int amount){
        return quizService.generateQuizWordList(username,amount);
    }

}
