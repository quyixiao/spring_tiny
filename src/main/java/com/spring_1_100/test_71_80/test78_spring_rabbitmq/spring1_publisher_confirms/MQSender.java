package com.spring_1_100.test_71_80.test78_spring_rabbitmq.spring1_publisher_confirms;

import com.alibaba.fastjson.JSON;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.HashMap;
import java.util.Map;

/**
 * @author xuexiaolei 
 * @version 2017年08月22日
 */

public class MQSender {

    

    public static final String queue_key = "test_queue_keybbbbbbb";

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring_1_100/config_71_80/spring78_rabbitmq/spring1/spring78_mq_sender1.xml");
        Map<String, Object> msg = new HashMap();
        msg.put("data", "hello,rabbmitmq!");
        msg.put("time", System.currentTimeMillis());
        System.out.println("++++++++发送消息++++++++++++" + JSON.toJSONString(msg));
        RabbitTemplate rabbitTemplate = (RabbitTemplate) context.getBean("rabbitTemplate");
        rabbitTemplate.convertAndSend(queue_key, msg);
    }

}