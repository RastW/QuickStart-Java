package com.rast.controller;

import com.rast.model.CommonResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author goumang
 * @description
 * @date 2022/8/6 00:48
 */
@RestController
public class LoginController {

    // 控制器
    // ？ 就是程序的最外层，直接来处理浏览器发送来请求数据的地方

    // GET POST
    // request: 请求 , Mapping: map是地图
    // == 判断的是内存地址，只有两个变量内存指向同一个才true，否则false
    // String这种类型不可以用==判断，因为可能是两个内存地址，只不过两个内存地址都是存储的一样的数据，但是比较的时候因为地址不对，所以判断就不对
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public CommonResult login(String username, String password) {
        String paw = "456";
        if (password.equals(paw)) {
            CommonResult commonResult = new CommonResult(true);
            return commonResult;
        }

        CommonResult commonResult = new CommonResult(false);
        return commonResult;
    }
}
