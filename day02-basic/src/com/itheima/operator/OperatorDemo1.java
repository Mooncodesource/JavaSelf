package com.itheima.operator;

public class OperatorDemo1 {
    public static void main(String[] args) {
        show(10,3);
        show1();
    }
//    四种基本运算符的数演示
    public static void show(int a,int b) {
        int c = a + b;
        System.out.println(c);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println((double)a / b);
        System.out.println(a % b);
    }
//    研究+符号是做连接符号还是运算符
    public static void show1() {
        int a = 5;
        System.out.println("abc" + a);
        System.out.println(a + 5);
        System.out.println(a + 'a' + "itheima");//10itheima
        System.out.println(a + 'a' + "itheima" + a);//65itheima5
    }
}
