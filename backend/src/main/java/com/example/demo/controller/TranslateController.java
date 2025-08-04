package com.example.demo.controller;

import com.example.demo.dto.DictionaryResponse;
import com.example.demo.service.WordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/tl")
public class TranslateController {
    @Autowired
    private WordService wordService;
    @GetMapping("/def/{word}")
    public Mono<DictionaryResponse> getDefinition(@PathVariable String word){
        return wordService.getDefinitionFromInternet(word);
    }

}
