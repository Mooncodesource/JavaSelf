package com.itheima.type;

public class TypeDemo1 {
    public static void main(String[] args) {
        int b = 100212;
        show(b);
        show1(b);
//        show2(b);
//        show3(b);
//       强制类型转换
        byte a = (byte)b;
        show2(a);
    }
    public static void show(int a) {
        System.out.println(a);
    }
    public static void show1(double a) {
        System.out.println(a);
    }

    public static void show2(byte a) {
        System.out.println(a);
    }

}
