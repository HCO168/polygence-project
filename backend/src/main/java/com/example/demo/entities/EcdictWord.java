package com.example.demo.entities;


import com.example.demo.dto.ReadingWordCn;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.ArrayList;
import java.util.List;

//https://github.com/skywind3000/ECDICT in chinese
@Entity
@Table(name = "ecdict")
public class EcdictWord {

    public ReadingWordCn toReadingWordCn(){
        ReadingWordCn readingWordCn = new ReadingWordCn();
        readingWordCn.setWord(word);
        readingWordCn.setDefinition(this.getDefinition());
        readingWordCn.setTranslation(this.getTranslation());
        readingWordCn.setFrq(this.getFrq());
        readingWordCn.setPhonetic(this.getPhonetic());
        String[] exchanges;
        if(this.getExchange() != null){
            exchanges=this.getExchange().split("/");
        }else{
            exchanges=new String[0];
        }
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
    }


    @Id
    private String word;
    private String phonetic;
    @Column(columnDefinition = "text")
    private String definition;
    private String translation;
    private String pos;
    private Integer collins;
    private Integer oxford;
    private String tag;
    private Integer bnc;
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

    public Integer getCollins() {
        return collins;
    }

    public void setCollins(Integer collins) {
        this.collins = collins;
    }

    public Integer getOxford() {
        return oxford;
    }

    public void setOxford(Integer oxford) {
        this.oxford = oxford;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public Integer getBnc() {
        return bnc;
    }

    public void setBnc(Integer bnc) {
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
