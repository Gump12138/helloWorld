package com.test;

public class test {
    public int start = 1;
    public int end = 99;

    public static void main (String[] args) {
        new test().method();
    }

    private void method() {

        Thread t = new Thread( () -> {
            for (int i =start ; i < end+1; i++) {
                System.out.println(i);
            }
        });
        t.start();
    }

}
