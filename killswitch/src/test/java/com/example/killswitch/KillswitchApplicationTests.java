package com.example.killswitch;

import com.example.killswitch.service.BizTypeEnum;
import com.example.killswitch.service.PayFactory;
import com.example.killswitch.service.PayService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = KillswitchApplication.class)
@WebAppConfiguration
class KillswitchApplicationTests {

    @Test
    void contextLoads() {
        try {
            String orderId = "";
            PayService payService = PayFactory.factory(BizTypeEnum.Shop);
            payService.checkBizData(orderId);
            payService.paySucceed(orderId);
        } catch (Exception ex) {

        }
    }

}
