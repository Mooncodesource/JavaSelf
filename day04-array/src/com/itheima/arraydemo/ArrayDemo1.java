package com.itheima.arraydemo;

public class ArrayDemo1 {
    public static void main(String[] args) {
        show();
    }
//    随机点名函数，15个人
    public static void show() {
        String[] names = {"小王", "小张", "小李", "小赵", "小钱", "小孙", "小周", "小吴", "小郑", "小王", "小王", "小王", "小王", "小王"};
        int index = (int) (Math.random() * names.length);
        System.out.println(names[index]);
    }
}
