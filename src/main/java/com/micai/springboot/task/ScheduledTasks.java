package com.micai.springboot.task;

import com.micai.springboot.mq.Sender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 * 描述：定时任务
 */
@Component
public class ScheduledTasks {
    @Autowired
    private Sender sender;
    private static final SimpleDateFormat dateFormate = new SimpleDateFormat("HH:mm:ss");
    // 5秒钟执行一次
    @Scheduled(fixedDelay = 500)
    public void send (){
        for (int i=0; i< 1000;i++) {
            sender.send(i);
        }
    }
    public void reportCurrentTime() {
        System.out.println("现在时间：" + dateFormate.format(new Date()));
    }
}

