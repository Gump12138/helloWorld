package com.Throwable;

public class ArrayTools {
    public static int getElement (int[] arr, int index)throws ArrayIndexOutOfBoundsException{
        if (index>arr.length-1||index<0){
            throw new ArrayIndexOutOfBoundsException("int数组引索值错误，不在数组的范围之内。");
        }
        int element = arr[index];
        return element;
    }
}
