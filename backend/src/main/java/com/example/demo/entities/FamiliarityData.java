package com.example.demo.entities;

import jakarta.persistence.*;

@Entity
@IdClass(FamiliarityKey.class)
@Table(name = "familiarity")
public class FamiliarityData {
    @Id
    public String username;
    @Id
    public String word;
    @Id
    public int definition_id;
    public int familiarity;
    @Column(name = "last_quizzed")
    public long last_quizzed;
    public String context;
}
