package com.example.demo.entities;


import jakarta.persistence.*;

@Entity
@IdClass(WordDefKey.class)
@Table(name = "definition")
public class DefinitionData {
    @Id
    @Column(name = "word")
    public String word;
    @Id
    @Column(name = "word_id")
    public int word_id;
    @Id
    @Column(name = "definition_id")
    public int definition_id;
    @Column(name = "definition")
    public String definition;
    @Column(name = "example")
    public String example;
    @Column(name = "pos")
    public String pos;
}
