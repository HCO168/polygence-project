package com.example.demo.service;

import rubish.DictionaryResponse;
import com.example.demo.dto.ReadingWordCn;
import com.example.demo.entities.EcdictWord;
import com.example.demo.repository.EcdictRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;


@Service
public class WordService {
    private final WebClient webClient = WebClient.create("https://api.dictionaryapi.dev/api/v2");

    @Autowired
    private EcdictRepository ecdictRepository;
    public WordService(){

    }
    @Transactional(readOnly = true)
    public ReadingWordCn getReadingWordCnByWord(String word) {
        EcdictWord ecdictWord=ecdictRepository.findByWordIgnoreCase(word);
        if(ecdictWord==null){
            return null;
        }
        return ecdictWord.toReadingWordCn();
    }

    @Transactional
    public Mono<DictionaryResponse> getDefinitionFromInternet(String word) {
        return webClient.get()
                .uri("/entries/en/{word}", word)
                .retrieve()
                .bodyToMono(DictionaryResponse[].class)
                .map(arr -> arr[0]);  // 解析为数组
    }
}
