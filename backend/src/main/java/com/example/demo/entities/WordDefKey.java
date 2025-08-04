package com.example.demo.entities;

import java.util.Objects;

public class WordDefKey {
    public String word;
    public int word_id;
    public int definition_id;

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        WordDefKey that = (WordDefKey) o;
        return word_id == that.word_id && definition_id == that.definition_id && Objects.equals(word, that.word);
    }

    @Override
    public int hashCode() {
        return Objects.hash(word, word_id, definition_id);
    }
}
