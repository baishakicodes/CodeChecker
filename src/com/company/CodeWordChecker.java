package com.company;

public class CodeWordChecker implements StringChecker {
    private String sym;
    private int min;
    private int max;
    public CodeWordChecker(String sym, int min, int max){
        this.sym=sym;
        this.min=min;
        this.max=max;
    }
    public CodeWordChecker(String sym){
        this.sym=sym;
        this.min=6;
        this.max=20;
    }
    public boolean isValid(String str){
        int length = str.length();
        if((min<=length)&& (length<=max)&& (str.indexOf(sym)<0)){
            return true;
        }
        return false;
    }
}
