package com.Throwable;

import java.util.Scanner;

public class CustomException {
    private static void show() throws BusinessException {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入被除数：");
        int num = input.nextInt();
        System.out.println("请输入除数");
        int num1 = input.nextInt();
        if (num1==0){
            throw new BusinessException();
        }
        System.out.println(num+"÷"+num1+"="+num/num1);
    }

    public static void main(String[] args) {
        try{
            show();
        }catch(BusinessException e){
            System.out.println("除数不能为零！");
            e.printStackTrace();
        }finally{
            System.out.println("谢谢使用本程序");
        }
    }

    private static class BusinessException extends java.lang.Exception {
        public BusinessException() {
        }

        public BusinessException(String message) {
            super(message);
        }
    }
}
