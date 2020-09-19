package com.dtcc.exams.part1;

public class IntegerArrayUtilities {

    public Boolean hasEvenLength(Integer[] array) {
        return (array.length % 2 == 0);
    }

    public Integer[] range(int start, int stop) {
       int range = Math.abs(stop - start);
        Integer[] temp = new Integer[range + 1];
        int temp_val = start;
        for(int i = 0; i < range + 1; i++){
            temp[i] = start++;
        }
        return temp;
    }

    public Integer getSumOfFirstTwo(Integer[] array) {
        return (array[0] + array[1]);
    }

    public Integer getProductOfFirstTwo(Integer[] array) {
        return (array[array.length-1] * array[array.length-2]);
    }

}
