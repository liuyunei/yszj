package com.liuyunei.upms.rpc.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 服务启动类
 * Created by liuyunei on 2018/4/13.
 */
public class yszjUpmsRpcServiceApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(yszjUpmsRpcServiceApplication.class);

    public static void main(String[] args) {
        LOGGER.info(">>>>> yszj-upms-rpc-service 正在启动 <<<<<");
        new ClassPathXmlApplicationContext("classpath:META-INF/spring/*.xml");
        LOGGER.info(">>>>> yszj-upms-rpc-service 启动完成 <<<<<");
    }

}
