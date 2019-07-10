package com.silence.spring.cloud.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
//import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * Created by Silence on 2018/5/8.
 */
@SpringBootApplication
//@EnableFeignClients
@EnableEurekaClient
public class FeignApplication {

    public static void main(String[] args) {

        SpringApplication.run(FeignApplication.class, args);

    }

}
