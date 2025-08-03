package com.example.demo.service;

import com.example.demo.dto.DictionaryResponse;
import com.example.demo.repository.TranslateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;


@Service
public class TranslateService {
    private TranslateRepository translateRepository;
    private final WebClient webClient = WebClient.create("https://api.dictionaryapi.dev/api/v2");

    public Mono<DictionaryResponse> getDefinition(String word) {
        return webClient.get()
                .uri("/entries/en/{word}", word)
                .retrieve()
                .bodyToMono(DictionaryResponse[].class)
                .map(arr -> arr[0]);  // 解析为数组
    }
}
