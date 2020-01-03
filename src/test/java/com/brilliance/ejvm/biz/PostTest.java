package com.brilliance.ejvm.biz;

import com.alibaba.fastjson.JSON;
import com.brilliance.ejvm.entity.PostMq;
import com.brilliance.ejvm.entity.enums.InteractionTemplateEnum;
import com.brilliance.ejvm.entity.enums.InteractionTypeEnum;
import com.brilliance.ejvm.entity.enums.PostTypeOfParamEnum;
import com.brilliance.ejvm.entity.param.PostParam;
import com.brilliance.ejvm.util.ByPostConstants;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.time.DateFormatUtils;
import org.apache.rocketmq.client.exception.MQClientException;
import org.apache.rocketmq.client.producer.DefaultMQProducer;
import org.apache.rocketmq.client.producer.SendResult;
import org.apache.rocketmq.client.producer.SendStatus;
import org.apache.rocketmq.common.message.Message;
import org.apache.rocketmq.remoting.common.RemotingHelper;
import org.assertj.core.util.Lists;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author hns
 * @version v1.0
 * @date 2019/12/31 16:07
 * @description 测试推送mq
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class PostTest {

    @Value("${apache.rocketmq.namesrvAddr}")
    private String namesrvAddr;

    @Value("${rocketmq.css.post.consumer.group}")
    private String producerGroup;
    @Value("${rocketmq.css.post.topic}")
    private String topic;

    private DefaultMQProducer defaultMQProducer;

    protected String tag;

    protected String instanceName;



    @Test
    public void pushMQ() {

        System.out.println(namesrvAddr);
        System.out.println(producerGroup);

    }
    @PostConstruct
    @Test
    public void produder() {
        initMq();
        List<PostMq> postMqs = bulidPostMqTest();
        for (PostMq postMq : postMqs) {
            String jsonstr = JSON.toJSONString(postMq);
            System.out.println("发送消息:"+jsonstr);
            sendMessage(jsonstr);
        }
        this.defaultMQProducer.shutdown();
        System.out.println("end....");
    }



    public List<PostMq> bulidPostMqTest() {
        List<PostMq> postMqList = new ArrayList<>();
        List<Integer> list = new ArrayList<Integer>(){
            {
                add(120110);
                add(120210);
                add(120310);
                add(120410);
                add(130110);
                add(140110);
            }
        };
        List<Integer> fissionTypes = ByPostConstants.PARAM_FISSION_TYPES;
        fissionTypes.addAll(list);
        for (Integer it : fissionTypes) {
            postMqList.add(ParamTest(it));
        }
        System.out.println(JSON.toJSONString(postMqList));
        System.out.println();
        return Lists.newArrayList(postMqList.get(0));
    }

    public PostMq ParamTest(int num) {

        PostMq postMq = new PostMq();
        postMq.setCaller("callerName");
        //120110
        postMq.setPostType(num);
        postMq.setBusinessId(21012540210032333L);
        postMq.setPublishTime(new Date().getTime());
        postMq.setPoster(2181157L);
        postMq.setExt(new HashMap<String, String>() {
            {
                put("fromId", "2181157");
                put("toId", "2722313");
                put("skuId","1300476235060000001");
                if(num==120410)
                    put("money", "120");

            }
        });
        String s = JSON.toJSONString(postMq);
        PostMq postMq1 = JSON.parseObject(s, PostMq.class);
        Map<String, String> ext = postMq1.getExt();
        ext.put("status", "1");
        System.out.println("Param ==> "+JSON.toJSONString(postMq1));
        return postMq1;

    }

    public boolean sendMessage(String messageBody) {
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
