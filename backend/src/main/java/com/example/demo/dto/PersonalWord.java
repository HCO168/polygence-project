package com.example.demo.dto;

import com.example.demo.entities.FamiliarityData;

public class PersonalWord {
    private ReadingWordCn readingWordC;
    private FamiliarityData familiarityData;

    public PersonalWord(ReadingWordCn readingWordC, FamiliarityData familiarityData) {
        this.readingWordC = readingWordC;
        this.familiarityData = familiarityData;
    }


    public ReadingWordCn getReadingWordC() {
        return readingWordC;
    }

    public void setReadingWordC(ReadingWordCn readingWordC) {
        this.readingWordC = readingWordC;
    }

    public FamiliarityData getFamiliarityData() {
        return familiarityData;
    }

    public void setFamiliarityData(FamiliarityData familiarityData) {
        this.familiarityData = familiarityData;
    }
}
