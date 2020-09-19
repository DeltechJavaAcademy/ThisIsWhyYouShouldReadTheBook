package com.dtcc.exams.part2;

import java.util.ArrayList;
import java.lang.Integer;
import java.util.Arrays;
import java.util.List;

public class ArrayUtility {

    public Integer[] merge(Integer[] array1, Integer[] array2) {
        ArrayList<Integer> mergeList = new ArrayList<>();
        mergeList.addAll(Arrays.asList(array1));
        mergeList.addAll(Arrays.asList(array2));
        Integer[] item = mergeList.toArray(new Integer[mergeList.size()]);
        return item;
    }    

    public Integer[] rotate(Integer[] array, int index) {
//        for(int i = 0; i< index; i++){
//
//        }
    Integer[] returnArr = new Integer[0];
    return returnArr;

    }

    public Integer countOccurrence(Integer[] array1, Integer[] array2, Integer valueToEvaluate) {
        int count1 = 0;
        int count2 = 0;
        for(int i = 0; i < array1.length; i++ ){
            if(array1[i] == valueToEvaluate){
                count1++;
            }}
            for(int j = 0; j < array2.length; j++){
                if(array2[j] == valueToEvaluate){
                    count2++;
                }  }
            return count1 + count2;
        }




    public Integer mostCommon(Integer[] array) {
        Arrays.sort(array);
        int curr_count =0;
        int max_count = 1;
        Integer res = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] == array[i - 1])
                curr_count++;
            else {
                if (curr_count > max_count) {
                    max_count = curr_count;
                    res = array[i - 1];
                }
                curr_count = 1;
            }
        }

        // If last element is most frequent
        if (curr_count > max_count)
        {
            max_count = curr_count;
            res = array[array.length - 1];
        }

        return res;


    }}
