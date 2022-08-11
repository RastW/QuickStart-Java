package com.rast.grammer;

import cn.hutool.core.collection.CollUtil;
import com.rast.model.Student;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author goumang
 * @description
 * @date 2022/8/10 19:38
 */
public class For {

    public static void main(String[] args) {
        // 各种初始化创建集合的方法
        createList();

        // 各种循环集合的方法
        iterList();
    }

    public static void createList() {
        // 创建一个集合并添加数据
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("jack", 18));
        students.add(new Student("rocy", 17));
        students.add(new Student("katrrin", 19));

        // 15 - 19 的代码用JDK1.8的方式重写(不可变）
        final List<Student> students1 = List.of(
                new Student("jack", 18),
                new Student("rocy", 17),
                new Student("katrrin", 19)
        );
        // 被注释的代码会出现问题，因为不可变 (不信你可以打开注释运行下试试
        // students1.add(new Student());

        // 使用hutool 工具来初始化 （可变）
        ArrayList<Student> students2 = CollUtil.newArrayList(
                new Student("jack", 18),
                new Student("rocy", 17),
                new Student("katrrin", 19)
        );

        // 被注释的代码会出现问题，因为不可变 (不信你可以打开注释运行下试试
        // students1.add(new Student());
        students2.add(new Student());

    }


    private static void iterList() {
        // 首先创建个集合
        List<Integer> list = List.of(97, 89, 76, 25, 92, 64, 30, 72, 39);

        // 传统for循环
        for (int i = 0; i < list.size(); i++) {
            System.out.println("for: " + list.get(i));
        }

        // 增强for循环
        for (Integer integer : list) {
            System.out.println("增强for: " + integer);
        }

        // 迭代器，每次获取下一个
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            Integer next = iterator.next();
            System.out.println("迭代器: " + next);
        }

        // foreach
        // foreach 来自Iterable接口，所有实现Iterable的list都可以使用foreach，内部基于迭代器
        list.forEach(
                // 这里是个lamdba表达式，'->' 前随便写，代表参数，'->' 后跟代码块跟处理逻辑
                item -> {
                    System.out.println("foreach: " + item);
                }
        );

    }

}
