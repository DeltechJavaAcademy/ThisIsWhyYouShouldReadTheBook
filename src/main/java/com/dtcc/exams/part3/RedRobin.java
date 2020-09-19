package com.dtcc.exams.part3;

public class RedRobin extends Bird implements Animal {

    private String migrationMonth;

    @Override
    public int getSpeed() {
        return 10;
    }

    @Override
    public String color() {
        return "brown";
    }

    public void setMigrationMonth(String month){
        this.migrationMonth = month;
    }
    public String getMigrationMonth() {
        return this.migrationMonth;
    }
}
