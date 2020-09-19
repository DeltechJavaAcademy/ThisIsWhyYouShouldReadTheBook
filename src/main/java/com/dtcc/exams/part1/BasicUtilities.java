package com.dtcc.exams.part1;

public class BasicUtilities {

    public Boolean isGreaterThan5(Integer value) {
        boolean temp_bool = false;
        if(value >= 5){
            temp_bool = true;
        }
        return temp_bool;
    }

    public Boolean isLessThan7(Integer value) {
        boolean temp_bool = false;
        if(value <= 7){
            temp_bool = true;
        }
        return temp_bool;
    }

    public Boolean isBetween5And7(Integer valueToEvaluate) {
        boolean temp_bool = false;
        if(valueToEvaluate >= 5 && valueToEvaluate <=7){
            temp_bool = true;
        }
        return temp_bool;
    }

    public Boolean startsWith(String string, Character character) {
        boolean temp_bool = false;

        if(string.toUpperCase().charAt(0) == character || string.toLowerCase().charAt(0) == character){
            temp_bool = true;
        }
        return temp_bool;
    }

}