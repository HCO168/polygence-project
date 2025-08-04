package com.example.demo;

import com.example.demo.service.WordService;

public class Test {
    public static void main(String[] args) {
        WordService translateService = new WordService();
        System.out.println(translateService.getReadingWordCnByWord("morning"));
        System.out.println(translateService.getDefinitionFromInternet("morning").block());
    }
}
