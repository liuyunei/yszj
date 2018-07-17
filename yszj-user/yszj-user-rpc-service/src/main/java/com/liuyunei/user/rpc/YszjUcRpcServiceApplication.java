package com.liuyunei.user.rpc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 服务启动类
 * Created by liuyunei on 2018/5/10.
 */
public class YszjUcRpcServiceApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(YszjUcRpcServiceApplication.class);

	public static void main(String[] args) {
		LOGGER.info(">>>>> yszj-user-rpc-service 正在启动 <<<<<");
		new ClassPathXmlApplicationContext("classpath:META-INF/spring/*.xml");
		LOGGER.info(">>>>> yszj-user-rpc-service 启动完成 <<<<<");
	}

}
