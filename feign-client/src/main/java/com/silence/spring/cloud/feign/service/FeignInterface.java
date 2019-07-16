package com.silence.spring.cloud.feign.service;

import com.silence.spring.cloud.feign.config.FeignConfiguration;
import com.silence.spring.cloud.feign.hystrix.FeignHystrix;
import feign.RequestLine;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Silence on 2018/5/8.
 * 如果需要支持FeignHystrix，需要在application.yml里面增加feign.hystrix.enabled: true
 */
@FeignClient(value = "microservice-provider", fallback = FeignHystrix.class, configuration = FeignConfiguration.class)
public interface FeignInterface {

    /**
     * 自定义FeignConfiguration需要使用feign自带的注解，即@RequestLine
     * @return
     */
    @RequestLine("GET /printInfo")
//    @RequestMapping(value = "/printInfo", method = RequestMethod.GET)
    public String printInfo();

    @RequestLine("GET /getInfo")
//    @RequestMapping(value = "/getInfo", method = RequestMethod.GET)
    public String getInfo();

}
