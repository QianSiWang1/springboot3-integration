package com.qy.controller;

import com.qy.feign.FeignClientTwo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Author qy
 * @Date 2025/12/17
 */
@RestController
public class HelloController {
    @Autowired
    RestTemplate restTemplate;

    @Autowired
    FeignClientTwo feignClientTwo;
    @GetMapping("/hello")
    public String hello(){
        System.out.println("hello world" + "This is from " + "boot-eureka-client-one");
        return "hello world boot-eureka-client-one";
    }

    @GetMapping("/call-hello-two")
    public String helloFromTwo(){
        System.out.println("Call Hello Two");
        return restTemplate.getForObject("http://boot-eureka-client-two/hello", String.class);
    }

    @GetMapping("/call-hello-two-feign")
    public String feignCallHelloFromTwo(){
        String hello = feignClientTwo.hello();
        System.out.println("Call Hello Two Feign: " + hello);
        return feignClientTwo.hello();
    }
}
