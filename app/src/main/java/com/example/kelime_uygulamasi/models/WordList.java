package com.example.kelime_uygulamasi.models;

import java.util.ArrayList;
import java.util.List;

public class WordList {
    private ArrayList<Deneme> wordList = new ArrayList<>();

    public WordList(ArrayList<Deneme> wordList) {
        this.wordList = wordList;
    }

    public WordList() {
    }

    public ArrayList<Deneme> getWordList() {
        return wordList;
    }

    public void setWordList(ArrayList<Deneme> denemeArrayList) {
        this.wordList = denemeArrayList;
    }
}

