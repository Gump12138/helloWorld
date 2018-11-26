package com.Mao;
import java.util.*;

public class ChinesePork {
    public static void main (String[] args) {
        List<String> color=List.of("♥","♦","♠","♣");
        List<String> number=List.of("1","2","3","4","5","6","7","8","9","10","J","Q","K");
        HashMap<Integer,String> pockermap=new HashMap<>();

        int count =0;
        pockermap.put(count++,"大☠");
        pockermap.put(count++,"小☺");
        for (int i = 0; i < color.size(); i++) {
            for (int j = 0; j < number.size(); j++) {
                pockermap.put(count++,color.get(i)+number.get(j));
            }
        }
        Set<Integer> numberSet=pockermap.keySet();
        ArrayList<Integer> pocker = new ArrayList<>(numberSet);
        Collections.shuffle(pocker);

        ArrayList<Integer> p1=new ArrayList<>();
        ArrayList<Integer> p2=new ArrayList<>();
        ArrayList<Integer> p3=new ArrayList<>();
        ArrayList<Integer> p4=new ArrayList<>();
        for (int i = 0; i < 17; i++) {
            p1.add(pocker.get(i));
        }
        for (int i = 17; i < 34; i++) {
            p2.add(pocker.get(i));
        }
        for (int i = 34; i < pocker.size()-3; i++) {
            p3.add(pocker.get(i));
        }
        for (int i = 51; i < 54; i++) {
            p4.add(pocker.get(i));
        }
        Collections.sort(p1);
        Collections.sort(p2);
        Collections.sort(p3);
        Collections.sort(p4);
        ArrayList<String> player1=new ArrayList<>();
        ArrayList<String> player2=new ArrayList<>();
        ArrayList<String> player3=new ArrayList<>();
        ArrayList<String> player4=new ArrayList<>();
        for (int i=0;i<p1.size();i++) {
            Integer a=p1.get(i);
            player1.add(pockermap.get(a));
        }
        for (int i=0;i<p2.size();i++) {
            Integer a=p2.get(i);
            player2.add(pockermap.get(a));
        }
        for (int i=0;i<p3.size();i++) {
            Integer a=p3.get(i);
            player3.add(pockermap.get(a));
        }
        for (int i=0;i<p4.size();i++) {
            Integer a=p4.get(i);
            player4.add(pockermap.get(a));
        }

        System.out.println(player1);
        System.out.println(player2);
        System.out.println(player3);
        System.out.println(player4);
    }
}
