package com.rebbitmq.test;


import com.rabbit.test.Application;
import com.rabbit.test.config.RabbitmqConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(classes = Application.class)
@RunWith(SpringRunner.class)
public class Producer05_topics_springboot {

    @Autowired
    RabbitTemplate rabbitTemplate;

    @Test
    public void testSendByTopics() {
        for (int i = 0; i < 5; i++) {
            String message = "sms 邮件 inform to 武大凯" + i;

            rabbitTemplate.convertAndSend(RabbitmqConfig.EXCHANGE_TOPCIS_INFORM, "inform.email", message);
            System.out.println(message);
        }
    }
}
