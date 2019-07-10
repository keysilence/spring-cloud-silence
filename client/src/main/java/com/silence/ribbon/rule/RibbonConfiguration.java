package com.silence.ribbon.rule;

import com.netflix.loadbalancer.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Silence on 2019/7/8.
 * 自定义负载均衡策略，此类不能存放在主应用程序上下文的@ComponentScan所扫描包总，否则该类中的配置信息将被所有的@RibbonClient共享
 */
@Configuration
public class RibbonConfiguration {

    @Bean
    public IRule ribbonRule() {
        //随机
        return new RandomRule();
        //轮询
//        return new RoundRobinRule();
        //一段时间内通过RoundRobinRule选择服务实例，如果此段时间内没有选择出来则线程终止
//        return new RetryRule();
        //最空闲并且并发请求书最小
//        return new BestAvailableRule();
        //该策略是对RoundRobinRule的扩展，增加了平均响应时间进行权重的策略，比如4个实例，A、B、C、D，平均响应时间为19、40、80、100，
        //所以总响应时间就是10+40+80+100=230，每个实例权重为总响应时间与实际自身的平均响应时间的差的累积所得，所以A、B、C、D的权重
        //分别为230-10=220、220+(230-40)=410、410+(230-80)=560、560+(230-100)=690，所以分别为[0,220]、(220,410]、(410,560]、
        //(560,690)
//        return new WeightedResponseTimeRule();
        //
//        return new AvailabilityFilteringRule();
        //
//        return new ZoneAvoidanceRule();
    }

}
