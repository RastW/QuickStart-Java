package com.rast.grammer;

import cn.hutool.json.JSONUtil;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.rast.model.Person;

import java.util.ArrayList;

/**
 * @author goumang
 * @description
 * @date 2022/8/7 16:17
 */
public class Json {

    public static void main(String[] args) {
        Person person = new Person(
                "jack", 80, false,
                new Person(
                        "krotos", 50, false,
                        new Person(
                                "jojo", 20, true
                        )
                )
        );

        // 把对象转换为json字符串
        String json = JSONUtil.toJsonStr(person);
        System.out.println(json);

        // 把Json字符串转换为java对象
        Person person1 = JSONUtil.toBean(json, Person.class);
        System.out.println(JSONUtil.toJsonStr(person1));
    }

}
