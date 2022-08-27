package com.rast;

import java.io.File;
import java.io.IOException;

/**
 * @author goumang
 * @description
 * @date 2022/8/27 18:27
 */
public class FileSearch {

    // 我们的需求是写一个文件搜索系统
    // 需要检索当前目录，及其所有子目录的文件，最终返回输出一个文件存在的目录地址
    public static void main(String[] args) throws IOException {
        // io input/output
        // input: 输入, output: 输出
        // intput: 输入，把文件输入到内存  读取
        // output：把内容写入到文件        写文件

        // 要找的文件名
        String fileName = "";

        // file 由Java官方提供的文件类型
        // 绝对路径和相对路径
        // 绝对路径：
        //      /Users/wangjiawei/Develop/CodeSpace/Java/QuickStart-Java/show-demo/src/main/java/com/rast/FileSearch.java
        // 相对路径(假设在showdemo文件夹下)：
        //      ./src/main/java/com/rast/FileSearch.java
        //      ../lianxi/
        File file = new File(".");
        System.out.println(file.getCanonicalPath());

        File[] files = file.listFiles();
        for (File f: files) {
            System.out.println(f);
        }
    }
}
