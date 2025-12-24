package com.itheima.method;

public class MethodDemo2 {
    public static void main(String[] args) {
//        学习方法重载
        show(10);
        show(10.0);
        show("hello");
        show(true);
        show(10L);
        show(10.0f);
    }

    public static void show(int a) {
        System.out.println(a);
    }
//    方法重载针对不同类型数据同一个函数都可以输出

    public static void show(double a) {
        System.out.println("show(double a)");
    }

    //    输出字符串型
    public static void show(String a) {
        System.out.println("show(String a)");
    }

    //    输出浮点型
    public static void show(boolean a) {
        System.out.println("show(boolean a)");
    }

    public static void show(long a) {
        System.out.println("show(long a)");
    }
}
