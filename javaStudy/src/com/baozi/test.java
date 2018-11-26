package com.baozi;

public class test {
    public static void main(String[] args) {
        baozi bz=new baozi();
        baoziStore bs=new baoziStore(bz);
        baoziCustom bc=new baoziCustom(bz);

        bc.start();
        bs.start();

    }
}
