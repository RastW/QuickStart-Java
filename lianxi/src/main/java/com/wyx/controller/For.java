package com.wyx.controller;


import cn.hutool.core.collection.CollUtil;
import com.sun.source.tree.WhileLoopTree;
import com.wyx.grammer.Student;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class For {
    public static void main(String[] args) {

        JiHe();
        ZengQianglist();
        System.out.println("哈哈哈哈哈哈");

    }

    public static void JiHe(){
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("他爹",30));
        students.add(new Student("学生",10));
        students.add(new Student("他爷爷",60));

        //看不懂啊 这是要干啥啊?
        final List<Student> students1 = List.of(
                new Student("tadie",30),
                new Student("xuesheng",10),
                new Student("tayeye",60)
        );
        // List.of()方法不可变
        //students1.add(new Student()为什么这里可以传送空参数 是应为那会写了两个方法吗, 是的！);

        ArrayList<Student> students2 = CollUtil.newArrayList(
                new Student("tadie",30),
                new Student("xuesheng",10),
                new Student("tayeye",60)
        );

        // 初始化
        students2.add(new Student());
    }

    public static void ZengQianglist(){
        List<Integer> list = List.of(
                // 下标，index，List 下标不是从1开始，而是从0开始
                1,          // 0
                35,         // 1
                657,        // 2
                23,         // 3
                76,         // 4
                4562,       // 5
                324,        // 6
                55          // 7
        );
        int sum = 0;

        // list.size()这是一个什么方法
        for (int i = 0; i < list.size(); i++){
            System.out.println("for:"+list.get(i));
        }

        int sum2 = 0;
        for (Integer integer : list){
            sum2 += integer;
            System.out.println("增强for:"+ integer);
        }


        Iterator<Integer> iterator = list.iterator();
        while(iterator.hasNext()){
            Integer next = iterator.next();
            System.out.println("迭代器:" + next);
        }

        list.forEach(
                kanbudongA ->{
                    System.out.println("看不懂啊啥意思:"+kanbudongA);
                }
        );


    }



}












