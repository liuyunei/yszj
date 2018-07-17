package com.liuyunei.common.aspect;

import com.alibaba.dubbo.rpc.RpcContext;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Author: 刘兴
 * Date: Created in 2018/4/23
 * 信息通知的方法
 */
public class RpcLogAspect {

	private static final Logger LOGGER = LoggerFactory.getLogger(RpcLogAspect.class);
	// 开始时间
	private long startTime = 0L;
	// 结束时间
	private long endTime = 0L;
	//前置通知，在通知下面的方法开始之前进行的一个信息输出
	@Before("execution(* *..rpc..*.*(..))")
	public void doBeforeInServiceLayer(JoinPoint joinPoint) {
		LOGGER.debug("doBeforeInServiceLayer");
		startTime = System.currentTimeMillis();
	}
	//后置通知，在该方法完结之后进行的一个信息通知
	@After("execution(* *..rpc..*.*(..))")
	//使用joint参数输出更为详细的信息
	public void doAfterInServiceLayer(JoinPoint joinPoint) {
		LOGGER.debug("doAfterInServiceLayer");
	}
	@Around("execution(* *..rpc..*.*(..))")
	public Object doAround(ProceedingJoinPoint pjp) throws Throwable {
		Object result = pjp.proceed();
		// 是否是消费端
		boolean consumerSide = RpcContext.getContext().isConsumerSide();
		// 获取最后一次提供方或调用方IP
		String ip = RpcContext.getContext().getRemoteHost();
		// 服务url
		String rpcUrl = RpcContext.getContext().getUrl().getParameter("application");
		LOGGER.info("consumerSide={}, ip={}, url={}", consumerSide, ip, rpcUrl);
		return result;
	}
}
