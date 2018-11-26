package com.FucntionInterface;

public class IntCalcText {
    public static void main(String[] args) {
        getProduct( 10,2,(a,b)->a*b  );
    }
    private static void getProduct(int a,int b,IntCalc calc){
        int c=calc.calc(a,b);
        System.out.println( c );
    }
}
