package com.dtcc.exams.part2;

import java.util.Arrays;

public class ArrayUtility {

    public Integer[] merge(Integer[] array1, Integer[] array2) {
        int firstArray = array1.length;
        int secondArray = array2.length;
        int count = 0;
        int[] result = new int [firstArray + secondArray];
        for(int i = 0; i < array1.length; i++) {
            result[i] = array1[i];
            count++;
        }
            for(int j = 0; j < array2.length; j++){
              result[count++] = array2[j];
            }
        return null;
    }

    public Integer[] rotate(Integer[] array, Integer index) {

        return null;
    }

    public Integer countOccurrence(Integer[] array1, Integer[] array2, Integer valueToEvaluate) {
        return null;
    }

    public Integer mostCommon(Integer[] array) {
        return null;
    }

}
