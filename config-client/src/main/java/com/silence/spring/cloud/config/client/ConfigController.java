package com.silence.spring.cloud.config.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Silence on 2018/5/7.
 */
@RestController
@RefreshScope
public class ConfigController {

    @Value("${group.00}")
    private String testString;

    @RequestMapping("/test")
    @ResponseBody
    public String testString() {

        return testString;

    }

}
