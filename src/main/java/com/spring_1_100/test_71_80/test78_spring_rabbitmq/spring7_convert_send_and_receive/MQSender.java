package com.spring_1_100.test_71_80.test78_spring_rabbitmq.spring7_convert_send_and_receive;

import com.alibaba.fastjson.JSON;
import org.springframework.amqp.AmqpException;
import org.springframework.amqp.core.AmqpMessageReturnedException;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.HashMap;
import java.util.Map;

/**
 * @author xuexiaolei
 * @version 2017年08月22日
 */

public class MQSender {

    public static final String queue_key = "test_queue_key";

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring_1_100/config_71_80/spring78_rabbitmq/spring7/spring78_mq_sender7.xml");
        Map<String, Object> msg = new HashMap();
        msg.put("data", "hello,rabbmitmq!");
        msg.put("time", System.currentTimeMillis());
        System.out.println("++++++++发送消息++++++++++++" + JSON.toJSONString(msg));
        try {
            RabbitTemplate rabbitTemplate = (RabbitTemplate) context.getBean("rabbitTemplate");
            rabbitTemplate.convertSendAndReceive(queue_key, msg);
        } catch (BeansException e) {
            System.out.println("11111111111111111");
            e.printStackTrace();
        } catch (AmqpException e) {
            System.out.println("2222222222222222");
            e.printStackTrace();
        }
    }

}