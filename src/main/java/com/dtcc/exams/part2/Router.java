package com.dtcc.exams.part2;

import java.util.HashMap;
import java.util.Map;

public class Router {
    //<PATH, CONTROLLER>
    Map<String,String> routerMap = new HashMap<>();

    public void add(String path, String controller) {routerMap.put(path, controller);}
    public Integer size() {return routerMap.size();}

    public String getController(String path) {
        return routerMap.get(path);
    }

    public void update(String path, String studentController) {
        routerMap.remove(path);
        routerMap.put(path, studentController);
    }

    public void remove(String path) {
        routerMap.remove(path);
    }

    public String toString(){
        String temp_string="";

        //Entries, each entry
        for(Map.Entry m:this.routerMap.entrySet()){
            String key = (String)m.getKey();
            String value = (String)m.getValue();
            temp_string += (key + " -> " + value + "\n");
        }
        return temp_string;
    }

}
