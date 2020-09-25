package com.dtcc.exams.part2;

import java.util.Arrays;
import java.util.Collections;

public class ArrayUtility {

    public Integer[] merge(Integer[] array1, Integer[] array2) {
        Integer[] mergedArray = new Integer[array1.length+array2.length];
        System.arraycopy(array1,0,mergedArray,0, array1.length);
        System.arraycopy(array2,0,mergedArray,array1.length,array2.length);
        return mergedArray;
    }

    public Integer[] rotate(Integer[] array, Integer index) {
        Collections.rotate(Arrays.asList(array), -index);
        return array;
    }

    public Integer countOccurrence(Integer[] array1, Integer[] array2, Integer valueToEvaluate) {
       int count = 0;
        for (Integer integer : array1) {
            if (integer.equals(valueToEvaluate)) {
                count++;
            }
        }
        for (Integer integer : array2) {
            if (integer.equals(valueToEvaluate)) {
                count++;
            }
        }
        return count;
    }

    public Integer mostCommon(Integer[] array) {
        Arrays.sort(array);
        int maxCount = 1, tempCount;
        int most = array[0];
        int currentArray;

        for(int i = 0; i < array.length-1; i++) {
            currentArray = array[i];
            tempCount=0;
            for(int j = 1; j < array.length; j++){
                if(currentArray == array[j]){
                    tempCount++;
                    }
                    if(tempCount > maxCount) {
                        most = currentArray;
                        maxCount = tempCount;
                    }
                }
            }
        return most;
    }
}
