package com.dtcc.exams.part1;

import java.util.ArrayList;

public class IntegerArrayUtilities {

    public Boolean hasEvenLength(Integer[] array) {
        int arrayLength = array.length;
        if(arrayLength % 2 == 0){
            return true;
        }
        else return false;
    }

    public Integer[] range(int start, int stop) {
       ArrayList<Integer> arr = new ArrayList<Integer>();
         for(int i = start; i < stop + 1; i++){
           arr.add(i);
        }
         return arr.toArray(new Integer[0]);
    }

    public Integer getSumOfFirstTwo(Integer[] array) {
        int sum = 0;
            sum = array[0] + array[1];
        return sum;
    }

    public Integer getProductOfFirstTwo(Integer[] array) {

           return array[array.length-1] * array[array.length-2];

    }

}
