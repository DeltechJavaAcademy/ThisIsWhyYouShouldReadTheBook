package com.dtcc.exams.part1;
import java.util.Scanner;
public class DelTechConcatenator {

    Scanner scan = new Scanner(System.in);
    int input = 0;
    public DelTechConcatenator(Integer input) {
        input = scan.nextInt();
        int count = 0;
        for(int i = 1; i <= input; i++){
            count++;
        }
    }

    public Boolean isDel() {
        if(input % 3 == 0){
            return true;
        }else {
            return false;
        }
    }

    public Boolean isTech() {
        if(input % 5 == 0) {
            return true;
        }else {
            return false;
        }
    }

    public Boolean isDelTech() {
        if(input % 3 == 0 && input % 5 == 0){
            return true;
        }else {
            return false;
        }
    }

}
