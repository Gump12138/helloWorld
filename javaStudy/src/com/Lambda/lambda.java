package com.Lambda;

public class lambda {
    public static void main(String[] args) {
        invokeCalc(10,5,(int a,int b) -> a-b);
    }
    private static void invokeCalc(int a, int b, Caculator calculator) {
        int result = calculator.calc(a, b);
        System.out.println("结果是：" + result);
    }

}
