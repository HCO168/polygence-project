package com.example.demo.entities;

import java.util.Objects;

public class WordKey {
    private String word;
    private String wordId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof WordKey)) return false;
        WordKey key = (WordKey) o;
        return Objects.equals(word, key.word) &&
                Objects.equals(wordId, key.wordId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(word, wordId);
    }
}
