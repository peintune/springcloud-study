package com.tomiyo.consumer.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @description: ${description}
 * @author: He Kun
 * @create: 2019-01-23 18:16
 **/
@FeignClient(value = "order",fallback = OrderClientFallBack.class)
public interface OrderClient {

    @GetMapping("hi")
    String sayHi(@RequestParam(value = "name")String name);
}
