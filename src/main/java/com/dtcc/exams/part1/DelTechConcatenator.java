package com.dtcc.exams.part1;

public class DelTechConcatenator {
    Integer input;

    public DelTechConcatenator(Integer input) {
        this.input=input;
    }

    public Boolean isDel() {
        if(input%3 == 0){
            return true;
        }
        return false;
    }

    public Boolean isTech() {
        if(this.input%5 == 0){
            return true;
        }
        return false;
    }

    public Boolean isDelTech() {
        if(this.input%15 == 0){
            return true;
        }
        return false;
    }

}
