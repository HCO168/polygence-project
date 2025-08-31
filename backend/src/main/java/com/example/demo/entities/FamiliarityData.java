package com.example.demo.entities;

import jakarta.persistence.*;

import java.time.Instant;

@Entity
@IdClass(FamiliarityKey.class)
@Table(name = "familiarity")
public class FamiliarityData {
    @Id
    public String username;
    @Id
    public String word;
    public int familiarity;
    @Column(name = "last_quizzed")
    public Instant last_quizzed;
    public String context;
}
