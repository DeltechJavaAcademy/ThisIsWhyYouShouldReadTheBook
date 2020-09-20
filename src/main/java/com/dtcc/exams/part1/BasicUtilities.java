package com.dtcc.exams.part1;

public class BasicUtilities {
    private int input;

    public Boolean isGreaterThan5(Integer value) {
        if(value >= 5){
            return true;
        }else
            return false;
    }

    public Boolean isLessThan7(Integer value) {
        if(value <= 7){
            return true;
        }else
            return false;
    }

    public Boolean isBetween5And7(Integer valueToEvaluate) {
        if(valueToEvaluate >= 5 && valueToEvaluate <=7){
            return true;
        }else
            return false;
    }

    public Boolean startsWith(String string, Character character) {
       char c = string.toLowerCase().charAt(0);
       char lchar = Character.toLowerCase(character);
        if(lchar==c){
            return true;
        }else
            return false;
    }

}