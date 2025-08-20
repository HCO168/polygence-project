package com.example.demo.dto;

import java.util.List;

public class ReadingWordCn {
    private String word;
    private String phonetic;
    private String definition;
    private String translation;
    private String frq;
    private List<Exchange> exchanges;
    private char currentType;//is this word original or other

    public String getBaseForm(){
        for(Exchange exchange:this.exchanges){
            if(exchange.getType()=='0'){
                return exchange.getWord();
            }
        }
        return this.word;
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

    public char getCurrentType() {
        return currentType;
    }

    public void setCurrentType(char currentType) {
        this.currentType = currentType;
    }

    public List<Exchange> getExchanges() {
        return exchanges;
    }

    public void setExchanges(List<Exchange> exchange) {
        this.exchanges = exchange;
    }

    public String getFrq() {
        return frq;
    }

    public void setFrq(String frq) {
        this.frq = frq;
    }

    public String getTranslation() {
        return translation;
    }

    public void setTranslation(String translation) {
        this.translation = translation;
    }

    public String getDefinition() {
        return definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }

    public static class Exchange{
        //verb: p=past,d=past_particle,i=ing,3=does
        //adj: r=more,t=most
        //noun: s=plural,
        private char type;
        private String word;
        public Exchange(){

        }
        public Exchange(char type, String word){
            this.type = type;
            this.word = word;
        }

        public String getWord() {
            return word;
        }

        public void setWord(String word) {
            this.word = word;
        }

        public char getType() {
            return type;
        }

        public void setType(char type) {
            this.type = type;
        }

        @Override
        public String toString() {
            return "Exchange{" +
                    "type=" + type +
                    ", word='" + word + '\'' +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "ReadingWordCn{" +
                "word='" + word + '\'' +
                ", phonetic='" + phonetic + '\'' +
                ", definition='" + definition + '\'' +
                ", translation='" + translation + '\'' +
                ", frq='" + frq + '\'' +
                ", exchanges=" + exchanges +
                ", currentType=" + currentType +
                '}';
    }
}
