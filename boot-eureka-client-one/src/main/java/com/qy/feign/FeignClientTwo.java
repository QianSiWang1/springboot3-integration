package com.qy.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Author qy
 * @Date 2025/12/17
 */
@FeignClient(name = "boot-eureka-client-two")
public interface FeignClientTwo {
    @GetMapping("/boot-eureka-client-two/hello")
    public String hello();
}
