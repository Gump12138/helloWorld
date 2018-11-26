package com.FucntionInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArrayListHandle {
    public static void main(String[] args) {
        ArrayList<String> one=new ArrayList <>();
        one.add("迪丽热巴");
        one.add("宋远桥");
        one.add("苏星河");
        one.add("石破天");
        one.add("石中玉");
        one.add("老子");
        one.add("庄子");
        one.add("洪七公");
        ArrayList<String> two=new ArrayList <>();
        two.add("古力娜扎");
        two.add("张无忌");
        two.add("赵丽颖");
        two.add("张三丰");
        two.add("尼古拉斯赵四");
        two.add("张天爱");
        two.add("张二狗");

        //筛选名字为三个字的,前三个
        Stream <String> no1=one.stream().filter( s -> s.length()==3).limit( 3 ) ;
        List<String> no1List=no1.collect( Collectors.toList());
        System.out.println( no1List );

        //筛选前性张的，不要后两个
        Stream<String> no2A=two.stream().filter(s -> s.startsWith("张")).skip( 2 );
        List<String> no2ListB=no2A.collect(Collectors.toList() );
        System.out.println( no2ListB );

        Stream.concat( no1,no2A ).map( Person::new ).forEach( System.out::println );
    }
}
