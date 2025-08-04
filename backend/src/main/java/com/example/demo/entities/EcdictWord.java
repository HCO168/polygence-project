package com.example.demo.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

//https://github.com/skywind3000/ECDICT in chinese
@Entity
@Table(name = "ecdict")
public class EcdictWord {
    @Id
    private String word;
    private String phonetic;
    private String definition;
    private String translation;
    private String pos;
    private int collins;
    private int oxford;
    private String tag;
    private int bnc;
    private String frq;
    private String exchange;
    private String detail;
    private String audio;

    public EcdictWord() {

    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getPhonetic() {
        return phonetic;
    }

    public void setPhonetic(String phonetic) {
        this.phonetic = phonetic;
    }

    public String getTranslation() {
        return translation;
    }

    public String getPos() {
        return pos;
    }

    public void setPos(String pos) {
        this.pos = pos;
    }

    public String getDefinition() {
        return definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }

    public void setTranslation(String translation) {
        this.translation = translation;
    }

    public int getCollins() {
        return collins;
    }

    public void setCollins(int collins) {
        this.collins = collins;
    }

    public int getOxford() {
        return oxford;
    }

    public void setOxford(int oxford) {
        this.oxford = oxford;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public int getBnc() {
        return bnc;
    }

    public void setBnc(int bnc) {
        this.bnc = bnc;
    }

    public String getFrq() {
        return frq;
    }

    public void setFrq(String frq) {
        this.frq = frq;
    }

    public String getExchange() {
        return exchange;
    }

    public void setExchange(String exchange) {
        this.exchange = exchange;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getAudio() {
        return audio;
    }

    public void setAudio(String audio) {
        this.audio = audio;
    }
}
