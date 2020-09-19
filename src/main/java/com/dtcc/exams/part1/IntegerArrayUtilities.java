package com.dtcc.exams.part1;

import java.util.ArrayList;

public class IntegerArrayUtilities {

    public Boolean hasEvenLength(Integer[] array) {
        if(array.length%2==0){return true;}
        else {return false;}
    }

    public Integer[] range(int start, int stop) {
       ArrayList<Integer> numArrayList=new ArrayList<>();
        for(int i=start;i<=stop;i++){
            numArrayList.add(i);
        }
        Integer[] numArray=new Integer[numArrayList.size()];
        for(int i=0;i<numArray.length;i++){
            numArray[i]=(Integer)numArrayList.get(i);
        }
        return numArray;
    }

    public Integer getSumOfFirstTwo(Integer[] array) {
        Integer sum=array[0]+array[1];
        return sum;
    }

    public Integer getProductOfFirstTwo(Integer[] array) {
        return array[array.length-2]*array[array.length-1];
        //return array[0]*array[1];
    }

}
