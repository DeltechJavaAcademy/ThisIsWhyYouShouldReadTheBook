package com.dtcc.exams.part1;

public class BasicUtilities {

    public Boolean isGreaterThan5(Integer value) {
        if (value < 5) {
            return false;
        } else {
            return true;
        }
    }

    public Boolean isLessThan7(Integer value) {
        if (value <= 7) {
            return true;
        } else {
            return false;
        }
    }

    public Boolean isBetween5And7(Integer valueToEvaluate) {
        if (valueToEvaluate <= 7 && valueToEvaluate >= 5) {
            return true;
        } else {
            return false;
        }
    }

    public Boolean startsWith(String string, Character character) {

        return false;
    }
}

