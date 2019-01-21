package com.micai.springboot.mq;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.amqp.core.Queue;
/**
 * 描述：RabbitMQ的配置类
 * <p>
 * Author: 赵新国
 * Date: 2017/11/3 16:16
 */
@Configuration
public class RabbitConfig extends BaseConfig{
    @Bean
    public Queue helloQueue() {
        return new Queue(QUEUE_KEY);
    }
}
