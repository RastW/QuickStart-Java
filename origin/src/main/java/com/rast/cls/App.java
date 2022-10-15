package com.rast.cls;

import com.rast.model.Person;
import com.rast.type.ListPlus;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

/**
 * @author goumang
 * @description
 * @date 2022/10/15 17:38
 */
public class App {

    public static void main(String[] args) {
        // sgx讲课
        jiangkeToStudent(new SgxTeacher());

        // 石油大学 讲课
        jiangkeToStudent(new ZgsyTeacher());

        jiangkeToStudent(
                // new Teacher()           ----------------------- 这一行代码会报错，为什么？
                // 因为Teacher 是个接口，是抽象的，也就是说这里要穿入一个具体实现了Teacher的对象才行。
                // 你想一下，你让一个老师去讲课，总得有人去吧？ 难道你说 "老师" 这个概念能去给学生讲嘛？那肯定是不行的
                // 因此java不允许参数为接口的时候， new 接口，但是可以在这里写匿名内部类去实现，就像下面这样：
                new Teacher() {
                    @Override
                    public void jiangke() {
                        System.out.println("临时老师-讲课");
                    }
                }
        );

        // 上面是匿名内部类，但是这样的话是不是有感觉，不是很美观，不是很好看？那么就要认识一个全新的概念，lamdba表达式
        // 在别的语言中也叫 闭包
        // lamdba可以理解为，将一段可以执行的代码作为参数传递，但是使用lamdba的前提是，对应接口只有一个方法。
        /**
         * lamdba语法：() -> {}
         * (参数【这里的参数名随便写，逗号分割】) -> 代码（如果只有一行代码可以不写"{}"
         * lamdba中的参数不需要写类型，因为接口定义方法中已经写了，也不需要写方法名，因为只有一个方法。
         * 因为比如有俩参数就是：(a, b) -> return x * y;
         * 等价于：
         * int run(int a, int b) {
         *     return x * y;
         * }
         *
         * 比如这里要的参数是一个Teacher接口，teacher中只有一个方法，就可以使用lamdba。
         */
        jiangkeToStudent(() -> System.out.println("lamdba老师-讲课"));

        /**
         * 那么是不是使用lamdba就需要写一个接口呢？那是不是太麻烦了？
         * 不是，JDK为我们提供了很多的内置函数式编程的接口，供我们使用lamdba，有以下：
         * Consumer<T>      此处的T是泛型，参数。             单参数无返回接口
         * Supplier<T>      此处的T是返回值                  无参数单返回接口
         * Function<T, R>   此处的T,R分别是参数，返回值        单参数单返回接口
         * 这些都可以直接用，这里有个菜鸟教程列出来的函数接口：https://www.runoob.com/java/java8-functional-interfaces.html
         */

        // final List<Integer> list = List.of(1, 2, 2, 3);

        // for (Integer integer : list) {
        //     System.out.println(integer);
        // }
        // 也可以这样：
        // list.forEach(v -> System.out.println(v));

        System.out.println("————————————————————————————————————————————————");

        ListPlus<Integer> list = new ListPlus<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);

//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//        }

        // 1,2,3 -> true,true,false,
        list.foreach(x -> System.out.println(x));
        list.map(x -> x > 2 ? 1.1 : 2.2);
        // list.map(App::logic);

        List<Integer> nums = List.of(1, 2, 8, 4, 5);

        List<Person> people = List.of(
                new Person("jack", 12),
                new Person("jack2", 20),
                new Person("jack3", 16),
                new Person("jack4", 18),
                new Person("jack5", 14)
        );
        final List<String> collect = people
                .stream()
                .filter(v -> v.getAge() >= 18)
                .map(Person::getName)
                .collect(Collectors.toList());
        collect.stream().forEach(v -> System.out.println(v));


        // List<String> collect = nums.stream().map(x -> {
        //     int i = x * 92;
        //     if (i % 3 == 0) {
        //         return "1";
        //     } else {
        //         return "2";
        //     }
        // }).collect(Collectors.toList());
        // 取最大
        Integer integer = nums.stream().max(Integer::compare).get();

        // nums.stream().sorted()

        // .map
        // .max
        // .filter
        // .group


    }

    /**
     * 给学生上课
     *
     * @param
     * @return void
     * @author goumang
     * @date 2022/10/15 17:41
     */
    public static void jiangkeToStudent(Teacher teacher) {
        teacher.jiangke();
    }
}
