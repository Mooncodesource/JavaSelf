package com.itheima.operator;

public class OperatorDemo2 {
    public static void main(String[] args) {
        show1();
    }
//    演示++符号前置和后置的区别
    public static void show1() {
        int a = 10;
        int c = a++;
        int b = ++a;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(a);
    }
}
