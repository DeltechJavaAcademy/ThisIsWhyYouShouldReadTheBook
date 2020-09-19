package com.dtcc.exams.part1;


import java.util.ArrayList;

public class IntegerArrayUtilities {

    public Boolean hasEvenLength(Integer[] array) {
        if(array.length %2 == 0){
            return true;
        }
        return false;
    }

    public Integer[] range(int start, int stop) {

        int arr = (start-stop);
        Integer[] range = new Integer[Math.abs(arr)+1];
        for(int i = start; i <= stop; i++){
            range[i]= i;
        }
        return range;
    }

    public Integer getSumOfFirstTwo(Integer[] array) {

        return (array[0] + array[1]);
    }

    public Integer getProductOfFirstTwo(Integer[] array) {
        return (array[0] * array[1]);
    }

}
