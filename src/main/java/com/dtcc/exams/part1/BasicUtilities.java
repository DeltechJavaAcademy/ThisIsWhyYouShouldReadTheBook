package com.dtcc.exams.part1;

public class BasicUtilities {

    public Boolean isGreaterThan5(Integer value) {
    	    if (value > 5) {
    	    	return true; }
    	    else return false ; 
    }

    public Boolean isLessThan7(Integer value) {
    		if (value < 7) {
    			return true; }
    		else return false ; 
 	    		}
    
   public Boolean isBetween5And7(Integer valueToEvaluate) {
    		if (valueToEvaluate > 5 && valueToEvaluate < 7){
    			return true;}
       		else return false;
    }

   // Not included in the Part 1 specifications
    public Boolean startsWith(String string, Character character) {
    	boolean startsWith = false;
    	String strCheck = string.charAt(0) + "";
		String strChar = character + "";
		if(strCheck.equalsIgnoreCase(strChar)){
			startsWith = true;}
		return startsWith;

		}

}