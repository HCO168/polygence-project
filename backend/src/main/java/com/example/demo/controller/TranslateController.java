package com.example.demo.controller;

import com.example.demo.dto.DictionaryResponse;
import com.example.demo.dto.User;
import com.example.demo.service.TranslateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

import java.util.List;

@RestController
@RequestMapping("/tl")
public class TranslateController {
    @Autowired
    private TranslateService translateService;
    @GetMapping("/def/{word}")
    public Mono<DictionaryResponse> getDefinition(@PathVariable String word){
        return translateService.getDefinition(word);
    }

}
