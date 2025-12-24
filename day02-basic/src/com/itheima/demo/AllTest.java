package com.itheima.demo;

import java.util.Scanner;

/*
* 简单的健康计算器应用程序
* 接受用户的输入（年龄，性别，身高，体重）
* 计算用户的BMI指数和基础代谢率BMR
* */
public class AllTest {
    public static void main(String[] args) {
        show();
    }
//    实现一个简单的健康计算器应用程序，接受用户的输入（年龄，性别，身高，体重），计算用户的BMI指数和基础代谢率BMR
    public static void show() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入年龄：");
        int age = sc.nextInt();
        System.out.println("请输入性别：");
        String sex = sc.next();
        System.out.println("请输入身高：");
        double height = sc.nextDouble();
        System.out.println("请输入体重：");
        double weight = sc.nextDouble();
//        求BMI指数的函数
        double bmi = getBMI(weight, height);
        System.out.println("BMI指数：" + bmi);
//        求BMR的函数
        double bmr = getBMR(age, sex, height, weight);
        System.out.println("基础代谢率：" + bmr);

    }
    public static double getBMI(double weight, double height) {
        return weight / (height * height);
    }
    public static double getBMR(int age, String sex, double height, double weight) {
        double bmr = 0;
        if ("男".equals(sex)) {
            bmr = 66 + (13.7 * weight) + (5 * height) - (6.8 * age);
        } else {
            bmr = 655 + (9.6 * weight) + (1.8 * height) - (4.7 * age);
        }
        return bmr;
    }
}
