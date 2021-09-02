package com.xian.transcation.seckill.producer;

import org.apache.rocketmq.common.message.Message;
import org.apache.rocketmq.spring.core.RocketMQTemplate;

/**
 * @author xian
 * @description
 * @createTime 2021/9/2 14:38
 */
public class RocketMqProducer {

    public static void main(String[] args) {
        RocketMQTemplate template = new RocketMQTemplate();
        Message message = new Message();
        //template.asyncSend();
    }

}
