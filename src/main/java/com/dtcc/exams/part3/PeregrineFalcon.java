package com.dtcc.exams.part3;

public class PeregrineFalcon extends Bird implements Animal {

    @Override
    public int getSpeed() {
        return 13;
    }

    @Override
    public String color() {
        return "brown";
    }
}
