package com.cgh.exer2_6;

/**
 * Created by ChengGuohua on 2017/11/8.
 */
public class Exercise2_6 {
    int storage(String s) {
        return s.length() * 2 ;
    }

    public static void main(String[] args) {
        Exercise2_6 exercise2_6 = new Exercise2_6();
        String s = new String("Hello World") ;
        System.out.println("字符串s占" + exercise2_6.storage(s) + "个字节");
    }
}
