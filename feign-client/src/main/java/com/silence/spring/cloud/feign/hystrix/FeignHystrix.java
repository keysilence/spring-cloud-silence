package com.silence.spring.cloud.feign.hystrix;

import com.silence.spring.cloud.feign.service.FeignInterface;
import org.springframework.stereotype.Component;

/**
 * Created by Silence on 2018/5/9.
 */
@Component
public class FeignHystrix implements FeignInterface {

    @Override
    public String getInfo() {

        return "Get Info Error!Hystrix!";

    }

}
