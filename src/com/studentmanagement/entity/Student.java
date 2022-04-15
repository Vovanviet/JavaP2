package com.studentmanagement.entity;

public class Student {
    private String rollNo;
    private String name;
    private int age;
    private double mark;

    public Student(String rollNo, String name, int age, double mark) {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.mark = mark;
    }

    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return  "{"+
                "id=" + rollNo +
                ", name='" + name + '\'' +
                ",age="+age+
                ", mark='" +Math.ceil(mark*10)/10 + '\''+"}"
               ;
    }
}
