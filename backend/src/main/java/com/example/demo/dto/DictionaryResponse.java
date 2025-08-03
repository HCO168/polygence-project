package com.example.demo.dto;

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
    }

    public static class Meaning {
        public String partOfSpeech;
        public List<Definition> definitions;
    }

    public static class Definition {
        public String definition;
        public String example;
        public List<String> synonyms;
        public List<String> antonyms;
        public String getDefinition() {
            return definition;
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
}
