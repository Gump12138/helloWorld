package com.ThreadRunable;

public class test {
    public static void main(String[] args) {
        int ticket=10;
        Ticket sale = new Ticket();
        Thread t1=new Thread(sale,"窗口1");
        Thread t2=new Thread(sale,"窗口2");
        Thread t3=new Thread(sale,"窗口3");
        t1.start();
        t2.start();
        t3.start();
    }
}
