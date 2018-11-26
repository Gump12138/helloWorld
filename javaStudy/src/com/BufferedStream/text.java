package com.BufferedStream;

public class text {
    public static void main(String[] args) {
        String test="asdasda.sdasd";
        String[] a=test.split( "\\." );
        System.out.println( a.length );
        for (int i = 0; i <a.length ; i++) {
            System.out.println( a[i] );
        }
    }
}
