package com.silence.spring.cloud.feign.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Silence on 2018/5/8.
 */
@FeignClient("provider")
public interface FeignInterface {

    @RequestMapping("/getInfo")
    public String getInfo();

}
