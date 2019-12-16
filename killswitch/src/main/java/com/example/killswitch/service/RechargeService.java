package com.example.killswitch.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @Description ShopService
 * @Author 吴桂林
 * @Date 2019/12/16 17:51
 * @Version 1.0
 */
@Service(BizTypeEnum.RechargeServiceBeanName)
public class RechargeService extends BasePayService implements PayService {
    @Override
    public void checkBizData(Object d) throws Exception {

    }

    @Override
    public void paySucceed(Object d) throws Exception {

    }
}
