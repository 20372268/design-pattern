package com.example.killswitch.service.event;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

/**
 * @Description PaySucceedEvent
 * @Author 吴桂林
 * @Date 2019/12/16 19:12
 * @Version 1.0
 */
public class PaySucceedLogListener implements ApplicationListener<PaySucceedEvent> {

    @Override
    public void onApplicationEvent(PaySucceedEvent paySucceedEvent) {
        Object d = paySucceedEvent.getSource();
        System.out.println("日志");
    }
}
