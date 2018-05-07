package com.silence.spring.cloud.config.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Silence on 2018/5/7.
 */
@RestController
public class ConfigController {

    @Value("${userName}")
    private String userName;

    @RequestMapping("/getUserName")
    @ResponseBody
    public String getUserName() {

        return userName;

    }

}
