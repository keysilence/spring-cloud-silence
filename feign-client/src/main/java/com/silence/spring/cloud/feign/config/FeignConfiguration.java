package com.silence.spring.cloud.feign.config;

import feign.Contract;
import feign.Logger;
import org.springframework.context.annotation.Bean;

/**
 * Created by Silence on 2019/7/15.
 */
public class FeignConfiguration {

    @Bean
    public Contract feignContract() {
        return new feign.Contract.Default();
    }

    /**
     * 为FeignInterface增加日志，需要在appliance.yml里面增加logging.level.com.silence.spring.cloud.feign.service.FeignInterface: DEBUG；
     * 此处亦可以通过配置完成即feign.client.config.microservice-provider.loggerLevel: full
     * @return
     */
//    @Bean
//    public Logger.Level feignLoggerLevel() {
//        return Logger.Level.FULL;
//    }

}
