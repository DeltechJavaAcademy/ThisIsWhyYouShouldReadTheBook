package com.dtcc.exams.part2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Router {

    Map<String,String> map=new HashMap<>();

    public void add(String path, String controller) {
        map.put(path,controller);
    }

    public Integer size() {
        return this.map.size();
    }

    public String getController(String path) {
        String value=null;
        for(Map.Entry m:this.map.entrySet()){        //this is how you traverse through the map.(Set)
            if(m.getKey().equals(path)){
                value= (String) m.getValue();
            }
        }
            return value;
    }

    public void update(String path, String studentController) {
        for(Map.Entry m:this.map.entrySet()) {
            if (m.getKey().equals(path)) {
                m.setValue(studentController);
            }
        }
    }

    public void remove(String path) {
        for(Map.Entry m:this.map.entrySet()) {
            if (m.getKey().equals(path)) {
                map.remove(path);
            }
        }
    }
    public String toString()
    {
        System.out.println("in to string method.");
       // Iterator hmIterator=map.entrySet().iterator();  //getting an iterator
      //  while(hmIterator.hasNext()){
      //      Map.Entry mapElement=(Map.Entry)hmIterator.next();
      //      System.out.println(mapElement.getKey() + " -> " + mapElement.getValue());}

        String strReturn="";
        for(Map.Entry m:this.map.entrySet()) {
            String key = (String)m.getKey();
            String value=(String)m.getValue();
            strReturn+=(key+" -> " + value+"\n");
        }
        return strReturn;
    }
}
