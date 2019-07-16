package com.silence.spring.cloud.provider;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Silence on 2018/5/3.
 */
@RestController
public class ProviderController {

    @Value("${server.port}")
    private String servicePort;

    @RequestMapping("/printInfo")
    public String printInfo() {

//        try {
//            Thread.sleep(2000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        System.out.println("It`s me!");
        return "It`s me!";

    }

    @RequestMapping("/getInfo")
    public String getInfo() {

//        try {
//            Thread.sleep(2000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        System.out.println("It`s me!");
        return servicePort;

    }

}
