package com.rast.grammer;

import com.rast.model.Student;

/**
 * @author goumang
 * @description
 * @date 2022/8/19 21:43
 */
public class Method {

    /**
     * 1. 方法名使用小驼峰命名法，以小写字母开头
     * 2. 被static修饰的属于"类"，不被static修饰的属于"对象"
     * 3. "类"类似一个模版，而对象，则是类的实例；
     * 4. 不被static修饰的方法是 属于对象的动作
     * @param args
     */
    public static void main(String[] args) {
        int amount = 8000;
        Student baige = new Student("baige", 24, amount);
        amount = 0;

        int a = 600;
        // 每个月给你还600
        for (int i = 0; i < 12; i++) {
            boolean isSuccess = getQian(baige, a);
            if (isSuccess) {
                amount = amount + 600;
            } else {
                System.out.println("摆哥没还钱！");
            }
        }

        System.out.println("现在过去12个月，我钱包有：" + amount);
    }

    /**
     * @param amount
     * @return 是否扣钱成功
     */
    public static boolean getQian(Student student, int amount) {
        if (student.getWallet() < amount) {
            return false;
        }
        student.setWallet(student.getWallet() - amount);
        return true;
    }
}
