package com.dtcc.exams.part2;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class ListUtility {

    private ArrayList<Integer> list = new ArrayList<>();

    public Boolean add(int i) {
        return list.add(i);
    }

    public Integer size() {
        return list.size();
    }

    public List<Integer> getUnique() {
        ArrayList<Integer> temp = new ArrayList<>();
        for(int i = 0; i < list.size(); i++){
            if(!temp.contains(list.get(i))){
                temp.add(list.get(i));
            }
        }
        return temp;
    }

    //I know this is lowkey cheating, but it works -\_(-_-)_/-
    public String join() {
        String temp_string = list.get(0).toString();
        if(list.size() > 1) {
            temp_string += ", ";
            for (int i = 1; i < list.size()-1; i++) {
                temp_string += list.get(i).toString() + ", ";
            }
            temp_string += list.get(list.size()-1).toString();
        }
        return temp_string;
    }

    public Integer mostCommon() {
        int most = 1;
        //Most common value, start with array[0];
        int val = list.get(0);
        int current = 1;

        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) == list.get(i-1)){
                current++;
            }else {
                if (current > most) {
                    most = current;
                    val = list.get(i-1);
                }
                current = 1;
            }
        }
        // If last element is most frequent
        if (current > most) {
            most = current;
            val = list.get(list.size()-1);
        }
        return val;
    }

    public Boolean contains(Integer valueToAdd) {
        return list.contains(valueToAdd);
    }

}
