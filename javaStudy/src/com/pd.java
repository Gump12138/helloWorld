package com;

import java.io.File;

public class pd {
    public static void main(String[] args) {
        File fileInputStream=new File( "C:\\Users\\G\\Videos\\18JAVA课件\\Java基础\\Java基础第一部分资料\\day01\\day01【前言、入门程序、常量、变量】.pdf" );
        System.out.println( fileInputStream.isFile() );
    }
}
