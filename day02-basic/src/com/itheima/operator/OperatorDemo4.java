package com.itheima.operator;

public class OperatorDemo4 {
    public static void main(String[] args) {
        show();
    }
//    研究关系运算符，收红包
    public static void show() {
        int a = 10;
        int b = 20;
        System.out.println(a > b);// false
        System.out.println(a < b);// true
        System.out.println(a >= b);// false
        System.out.println(a <= b);// true
        System.out.println(a == b);// false
        System.out.println(a != b);// true
    }
}
