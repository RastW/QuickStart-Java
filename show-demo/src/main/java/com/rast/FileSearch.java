package com.rast;

import java.io.File;
import java.io.IOException;
import java.util.Objects;

/**
 * @author goumang
 * @description
 * @date 2022/8/27 18:27
 */
public class FileSearch {

    // 我们的需求是写一个文件搜索系统
    // 需要检索当前目录，及其所有子目录的文件，最终返回输出一个文件存在的目录地址
    // public static void main(String[] args) throws IOException {
    //     // io input/output
    //     // input: 输入, output: 输出
    //     // intput: 输入，把文件输入到内存  读取
    //     // output：把内容写入到文件        写文件

    //     // 要找的文件名
    //     String fileName = "README.md";

    //     // file 由Java官方提供的文件类型
    //     // 绝对路径和相对路径
    //     // 绝对路径：
    //     //      /Users/wangjiawei/Develop/CodeSpace/Java/QuickStart-Java/show-demo/src/main/java/com/rast/FileSearch.java
    //     // 相对路径(假设在showdemo文件夹下)：
    //     //      ./src/main/java/com/rast/FileSearch.java
    //     //      ../lianxi/
    //     File file = new File(".");
    //     System.out.println(file.getCanonicalPath());

    //     // 这里获取到了 所有的文件(当前目录下
    //     File[] files = file.listFiles();

    //     // 将所有的文件进行循环
    //     for (File f : files) {
    //         // 打印每一个文件的文件名
    //         System.out.println(f);

    //         // 是否是文件
    //         if (f.isFile()) {
    //             // 文件情况下
    //             System.out.println(f.getName());

    //             // 是否相等
    //             if (Objects.equals(f.getName(), fileName)) {
    //                 System.out.println("你找到了，文件目录是：" + f.getCanonicalPath());
    //             }
    //         } else {
    //             // 文件夹情况下
    //             File[] ff = f.listFiles();


    //             for (File f1 : ff) {
    //                 System.out.println(" -- " + f1);
    //             }
    //         }
    //     }
    // }

    public static void main(String[] args) throws IOException {
        // 要找的文件名
        search(new File("."), "ceshi.java");
    }

    /**
     * search 查找
     *
     * @param file
     * @param name
     * @return void
     * @author goumang
     * @date 2022/9/3 16:22
     */
    public static void search(File file, String name) throws IOException {
        File[] files = file.listFiles();

        // ture || false = true;   或
        // true && true == true;   与

        for (File f : files) {
            if (f.isFile() && Objects.equals(f.getName(), name)) {
                // 是否相等
                System.out.println("你找到了，文件目录是：" + f.getCanonicalPath());
            }
            if (f.isDirectory()){
                System.out.println("进入文件夹：" + f.getName());
                // 文件夹
                search(f, name);
            }
        }
    }
}
