package com.cgh.exer2_7;

/**
 * Created by ChengGuohua on 2017/11/8.
 */
class StaticTest {
    static int i = 47 ;
}

public class Incrementale {
    static void increment() {
        StaticTest.i ++ ;
    }

    public static void main(String[] args) {
        System.out.println("before increment: " + StaticTest.i);
        Incrementale.increment();
        System.out.println("after increment: " + StaticTest.i);
    }
}
