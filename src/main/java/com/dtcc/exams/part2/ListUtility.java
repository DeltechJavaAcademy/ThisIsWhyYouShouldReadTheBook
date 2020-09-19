package com.dtcc.exams.part2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListUtility {

    public ArrayList<Integer> list = new ArrayList<>();

    public Boolean add(int i) {
        //if (null==(Integer)i) { return false; }
        return list.add(i);
        //return null;
    }

    public Integer size() {
       return list.size();
    }

    public List<Integer> getUnique() {
        ArrayList<Integer> newlist = new ArrayList<>();
        for (Integer element : list) {
            if (!newlist.contains(element)) {
                newlist.add(element);
            }
        }
        return newlist;
    }

    public String join() {
        
        String result = String.join(", ", (CharSequence) list);
        return result;
    }

    public Integer mostCommon() {
        return null;
    }

    public Boolean contains(Integer valueToAdd) {

        if((Integer)valueToAdd != null) {
            if (list.contains(valueToAdd)) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

}

