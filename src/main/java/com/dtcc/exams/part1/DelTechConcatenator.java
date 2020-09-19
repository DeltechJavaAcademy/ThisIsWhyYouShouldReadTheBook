package com.dtcc.exams.part1;

public class DelTechConcatenator {
    Integer input;
    public DelTechConcatenator(Integer input) {
        this.input=input;
    }

    public Boolean isDel() {
       if(this.input %3 ==0){return true;}
       else {return false;}
       // return (this.input%3==0);
    }

    public Boolean isTech() {
        if(this.input % 5 ==0){return true;}
        else {return false;}
       // return (this.input%5==0);
    }

    public Boolean isDelTech() {
        if(this.input % 3 == 0 && this.input % 5 == 0){return true;}
        else {return false;}
       // return (this.input%3==0 || this.input%5==0);
    }

}
