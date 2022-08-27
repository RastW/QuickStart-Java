package com.rast.grammer.ab;

import java.util.ArrayList;
import java.util.List;

/**
 * @author goumang
 * @description
 * @date 2022/8/27 17:53
 */
public class Huodong {

    /**
     * 普通的类可以继承，但是不能写 "抽象方法"
     * 抽象类可以写抽象方法，也可以写正常的方法
     * 接口 只能写抽象方法
     * @param args
     */
    public static void main(String[] args) {

        Teacher shiGongTeacher = new ShiGongTeacher();
        Teacher shiYouTeacher = new ShiYouTeacher();

        ArrayList<Teacher> teacherList = new ArrayList<>();

        teacherList.add(shiYouTeacher);
        teacherList.add(shiGongTeacher);

        // list: 0-shiyou, 1-shigong

        // 有一个map，里面存所有老师
        // 将当前宝下所有Teacher类型（父类型）的类，全部new一个加载进来，通过for循环来扫描当前文件夹目录



        // 有个参数，叫教师类型，类型为0，则是石油大学的老师，否则1，则是石公校老师，来讲课
        int flag = 0;
        teacherList.get(flag).game();
        teacherList.get(flag).game();


        // 需求再次升级，每个月来授课的老师都不一样，我想写一段代码，没添加一个授课老师只需要添加一个新的老师文件，而不用改现有的
    }
}
