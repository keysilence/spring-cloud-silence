package com.silence.spring.cloud.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Created by Silence on 2018/5/8.
 */
@SpringBootApplication
@EnableFeignClients
//@EnableEurekaClient
@EnableHystrix
@EnableHystrixDashboard
public class FeignApplication {

    public static void main(String[] args) {

        SpringApplication.run(FeignApplication.class, args);

    }

}
