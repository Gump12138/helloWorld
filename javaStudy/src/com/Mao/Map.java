package com.Mao;

import java.util.LinkedHashMap;
import java.util.Scanner;
public class Map {
    public static void main(String[] args) {
        LinkedHashMap<Character,Integer> maplist=new LinkedHashMap<>();
        System.out.println("请输入一串字符：");
        String a=new Scanner(System.in).nextLine();
        for (int i=0;i<a.length();i++) {
            Character b=a.charAt(i);
            if (!maplist.containsKey(b)){
                maplist.put(b,1);
            }else{
                Integer c=maplist.get(b);
                maplist.put(b,++c);
            }
        }
        System.out.println(maplist);
    }
}
