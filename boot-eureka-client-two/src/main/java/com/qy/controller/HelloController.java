package com.qy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author qy
 * @Date 2025/12/17
 */
@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello(){
        int a = 1;
        a++;
        // 这边为啥打印了两次啊
        System.out.println(a);
        System.out.println("hello world" + "This is from " + "boot-eureka-client-two");
        return "hello world from boot-eureka-client-two";
    }
}
