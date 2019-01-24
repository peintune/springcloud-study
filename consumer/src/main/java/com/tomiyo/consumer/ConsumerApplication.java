package com.tomiyo.consumer;

import com.tomiyo.consumer.client.OrderClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
@EnableFeignClients
@RestController
@EnableAutoConfiguration
public class ConsumerApplication {

    @Autowired
    OrderClient client;

    @Value("${foo}")
    String foo ;

    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class, args);
    }


    @GetMapping("hi")
    public String sayHi(@RequestParam(value ="name") String name){
       return client.sayHi(name)+" "+foo;
    }

}

