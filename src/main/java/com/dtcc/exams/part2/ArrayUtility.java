package com.dtcc.exams.part2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayUtility {

    public Integer[] merge(Integer[] array1, Integer[] array2) {
    List list = new ArrayList(Arrays.asList(array1));
    list.addAll(Arrays.asList(array2));
    Integer [] array3 = list.toArray();
        return array3;
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
