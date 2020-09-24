package com.dtcc.exams.part1;

public class IntegerArrayUtilities {

    public Boolean hasEvenLength(Integer[] array) {
        boolean hasEvenLength = false;
        if(array.length % 2 == 0){
            hasEvenLength = true;
        }
        return hasEvenLength;
    }

    public Integer[] range(int start, int stop) {
        Integer[] range = new Integer[(stop - (start-1))];
        int j = 0;
        for(int i = start; i <= stop; i++){
            range[j] = i;
            j++;
        }
        return range;
    }

    public Integer getSumOfFirstTwo(Integer[] array) {
        Integer sum;
        sum = array[0] + array[1];
        return sum;
    }

    public Integer getProductOfFirstTwo(Integer[] array) {
        Integer product;

        product = array[array.length-2] * array[array.length-1];
        return product;
    }

}
