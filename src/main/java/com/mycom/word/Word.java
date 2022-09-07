package com.mycom.word;

/*
* This is the data class
* class made for the purpose of handling data
* 단어를 다루기 위해 필요한 멤버 변수를 구성해야할 것.
*
* */

public class Word {
    private int id;
    private int level;
    private String word;
    private String meaning;

    //Constructor
    Word(){}

    public Word(int id, int level, String word, String meaning) {
        this.id = id;
        this.level = level;
        this.word = word;
        this.meaning = meaning;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getMeaning() {
        return meaning;
    }

    public void setMeaning(String meaning) {
        this.meaning = meaning;
    }

    //To Display Meaningful info about each Word Object
    @Override
    public String toString() {

        String slevel = "";
        for(int i = 0; i < level; i++) slevel += "*";

        // Formatting String output
        String str = String.format("%-3s", slevel)
                + String.format("%15s", word) + " " + meaning;

        return str;
    }
}
