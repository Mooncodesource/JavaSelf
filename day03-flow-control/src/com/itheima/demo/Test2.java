package com.itheima.demo;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {

        show();
    }

    //    生成一个随机数，0-100之间，根据用户输入的数字去判断给出太大还是太小，不端重复猜，直到猜对为止
    public static void show() {
        int number = (int) (Math.random() * 100);
        while (true) {
            System.out.println("请输入数字：");
            Scanner sc = new Scanner(System.in);
            int number1 = sc.nextInt();
            if (number1 > number) {
                System.out.println("太大了");
                continue;

            } else if (number1 < number) {
                System.out.println("太小了");
                continue;

            } else {
                System.out.println("恭喜你猜对了");
                break;
            }
        }
    }
}

