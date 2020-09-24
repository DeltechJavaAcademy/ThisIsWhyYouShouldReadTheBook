package com.dtcc.exams.part2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListUtility {
    ArrayList<Integer> myList = new ArrayList<>();


    public Boolean add(Integer i) {

        boolean wasAdded = false;
        myList.add(i);
        if(contains(i)){
            wasAdded = true;
        }
        if( i == null ){
            wasAdded = false;
        }
        return wasAdded;
    }

    public Integer size() {
        int size = myList.size();
        return size;
    }

    public List<Integer> getUnique() {
        Collections.sort(myList);
        ArrayList<Integer> uniqueList = new ArrayList<>();
        uniqueList.add(myList.get(0));
        for(int i = 1; i < myList.size(); i++){
            if (myList.get(i) == myList.get(i-1)){

            }
            else{
                uniqueList.add(myList.get(i));
            }

        }
        return uniqueList;
    }

    public String join() {
        String strMyList = myList.get(0) + "";
        for(int i = 1; i < myList.size(); i++){
            strMyList += ", " + myList.get(i);
        }
        return strMyList;
    }

    public Integer mostCommon() {
        for (int i = 0; i< myList.size(); i++){
            System.out.print(myList.get(i) + " ");
        }
        System.out.println();
        Collections.sort(myList);
        for (int i = 0; i< myList.size(); i++){
            System.out.print(myList.get(i) + " ");
        }
        System.out.println();
        int currentCount = 1;
        int maxCount = 0;
        int indexOfMostCommon = 0;
        Integer mostCommon;
        for( int i = 1; i < myList.size(); i++){
            if (myList.get(i) == myList.get(i-1)){
                currentCount ++;
            }
            if (currentCount > maxCount) {
                maxCount = currentCount;
                currentCount = 1;
                indexOfMostCommon = i-1;
            }
        }

        mostCommon = myList.get(indexOfMostCommon);
        return mostCommon;
    }

    public Boolean contains(Integer valueToAdd) {
        boolean contains = false;
        if (myList.contains(valueToAdd)){
            contains = true;
        }
        return contains;
    }

}
