package com.FucntionInterface;

public class CurrentTimePrintText {
    public static void main(String[] args) {
        showLongTime(() -> System.out.println(System.currentTimeMillis()) );
    }
    private static void showLongTime(CurrentTimePrint timePrint){
        timePrint.PrintCurrentTime();
    }
}
