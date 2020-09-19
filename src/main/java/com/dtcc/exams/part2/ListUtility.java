package com.dtcc.exams.part2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListUtility {

    private List<Integer> list=new ArrayList<Integer>();

    public Boolean add(int i) {
     /*   Integer num=i;

        if(num==null){
            return false;
        }
        else {
            this.list.add(i);
            if(list.contains(i)){
                return true;
            }
            return false;
        }*/
        return list.add(i);
    }

    public Integer size() {
        return list.size();
    }

    public List<Integer> getUnique() {
        List<Integer> newList=new ArrayList<Integer>();
        for(int i=0;i< list.size();i++){
            if(!newList.contains(list.get(i))){     //if newList does not contain the element then add.
                newList.add(list.get(i));
            }

        }
       return newList;
    }

    public String join() {
        String strJoin="";
        for(int i=0;i< list.size();i++){
            strJoin += list.get(i);
            if(i<=list.size()-2) {strJoin += ", "; }
        }
        System.out.println(strJoin);
        return strJoin;
    }

    public Integer mostCommon() {
        Collections.sort(this.list);
        for(Integer i:list) System.out.println(i);
        //to sort the list.
        int mostCommonNumber=list.get(0);
        int countOccurence=1;
        int maxCount=1;

        for(int i=1;i<list.size()-1;i++) {
            if(list.get(i).equals(list.get(i+1))) {
                countOccurence++;
                mostCommonNumber = list.get(i - 1);
            }
            else{
                    if(countOccurence>maxCount){
                        mostCommonNumber=list.get(i-1);
                        maxCount=countOccurence;
                        countOccurence=1;

                    }
                }
            }
            return mostCommonNumber;
    }

    public Boolean contains(Integer valueToAdd) {
       // if(valueToAdd==null){return false;}
       // else{
            if (this.list.contains(valueToAdd)) {
                return true;
            } else { return false; }
       // }
        }
}
