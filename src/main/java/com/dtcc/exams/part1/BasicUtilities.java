package com.dtcc.exams.part1;

public class BasicUtilities {

    public Boolean isGreaterThan5(Integer value) {
        if(value>=5){return true;}
        else {return false;}
    }

    public Boolean isLessThan7(Integer value) {
        if(value<=7){return true;}
        else {return false;}
    }

    public Boolean isBetween5And7(Integer valueToEvaluate) {
        if(valueToEvaluate<=7 && valueToEvaluate>=5){return true;}
        else {return false;}
    }

    //is this extra method?
    public Boolean startsWith(String string, Character character) {
        String strCheck=string.charAt(0)+"";
        String strChar=character+"";
        if(strCheck.equalsIgnoreCase(strChar)){return true;}
        else{return false;}
    }

}