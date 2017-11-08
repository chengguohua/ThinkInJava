package com.cgh.exer2_9;

/**
 * Created by ChengGuohua on 2017/11/8.
 */
public class Exercise2_9 {
    public static void main(String[] args) {
        System.out.println("***boolean-Boolean******");
        boolean b0 = true;
        Boolean b1 = new Boolean(b0);
        boolean b2 = b1 ;
        System.out.println(b1);
        System.out.println(b2);

        System.out.println("***char-Character******");
        char c0 = 'q' ;
        Character c1 = new Character(c0) ;
        char c2 = c1 ;
        System.out.println(c1);
        System.out.println(c2);

        System.out.println("***byte-Byte******");
        byte by0 = 68 ;
        Byte by1 = new Byte(by0);
        byte by2 = by1 ;
        System.out.println(by1);
        System.out.println(by2);

        System.out.println("***short-Short******");
        short s0 = 5 ;
        Short s1 = new Short(s0);
        short s2 = s1;
        System.out.println(s1);
        System.out.println(s2);

        System.out.println("***int-Integer******");
        int i0 = 6 ;
        Integer i1 = new Integer(i0) ;
        int i2 = i1;
        System.out.println(i1);
        System.out.println(i2);

        System.out.println("***long-Long******");
        long l0 = 78 ;
        Long l1 = new Long(l0);
        long l2 = l1;
        System.out.println(l1);
        System.out.println(l2);

        System.out.println("***float-Float******");
        float f0 = 9.2f ;
        Float f1 = new Float(f0);
        float f2 = f0 ;
        System.out.println(f1);
        System.out.println(f2);

        System.out.println("***double-Double******");
        double d0 = 10.5;
        Double d1 = new Double(d0) ;
        double d2 = d1 ;
        System.out.println(d1);
        System.out.println(d2);
    }
}
