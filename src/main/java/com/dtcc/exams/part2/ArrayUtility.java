package com.dtcc.exams.part2;

import java.util.Arrays;

public class ArrayUtility {

    public Integer[] merge(Integer[] array1, Integer[] array2) {
        Integer[] mergedArray = new Integer[array1.length + array2.length];
        int c = 0;
        for(int i = 0; i < array1.length; i++){
            mergedArray[i] = array1[i];
        }
        for(int j = array1.length; j < mergedArray.length; j++){
            mergedArray[j] = array2[c];
            c++;
        }
        return mergedArray;
    }

    public Integer[] rotate(Integer[] array, Integer index) {
        Integer[] rotatedArray = new Integer[array.length];
        int e = 0;
        for(int i = 0; i < array.length - index; i++){
            rotatedArray[i] = array[i+index];
        }
        for(int j = array.length-(index); j < rotatedArray.length; j++){
            rotatedArray[j] = array[e];
            e++;
        }
        return rotatedArray;
    }

    public Integer countOccurrence(Integer[] array1, Integer[] array2, Integer valueToEvaluate) {
        Integer counter = 0;
        for(int i = 0; i < array1.length; i++) {
            if (array1[i] == valueToEvaluate) {
                counter++;
            }
        }
        for(int i = 0; i < array2.length; i++) {
            if(array2[i] == valueToEvaluate){
                counter++;
            }
        }
        return counter;
    }

    public Integer mostCommon(Integer[] array) {
        Arrays.sort(array);
        System.out.println();
        int currentCount=0;
        int maxCount = 0;
        int indexOfMostCommon = 0;
        int mostCommon;
        for( int i = 1; i < array.length; i++){
            if (array[i] == array[i-1]){
                currentCount ++;
            }
            if (currentCount > maxCount) {
                maxCount = currentCount;
                currentCount = 0;
                indexOfMostCommon = i-1;
            }
        }
        mostCommon = array[indexOfMostCommon];
        return mostCommon;
    }

}
