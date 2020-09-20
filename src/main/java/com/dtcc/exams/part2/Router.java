package com.dtcc.exams.part2;

import java.util.HashMap;
import java.util.Map;

public class Router {
    Map<String,String> hash_map = new HashMap<String,String>();

    public void add(String path, String controller) {

        hash_map.put(path, controller);

    }

    public Integer size() {
        return this.hash_map.size();
    }

    public String getController(String path) {
        String value=null;
        for(Map.Entry key:hash_map.entrySet()){        //this is how you traverse through the map.(Set)
            if(key.getKey().equals(path)){
                value= (String) key.getValue();
            }
        }
        return value;
    }


    public void update(String path, String studentController) {
        for(Map.Entry key:this.hash_map.entrySet()) {
            if (key.getKey().equals(path)) {
                key.setValue(studentController);
            }
        }
    }

    public void remove(String path) {
        for(Map.Entry key:this.hash_map.entrySet()) {
            if (key.getKey().equals(path)) {
                hash_map.remove(path);
            }
        }
    }

}
