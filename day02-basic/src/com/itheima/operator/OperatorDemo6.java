package com.itheima.operator;

public class OperatorDemo6 {
    public static void main(String[] args) {
//掌握逻辑运算符的使用
        show();
        show1();
        show2(10, 20, 30);
    }
//    逻辑运算符方法，针对身高体重范围判断是否满足择偶要求
    public static void show() {
        double height = 1.75;
        double weight = 80.5;
        boolean flag = height >= 1.6 && weight <= 90;
        System.out.println(flag);
    }
//    或，非，异或的逻辑运算符演示现实生活择偶为例
    public static void show1() {
        double height = 1.75;
        double weight = 80.5;
        boolean flag = height >= 1.6 || weight <= 90;
        System.out.println(flag);
        boolean flag1 = !flag;
        System.out.println(flag1);
        boolean flag2 = height >= 1.6 ^ weight <= 90;
        System.out.println(flag2);
    }
//实现函数探究&&，||与&，|的区别
    public static void show2(int a, int b, int c) {
        boolean flag = a > b && b > c;
        System.out.println(flag);
        boolean flag1 = a > b & b > c;
        System.out.println(flag1);
        boolean flag2 = a > b || b > c;
        System.out.println(flag2);
        boolean flag3 = a > b | b > c;
        System.out.println(flag3);
    }
}
