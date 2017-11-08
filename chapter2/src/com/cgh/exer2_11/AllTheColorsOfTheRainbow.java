package com.cgh.exer2_11;

/**
 * Created by ChengGuohua on 2017/11/8.
 */
public class AllTheColorsOfTheRainbow {
    int anIntegerRepresentingColors ;

    void changeTheHueOfTheCOlor(int newHue) {
        anIntegerRepresentingColors = newHue ;
    }

    public static void main(String[] args) {
        AllTheColorsOfTheRainbow color = new AllTheColorsOfTheRainbow();
        color.anIntegerRepresentingColors = 3 ;
        System.out.println(color.anIntegerRepresentingColors);
        color.changeTheHueOfTheCOlor(5);
        System.out.println(color.anIntegerRepresentingColors);
    }
}
