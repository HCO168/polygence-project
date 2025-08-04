package com.example.demo.dto;

public class ReadingWordCn {
    public String word;
    public String phonetic;
    public String definition;
    public String translation;
    public String frq;
    public Exchange exchange;
    public char currentType;
    public static class Exchange{
        //verb: p=past,d=past_particle,i=ing,3=does
        //adj: r=more,t=most
        //noun: s=plural,
        public char type;
        public String word;
    }
}
