package com.brilliance.ejvm.dao.impl;

import com.alibaba.fastjson.JSON;
import com.brilliance.ejvm.dao.IExecuteService;
import com.brilliance.ejvm.dao.MqService;
import com.brilliance.ejvm.entity.PostMq;
import com.brilliance.ejvm.util.ByPostConstants;
import com.google.common.collect.Lists;
import lombok.extern.slf4j.Slf4j;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author sinosong
 */
@Service("defaultExecuteService")
@Slf4j
public class ExecuteServiceImpl implements IExecuteService {


//    @Autowired
//    private PlatformTransactionManager txManager;
    @Autowired
    private MqService mqService;

    @Override
    public void execute() {

        /*DefaultTransactionDefinition def = new DefaultTransactionDefinition();
        def.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRED);
        def.setIsolationLevel(TransactionDefinition.ISOLATION_READ_COMMITTED);
        TransactionStatus status = txManager.getTransaction(def);

        try {

            System.out.println("execute......");


            txManager.commit(status);

        } catch (Exception e) {
            txManager.rollback(status);
            e.printStackTrace();
        } finally {
            System.out.println("end......");
        }*/

    }

    @PostConstruct
    @Override
    public void produder() {
        List<PostMq> postMqs = bulidPostMqTest();
        for (PostMq postMq : postMqs) {
            String jsonstr = JSON.toJSONString(postMq);
            System.out.println("发送消息:"+jsonstr);
            mqService.sendMessage(jsonstr);
        }
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
        postMq.setPublishTime(System.currentTimeMillis());
        postMq.setPoster(2181157L);
        postMq.setExt(new HashMap<String, String>() {
            {
                put("fromId", "2181157");
                put("toId", "2722313");
                put("skuId","1300476235060000001");
                if(num==120410) {
                    put("money", "120");
                }
            }
        });
        String s = JSON.toJSONString(postMq);
        PostMq postMq1 = JSON.parseObject(s, PostMq.class);
        Map<String, String> ext = postMq1.getExt();
        ext.put("status", "1");
        System.out.println("Param ==> "+JSON.toJSONString(postMq1));
        return postMq1;

    }
}
