package com.example.demo.dto;

import com.example.demo.entities.FamiliarityData;

public class PersonalWord {
    private ReadingWordCn readingWord;
    private FamiliarityData familiarityData;

    public PersonalWord(ReadingWordCn readingWordC, FamiliarityData familiarityData) {
        this.readingWord = readingWordC;
        this.familiarityData = familiarityData;
    }


    public ReadingWordCn getReadingWord() {
        return readingWord;
    }

    public void setReadingWord(ReadingWordCn readingWord) {
        this.readingWord = readingWord;
    }

    public FamiliarityData getFamiliarityData() {
        return familiarityData;
    }

    public void setFamiliarityData(FamiliarityData familiarityData) {
        this.familiarityData = familiarityData;
    }
}
