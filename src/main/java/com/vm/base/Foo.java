package com.vm.base;

/**
 * javap -v Foo.class
 */
public class Foo {
    public static void main(String[] args) {
        boolean flag = Boolean.TRUE;
        if (flag){
            System.out.println(" 吃了 ");
        } else {
        if (true == flag) System.out.println(" 真吃了 ");
        }
    }
}
