package com.dtcc.exams.part1;

public class BasicUtilities {

    public Boolean isGreaterThan5(Integer value) {
        if (value >= 5) {
            return true;
        } else
            return false;
    }


    public Boolean isLessThan7(Integer value) {
        if (value < 7) {
            return true;
        }
        return false;
    }

    public Boolean isBetween5And7(Integer valueToEvaluate) {
        if (valueToEvaluate >= 5 || valueToEvaluate <= 7) {
            return true;
        } else return false;
    }

    public Boolean startsWith(String string, Character character) {
        String firstChar= String.valueOf(string.charAt(0));
        if (character.toString().equalsIgnoreCase(firstChar)) {
            return true;
        } else
            return false;
    }
}