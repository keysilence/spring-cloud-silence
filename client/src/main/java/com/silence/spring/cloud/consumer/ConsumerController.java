package com.silence.spring.cloud.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by Silence on 2018/5/3.
 */
@RestController
public class ConsumerController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/printInfo")
    @ResponseBody
    public String printInfo() {

        String info = restTemplate.getForObject("http://provider/getInfo", String.class);

        return info;

    }

}
