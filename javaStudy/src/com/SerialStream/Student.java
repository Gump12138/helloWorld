package com.SerialStream;

public class Student implements java.io.Serializable{
    public int age;
    public String name;

    public Student(int age,String name) {
        this.age = age;
        this.name=name;
    }

}
