package com.baozi;

public class baoziStore extends Thread{
    private baozi bz;
    public baoziStore( baozi bz) {
        this.bz = bz;
    }
    @Override
    public void run() {
        while(true) {
            //生产包子
            synchronized (bz) {
                if (baozi.baozi_num != 0) {
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("生产一个包子");
                baozi.baozi_num++;
                bz.notify();
            }
        }
    }
}
