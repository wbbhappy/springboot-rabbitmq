package com.micai.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 * Spring Boot应用启动类
 * @author zhaoxinguo on 2017/8/21.
 */
// 定时任务注解
//@EnableScheduling
@SpringBootApplication
public class Application {
    public static void main(String [] args){
        SpringApplication.run(Application.class,args);
    }
}
