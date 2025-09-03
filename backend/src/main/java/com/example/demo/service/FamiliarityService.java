package com.example.demo.service;

import com.example.demo.dto.User;
import com.example.demo.entities.FamiliarityData;
import com.example.demo.entities.FamiliarityKey;
import com.example.demo.repository.EcdictRepository;
import com.example.demo.repository.FamiliarityRepository;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.Instant;
import java.util.List;
@Service
public class FamiliarityService {

    @Autowired
    private FamiliarityRepository familiarityRepository;
    @Autowired
    private EcdictRepository ecdictRepository;
    public String getBaseForm(String word){
        return ecdictRepository.findByWord(word).toReadingWordCn().getBaseForm();
    }

    @Transactional
    public void updateFamiliarity(String username, String word, Integer familiarity,String context) {
        word=getBaseForm(word);
        if(familiarityRepository.existsById(new FamiliarityKey(username,word))){
            familiarityRepository.updateFamiliarityAndLast_quizzedByUsernameAndWord(username, word, familiarity, Instant.now());
        }else{
            familiarityRepository.save(new FamiliarityData(username,word,familiarity,Instant.now(),context));
        }
    }
    @Transactional
    public FamiliarityData getFamiliarityData(String username, String word) {
        word=getBaseForm(word);
        return familiarityRepository.getFamiliarityDataByUsernameAndWord(username, word);
    }
    @Transactional
    public Integer getFamiliarity(String username, String word) {
        word=getBaseForm(word);
        FamiliarityData familiarityData=getFamiliarityData(username,word);
        if(familiarityData==null){
            return -1;
        }else{
            return familiarityData.familiarity;
        }
    }
    @Transactional
    public List<FamiliarityData> getBaseFormFamiliarityDataBy(String username){
        List<FamiliarityData> list= familiarityRepository.getFamiliarityDataByUsername(username);
        list.stream().filter((familiarityData)->
            familiarityData.familiarity<500
        );
        return list;
    }
}