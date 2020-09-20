package com.dtcc.exams.part3;

import java.util.Comparator;

public class SpeedComparator implements Comparator<Animal> {

    public int compare(Animal animal1, Animal animal2){return (animal2.getSpeed()-animal1.getSpeed());
    }
}
