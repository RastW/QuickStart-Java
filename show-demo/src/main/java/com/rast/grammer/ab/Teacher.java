package com.rast.grammer.ab;

/**
 * 抽象类
 *
 * @author goumang
 * @description
 * @date 2022/8/27 17:48
 */
public abstract class Teacher {

    public void game() {
        System.out.println("因为是老师，所以打游戏很菜");
    }

    // 抽象方法，讲课，子类必须重写父类的抽象方法
    public abstract void jiangke();
}
