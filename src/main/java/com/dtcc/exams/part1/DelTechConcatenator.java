package com.dtcc.exams.part1;

public class DelTechConcatenator {

    private Integer value;

    public DelTechConcatenator(Integer input) {
        this.value = input;
    }

    public Integer getValue(){return this.value;}

    public Boolean isDel() {
        return (this.value%3 == 0);
    }

    public Boolean isTech() {
        return (this.value%5 == 0);
    }

    public Boolean isDelTech() {
        return ((this.value%5 == 0) && (this.value%3 == 0));
    }

}
