package com.cgh.exer2_4;

/**
 * Created by ChengGuohua on 2017/11/8.
 */
public class DataOnly {
    int i;
    double d;
    boolean b ;

    public static void main(String[] args) {
        DataOnly data = new DataOnly();
        data.i = 6;
        data.d = 2.5;
        data.b = true ;
        System.out.println("i = " + data.i + ", d = " + data.d + ", b = " + data.b);
    }
}
