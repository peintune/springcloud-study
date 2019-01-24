package com.tomiyo.consumer.client;

import org.springframework.stereotype.Component;

/**
 * @description: ${description}
 * @author: He Kun
 * @create: 2019-01-23 20:25
 **/
@Component
public class OrderClientFallBack implements OrderClient {
    @Override
    public String sayHi(String name) {
        return "failed to "+name;
    }
}
