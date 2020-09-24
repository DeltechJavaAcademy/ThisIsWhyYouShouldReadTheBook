package com.dtcc.exams.part1;

public class DelTechConcatenator {

    private int input;

    public DelTechConcatenator(Integer input) {
        this.input = input;
    }

    public Boolean isDel() {
        boolean isDel = false;
        if(this.input % 3 == 0){
            isDel = true;
        }
        return isDel;
    }

    public Boolean isTech() {
        boolean isTech = false;
        if(this.input % 5 == 0){
            isTech = true;
        }
        return isTech;
    }

    public Boolean isDelTech() {
        boolean isDelTech = false;
        if(this.input % 3 == 0 && input % 5 == 0){
            isDelTech = true;
        }

        return isDelTech;
    }

}
