package com.example.demo.entities;

import jakarta.persistence.*;

import java.time.Instant;

@Entity
@IdClass(FamiliarityKey.class)
@Table(name = "familiarity")
public class FamiliarityData {
    public FamiliarityData(){

    }
    public FamiliarityData(String username, String word, int familiarity,Instant last_quizzed,String context) {
        this.username = username;
        this.word = word;
        this.familiarity=familiarity;
        this.last_quizzed = last_quizzed;
        this.context = context;
    }
    @Id
    public String username;
    @Id
    public String word;
    public int familiarity;
    @Column(name = "last_quizzed")
    public Instant last_quizzed;
    public String context;
}
