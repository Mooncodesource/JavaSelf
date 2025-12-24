package com.itheima.literal;

/**
 * 目标,掌握字面量书写格式
 *
 */

public class LiteralDemo {
    public static void main(String[] args) {

        test1();

    }

    public static void test1(){
        int a = 10;
        int b = 0x10;
        int c = 012;
        int d = 0b1010;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}
