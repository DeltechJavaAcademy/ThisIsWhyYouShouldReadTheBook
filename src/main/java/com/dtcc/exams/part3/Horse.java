package com.dtcc.exams.part3;

public class Horse implements Animal{

    @Override
    public String move() {return "gallop";}

    @Override
    public int getSpeed() {
        return 40;
    }

    @Override
    public String color() {
        return "black";
    }
}
