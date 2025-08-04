package com.example.demo.dto;

import com.example.demo.entities.WordData;

import java.util.List;

public class DictionaryResponse {
    public String word;
    public String phonetic;
    public List<Phonetic> phonetics;
    public String origin;
    public List<Meaning> meanings;

    public static class Phonetic {
        public String text;
        public String audio;



        public String getText() {
            return text;
        }
        public void setText(String text) {
            this.text = text;
        }

        public String getAudio() {
            return audio;
        }
        public void setAudio(String audio) {
            this.audio = audio;
        }
    }

    public static class Meaning {
        public String partOfSpeech;
        public List<Definition> definitions;

        public String getPartOfSpeech() {
            return partOfSpeech;
        }
        public void setPartOfSpeech(String partOfSpeech) {
            this.partOfSpeech = partOfSpeech;
        }

        public List<Definition> getDefinitions() {
            return definitions;
        }
        public void setDefinitions(List<Definition> definitions) {
            this.definitions = definitions;
        }
    }

    public static class Definition {
        public String definition;
        public String example;
        private List<String> synonyms;
        private List<String> antonyms;


        public String getDefinition() {
            return definition;
        }
        public void setDefinition(String definition) {
            this.definition = definition;
        }

        public String getExample() {
            return example;
        }
        public void setExample(String example) {
            this.example = example;
        }

        public List<String> getSynonyms() {
            return synonyms;
        }
        public void setSynonyms(List<String> synonyms) {
            this.synonyms = synonyms;
        }

        public List<String> getAntonyms() {
            return antonyms;
        }
        public void setAntonyms(List<String> antonyms) {
            this.antonyms = antonyms;
        }
    }
    //ask chatGpt about it



    public String toString(){
        return getDefinitionsStrings();
    }
    public String getDefinitionsStrings(){
        StringBuilder sb = new StringBuilder();
        for(Meaning meaning:meanings){
            for(Definition definition:meaning.definitions){
                sb
                        .append(meaning.partOfSpeech)
                        .append(": ")
                        .append(definition.getDefinition())
                        .append("\n");
            }
        }
        return sb.toString();
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

    public List<Phonetic> getPhonetics() {
        return phonetics;
    }
    public void setPhonetics(List<Phonetic> phonetics) {
        this.phonetics = phonetics;
    }

    public String getOrigin() {
        return origin;
    }
    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public List<Meaning> getMeanings() {
        return meanings;
    }
    public void setMeanings(List<Meaning> meanings) {
        this.meanings = meanings;
    }

}
