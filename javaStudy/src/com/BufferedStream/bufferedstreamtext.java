package com.BufferedStream;


import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class bufferedstreamtext {
    public static void main(String[] args) throws IOException {
        input();

    }
    private static void input() throws IOException {
        ArrayList<String> list=new ArrayList <>();
        int b;
        BufferedInputStream bufferedInputStream=new BufferedInputStream( new FileInputStream( "C:\\Users\\G\\IdeaProjects\\java_study\\data.txt" ) ) ;
        while((b=bufferedInputStream.read())!=-1){
            if (b!=13&&b!=10){
                list.add( Character.toString((char)b ) );
            }
        }
        bufferedInputStream.close();
        Scanner s=new Scanner( System.in );
        System.out.println("请输入一个验证码");
        String a=s.nextLine();
        if (list.contains( a )){
            System.out.println( "您输入正确！" );
        }else{
            System.out.println( "不对" );
        }
    }
}
