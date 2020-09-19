package com.dtcc.exams.part1;

public class IntegerArrayUtilities {

    public Boolean hasEvenLength(Integer[] array) {
            if (array.length % 2 != 0) {
                return false;
        }return true;
    }
    public Integer[] range(int start, int stop) {

        return null;
    }

    public Integer getSumOfFirstTwo(Integer[] array) {
        int sum = array[0] + array[1];
        return sum;
    }

    public Integer getProductOfFirstTwo(Integer[] array) {
        int product = array.length * array.length-1;

        return product;
    }

}
