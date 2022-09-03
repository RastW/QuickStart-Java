package com.rast.grammer;

/**
 * @author goumang
 * @description 递归 - 自调用，方法自己调用自己
 * @date 2022/9/3 15:34
 */
public class Recursion {

    public static void main(String[] args) {

        run(0);
    }

    public static void run (int i) {
        System.out.println("递归： " + i);

        if (i < 10) {
            run( i + 1);
        }
    }
}
