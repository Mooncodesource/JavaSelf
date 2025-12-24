package com.itheima.operator;

public class OperatorDemo5 {
    public static void main(String[] args) {
        show();
        show(10,20,30);
    }
//    三元运算符，判断成绩等级判定
    public static void show() {
        int score = 80;
        String grade = score >= 60 ? "及格" : "不及格";
        System.out.println(grade);// 及格
    }
// 函数输入三个整数参数，求最大值
public static void show(int a, int b, int c) { // a,b,c
    int max = a;
    if (b > max) {
        max = b;
    }
    if (c > max) {
        max = c;
    }
    System.out.println(max); //
}

}
