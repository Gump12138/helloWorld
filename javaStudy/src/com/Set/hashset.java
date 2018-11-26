package com.Set;

import java.util.HashSet;

public class hashset {
    public static void main(String[] args) {
        HashSet<Person> setlist=new HashSet<>();
        setlist.add(new Person("王昭君",18));
        setlist.add(new Person("西施", 21));
        setlist.add(new Person("杨玉环", 20));
        setlist.add(new Person("貂蝉", 19));
        setlist.add(new Person("杨玉环", 20));
        setlist.add(new Person("貂蝉", 19));
        for (Person a:setlist) {
            System.out.println(a);
        }

    }
}
