package com.itheima.type;

public class TypeDemo2 {
    public static void main(String[] args) {
        System.out.println(show(10,20,30,40));
        System.out.println(show((byte)101,(byte)101));
        System.out.println(show1((byte)101,(byte)101));
    }
//    表达式自动类型提升函数演示
    public static  double show(int a,long b,float c,double d) {
        return a+b+c+d;
    }
//    返回两个byte类型的和，强制转换
    public static byte show(byte a,byte b) {
        return (byte)(a+b);
    }
    public static int show1(byte a,byte b) {
        return (a+b);
    }
}
