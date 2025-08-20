package com.example.demo.controller;

import com.example.demo.dto.ReadingWordCn;
import com.example.demo.entities.EcdictWord;
import rubish.DictionaryResponse;
import com.example.demo.service.WordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/tl")
public class TranslateController {
    @Autowired
    private WordService wordService;
    @GetMapping("/v0/def/{word}")
    public Mono<DictionaryResponse> getInternetDefinition(@PathVariable String word){
        return wordService.getDefinitionFromInternet(word);
    }
    @GetMapping("/v1/def/{word}")
    public ReadingWordCn getDefinition(@PathVariable String word){
        return wordService.getReadingWordCnByWord(word);
    }

}
