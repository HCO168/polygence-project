package com.example.demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;

import java.sql.Timestamp;

@Entity
@IdClass(WordKey.class)
@Table(name = "words")
public class WordData {
    @Id
    private String word;
    @Id
    private int wordId;
    private String phonetic_0;
    private String phonetic_1;
    private Timestamp last_visit;
    public String getWord() {
        return word;
    }

    public String getPhonetic_0() {
        return phonetic_0;
    }

    public String getPhonetic_1() {
        return phonetic_0;
    }

    public int getWordId() {
        return wordId;
    }

    public Timestamp getLast_visit() {
        return last_visit;
    }

    public void setLast_visit(Timestamp last_visit) {
        this.last_visit = last_visit;
    }

    public void setPhonetic_0(String phonetic) {
        this.phonetic_0 = phonetic;
    }

    public void setPhonetic_1(String phonetic) {
        this.phonetic_1 = phonetic;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public void setWordId(int wordId) {
        this.wordId = wordId;
    }
}
