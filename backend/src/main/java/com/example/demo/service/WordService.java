package com.example.demo.service;

import com.example.demo.dto.DictionaryResponse;
import com.example.demo.dto.ReadingWordCn;
import com.example.demo.entities.EcdictWord;
import com.example.demo.entities.WordData;
import com.example.demo.repository.DefinitionRepository;
import com.example.demo.repository.EcdictRepository;
import com.example.demo.repository.WordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Service
public class WordService {
    private final WebClient webClient = WebClient.create("https://api.dictionaryapi.dev/api/v2");

    @Autowired
    private DefinitionRepository definitionRepository;
    @Autowired
    private WordRepository wordRepository;
    @Autowired
    private EcdictRepository ecdictRepository;
    public WordService(){

    }
    @Transactional(readOnly = true)
    public ReadingWordCn getReadingWordCnByWord(String word) {
        if(ecdictRepository.existsById(word)){
            EcdictWord ecdictWord=ecdictRepository.getEcdictWordByWord(word);
            ReadingWordCn readingWordCn = new ReadingWordCn();
            readingWordCn.setWord(word);
            readingWordCn.setDefinition(ecdictWord.getDefinition());
            readingWordCn.setTranslation(ecdictWord.getTranslation());
            readingWordCn.setFrq(ecdictWord.getFrq());
            readingWordCn.setPhonetic(ecdictWord.getPhonetic());
            String[] exchanges=ecdictWord.getExchange().split("/");
            List<ReadingWordCn.Exchange> exchangesList = new ArrayList<>();
            readingWordCn.setCurrentType('0');
            for(String exchange:exchanges){
                String[] parts=exchange.split(":");
                if(parts.length==2){
                    if(parts[0].equals("1")){
                        readingWordCn.setCurrentType(parts[1].charAt(0));
                    }else{
                        exchangesList.add(new ReadingWordCn.Exchange(parts[0].charAt(0),parts[1]));
                    }
                }
            }
            readingWordCn.setExchanges(exchangesList);
            return readingWordCn;
        }else{
            return null;
        }

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
