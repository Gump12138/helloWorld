package com.Lambda;

public class lanmbdawithout {
    public static void main(String[] args) {
        InvokeDirect(() ->System.out.println("导演拍电影啦！"));
    }
    private static void InvokeDirect(Director director){
        director.makeMovie();
    }
}
