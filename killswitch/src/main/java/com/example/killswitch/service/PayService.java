package com.example.killswitch.service;

/**
 * @Description PayService
 * @Author 吴桂林
 * @Date 2019/12/16 17:52
 * @Version 1.0
 */
public interface PayService {

    void createPayOrdere(Object d) throws Exception;

    void checkBizData(Object d) throws Exception;

    void paySucceed(Object d) throws Exception;
}
