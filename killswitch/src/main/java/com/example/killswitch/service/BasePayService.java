package com.example.killswitch.service;

import org.springframework.scheduling.annotation.Async;

/**
 * @Description PayService
 * @Author 吴桂林
 * @Date 2019/12/16 17:52
 * @Version 1.0
 */
public class BasePayService implements PayService {


    @Override
    public void createPayOrdere(Object d) throws Exception {
        checkBizData(d);

        //创建支付订单
    }

    @Override
    public void checkBizData(Object d) throws Exception {

    }


    @Override
    public void paySucceed(Object d) throws Exception {
        //处理支付订单状态

        //处理业务

        //处理日志
        log();
        //处理推送等等
        push();
    }

    @Async
    void log() {
    }

    @Async
    void push() {
    }
}
