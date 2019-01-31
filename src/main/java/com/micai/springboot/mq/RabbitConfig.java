package com.micai.springboot.mq;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.amqp.core.Queue;
/**
 * 描述：RabbitMQ的配置类
 */
@Configuration
public class RabbitConfig extends BaseConfig{
    @Bean
    public Queue helloQueue() {
        return new Queue(QUEUE_KEY);
    }
}
