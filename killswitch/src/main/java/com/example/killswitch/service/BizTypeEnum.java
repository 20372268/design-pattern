package com.example.killswitch.service;

public enum BizTypeEnum {
    Shop(BizTypeEnum.ShopServiceBeanName),
    Recharge(BizTypeEnum.RechargeServiceBeanName);

    BizTypeEnum(String beanName) {
        this.beanName = beanName;
    }

    public static final String ShopServiceBeanName = "ShopService";
    public static final String RechargeServiceBeanName = "RechargeService";

    String beanName;
}
