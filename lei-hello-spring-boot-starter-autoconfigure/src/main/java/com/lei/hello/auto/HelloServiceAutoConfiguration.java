package com.lei.hello.auto;

import com.lei.hello.properties.Helloproperties;
import com.lei.hello.service.HelloService;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author leiyunlong
 * @version 1.0
 * @since 2021/8/10 3:19 下午
 */
@Configuration
@EnableConfigurationProperties(Helloproperties.class)
public class HelloServiceAutoConfiguration {

    @ConditionalOnMissingBean(HelloService.class)
    @Bean
    public HelloService helloService() {
        HelloService helloService = new HelloService();
        return helloService;
    }
}
