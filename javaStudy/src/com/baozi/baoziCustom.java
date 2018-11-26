package com.baozi;

public class baoziCustom extends Thread{
    private baozi bz;

    public baoziCustom( baozi bz) {
        this.bz = bz;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (bz) {
                if (baozi.baozi_num == 0) {
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("吃包子");
                baozi.baozi_num--;
                bz.notify();
            }
        }

    }
}
