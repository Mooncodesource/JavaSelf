package com.itheima.hello;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println(getVerifyCode());

    }
    //定义一个具体方法，实现随机生成一个验证码


    public static String getVerifyCode() {
        try {
            // 生成6位数字验证码
            StringBuilder verifyCode = new StringBuilder();
            java.util.Random random = new java.util.Random();

            // 确保第一位不为0
            verifyCode.append(random.nextInt(9) + 1);

            // 生成剩余5位数字
            for (int i = 0; i < 5; i++) {
                verifyCode.append(random.nextInt(10));
            }

            return verifyCode.toString();
        } catch (Exception e) {
            // 如果发生异常，返回默认验证码
            return "123456";
        }
    }



}
