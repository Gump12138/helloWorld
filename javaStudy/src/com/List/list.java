package com.List;

import java.util.ArrayList;
import java.util.List;

public class list {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("华安");
        list.add("华文");
        list.add("华武");
        list.add("路人甲");
        System.out.println(list);
        int a = 0;
        for (int i = 0; i <list.size() ; i++) {
            if (list.get(i).equals("路人甲")){
                a=i;
            }
        }
        list.set(a,"秋香");
        System.out.println(list);
        }
}
