package com.dtcc.exams.part1;
import java.util.*;
public class IntegerArrayUtilities {

    public Boolean hasEvenLength(Integer[] array) {
    	if(array.length%2==0) {
    	return true; }
    	else return false;
    }

    public Integer[] range(int start, int stop) {
    	ArrayList<Integer> range = new ArrayList<>();
    	for (int i = start; i < stop; i++) {
            range.add(i);
        }
    	 Integer[] rangeArray=new Integer[range.size()];
         for(int i=0;i<rangeArray.length;i++){
             rangeArray[i]=(Integer)range.get(i);}
               return rangeArray;
    }

    // Not included in the Part 1 specifications
   public Integer getSumOfFirstTwo(Integer[] array) {
        Integer sum;
        sum = array[0] + array[1];

       return sum;
    }

    public Integer getProductOfFirstTwo(Integer[] array) {
        Integer product;
        product = array[array.lenght-2] * array[array.length-1];
            return product;
    }

}
