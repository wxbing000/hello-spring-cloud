package com.wxb.hystrix.controller;

import com.wxb.hystrix.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * describe:
 *
 * @author : 王校兵
 * @version : v1.0
 * @time : 2017/6/4  21:19
 */
@RestController
public class HelloController {

    @Autowired
    HelloService helloService;

    @RequestMapping(value = "/hi")
    public String hi(@RequestParam String name){
        return helloService.hiService(name);
    }


}