package com.example.demo.controller;

import com.example.demo.dto.PersonalWord;
import com.example.demo.dto.ReadingWordCn;
import com.example.demo.entities.EcdictWord;
import com.example.demo.service.FamiliarityService;
import rubish.DictionaryResponse;
import com.example.demo.service.WordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/tl")
public class TranslateController {
    @Autowired
    private WordService wordService;
    @Autowired
    private FamiliarityService familiarityService;
    @GetMapping("/v0/def/{word}")
    public Mono<DictionaryResponse> getInternetDefinition(@PathVariable String word){
        return wordService.getDefinitionFromInternet(word);
    }
    @GetMapping("/v1/def/{word}")
    public ReadingWordCn getDefinition(@PathVariable String word){
        return wordService.getReadingWordCnByWord(word);
    }
    @PostMapping("/read/")
    public List<PersonalWord> preload(@RequestBody String text,@RequestBody String username){
        String[] textWords=text.split(" ");
        List<PersonalWord> readingWordCnList=new ArrayList<>();
        for(String word:textWords){
            readingWordCnList.add(new PersonalWord(wordService.getReadingWordCnByWord(word),familiarityService.getFamiliarityData(username,word)));
        }
        return readingWordCnList;
    }

}
