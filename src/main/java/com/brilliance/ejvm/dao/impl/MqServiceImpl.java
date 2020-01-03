package com.brilliance.ejvm.dao.impl;

import com.brilliance.ejvm.dao.MqService;
import lombok.extern.slf4j.Slf4j;
import org.apache.rocketmq.client.exception.MQClientException;
import org.apache.rocketmq.client.producer.DefaultMQProducer;
import org.apache.rocketmq.client.producer.SendResult;
import org.apache.rocketmq.client.producer.SendStatus;
import org.apache.rocketmq.common.message.Message;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * @author sinosong
 */
@Service
@Slf4j
public class MqServiceImpl implements MqService {

    @Value("${apache.rocketmq.namesrvAddr}")
    private String namesrvAddr;

    @Value("${rocketmq.css.post.consumer.group}")
    private String producerGroup;
    @Value("${rocketmq.css.post.topic}")
    private String topic;

    private DefaultMQProducer defaultMQProducer;

    protected String tag;

    protected String instanceName;

    @Override
    public boolean sendMessage(String messageBody) {
        initMq();
        Message message = new Message(topic, tag, messageBody.getBytes());
        SendResult sendResult = null;
        try {
            sendResult = defaultMQProducer.send(message);
        } catch (Exception e) {
            log.error("mq消息发送失败,messageBody=" + messageBody.toString(), e);
        }
        if (sendResult == null || sendResult.getSendStatus() != SendStatus.SEND_OK) {
            log.error("mq消息发送失败,messageBody=" + messageBody.toString());
            return false;
        }
        return true;
    }

    @PostConstruct
    protected void initMq() {
        this.defaultMQProducer = new DefaultMQProducer(producerGroup);
        this.defaultMQProducer.setNamesrvAddr(namesrvAddr);
        if (instanceName != null) {
            defaultMQProducer.setInstanceName(instanceName);
        }
        this.defaultMQProducer.setInstanceName(String.valueOf(System.currentTimeMillis()));
        this.defaultMQProducer.setSendMsgTimeout(3000);
        this.defaultMQProducer.setRetryTimesWhenSendFailed(2);
        try {
            this.defaultMQProducer.start();
        } catch (MQClientException e) {
            log.error("初始化MQ失败", e);
        }
    }

}
