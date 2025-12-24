package com.itheima.operator;

public class OperatorDemo3 {
    public static void main(String[] args) {
        show();
    }
//    扩展赋值运算符的演示，收红包
    public static void show() {
        int money = 10;
        money += 10;
        System.out.println(money);
        money -= 5;
        System.out.println(money);
        money *= 2;
        System.out.println(money);
        money /= 3;
        System.out.println(money);
        money %= 2;
        System.out.println(money);
    }
}
