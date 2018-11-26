package com.Set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class linkedhashset {
    public static void main(String[] args) {
        LinkedHashSet<String> lhSet = new LinkedHashSet<>();
        lhSet.add("王昭君");
        lhSet.add("王昭君");
        lhSet.add("王昭君");
        lhSet.add("西施");
        lhSet.add("杨玉环");
        lhSet.add("貂蝉");
        Iterator<String> it=lhSet.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+"\0");
        }
        System.out.println("\n"+"--------------");
        for (String a:lhSet) {
            System.out.print(a+"\0");
        }
    }
}
