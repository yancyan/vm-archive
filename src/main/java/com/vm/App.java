package com.vm;


public class App {
    public static void main(String[] args) {
        float toFloat = Float.intBitsToFloat(0X80000000);
        System.out.println(toFloat);


        // float sn1 = 0.0f / 0.0f;
        // float f1 = 0.0f;
        // float sn2 = f1 / f1;
        // System.out.println("sn1 hex = " + Integer.toHexString(Float.floatToRawIntBits(sn1)));
        // System.out.println("sn2 hex = " + Integer.toHexString(Float.floatToRawIntBits(sn2)));
    }
}
