package com.company;

public class CodeWordChecker implements StringChecker {
    private String sym;
    private int min;
    private int max;
    private String word;
    public CodeWordChecker(String sym, int min, int max){
        this.sym=sym;
        this.min=min;
        this.max=max;
    }
    public CodeWordChecker(String word){
        this.word=word;
        this.min=6;
        this.max=20;
    }
    public boolean isValid(String str){
        if((min<=str.length())&&(str.length()<=max)&& str.indexOf(sym)<0){
            return true;
        }
        if((6<=str.length())&&(str.length()<=20)&&str.indexOf(word)<0){
            
        }
    }

}
