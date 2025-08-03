package com.example.demo;

import com.example.demo.service.TranslateService;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        TranslateService translateService = new TranslateService();
        System.out.println(translateService.getDefinition("morning").block());
    }
}
