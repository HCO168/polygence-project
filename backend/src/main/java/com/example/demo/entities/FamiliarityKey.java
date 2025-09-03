package com.example.demo.entities;

import java.util.Objects;

public class FamiliarityKey {
    private String username;
    private String word;

    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public FamiliarityKey(String username, String word) {
        this.username = username;
        this.word = word;
    }
    public FamiliarityKey() {
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        FamiliarityKey that = (FamiliarityKey) o;
        return Objects.equals(username, that.username) && Objects.equals(word, that.word);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, word);
    }
}
