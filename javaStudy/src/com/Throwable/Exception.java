package com.Throwable;

public class Exception {
    public static void main(String[] args) throws ArrayIndexOutOfBoundsException{
        int[] arr = { 34, 12, 67 };
        int num = ArrayTools.getElement(arr, 4);
//        System.out.println("num=" + num);
//        System.out.println("over");
    }
}
