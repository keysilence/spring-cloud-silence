package com.silence.spring.cloud.provider;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Silence on 2018/5/3.
 */
@RestController
public class ProviderController {

    @RequestMapping("/getInfo")
    public String getInfo() {

        return "provider";

    }

}
