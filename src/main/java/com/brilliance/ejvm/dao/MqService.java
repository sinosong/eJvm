package com.brilliance.ejvm.dao;

/**
 * @author hns
 * @date 2019/12/31 18:34
 * @description
 */
public interface MqService {

    boolean sendMessage(String messageBody);

}
