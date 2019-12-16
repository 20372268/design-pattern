package com.example.killswitch.service.event;

import org.springframework.context.ApplicationEvent;

/**
 * @Description PaySucceedEvent
 * @Author 吴桂林
 * @Date 2019/12/16 19:12
 * @Version 1.0
 */
public class PaySucceedEvent extends ApplicationEvent {
    public PaySucceedEvent(Object source) {
        super(source);
    }
}
