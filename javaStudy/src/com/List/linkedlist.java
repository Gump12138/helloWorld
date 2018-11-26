package com.List;
import java.util.Collection;
import java.util.LinkedList;

public class linkedlist {
    public static void main(String[] args) {
        LinkedList<String> list=new LinkedList<>();
        list.add(0,"a");
        list.add(1,"b");
        list.add(2,"c");
        String a=list.getFirst();
        String b=list.getLast();
        System.out.println(a);
        System.out.println(b);
        list.remove("b");
        System.out.println(list);
//        list.remove();
//        System.out.println(list);
//        list.clear();
        Collection<String> list2=new LinkedList<>();
        list2.add("abc");
        list2.add("abd");
        list.addAll(0, list2);
        System.out.println(list);
        System.out.println(list.pop());
        System.out.println(list.pop());
        System.out.println(list);
        list.push("b");
        System.out.println(list);

        System.out.println(list.set(0,"AAA"));
        System.out.println(list);

    }
}
