package com.dtcc.exams.part2;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayUtility {

    public Integer[] merge(Integer[] array1, Integer[] array2) {
        int totalArrayLength = array1.length + array2.length;
        Integer totalArray[]=new Integer[totalArrayLength];
        //copy array1 to totalArray
        System.arraycopy(array1,0,totalArray,0,array1.length);
        //copy array2 to totalArray from length (array1.length)
        System.arraycopy(array2,0,totalArray,array1.length,array2.length);

        System.out.printf("Array: "+totalArray.toString());
        return totalArray;
    }

    public Integer[] rotate(Integer[] array, Integer index) {
        Integer[] rotatedArray=new Integer[array.length];
        Integer[] numArrayRemove=new Integer[index];
        Integer[] numArryAdd=new Integer[array.length-index];

        for(int i=0;i<index;i++){   //first index-number elements.
            numArrayRemove[i]=array[i];
        }

        for(int i=index,j=0;i<array.length;i++,j++){    //remaining elements after index number elements.
            numArryAdd[j]=array[i];
        }
        System.arraycopy(numArryAdd,0,rotatedArray,0,numArryAdd.length);
        System.arraycopy(numArrayRemove,0,rotatedArray,numArryAdd.length,numArrayRemove.length);
        return rotatedArray;
    }

    public Integer countOccurrence(Integer[] array1, Integer[] array2, Integer valueToEvaluate) {
        Integer count=0;
        for(int i=0;i<array1.length;i++){
            if(array1[i]==valueToEvaluate){count++;}
        }
        for(int i=0;i<array2.length;i++){
            if(array2[i]==valueToEvaluate){count++;}
        }
        return count;
    }

    public Integer mostCommon(Integer[] array) {
        Arrays.sort(array);
        int mostCommonNumber=array[0];
        int countOccurence=1;
        int maxCount=1;

        for(int i=1;i<array.length-1;i++){
            if(array[i]==array[i+1]){
                countOccurence++;
                mostCommonNumber=array[i-1];
            }
            else{
                if(countOccurence>maxCount){
                    mostCommonNumber=array[i-1];
                    maxCount=countOccurence;
                    countOccurence=1;

                }
            }
        }
        return mostCommonNumber;
    }
}
