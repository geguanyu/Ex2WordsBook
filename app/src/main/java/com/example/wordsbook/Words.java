package com.example.wordsbook;

public class Words {
    private String word ;
    private String meanings ;
    private String exS ;



    public Words(String word,String meanings,String exS){
        this.word= word;
        this.meanings=meanings;
        this.exS=exS;
    }

    public String getExS() {
        return exS;
    }

    public String getMeanings() {
        return meanings;
    }

    public String getWord() {
        return word;
    }




}