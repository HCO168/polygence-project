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
    private String exchange;
    private String detail;
    private String audio;

}
