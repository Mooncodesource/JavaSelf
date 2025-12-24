package com.itheima.scanner;

import java.util.Scanner;

public class ScannerDemo1 {
    public static void main(String[] args) {
        //    实现用户输入用户名和年龄，并打印
        show();
    }
//定义一个完整函数实现用户名输入和年龄输入，并打印
    public static void show() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String name = sc.next();
        System.out.println("请输入年龄：");
        int age = sc.nextInt();
        System.out.println("用户名：" + name + "，年龄：" + age);
    }


}
