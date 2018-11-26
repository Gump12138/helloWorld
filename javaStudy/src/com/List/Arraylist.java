package com.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> alist=new ArrayList<>();
        alist.add(33);
        alist.add(11);
        alist.add(77);
        alist.add(55);
        Collections.sort(alist, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;//升序
                //return o2-o1;降序
            }
        });
        for (Integer a:alist) {
            System.out.print(a+"\0");
        }

    }
}
