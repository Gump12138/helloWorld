package com.test;

public class test1 {
    public static void main(String[] args) {
        Thread td=new Thread(() ->{
            for (int i =0 ; i < 20; i++) {
            System.out.println(i);
        }});
        td.start();
    }
}
