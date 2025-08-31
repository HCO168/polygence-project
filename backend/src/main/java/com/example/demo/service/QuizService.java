package com.example.demo.service;

import com.example.demo.dto.PersonalWord;
import com.example.demo.dto.ReadingWordCn;
import com.example.demo.entities.FamiliarityData;
import com.example.demo.repository.EcdictRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class QuizService {
    @Autowired
    private FamiliarityService familiarityService;
    @Autowired
    private EcdictRepository ecdictRepository;

    public QuizService() {
    }
    public QuizService(FamiliarityService familiarityService) {
        this.familiarityService = familiarityService;
    }
    @Transactional
    public List<PersonalWord> generateQuizWordList(String username, int amount){
        List<FamiliarityData> familiarityDataList=familiarityService.getBaseFormFamiliarityDataBy(username);
        List<FamiliarityData> resultFamiliarityDataList=familiarityDataList.subList(0,amount-1);
        List<PersonalWord> result=new ArrayList<>();
        for(FamiliarityData familiarityData:resultFamiliarityDataList){
            ReadingWordCn readingWordCn= ecdictRepository.findByWord(familiarityData.word).toReadingWordCn();
            result.add(new PersonalWord(readingWordCn,familiarityData));
        }
        return result;
    }
}
