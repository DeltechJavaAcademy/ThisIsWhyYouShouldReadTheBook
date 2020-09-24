package com.dtcc.exams.part2;

import org.apache.commons.lang3.StringUtils;
import java.util.ArrayList;
import java.util.List;

public class ListUtility {
    List<Integer> list = new ArrayList<>();

    public Boolean add(int i) {
        return list.add(i);
    }

    public Integer size() {
        return list.size();
    }

    public List<Integer> getUnique() {
        list.stream().distinct();
        return list;
    }

    public String join() {
        return StringUtils.join(list, ", ");
    }

    public Integer mostCommon() {
        int maxCount = 1, tempCount;
        int most = list.get(0);
        int currentList;

        for(int i = 0; i < list.size()-1; i++) {
            currentList = list.get(i);
            tempCount=0;
            for(int j = 1; j < list.size(); j++){
                if(currentList == list.get(j)){
                    tempCount++;
                }
                if(tempCount > maxCount) {
                    most = currentList;
                    maxCount = tempCount;
                }
            }
        }
        return most;
    }

    public Boolean contains(Integer valueToAdd) {
        return list.contains(valueToAdd);
    }

}
