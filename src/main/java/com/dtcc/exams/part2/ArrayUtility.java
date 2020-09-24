package com.dtcc.exams.part2;

import java.util.Arrays;

public class ArrayUtility {

    public Integer[] merge(Integer[] array1, Integer[] array2) {
        Integer[] temp = new Integer[(array1.length + array2.length)];
        System.arraycopy(array1, 0, temp, 0, array1.length);
        System.arraycopy(array2, 0, temp, array1.length, array2.length);
        return temp;
    }

    public Integer[] rotate(Integer[] array, Integer index) {
        int j;
        for(int i = 0; i < index; i++){
            int first_val;
            first_val = array[0];
            for(j = 0; j < array.length-1; j++){
                //Shift element of array by one
                array[j] = array[j+1];
            }
            //First element of array will be added to the end
            array[j] = first_val;
        }
        return array;
    }

    public Integer countOccurrence(Integer[] array1, Integer[] array2, Integer valueToEvaluate) {
        int occurances = 0;
        Integer[] temp = new Integer[(array1.length + array2.length)];

        System.arraycopy(array1, 0, temp,0,array1.length);
        System.arraycopy(array2,0,temp,array1.length, array2.length);

        //Cycle through entire array
        for(int i = 0; i < temp.length; i++) {
            if(valueToEvaluate == temp[i]){
                occurances+=1;
            }
        }
        return occurances;
    }

    public Integer mostCommon(Integer[] array) {
        Arrays.sort(array);
        int most = 1;
        //Most common value, start with array[0];
        int val = array[0];
        int current = 1;

        for (int i = 1; i < array.length; i++) {
            if (array[i] == array[i - 1]){
                current++;
            }else {
                if (current > most) {
                    most = current;
                    val = array[i - 1];
                }
                current = 1;
            }
        }
        // If last element is most frequent
        if (current > most) {
            most = current;
            val = array[array.length - 1];
        }
        return val;
    }

}
