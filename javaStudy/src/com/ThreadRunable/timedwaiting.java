package com.ThreadRunable;

public class timedwaiting {
    public static void main(String[] args) {
        for (int i = 1; i < 100; i++) {
            if (i%10==0){
                System.out.println("-----------"+i);
            }else{System.out.println(i);}
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
