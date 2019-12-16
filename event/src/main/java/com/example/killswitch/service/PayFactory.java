package com.example.killswitch.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.Map;

/**
 * @Description PayFactory
 * @Author 吴桂林
 * @Date 2019/12/16 17:54
 * @Version 1.0
 */

@Service
public class PayFactory {

    @Autowired
    Map<String, PayService> payServices = null;


    @Autowired
    private PayFactory payFactory;


    private static PayFactory payFactoryStatic;

    @Autowired
    ApplicationContext context;

    private static ApplicationContext applicationContextStatic;


    @PostConstruct
    public void init() {
        payFactoryStatic = payFactory;
        applicationContextStatic = context;
    }

    //业务分配工厂
    public static PayService factory(BizTypeEnum bizTypeEnum) throws Exception {
        //return payFactoryStatic.payServices.get(bizTypeEnum.beanName);

        return (PayService) applicationContextStatic.getBean(bizTypeEnum.beanName);


//        switch (bizTypeEnum) {
//            case Shop:
//                return new ShopService();
//            case Recharge:
//                return new RechargeService();
//            default:
//                return null;
//        }

    }
}
