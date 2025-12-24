package com.itheima.method;

public class MethodDemo1 {
    public static void main(String[] args) {
//        掌握方法的定义和调用

         show();
         System.out.println(getSum(10, 20));
//         验证码对象使用
        String verifyCode = VerifyCodeUtil.getVerifyCode(4);
        System.out.println(verifyCode);
    }
    public static void show() {
        System.out.println("show方法执行了...");
    }
//    定义一个方法，返回两个数的和
    public static int getSum(int a, int b) {
        int sum = a + b;
        return sum;
 }
// 获取指定位数的验证码的方法
public class VerifyCodeUtil {
    // 使用安全的随机数生成器
    private static final java.security.SecureRandom random = new java.security.SecureRandom();

    public static String getVerifyCode(int length) {
        if (length <= 0) {
            length = 6; // 默认长度
        }

        // 验证码字符范围（去除容易混淆的数字0、O、l、1）
        String chars = "23456789ABCDEFGHJKLMNPQRSTUVWXYZ";
        StringBuilder verifyCode = new StringBuilder();

        for (int i = 0; i < length; i++) {
            verifyCode.append(chars.charAt(random.nextInt(chars.length())));
        }

        return verifyCode.toString();
    }
}

}
