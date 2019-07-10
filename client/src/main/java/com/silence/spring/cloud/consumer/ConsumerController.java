package com.silence.spring.cloud.consumer;

import com.silence.ribbon.rule.RibbonConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by Silence on 2018/5/3.
 * 手动指定负载均衡策略@RibbonClient(name="consumer", configuration = RibbonConfiguration.class)
 */
@RestController
@RibbonClient(name="consumer", configuration = RibbonConfiguration.class)
public class ConsumerController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/printInfo")
    @ResponseBody
    public String printInfo() {

        String info = restTemplate.getForObject("http://microservice-provider/getInfo", String.class);

        return info;

    }

}
