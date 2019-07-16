package com.silence.spring.cloud.feign.controller;

import com.silence.spring.cloud.feign.service.FeignInterface;
import feign.RequestLine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Silence on 2018/5/8.
 */
@RestController
@RequestMapping("/feign")
public class FeignController {

    @Autowired
    FeignInterface feignInterface;

    @RequestMapping(value = "/printInfoByFeign", method = RequestMethod.GET)
    public String printInfo() {

        return feignInterface.printInfo();

    }


}
