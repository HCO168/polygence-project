package com.example.demo.service;

import com.example.demo.dto.DictionaryResponse;
import com.example.demo.entities.WordData;
import com.example.demo.repository.DefinitionRepository;
import com.example.demo.repository.WordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.util.List;


@Service
public class WordService {
    private final WebClient webClient = WebClient.create("https://api.dictionaryapi.dev/api/v2");

    @Autowired
    private DefinitionRepository definitionRepository;
    @Autowired
    private WordRepository wordRepository;

    

    public Mono<DictionaryResponse> getDefinitionFromInternet(String word) {
        return webClient.get()
                .uri("/entries/en/{word}", word)
                .retrieve()
                .bodyToMono(DictionaryResponse[].class)
                .map(arr -> arr[0]);  // 解析为数组
    }
}
