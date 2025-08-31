package com.example.demo.entities;

import java.util.Objects;

public class FamiliarityKey {
    private String username;
    private String word;

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
