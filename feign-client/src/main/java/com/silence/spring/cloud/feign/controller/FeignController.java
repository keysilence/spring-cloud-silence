package com.silence.spring.cloud.feign.controller;

import com.silence.spring.cloud.feign.service.FeignInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Silence on 2018/5/8.
 */
@RestController
public class FeignController {

    @Autowired
    FeignInterface feignInterface;

    @RequestMapping("/printInfoByFeign")
    public String printInfo() {

        return feignInterface.getInfo();

    }


}
